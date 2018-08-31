
package conexoesbancodedados;

import classes.ClasseCadastro;
import classes.ClasseCadastro_exercicios;
import classes.ClasseCadastro_treino;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InsertBd {
    
    public void insertCadastro(ClasseCadastro dados){
        
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null;
 
        try{
            stmt = con.prepareStatement("INSERT INTO TB_ALUNOS (SITUACAO,NOME,TEL1,TEL2,PROFISSAO,SEXO,ESTADO_CIVIL"
                                        + ",RG,CPF,DT_NASCIMENTO,NM_MAE,NM_PAI,NM_EMER,TEL_EMER,PARENTESCO,END_RUA"
                                        + ",END_NUMERO,END_BAIRRO,END_CIDADE,END_ESTADO,END_CEP) "
                                        + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");           
            
            stmt.setBoolean(1, dados.getSituacao());
            stmt.setString(2, dados.getNome());
            stmt.setString(3, dados.getTel1());
            stmt.setString(4, dados.getTel2());
            stmt.setString(5, dados.getProfissao());
            stmt.setString(6,dados.getSexo());
            stmt.setInt(7, dados.getEstado_civil());
            stmt.setString(8, dados.getRg());
            stmt.setString(9, dados.getCpf());
            stmt.setString(10, dados.getDt_nascimento());
            stmt.setString(11,dados.getNm_mae());
            stmt.setString(12, dados.getNm_pai());
            stmt.setString(13, dados.getNm_emer());
            stmt.setString(14, dados.getTel_emer());
            stmt.setInt(15, dados.getParentesco());
            stmt.setString(16,dados.getEnd_rua());
            stmt.setString(17, dados.getEnd_numero());
            stmt.setString(18, dados.getEnd_bairro());
            stmt.setString(19, dados.getEnd_cidade());
            stmt.setInt(20, dados.getEnd_estado());
            stmt.setString(21,dados.getEnd_cep());
                       
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"SALVO COM SUCESSO !");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }        
    }
    
    //Insert para cadastrar grupos musculares
    public void insereGrupoMembro(ClasseCadastro_exercicios dados){
        
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null;
 
        try{
            stmt = con.prepareStatement("INSERT INTO TB_MEMBROS (NM_MEMBRO) VALUES (?)");           
            
            stmt.setString(1, dados.getNm_membro());
                                   
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"SALVO COM SUCESSO !");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }        
    }
    
    //Insert para cadastrar exercicios
    public void insereExercicio(ClasseCadastro_exercicios dados){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO TB_EXERCICIOS (NM_EXERCICIO,CD_MEMBRO) VALUES (?,?)");           
            
            stmt.setString(1, dados.getNm_exercicio());
            stmt.setInt(2, dados.getCd_membro());
                                   
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"EXERCÍCIO SALVO COM SUCESSO !");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }        
        
    }
    
    public void insereRepeticoes(ClasseCadastro_exercicios dados){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null;
        //INSERT INTO TB_REPETICOES (NM_REPETICAO) VALUES ('3x10')
        try{
            stmt = con.prepareStatement("INSERT INTO TB_REPETICOES (NM_REPETICAO) VALUES (?)");           
            
            stmt.setString(1, dados.getNm_repeticao());
                                   
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"REPETIÇÃO SALVA COM SUCESSO !");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }        
        
    }
    
    public void insereTreinoA(ClasseCadastro_treino dados){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null;
        System.out.println("No Insert :"+dados.getCd_registro()); 
        try{
            stmt = con.prepareStatement("INSERT INTO TB_TREINOSA (DT_INICIO,DT_FIM,CD_REGISTRO,GRUPO_MUSCULARA1,EXERCICIOA1,REPETICAOA1,OBSERVACAOA1) "
+ "VALUES ((?),(?),(?),(SELECT CD_MEMBRO FROM TB_MEMBROS WHERE NM_MEMBRO = '"+dados.getGrupo_muscularA1()+"'),(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA1()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA1()+"'),(?)          )");           
            
            stmt.setString(1, dados.getDt_inicio());
            stmt.setString(2, dados.getDt_fim());
            stmt.setInt(3, dados.getCd_registro());
            stmt.setString(4, dados.getObservacaoA1());
                                   
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"TREINO SALVO !");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }        
        
    }
    
}
