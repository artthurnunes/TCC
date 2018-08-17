
package conexoesbancodedados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UpdateBd {
    
    public void inativaCadastro(int cd_registro){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("UPDATE TB_ALUNOS SET SITUACAO = FALSE WHERE CD_REGISTRO =(?)");
            stmt.setInt(1,cd_registro);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"<html>CADASTRO INATIVO !!!<br>Para ativar o cadastro novamente, vá para ?????</html>");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }  
    }
    
}
