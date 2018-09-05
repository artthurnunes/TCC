
package conexoesbancodedados;

import classes.ClasseCadastro_exercicios;
import classes.ClasseCadastro_modalidades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DeleteBd {
    
    
    public void apagarGrupoMuscular(ClasseCadastro_exercicios dados) throws SQLException{
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM TB_MEMBROS WHERE NM_MEMBRO = '"+dados.getNm_membro()+"'");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"<html>CADASTRO DO GRUPO MUSCULAR: <b>"+dados.getNm_membro()+"</b> <br>EXLCUIDO COM SUCESSO !!!</html>");
        }catch(SQLException ex){
            //JOptionPane.showMessageDialog(null,"ERRO AO EXCLUIR !"+ex); //exibir o erro
            JOptionPane.showMessageDialog(null, "Este grupo muscular possui exercícios, exclua os exercícios primeiro.");
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }   
    }
    
    public void apagarExercicio(ClasseCadastro_exercicios dados) throws SQLException{
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getNm_exercicio()+"'");
            //stmt = con.prepareStatement("UPDATE TB_ALUNOS SET SITUACAO = FALSE WHERE CD_REGISTRO =(?)");
            //stmt.setInt(1,cd_registro);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"<html>EXERCÍCIO: <b>"+dados.getNm_exercicio()+"</b> <br>EXLCUIDO COM SUCESSO !!!</html>");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO EXCLUIR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }  
        
        
    }
    
    public void apagarRepeticoes(ClasseCadastro_exercicios dados) throws SQLException{
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getNm_repeticao()+"'");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"<html>REPETIÇÃO: <b>"+dados.getNm_repeticao()+"</b> <br>EXLCUIDA COM SUCESSO !!!</html>");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO EXCLUIR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }  
        
        
    }
    
    public void apagarModalidade(ClasseCadastro_modalidades dados) throws SQLException{
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM TB_MODALIDADES WHERE NM_MODALIDADE = '"+dados.getNm_modalidade()+"'");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"<html>MODALIDADE: <b>"+dados.getNm_modalidade()+"</b> <br>EXLCUIDA COM SUCESSO !!!</html>");
        }catch(SQLException ex){
            //JOptionPane.showMessageDialog(null,"ERRO AO EXCLUIR !"+ex); //exibir o erro
            JOptionPane.showMessageDialog(null, "Esta modalidade não pode ser excluída pois está sendo utilizada para algum cadastro de aluno.");
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }   
    }
    
}
