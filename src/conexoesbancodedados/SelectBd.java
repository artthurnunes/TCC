
package conexoesbancodedados;

import classes.ClasseCadastro;
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
    
    //select para pesquisar aluno sem like, vai pegar na ordem alfabética
    public void selectCadastroAlfabetico(ClasseCadastro dados) throws SQLException{
        
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();

        String sql = "SELECT CD_REGISTRO,SITUACAO,NOME,TEL1,TEL2,PROFISSAO,SEXO,ESTADO_CIVIL,RG,CPF,DT_NASCIMENTO"
                             + ",NM_MAE,NM_PAI,NM_EMER,TEL_EMER,PARENTESCO,END_RUA,END_NUMERO,END_BAIRRO,END_CIDADE"
                             + ",END_ESTADO,END_CEP "
                      + "FROM TB_ALUNOS ";
                      //+ "WHERE NOME = 'Arthur Nunes' ";
        
        rs = stmt.executeQuery(sql);
        
            if(rs.next()){
                dados.setCd_registro(rs.getInt("CD_REGISTRO"));
                dados.setNome(rs.getString("NOME"));
            }   
    }
    
    
    
    
    
    
}
