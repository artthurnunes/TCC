
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
        //System.out.println("No Insert :"+dados.getCd_registro()); //teste
             
        try{
           stmt = con.prepareStatement("INSERT INTO TB_TREINOSA (DT_INICIO,DT_FIM,CD_REGISTRO,GRUPO_MUSCULARA1,EXERCICIOA1,REPETICAOA1,OBSERVACAOA1,EXERCICIOA1_1,REPETICAOA1_1,OBSERVACAOA1_1,EXERCICIOA1_2,REPETICAOA1_2,OBSERVACAOA1_2,EXERCICIOA1_3,REPETICAOA1_3,OBSERVACAOA1_3,EXERCICIOA1_4,REPETICAOA1_4,OBSERVACAOA1_4,EXERCICIOA1_5,REPETICAOA1_5,OBSERVACAOA1_5,EXERCICIOA1_6,REPETICAOA1_6,OBSERVACAOA1_6"
                   + ",GRUPO_MUSCULARA2,EXERCICIOA2,REPETICAOA2,OBSERVACAOA2,EXERCICIOA2_1,REPETICAOA2_1,OBSERVACAOA2_1,EXERCICIOA2_2,REPETICAOA2_2,OBSERVACAOA2_2,EXERCICIOA2_3,REPETICAOA2_3,OBSERVACAOA2_3,EXERCICIOA2_4,REPETICAOA2_4,OBSERVACAOA2_4,EXERCICIOA2_5,REPETICAOA2_5,OBSERVACAOA2_5,EXERCICIOA2_6,REPETICAOA2_6,OBSERVACAOA2_6"
                   + ",GRUPO_MUSCULARA3,EXERCICIOA3,REPETICAOA3,OBSERVACAOA3,EXERCICIOA3_1,REPETICAOA3_1,OBSERVACAOA3_1,EXERCICIOA3_2,REPETICAOA3_2,OBSERVACAOA3_2,EXERCICIOA3_3,REPETICAOA3_3,OBSERVACAOA3_3,EXERCICIOA3_4,REPETICAOA3_4,OBSERVACAOA3_4,EXERCICIOA3_5,REPETICAOA3_5,OBSERVACAOA3_5,EXERCICIOA3_6,REPETICAOA3_6,OBSERVACAOA3_6"
                   + ",GRUPO_MUSCULARA4,EXERCICIOA4,REPETICAOA4,OBSERVACAOA4,EXERCICIOA4_1,REPETICAOA4_1,OBSERVACAOA4_1,EXERCICIOA4_2,REPETICAOA4_2,OBSERVACAOA4_2,EXERCICIOA4_3,REPETICAOA4_3,OBSERVACAOA4_3,EXERCICIOA4_4,REPETICAOA4_4,OBSERVACAOA4_4,EXERCICIOA4_5,REPETICAOA4_5,OBSERVACAOA4_5,EXERCICIOA4_6,REPETICAOA4_6,OBSERVACAOA4_6"
                   + ",GRUPO_MUSCULARA5,EXERCICIOA5,REPETICAOA5,OBSERVACAOA5,EXERCICIOA5_1,REPETICAOA5_1,OBSERVACAOA5_1,EXERCICIOA5_2,REPETICAOA5_2,OBSERVACAOA5_2,EXERCICIOA5_3,REPETICAOA5_3,OBSERVACAOA5_3,EXERCICIOA5_4,REPETICAOA5_4,OBSERVACAOA5_4,EXERCICIOA5_5,REPETICAOA5_5,OBSERVACAOA5_5,EXERCICIOA5_6,REPETICAOA5_6,OBSERVACAOA5_6)"
                   
                   + "VALUES ((?),(?),(?),(SELECT CD_MEMBRO FROM TB_MEMBROS WHERE NM_MEMBRO = '"+dados.getGrupo_muscularA1()+"')"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA1()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA1()+"'),(?)"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA1_1()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA1_1()+"'),(?)"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA1_2()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA1_2()+"'),(?)"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA1_3()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA1_3()+"'),(?)"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA1_4()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA1_4()+"'),(?)"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA1_5()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA1_5()+"'),(?)"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA1_6()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA1_6()+"'),(?)"
                   
                        + ",(SELECT CD_MEMBRO FROM TB_MEMBROS WHERE NM_MEMBRO = '"+dados.getGrupo_muscularA2()+"')  "
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA2()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA2()+"'),(?)"
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA2_1()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA2_1()+"'),(?)"
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA2_2()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA2_2()+"'),(?)"
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA2_3()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA2_3()+"'),(?)"
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA2_4()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA2_4()+"'),(?)"
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA2_5()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA2_5()+"'),(?)"
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA2_6()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA2_6()+"'),(?)"
                   
                            + ",(SELECT CD_MEMBRO FROM TB_MEMBROS WHERE NM_MEMBRO = '"+dados.getGrupo_muscularA3()+"')  "
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA3()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA3()+"'),(?)"
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA3_1()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA3_1()+"'),(?)"
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA3_2()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA3_2()+"'),(?)"
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA3_3()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA3_3()+"'),(?)"
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA3_4()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA3_4()+"'),(?)"
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA3_5()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA3_5()+"'),(?)"
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA3_6()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA3_6()+"'),(?)"        
                           
                                + ",(SELECT CD_MEMBRO FROM TB_MEMBROS WHERE NM_MEMBRO = '"+dados.getGrupo_muscularA4()+"')  "
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA4()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA4()+"'),(?)"
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA4_1()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA4_1()+"'),(?)"
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA4_2()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA4_2()+"'),(?)"
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA4_3()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA4_3()+"'),(?)"
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA4_4()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA4_4()+"'),(?)"
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA4_5()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA4_5()+"'),(?)"
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA4_6()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA4_6()+"'),(?)"
                                 
                                    + ",(SELECT CD_MEMBRO FROM TB_MEMBROS WHERE NM_MEMBRO = '"+dados.getGrupo_muscularA5()+"')  "
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA5()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA5()+"'),(?)"
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA5_1()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA5_1()+"'),(?)"
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA5_2()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA5_2()+"'),(?)"
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA5_3()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA5_3()+"'),(?)"
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA5_4()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA5_4()+"'),(?)"
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA5_5()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA5_5()+"'),(?)"
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioA5_6()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoA5_6()+"'),(?)"                                  
                                    + "  )");
            
            stmt.setString(1, dados.getDt_inicio());
            stmt.setString(2, dados.getDt_fim());
            stmt.setInt(3, dados.getCd_registro());
            stmt.setString(4, dados.getObservacaoA1());
            stmt.setString(5, dados.getObservacaoA1_1());
            stmt.setString(6, dados.getObservacaoA1_2());
            stmt.setString(7, dados.getObservacaoA1_3());
            stmt.setString(8, dados.getObservacaoA1_4());
            stmt.setString(9, dados.getObservacaoA1_5());
            stmt.setString(10, dados.getObservacaoA1_6());
            stmt.setString(11, dados.getObservacaoA2());
            stmt.setString(12, dados.getObservacaoA2_1());
            stmt.setString(13, dados.getObservacaoA2_2());
            stmt.setString(14, dados.getObservacaoA2_3());
            stmt.setString(15, dados.getObservacaoA2_4());
            stmt.setString(16, dados.getObservacaoA2_5());
            stmt.setString(17, dados.getObservacaoA2_6());
            stmt.setString(18, dados.getObservacaoA3());
            stmt.setString(19, dados.getObservacaoA3_1());
            stmt.setString(20, dados.getObservacaoA3_2());
            stmt.setString(21, dados.getObservacaoA3_3());
            stmt.setString(22, dados.getObservacaoA3_4());
            stmt.setString(23, dados.getObservacaoA3_5());
            stmt.setString(24, dados.getObservacaoA3_6());
            stmt.setString(25, dados.getObservacaoA4());
            stmt.setString(26, dados.getObservacaoA4_1());
            stmt.setString(27, dados.getObservacaoA4_2());
            stmt.setString(28, dados.getObservacaoA4_3());
            stmt.setString(29, dados.getObservacaoA4_4());
            stmt.setString(30, dados.getObservacaoA4_5());
            stmt.setString(31, dados.getObservacaoA4_6());
            stmt.setString(32, dados.getObservacaoA5());
            stmt.setString(33, dados.getObservacaoA5_1());
            stmt.setString(34, dados.getObservacaoA5_2());
            stmt.setString(35, dados.getObservacaoA5_3());
            stmt.setString(36, dados.getObservacaoA5_4());
            stmt.setString(37, dados.getObservacaoA5_5());
            stmt.setString(38, dados.getObservacaoA5_6());
                                   
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"TREINO SALVO !");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }        
        
    }
    
}
