
package conexoesbancodedados;

import classes.ClasseCadastro;
import classes.ClasseCadastro_exercicios;
import classes.ClasseCadastro_modalidades;
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
            JOptionPane.showMessageDialog(null,"TREINO SALVO COM SUCESSO !");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }        
        
    }
    
    public void insereTreinoB(ClasseCadastro_treino dados){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null;
             
        try{
           stmt = con.prepareStatement("INSERT INTO TB_TREINOSB (CD_REGISTRO,GRUPO_MUSCULARB1,EXERCICIOB1,REPETICAOB1,OBSERVACAOB1,EXERCICIOB1_1,REPETICAOB1_1,OBSERVACAOB1_1,EXERCICIOB1_2,REPETICAOB1_2,OBSERVACAOB1_2,EXERCICIOB1_3,REPETICAOB1_3,OBSERVACAOB1_3,EXERCICIOB1_4,REPETICAOB1_4,OBSERVACAOB1_4,EXERCICIOB1_5,REPETICAOB1_5,OBSERVACAOB1_5,EXERCICIOB1_6,REPETICAOB1_6,OBSERVACAOB1_6"
                   + ",GRUPO_MUSCULARB2,EXERCICIOB2,REPETICAOB2,OBSERVACAOB2,EXERCICIOB2_1,REPETICAOB2_1,OBSERVACAOB2_1,EXERCICIOB2_2,REPETICAOB2_2,OBSERVACAOB2_2,EXERCICIOB2_3,REPETICAOB2_3,OBSERVACAOB2_3,EXERCICIOB2_4,REPETICAOB2_4,OBSERVACAOB2_4,EXERCICIOB2_5,REPETICAOB2_5,OBSERVACAOB2_5,EXERCICIOB2_6,REPETICAOB2_6,OBSERVACAOB2_6"
                   + ",GRUPO_MUSCULARB3,EXERCICIOB3,REPETICAOB3,OBSERVACAOB3,EXERCICIOB3_1,REPETICAOB3_1,OBSERVACAOB3_1,EXERCICIOB3_2,REPETICAOB3_2,OBSERVACAOB3_2,EXERCICIOB3_3,REPETICAOB3_3,OBSERVACAOB3_3,EXERCICIOB3_4,REPETICAOB3_4,OBSERVACAOB3_4,EXERCICIOB3_5,REPETICAOB3_5,OBSERVACAOB3_5,EXERCICIOB3_6,REPETICAOB3_6,OBSERVACAOB3_6"
                   + ",GRUPO_MUSCULARB4,EXERCICIOB4,REPETICAOB4,OBSERVACAOB4,EXERCICIOB4_1,REPETICAOB4_1,OBSERVACAOB4_1,EXERCICIOB4_2,REPETICAOB4_2,OBSERVACAOB4_2,EXERCICIOB4_3,REPETICAOB4_3,OBSERVACAOB4_3,EXERCICIOB4_4,REPETICAOB4_4,OBSERVACAOB4_4,EXERCICIOB4_5,REPETICAOB4_5,OBSERVACAOB4_5,EXERCICIOB4_6,REPETICAOB4_6,OBSERVACAOB4_6"
                   + ",GRUPO_MUSCULARB5,EXERCICIOB5,REPETICAOB5,OBSERVACAOB5,EXERCICIOB5_1,REPETICAOB5_1,OBSERVACAOB5_1,EXERCICIOB5_2,REPETICAOB5_2,OBSERVACAOB5_2,EXERCICIOB5_3,REPETICAOB5_3,OBSERVACAOB5_3,EXERCICIOB5_4,REPETICAOB5_4,OBSERVACAOB5_4,EXERCICIOB5_5,REPETICAOB5_5,OBSERVACAOB5_5,EXERCICIOB5_6,REPETICAOB5_6,OBSERVACAOB5_6)"
                   
                   + "VALUES ((?),(SELECT CD_MEMBRO FROM TB_MEMBROS WHERE NM_MEMBRO = '"+dados.getGrupo_muscularB1()+"')"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB1()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB1()+"'),(?)"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB1_1()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB1_1()+"'),(?)"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB1_2()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB1_2()+"'),(?)"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB1_3()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB1_3()+"'),(?)"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB1_4()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB1_4()+"'),(?)"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB1_5()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB1_5()+"'),(?)"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB1_6()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB1_6()+"'),(?)"
                   
                        + ",(SELECT CD_MEMBRO FROM TB_MEMBROS WHERE NM_MEMBRO = '"+dados.getGrupo_muscularB2()+"')  "
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB2()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB2()+"'),(?)"
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB2_1()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB2_1()+"'),(?)"
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB2_2()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB2_2()+"'),(?)"
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB2_3()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB2_3()+"'),(?)"
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB2_4()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB2_4()+"'),(?)"
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB2_5()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB2_5()+"'),(?)"
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB2_6()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB2_6()+"'),(?)"
                   
                            + ",(SELECT CD_MEMBRO FROM TB_MEMBROS WHERE NM_MEMBRO = '"+dados.getGrupo_muscularB3()+"')  "
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB3()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB3()+"'),(?)"
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB3_1()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB3_1()+"'),(?)"
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB3_2()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB3_2()+"'),(?)"
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB3_3()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB3_3()+"'),(?)"
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB3_4()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB3_4()+"'),(?)"
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB3_5()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB3_5()+"'),(?)"
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB3_6()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB3_6()+"'),(?)"        
                           
                                + ",(SELECT CD_MEMBRO FROM TB_MEMBROS WHERE NM_MEMBRO = '"+dados.getGrupo_muscularB4()+"')  "
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB4()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB4()+"'),(?)"
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB4_1()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB4_1()+"'),(?)"
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB4_2()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB4_2()+"'),(?)"
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB4_3()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB4_3()+"'),(?)"
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB4_4()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB4_4()+"'),(?)"
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB4_5()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB4_5()+"'),(?)"
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB4_6()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB4_6()+"'),(?)"
                                 
                                    + ",(SELECT CD_MEMBRO FROM TB_MEMBROS WHERE NM_MEMBRO = '"+dados.getGrupo_muscularB5()+"')  "
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB5()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB5()+"'),(?)"
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB5_1()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB5_1()+"'),(?)"
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB5_2()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB5_2()+"'),(?)"
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB5_3()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB5_3()+"'),(?)"
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB5_4()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB5_4()+"'),(?)"
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB5_5()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB5_5()+"'),(?)"
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioB5_6()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoB5_6()+"'),(?)"                                  
                                    + "  )");
            
            stmt.setInt(1, dados.getCd_registro());
            stmt.setString(2, dados.getObservacaoB1());
            stmt.setString(3, dados.getObservacaoB1_1());
            stmt.setString(4, dados.getObservacaoB1_2());
            stmt.setString(5, dados.getObservacaoB1_3());
            stmt.setString(6, dados.getObservacaoB1_4());
            stmt.setString(7, dados.getObservacaoB1_5());
            stmt.setString(8, dados.getObservacaoB1_6());
            stmt.setString(9, dados.getObservacaoB2());
            stmt.setString(10, dados.getObservacaoB2_1());
            stmt.setString(11, dados.getObservacaoB2_2());
            stmt.setString(12, dados.getObservacaoB2_3());
            stmt.setString(13, dados.getObservacaoB2_4());
            stmt.setString(14, dados.getObservacaoB2_5());
            stmt.setString(15, dados.getObservacaoB2_6());
            stmt.setString(16, dados.getObservacaoB3());
            stmt.setString(17, dados.getObservacaoB3_1());
            stmt.setString(18, dados.getObservacaoB3_2());
            stmt.setString(19, dados.getObservacaoB3_3());
            stmt.setString(20, dados.getObservacaoB3_4());
            stmt.setString(21, dados.getObservacaoB3_5());
            stmt.setString(22, dados.getObservacaoB3_6());
            stmt.setString(23, dados.getObservacaoB4());
            stmt.setString(24, dados.getObservacaoB4_1());
            stmt.setString(25, dados.getObservacaoB4_2());
            stmt.setString(26, dados.getObservacaoB4_3());
            stmt.setString(27, dados.getObservacaoB4_4());
            stmt.setString(28, dados.getObservacaoB4_5());
            stmt.setString(29, dados.getObservacaoB4_6());
            stmt.setString(30, dados.getObservacaoB5());
            stmt.setString(31, dados.getObservacaoB5_1());
            stmt.setString(32, dados.getObservacaoB5_2());
            stmt.setString(33, dados.getObservacaoB5_3());
            stmt.setString(34, dados.getObservacaoB5_4());
            stmt.setString(35, dados.getObservacaoB5_5());
            stmt.setString(36, dados.getObservacaoB5_6());
                                   
            stmt.executeUpdate();
            //JOptionPane.showMessageDialog(null,"TREINO B SALVO !");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }        
        
    }
    
    public void insereTreinoC(ClasseCadastro_treino dados){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null;
             
        try{
           stmt = con.prepareStatement("INSERT INTO TB_TREINOSC (CD_REGISTRO,GRUPO_MUSCULARC1,EXERCICIOC1,REPETICAOC1,OBSERVACAOC1,EXERCICIOC1_1,REPETICAOC1_1,OBSERVACAOC1_1,EXERCICIOC1_2,REPETICAOC1_2,OBSERVACAOC1_2,EXERCICIOC1_3,REPETICAOC1_3,OBSERVACAOC1_3,EXERCICIOC1_4,REPETICAOC1_4,OBSERVACAOC1_4,EXERCICIOC1_5,REPETICAOC1_5,OBSERVACAOC1_5,EXERCICIOC1_6,REPETICAOC1_6,OBSERVACAOC1_6"
                   + ",GRUPO_MUSCULARC2,EXERCICIOC2,REPETICAOC2,OBSERVACAOC2,EXERCICIOC2_1,REPETICAOC2_1,OBSERVACAOC2_1,EXERCICIOC2_2,REPETICAOC2_2,OBSERVACAOC2_2,EXERCICIOC2_3,REPETICAOC2_3,OBSERVACAOC2_3,EXERCICIOC2_4,REPETICAOC2_4,OBSERVACAOC2_4,EXERCICIOC2_5,REPETICAOC2_5,OBSERVACAOC2_5,EXERCICIOC2_6,REPETICAOC2_6,OBSERVACAOC2_6"
                   + ",GRUPO_MUSCULARC3,EXERCICIOC3,REPETICAOC3,OBSERVACAOC3,EXERCICIOC3_1,REPETICAOC3_1,OBSERVACAOC3_1,EXERCICIOC3_2,REPETICAOC3_2,OBSERVACAOC3_2,EXERCICIOC3_3,REPETICAOC3_3,OBSERVACAOC3_3,EXERCICIOC3_4,REPETICAOC3_4,OBSERVACAOC3_4,EXERCICIOC3_5,REPETICAOC3_5,OBSERVACAOC3_5,EXERCICIOC3_6,REPETICAOC3_6,OBSERVACAOC3_6"
                   + ",GRUPO_MUSCULARC4,EXERCICIOC4,REPETICAOC4,OBSERVACAOC4,EXERCICIOC4_1,REPETICAOC4_1,OBSERVACAOC4_1,EXERCICIOC4_2,REPETICAOC4_2,OBSERVACAOC4_2,EXERCICIOC4_3,REPETICAOC4_3,OBSERVACAOC4_3,EXERCICIOC4_4,REPETICAOC4_4,OBSERVACAOC4_4,EXERCICIOC4_5,REPETICAOC4_5,OBSERVACAOC4_5,EXERCICIOC4_6,REPETICAOC4_6,OBSERVACAOC4_6"
                   + ",GRUPO_MUSCULARC5,EXERCICIOC5,REPETICAOC5,OBSERVACAOC5,EXERCICIOC5_1,REPETICAOC5_1,OBSERVACAOC5_1,EXERCICIOC5_2,REPETICAOC5_2,OBSERVACAOC5_2,EXERCICIOC5_3,REPETICAOC5_3,OBSERVACAOC5_3,EXERCICIOC5_4,REPETICAOC5_4,OBSERVACAOC5_4,EXERCICIOC5_5,REPETICAOC5_5,OBSERVACAOC5_5,EXERCICIOC5_6,REPETICAOC5_6,OBSERVACAOC5_6)"
                   
                   + "VALUES ((?),(SELECT CD_MEMBRO FROM TB_MEMBROS WHERE NM_MEMBRO = '"+dados.getGrupo_muscularC1()+"')"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC1()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC1()+"'),(?)"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC1_1()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC1_1()+"'),(?)"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC1_2()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC1_2()+"'),(?)"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC1_3()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC1_3()+"'),(?)"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC1_4()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC1_4()+"'),(?)"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC1_5()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC1_5()+"'),(?)"
                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC1_6()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC1_6()+"'),(?)"
                   
                        + ",(SELECT CD_MEMBRO FROM TB_MEMBROS WHERE NM_MEMBRO = '"+dados.getGrupo_muscularC2()+"')  "
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC2()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC2()+"'),(?)"
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC2_1()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC2_1()+"'),(?)"
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC2_2()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC2_2()+"'),(?)"
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC2_3()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC2_3()+"'),(?)"
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC2_4()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC2_4()+"'),(?)"
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC2_5()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC2_5()+"'),(?)"
                        + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC2_6()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC2_6()+"'),(?)"
                   
                            + ",(SELECT CD_MEMBRO FROM TB_MEMBROS WHERE NM_MEMBRO = '"+dados.getGrupo_muscularC3()+"')  "
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC3()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC3()+"'),(?)"
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC3_1()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC3_1()+"'),(?)"
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC3_2()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC3_2()+"'),(?)"
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC3_3()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC3_3()+"'),(?)"
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC3_4()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC3_4()+"'),(?)"
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC3_5()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC3_5()+"'),(?)"
                            + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC3_6()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC3_6()+"'),(?)"        
                           
                                + ",(SELECT CD_MEMBRO FROM TB_MEMBROS WHERE NM_MEMBRO = '"+dados.getGrupo_muscularC4()+"')  "
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC4()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC4()+"'),(?)"
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC4_1()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC4_1()+"'),(?)"
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC4_2()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC4_2()+"'),(?)"
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC4_3()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC4_3()+"'),(?)"
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC4_4()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC4_4()+"'),(?)"
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC4_5()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC4_5()+"'),(?)"
                                + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC4_6()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC4_6()+"'),(?)"
                                 
                                    + ",(SELECT CD_MEMBRO FROM TB_MEMBROS WHERE NM_MEMBRO = '"+dados.getGrupo_muscularC5()+"')  "
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC5()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC5()+"'),(?)"
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC5_1()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC5_1()+"'),(?)"
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC5_2()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC5_2()+"'),(?)"
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC5_3()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC5_3()+"'),(?)"
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC5_4()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC5_4()+"'),(?)"
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC5_5()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC5_5()+"'),(?)"
                                    + ",(SELECT CD_EXERCICIO FROM TB_EXERCICIOS WHERE NM_EXERCICIO = '"+dados.getExercicioC5_6()+"'),(SELECT CD_REPETICAO FROM TB_REPETICOES WHERE NM_REPETICAO = '"+dados.getRepeticaoC5_6()+"'),(?)"                                  
                                    + "  )");
            
            stmt.setInt(1, dados.getCd_registro());
            stmt.setString(2, dados.getObservacaoC1());
            stmt.setString(3, dados.getObservacaoC1_1());
            stmt.setString(4, dados.getObservacaoC1_2());
            stmt.setString(5, dados.getObservacaoC1_3());
            stmt.setString(6, dados.getObservacaoC1_4());
            stmt.setString(7, dados.getObservacaoC1_5());
            stmt.setString(8, dados.getObservacaoC1_6());
            stmt.setString(9, dados.getObservacaoC2());
            stmt.setString(10, dados.getObservacaoC2_1());
            stmt.setString(11, dados.getObservacaoC2_2());
            stmt.setString(12, dados.getObservacaoC2_3());
            stmt.setString(13, dados.getObservacaoC2_4());
            stmt.setString(14, dados.getObservacaoC2_5());
            stmt.setString(15, dados.getObservacaoC2_6());
            stmt.setString(16, dados.getObservacaoC3());
            stmt.setString(17, dados.getObservacaoC3_1());
            stmt.setString(18, dados.getObservacaoC3_2());
            stmt.setString(19, dados.getObservacaoC3_3());
            stmt.setString(20, dados.getObservacaoC3_4());
            stmt.setString(21, dados.getObservacaoC3_5());
            stmt.setString(22, dados.getObservacaoC3_6());
            stmt.setString(23, dados.getObservacaoC4());
            stmt.setString(24, dados.getObservacaoC4_1());
            stmt.setString(25, dados.getObservacaoC4_2());
            stmt.setString(26, dados.getObservacaoC4_3());
            stmt.setString(27, dados.getObservacaoC4_4());
            stmt.setString(28, dados.getObservacaoC4_5());
            stmt.setString(29, dados.getObservacaoC4_6());
            stmt.setString(30, dados.getObservacaoC5());
            stmt.setString(31, dados.getObservacaoC5_1());
            stmt.setString(32, dados.getObservacaoC5_2());
            stmt.setString(33, dados.getObservacaoC5_3());
            stmt.setString(34, dados.getObservacaoC5_4());
            stmt.setString(35, dados.getObservacaoC5_5());
            stmt.setString(36, dados.getObservacaoC5_6());
                                   
            stmt.executeUpdate();
            //JOptionPane.showMessageDialog(null,"TREINO C SALVO !");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }        
        
    }
    
    public void insereModalidade(String dado){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO TB_MODALIDADES (NM_MODALIDADE) VALUES (?)");           
            
            stmt.setString(1, dado);                                   
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"MODALIDADE SALVA COM SUCESSO !");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }          
    }
    
    public void insereModAluno(ClasseCadastro_modalidades dados){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO TB_MOD_ALUNOS (CD_REGISTRO,CD_MODALIDADE1,CD_MODALIDADE2,CD_MODALIDADE3,CD_MODALIDADE4,CD_MODALIDADE5,CD_MODALIDADE6,CD_MODALIDADE7,CD_MODALIDADE8) "
                    + "VALUES (?,(SELECT CD_MODALIDADE FROM TB_MODALIDADES WHERE NM_MODALIDADE = '"+dados.getNm_mod_comb1()+"')"
                    + ",(SELECT CD_MODALIDADE FROM TB_MODALIDADES WHERE NM_MODALIDADE = '"+dados.getNm_mod_comb2()+"')"
                    + ",(SELECT CD_MODALIDADE FROM TB_MODALIDADES WHERE NM_MODALIDADE = '"+dados.getNm_mod_comb3()+"')"
                    + ",(SELECT CD_MODALIDADE FROM TB_MODALIDADES WHERE NM_MODALIDADE = '"+dados.getNm_mod_comb4()+"')"
                    + ",(SELECT CD_MODALIDADE FROM TB_MODALIDADES WHERE NM_MODALIDADE = '"+dados.getNm_mod_comb5()+"')"
                    + ",(SELECT CD_MODALIDADE FROM TB_MODALIDADES WHERE NM_MODALIDADE = '"+dados.getNm_mod_comb6()+"')"
                    + ",(SELECT CD_MODALIDADE FROM TB_MODALIDADES WHERE NM_MODALIDADE = '"+dados.getNm_mod_comb7()+"')"
                    + ",(SELECT CD_MODALIDADE FROM TB_MODALIDADES WHERE NM_MODALIDADE = '"+dados.getNm_mod_comb8()+"')"   
                    + ")");           
            
            stmt.setInt(1, dados.getCd_registro());
            //stmt.setInt(2, dados.getCd_registro());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"MODALIDADE DO ALUNO SALVA COM SUCESSO !");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }          
    }
    
    
    
    
    
}
