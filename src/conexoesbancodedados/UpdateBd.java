
package conexoesbancodedados;

import classes.ClasseAltSenha;
import classes.ClasseCadastro;
import classes.ClasseCadastro_planos;
import classes.ClasseCatraca;
import classes.ClasseDespesas;
import classes.ClasseEquipamentos;
import classes.ClassePagamentoMensalidade;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UpdateBd {
    
    public void alteraSenhaAcesso(ClasseAltSenha dados){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null; 

        try{
            stmt = con.prepareStatement("UPDATE TB_SENHAS SET SENHA = (?),ESQ_SENHA = FALSE WHERE USUARIO = '"+dados.getUsuario()+"'");
            
            stmt.setString(1,dados.getNovaSenha());
           
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"<html>Senha atualizada com sucesso !</html>");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }  
    }
    
    public void esqueceuSenha(String user, String newPass){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null; 

        try{
            stmt = con.prepareStatement("UPDATE TB_SENHAS SET SENHA = (?),ESQ_SENHA = 1 WHERE USUARIO = (?)");
            
            stmt.setString(1,newPass);
            stmt.setString(2,user);
           
            stmt.executeUpdate();
            //JOptionPane.showMessageDialog(null,"<html>Senha atualizada com sucesso !</html>");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }  
    }
    
    public void inativaCadastro(int cd_registro){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("UPDATE TB_ALUNOS SET SITUACAO = FALSE WHERE CD_REGISTRO =(?)");
            stmt.setInt(1,cd_registro);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"<html>CADASTRO INATIVO !!!<br>Para ativar o cadastro novamente, vá para EXIBIR/EXIBIR ALUNOS INATIVOS</html>");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }  
    }
    
    public void inativaCadEquipamento(int codigo){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("UPDATE TB_EQUIPAMENTOS SET ATIVO = FALSE WHERE CD_EQUIPAMENTO =(?)");
            stmt.setInt(1,codigo);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"<html>CADASTRO INATIVO !!!<br>Para ativar o cadastro novamente, vá para EXIBIR/EXIBIR EQUIPAMENTOS INATIVOS</html>");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }  
    }
    
    public void ativarCadastroAluno(int cd_registro){
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
    
    public void ativarCadastroEquipamento(int codigo){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("UPDATE TB_EQUIPAMENTOS SET ATIVO = TRUE WHERE CD_EQUIPAMENTO =(?)");
            stmt.setInt(1,codigo);
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
    
    public void alterarCadastroEquipamento(ClasseEquipamentos dados){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null; 
        
        try{
            stmt = con.prepareStatement("UPDATE TB_EQUIPAMENTOS SET NM_EQUIPAMENTO = (?),DT_COMPRA_EQUIPAMENTO = (?),FORNECEDOR_EQUIPAMENTO = (?),NOTA_EQUIPAMENTO = (?)"
                                                        + ",VALOR_EQUIPAMENTO = (?),DT_GARANTIA_EQUIPAMENTO = (?),DT_ULTIMA_MANUTENCAO = (?),EMPRESA_MANUTENCAO = (?)"
                                                        + ",DT_GARANTIA_MANUTENCAO = (?),DT_PROXIMA_MANUTENCAO = (?),PROXIMA_EMPRESA = (?)"
                                                        + " WHERE CD_EQUIPAMENTO = (?)");
            stmt.setString(1,dados.getNm_equipamento());
            stmt.setString(2, dados.getDt_compra_equipamento());
            stmt.setString(3, dados.getFornecedor_equipamento());
            stmt.setString(4, dados.getNota_equipamento());
            stmt.setFloat(5,dados.getValor_equipamento());
            stmt.setString(6, dados.getDt_garantia_equipamento());
            stmt.setString(7, dados.getDt_ultima_manutencao());
            stmt.setString(8, dados.getEmpresa_manutencao());
            stmt.setString(9, dados.getDt_garantia_manutencao());
            stmt.setString(10,dados.getDt_proxima_manutencao());
            stmt.setString(11, dados.getProxima_empresa());
            stmt.setInt(12, dados.getCd_equipamento());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"<html>CADASTRO DE EQUIPAMENTO ATUALIZADO COM SUCESSO !</html>");
        
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
    
    public void salvaDataSaidaHistorico(ClasseCatraca dados){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null; 
        
        try{    
            stmt = con.prepareStatement("UPDATE TB_FREQUENCIA_ALUNOS_HISTORICO SET HR_SAIDA = (?),ON_OFF = FALSE "
            + "WHERE CD_REGISTRO = (?) AND DT_ENTRADA = (?) ");
            
            stmt.setString(1,dados.getHorario_saida());
            stmt.setInt(2,dados.getCd_registro());
            stmt.setString(3,dados.getData_entrada());
           
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"<html>Liberado !</html>");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }  
    }
    
    public void atualizaDataUltimoTreino(ClasseCatraca dados){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null; 
        
        try{    
            stmt = con.prepareStatement("UPDATE TB_FREQUENCIA_ALUNOS SET DT_ENTRADA = (?) WHERE CD_REGISTRO = (?) ");
            
            stmt.setString(1,dados.getData_entrada());
            stmt.setInt(2,dados.getCd_registro());
           
            stmt.executeUpdate();
            //JOptionPane.showMessageDialog(null,"<html>Liberado !</html>");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }  
    }
    
    public void alteraValorDespesas(ClasseDespesas despesas){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null; 
        
        try{    
            stmt = con.prepareStatement("UPDATE TB_DESPESAS_PROGRAMADAS SET NM_DESPESA = (?)"
                    + ",VALOR = (?),VENCIMENTO = (?)  WHERE CD_DESPESA = '"+despesas.getCodigo()+"' ");
            
            stmt.setString(1,despesas.getNome());
            stmt.setFloat(2,despesas.getValor());
            stmt.setDate(3, (Date) despesas.getVencimento());
                       
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"<html>Dados atualizados !</html>");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }  
    }
    
    public void pagaDespesa(ClasseDespesas despesas){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null; 
        
        try{    
            stmt = con.prepareStatement("UPDATE TB_DESPESAS_PROGRAMADAS SET PAGO = TRUE, DATA_PAGAMENTO = '"+despesas.getDtPagamento()+"'"
                    + " WHERE CD_DESPESA = '"+despesas.getCodigo()+"' ");
                       
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"<html>Despesa PAGA !</html>");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }  
    }
    
    //FAZ UM SELECT PARA PEGAR O ULTIMO REGISTRO E ALTERA SOMENTE O ULTIMO VENCIMENTO, OS 
    //OUTROS DO HISTÓRICO SÃO MANTIDOS
    public void alteraVencimento(int codigo, int vencimento) throws SQLException{
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null; 
        Statement ultReg = con.createStatement();
        ResultSet rs = null;
        int ultRegistro = 0;
        String sql = "SELECT CD_PAGAMENTO FROM TB_HISTORICO_PAGAMENTOS_ALUNOS WHERE CD_REGISTRO = "+codigo+" ORDER BY CD_PAGAMENTO DESC LIMIT 1";
        rs = ultReg.executeQuery(sql);
        if(rs.next()){
                ultRegistro = rs.getInt("CD_PAGAMENTO");
            }

        try{    
            stmt = con.prepareStatement("UPDATE TB_HISTORICO_PAGAMENTOS_ALUNOS SET PROXIMO_VENCIMENTO = DATE_FORMAT(PROXIMO_VENCIMENTO,'%Y-%m-"+vencimento+"')"
                    + " WHERE CD_REGISTRO = "+codigo+" AND CD_PAGAMENTO = "+ultRegistro+" ");
                       
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"<html>Vencimento atualizado !</html>");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO ATUALIZAR VENCIMENTO !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }  
    }
    
    public void atualizaValoresMensalidade(ClassePagamentoMensalidade dados){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null; 
        
        try{    
            stmt = con.prepareStatement("UPDATE TB_HISTORICO_PAGAMENTOS_ALUNOS "
                    + "SET DT_PAGAMENTO = '"+(Date)dados.getDtPagamento()+"' "
                    + ",VALOR_PAGO = "+dados.getValorPago()+" WHERE CD_REGISTRO = "+dados.getCodigo()+" "
                    + "ORDER BY CD_PAGAMENTO DESC LIMIT 1");
                       
            stmt.executeUpdate();
            //JOptionPane.showMessageDialog(null,"<html>Vencimento atualizado !</html>");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO RECEBER MENSALIDADE !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }  
    }
    
    public void inativaPlano(int codigo){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null; 
        
        try{    
            stmt = con.prepareStatement("UPDATE TB_PLANOS_ALUNOS SET SN_ATIVO = FALSE "
                    + "WHERE CD_REGISTRO = "+codigo+" AND SN_ATIVO = TRUE");
                       
            stmt.executeUpdate();
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO INATIVAR PLANO !"+ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }  
    }
    
    public void alterarImagemAlunos(ClasseCadastro classecadastro){
        Connection con = ConectaBd.getConnection();
        PreparedStatement stmt = null; 
        InputStream fis;
        
        File file = new File(classecadastro.getCaminhoImg());
        
        try{    
            fis = new FileInputStream(file);
            stmt = con.prepareStatement("UPDATE TB_FOTOS_ALUNOS SET IMAGEM = ? WHERE CD_REGISTRO = ? ");
            
            stmt.setBinaryStream(1, fis, (int)file.length());
            stmt.setInt(2, classecadastro.getCd_registro());
                       
            stmt.executeUpdate();
            //JOptionPane.showMessageDialog(null,"<html>Dados atualizados !</html>");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR !"+ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UpdateBd.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConectaBd.closeConnection(con, stmt);
        }  
    }
    
}
