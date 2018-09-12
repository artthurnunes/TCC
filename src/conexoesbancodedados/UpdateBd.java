
package conexoesbancodedados;

import classes.ClasseCadastro;
import classes.ClasseCadastro_planos;
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
    
    public void ativarCadastro(int cd_registro){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("UPDATE TB_ALUNOS SET SITUACAO = TRUE WHERE CD_REGISTRO =(?)");
            stmt.setInt(1,cd_registro);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"<html>CADASTRO ATIVADO COM SUCESSO !!!<br>Para editar os dados cadastrais vá para a tela de Cadastro</html>");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }  
    }
    
    public void alterarCadastroAluno(ClasseCadastro dados){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null; 
        
        try{
            stmt = con.prepareStatement("UPDATE TB_ALUNOS SET NOME = (?),TEL1 = (?),TEL2 = (?),PROFISSAO = (?)"
                                                        + ",SEXO = (?),ESTADO_CIVIL = (?),RG = (?),CPF = (?)"
                                                        + ",DT_NASCIMENTO = (?),NM_MAE = (?),NM_PAI = (?),NM_EMER = (?)"
                                                        + ",TEL_EMER = (?),PARENTESCO = (?),END_RUA = (?)"
                                                        + ",END_NUMERO = (?),END_BAIRRO = (?),END_CIDADE = (?)"
                                                        + ",END_ESTADO = (?),END_CEP = (?) WHERE CD_REGISTRO = (?)");
            stmt.setString(1,dados.getNome());
            stmt.setString(2, dados.getTel1());
            stmt.setString(3, dados.getTel2());
            stmt.setString(4, dados.getProfissao());
            stmt.setString(5,dados.getSexo());
            stmt.setInt(6, dados.getEstado_civil());
            stmt.setString(7, dados.getRg());
            stmt.setString(8, dados.getCpf());
            stmt.setString(9, dados.getDt_nascimento());
            stmt.setString(10,dados.getNm_mae());
            stmt.setString(11, dados.getNm_pai());
            stmt.setString(12, dados.getNm_emer());
            stmt.setString(13, dados.getTel_emer());
            stmt.setInt(14, dados.getParentesco());
            stmt.setString(15,dados.getEnd_rua());
            stmt.setString(16, dados.getEnd_numero());
            stmt.setString(17, dados.getEnd_bairro());
            stmt.setString(18, dados.getEnd_cidade());
            stmt.setInt(19, dados.getEnd_estado());
            stmt.setString(20,dados.getEnd_cep());
            stmt.setInt(21,dados.getCd_registro());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"<html>CADASTRO ATUALIZADO COM SUCESSO !</html>");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }  
    }
    
    public void alteraValorPlanos(ClasseCadastro_planos dados){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null; 
        
        try{
            stmt = con.prepareStatement("UPDATE TB_PLANOS_VALORES SET VALOR = (?) WHERE NM_PLANO = '"+dados.getNm_plano()+"'");
            
            stmt.setFloat(1,dados.getValor_plano());
           
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"<html>Plano atualizado com sucesso !</html>");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }  
    }
    
    
}
