
package conexoesbancodedados;

import classes.ClasseCadastro;
import classes.ClasseCadastro_exercicios;
import classes.ClasseEsqueceuSenha;
import classes.ClasseSenhaInicial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class SelectBd {
    
    ClasseSenhaInicial cSenha = new ClasseSenhaInicial();
    ClasseEsqueceuSenha cEsqSenha = new ClasseEsqueceuSenha();
    
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Connection con;
    String sqlselectCadastroAlfabetico;
    private int qt_linhas_select;
    private int linha_atual_select = 1;

    public int getQt_linhas_select() {
        return qt_linhas_select;
    }

    public void setQt_linhas_select(int qt_linhas_select) {
        this.qt_linhas_select = qt_linhas_select;
    }    

    public int getLinha_atual_select() {
        return linha_atual_select;
    }

    public void setLinha_atual_select(int linha_atual_select) {
        this.linha_atual_select = linha_atual_select;
    }
       
    public void verificaUsuario(ClasseSenhaInicial login) throws SQLException{
        
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();

        String sql = "SELECT NOME FROM TB_SENHAS WHERE USUARIO = '"+login.getUsuario()+"' ";
        
        rs = stmt.executeQuery(sql);
        
            if(rs.next()){
                cSenha.setNome(rs.getString("NOME"));
            }   
    }

    public boolean verificaSenha(ClasseSenhaInicial login){
        
        con = ConectaBd.getConnection();
        boolean check = false;
        
        try{
            stmt = con.prepareStatement("SELECT USUARIO,SENHA FROM TB_SENHAS WHERE USUARIO = ? AND SENHA = ?");
            stmt.setString(1,login.getUsuario());
            stmt.setString(2,login.getSenha());
            rs = stmt.executeQuery();
            
            if(rs.next()){
                check = true;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO FAZER SELECT NO BANCO !"+ ex);
        }finally{
            ConectaBd.closeConnection(con,stmt,rs);
        }
        return(check);
    }
    
    //select de email para recuperacao de senha
    public void selecionaEmail() throws SQLException{
        
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT EMAIL FROM TB_SENHAS WHERE USUARIO = '"+cSenha.getUsuario()+"' ";
        
        rs = stmt.executeQuery(sql);
        
            if(rs.next()){
                cEsqSenha.setEmail(rs.getString("EMAIL"));
            }   
    }
    
    //select para trazer o cadastro desejado com LIKE, se estiver vazio ele traz todos os cadastros em ordem alfabética
    public void selectCadastroAlfabetico(ClasseCadastro dados) throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();

        sqlselectCadastroAlfabetico = "SELECT CD_REGISTRO,SITUACAO,NOME,TEL1,TEL2,PROFISSAO,SEXO,ESTADO_CIVIL,RG"
                                   + ",CPF,DT_NASCIMENTO,NM_MAE,NM_PAI,NM_EMER,TEL_EMER,PARENTESCO,END_RUA,END_NUMERO"
                                   + ",END_BAIRRO,END_CIDADE,END_ESTADO,END_CEP "
                                        + "FROM TB_ALUNOS WHERE SITUACAO = 1 AND NOME LIKE '%"+dados.getNome()+"%'"
                                            + "ORDER BY 3 ";
        
        rs = stmt.executeQuery(sqlselectCadastroAlfabetico);
        //System.out.println("Logo quando recebe o sql no rs :"+rs.getRow()); //teste
         
       //O rs começa com 0 mas o primeiro registro válido é o next que no caso é o 1. O 0 não retorna nada do sql
       while(rs.next()){ //while e if para que eu consiga manipular as linhas retornadas
       //System.out.println("Entrei no While :"+rs.getRow()); //teste
              if(rs.getRow() == this.linha_atual_select){
            //if(rs.next()){ //if caso retorno somente 1 row
                //System.out.println("Primeira linha do rs.next numero :"+rs.getRow()); //teste
                
                dados.setCd_registro(rs.getInt("CD_REGISTRO"));
                dados.setSituacao(rs.getBoolean("SITUACAO"));
                dados.setNome(rs.getString("NOME"));
                dados.setTel1(rs.getString("TEL1"));
                dados.setTel2(rs.getString("TEL2"));
                dados.setProfissao(rs.getString("PROFISSAO"));
                dados.setSexo(rs.getString("SEXO"));
                dados.setEstado_civil(rs.getInt("ESTADO_CIVIL"));
                dados.setRg(rs.getString("RG"));
                dados.setCpf(rs.getString("CPF"));
                dados.setDt_nascimento(rs.getString("DT_NASCIMENTO"));
                dados.setNm_mae(rs.getString("NM_MAE"));
                dados.setNm_pai(rs.getString("NM_PAI"));
                dados.setNm_emer(rs.getString("NM_EMER"));
                dados.setTel_emer(rs.getString("TEL_EMER"));
                dados.setParentesco(rs.getInt("PARENTESCO"));
                dados.setEnd_rua(rs.getString("END_RUA"));
                dados.setEnd_numero(rs.getString("END_NUMERO"));
                dados.setEnd_bairro(rs.getString("END_BAIRRO"));
                dados.setEnd_cidade(rs.getString("END_CIDADE"));
                dados.setEnd_estado(rs.getInt("END_ESTADO"));
                dados.setEnd_cep(rs.getString("END_CEP"));
                
                this.linha_atual_select = rs.getRow();
                
                System.out.println("Linha atual do select :"+rs.getRow());//teste
            } 
        }
    }
        
    //select para contar a quantidade de linhas retornadas pelo select para que quando o select retornar mais de uma linha
    //o botão frente e traz da tela cadastro funcione.
    public int selectQtLinhasSelectOrderNome(ClasseCadastro dados) throws SQLException{
        con = ConectaBd.getConnection();
        Statement Stmt = con.createStatement();
        ResultSet rsContagem = null;

        sqlselectCadastroAlfabetico = "SELECT CD_REGISTRO,SITUACAO,NOME,TEL1,TEL2,PROFISSAO,SEXO,ESTADO_CIVIL,RG"
                                   + ",CPF,DT_NASCIMENTO,NM_MAE,NM_PAI,NM_EMER,TEL_EMER,PARENTESCO,END_RUA,END_NUMERO"
                                   + ",END_BAIRRO,END_CIDADE,END_ESTADO,END_CEP "
                                        + "FROM TB_ALUNOS WHERE SITUACAO = 1 AND NOME LIKE '%"+dados.getNome()+"%'"
                                            + "ORDER BY 3 ";
        
        rsContagem = Stmt.executeQuery(sqlselectCadastroAlfabetico);
        int i = 0; //contar a quantidade de linhas que o select Retornou
        
            while(rsContagem.next()){
                //System.out.println("Passei no next da contagem: "+i);//teste
                i++;
            }
                
        
        return(i);
    }
    
    //selec para retornar o numero do cd do grupo muscular para a tela de cadastro de exercicios
    public void retornaCdGrupoMuscular(ClasseCadastro_exercicios dados) throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT CD_MEMBRO FROM TB_MEMBROS WHERE NM_MEMBRO = '"+dados.getNm_membro()+"' ";
        
        rs = stmt.executeQuery(sql);
        
            if(rs.next()){
                dados.setCd_membro(rs.getInt("CD_MEMBRO"));
            } 
            
            //System.out.println(dados.getCd_membro()); //teste
    }
    

    
    
    
}
    
    
    
    
    
    

