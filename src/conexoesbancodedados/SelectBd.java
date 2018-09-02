
package conexoesbancodedados;

import classes.ClasseCadastro;
import classes.ClasseCadastro_exercicios;
import classes.ClasseCadastro_treino;
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
    ClasseCadastro_treino treinos = new ClasseCadastro_treino();
    
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
                
                //System.out.println("Linha atual do select :"+rs.getRow());//teste
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
    
    public int selectExisteTreino(ClasseCadastro_treino dados) throws SQLException{
        int n = 0;
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
                
        String sql = "SELECT CD_TREINOA FROM TB_TREINOSA WHERE CD_REGISTRO = '"+dados.getCd_registro()+"' ";
        
        rs = stmt.executeQuery(sql);
        
            if(rs.last()){
                n = rs.getInt("CD_TREINOA");
            } 
        return n;
    }

    public void populandoTelaTreinosStrings() throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT * FROM TB_TREINOSA WHERE CD_TREINOA = '"+treinos.getCd_treino()+"' ";
        rs = stmt.executeQuery(sql);
        
            if(rs.next()){
                treinos.setCd_treino(rs.getInt("CD_TREINOA"));
                treinos.setDt_inicio(rs.getString("DT_INICIO"));
                treinos.setDt_fim(rs.getString("DT_FIM"));
                //treinos.setGrupo_muscularA1(rs.getString("GRUPO_MUSCULARA1"));
                //treinos.setExercicioA1("EXERCICIOA1");
                //treinos.setRepeticaoA1("REPETICAOA1");
                treinos.setObservacaoA1(rs.getString("OBSERVACAOA1"));
                /*
                treinos.setExercicioA1_1("EXERCICIOA1_1");
                treinos.setRepeticaoA1_1("REPETICAOA1_1");
                treinos.setObservacaoA1_1("OBSERVACAOA1_1");
                treinos.setExercicioA1_2("EXERCICIOA1_2");
                treinos.setRepeticaoA1_2("REPETICAOA1_2");
                treinos.setObservacaoA1_2("OBSERVACAOA1_2");
                treinos.setExercicioA1_3("EXERCICIOA1_3");
                treinos.setRepeticaoA1_3("REPETICAOA1_3");
                treinos.setObservacaoA1_3("OBSERVACAOA1_3");
                treinos.setExercicioA1_4("EXERCICIOA1_4");
                treinos.setRepeticaoA1_4("REPETICAOA1_4");
                treinos.setObservacaoA1_4("OBSERVACAOA1_4");
                treinos.setExercicioA1_5("EXERCICIOA1_5");
                treinos.setRepeticaoA1_5("REPETICAOA1_5");
                treinos.setObservacaoA1_5("OBSERVACAOA1_5");
                treinos.setExercicioA1_6("EXERCICIOA1_6");
                treinos.setRepeticaoA1_6("REPETICAOA1_6");
                treinos.setObservacaoA1_6("OBSERVACAOA1_6");
                treinos.setGrupo_muscularA2("GRUPO_MUSCULARA2");
                treinos.setExercicioA2("EXERCICIOA2");
                treinos.setRepeticaoA2("REPETICAOA2");
                treinos.setObservacaoA2("OBSERVACAOA2");
                treinos.setExercicioA2_1("EXERCICIOA2_1");
                treinos.setRepeticaoA2_1("REPETICAOA2_1");
                treinos.setObservacaoA2_1("OBSERVACAOA2_1");
                treinos.setExercicioA2_2("EXERCICIOA2_2");
                treinos.setRepeticaoA2_2("REPETICAOA2_2");
                treinos.setObservacaoA2_2("OBSERVACAOA2_2");
                treinos.setExercicioA2_3("EXERCICIOA2_3");
                treinos.setRepeticaoA2_3("REPETICAOA2_3");
                treinos.setObservacaoA2_3("OBSERVACAOA2_3");
                treinos.setExercicioA2_4("EXERCICIOA2_4");
                treinos.setRepeticaoA2_4("REPETICAOA2_4");
                treinos.setObservacaoA2_4("OBSERVACAOA2_4");
                treinos.setExercicioA2_5("EXERCICIOA2_5");
                treinos.setRepeticaoA2_5("REPETICAOA2_5");
                treinos.setObservacaoA2_5("OBSERVACAOA2_5");
                treinos.setExercicioA2_6("EXERCICIOA2_6");
                treinos.setRepeticaoA2_6("REPETICAOA2_6");
                treinos.setObservacaoA2_6("OBSERVACAOA2_6"); 
                treinos.setGrupo_muscularA3("GRUPO_MUSCULARA3");
                treinos.setExercicioA3("EXERCICIOA3");
                treinos.setRepeticaoA3("REPETICAOA3");
                treinos.setObservacaoA3("OBSERVACAOA3");
                treinos.setExercicioA3_1("EXERCICIOA3_1");
                treinos.setRepeticaoA3_1("REPETICAOA3_1");
                treinos.setObservacaoA3_1("OBSERVACAOA3_1");
                treinos.setExercicioA3_2("EXERCICIOA3_2");
                treinos.setRepeticaoA3_2("REPETICAOA3_2");
                treinos.setObservacaoA3_2("OBSERVACAOA3_2");
                treinos.setExercicioA3_3("EXERCICIOA3_3");
                treinos.setRepeticaoA3_3("REPETICAOA3_3");
                treinos.setObservacaoA3_3("OBSERVACAOA3_3");
                treinos.setExercicioA3_4("EXERCICIOA3_4");
                treinos.setRepeticaoA3_4("REPETICAOA3_4");
                treinos.setObservacaoA3_4("OBSERVACAOA3_4");
                treinos.setExercicioA3_5("EXERCICIOA3_5");
                treinos.setRepeticaoA3_5("REPETICAOA3_5");
                treinos.setObservacaoA3_5("OBSERVACAOA3_5");
                treinos.setExercicioA3_6("EXERCICIOA3_6");
                treinos.setRepeticaoA3_6("REPETICAOA3_6");
                treinos.setObservacaoA3_6("OBSERVACAOA3_6"); */
                
                
                
            } 
            //System.out.println(treinos.getGrupo_muscularA1()); //teste
            //System.out.println(dados.getCd_membro()); //teste
    }
    
    public String populandoTelaTreinosGruposMusculares(ClasseCadastro_treino codigo) throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        String nome = "";
        String sql = "SELECT NM_MEMBRO FROM TB_MEMBROS A,TB_TREINOSA B, TB_ALUNOS C WHERE A.CD_MEMBRO = B.GRUPO_MUSCULARA1 AND C.CD_REGISTRO = '"+codigo.getCd_registro()+"' ";
   
        rs = stmt.executeQuery(sql);
        
            if(rs.next())
                nome = rs.getString("NM_MEMBRO"); 
            
        return nome;        
          
    }
  
}
    
    
    
    
    
    

