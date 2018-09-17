
package classes;

import conexoesbancodedados.ConectaBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ClasseAltSenha {
    
    ResultSet rs = null;
    Connection con;
    PreparedStatement stmt = null;
    private static String usuario;
    private static String senha;
    private static String novaSenha;
    private static String nome;

    public void verificaUsuario(String user) throws SQLException{
        
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();

        String sql = "SELECT NOME FROM TB_SENHAS WHERE USUARIO = '"+user+"' ";
        
        rs = stmt.executeQuery(sql);
        
            if(rs.next()){
                this.setNome(rs.getString("NOME"));
            }else{
                this.setNome(null);
            }
    }
    
    public boolean verificaSenha(ClasseAltSenha dados){
        
        con = ConectaBd.getConnection();
        boolean check = false;
        
        try{
            stmt = con.prepareStatement("SELECT USUARIO,SENHA FROM TB_SENHAS WHERE USUARIO = ? AND SENHA = ?");
            stmt.setString(1,dados.getUsuario());
            stmt.setString(2,dados.getSenha());
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
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNovaSenha() {
        return novaSenha;
    }

    public void setNovaSenha(String novaSenha) {
        this.novaSenha = novaSenha;
    }
    
    
    
}
