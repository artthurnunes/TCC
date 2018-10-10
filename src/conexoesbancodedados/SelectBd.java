
package conexoesbancodedados;

import classes.ClassePagamentoMensalidade;
import classes.ClasseCadastro;
import classes.ClasseCadastro_exercicios;
import classes.ClasseCadastro_modalidades;
import classes.ClasseCadastro_planos;
import classes.ClasseCadastro_treino;
import classes.ClasseCadastro_treinoCodigos;
import classes.ClasseDespesas;
import classes.ClasseEquipamentos;
import classes.ClasseEsqueceuSenha;
import classes.ClasseSenhaInicial;
import classes.ClasseSituacaoFinanceira;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SelectBd {
    
    ClasseSenhaInicial cSenha = new ClasseSenhaInicial();
    ClasseEsqueceuSenha cEsqSenha = new ClasseEsqueceuSenha();
    ClasseCadastro_treino treinos = new ClasseCadastro_treino();
    ClasseCadastro_treinoCodigos treinosCodigos = new ClasseCadastro_treinoCodigos();
    ClasseCadastro cadastro = new ClasseCadastro();
    
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Connection con;
    String sqlselectCadastroAlfabetico;
    private int qt_linhas_select;
    private int linha_atual_select = 1;
    private boolean retornoVazio = false;

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

    public boolean getRetornoVazio() {
        return retornoVazio;
    }

    public void setRetornoVazio(boolean retornoVazio) {
        this.retornoVazio = retornoVazio;
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
      
    //select para trazer o cadastro atraves do codigo do aluno
    public void selectCadastroAlfabetico(int codigo) throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();

        sqlselectCadastroAlfabetico = "SELECT CD_REGISTRO,SITUACAO,NOME,TEL1,TEL2,PROFISSAO,SEXO,ESTADO_CIVIL,RG"
                                   + ",CPF,DT_NASCIMENTO,NM_MAE,NM_PAI,NM_EMER,TEL_EMER,PARENTESCO,END_RUA,END_NUMERO"
                                   + ",END_BAIRRO,END_CIDADE,END_ESTADO,END_CEP "
                                        + "FROM TB_ALUNOS WHERE SITUACAO = 1 AND CD_REGISTRO = "+codigo+" "
                                            + "ORDER BY 3 ";
        
        rs = stmt.executeQuery(sqlselectCadastroAlfabetico);
        //System.out.println("Logo quando recebe o sql no rs :"+rs.getRow()); //teste
         
       //O rs começa com 0 mas o primeiro registro válido é o next que no caso é o 1. O 0 não retorna nada do sql
       while(rs.next()){ //while e if para que eu consiga manipular as linhas retornadas
       //System.out.println("Entrei no While :"+rs.getRow()); //teste
              if(rs.getRow() == this.linha_atual_select){
            //if(rs.next()){ //if caso retorno somente 1 row
                //System.out.println("Primeira linha do rs.next numero :"+rs.getRow()); //teste
                
                cadastro.setCd_registro(rs.getInt("CD_REGISTRO"));
                cadastro.setSituacao(rs.getBoolean("SITUACAO"));
                cadastro.setNome(rs.getString("NOME"));
                cadastro.setTel1(rs.getString("TEL1"));
                cadastro.setTel2(rs.getString("TEL2"));
                cadastro.setProfissao(rs.getString("PROFISSAO"));
                cadastro.setSexo(rs.getString("SEXO"));
                cadastro.setEstado_civil(rs.getInt("ESTADO_CIVIL"));
                cadastro.setRg(rs.getString("RG"));
                cadastro.setCpf(rs.getString("CPF"));
                cadastro.setDt_nascimento(rs.getString("DT_NASCIMENTO"));
                cadastro.setNm_mae(rs.getString("NM_MAE"));
                cadastro.setNm_pai(rs.getString("NM_PAI"));
                cadastro.setNm_emer(rs.getString("NM_EMER"));
                cadastro.setTel_emer(rs.getString("TEL_EMER"));
                cadastro.setParentesco(rs.getInt("PARENTESCO"));
                cadastro.setEnd_rua(rs.getString("END_RUA"));
                cadastro.setEnd_numero(rs.getString("END_NUMERO"));
                cadastro.setEnd_bairro(rs.getString("END_BAIRRO"));
                cadastro.setEnd_cidade(rs.getString("END_CIDADE"));
                cadastro.setEnd_estado(rs.getInt("END_ESTADO"));
                cadastro.setEnd_cep(rs.getString("END_CEP"));
                
                this.linha_atual_select = rs.getRow();
                
                //System.out.println("Linha atual do select :"+rs.getRow());//teste
            } 
        }
    }

    //select para trazer os equipamentos da academia em ordem alfabetica
    public void selectCadEquipAlfabetico(ClasseEquipamentos dados) throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();

        String sql = "SELECT * FROM TB_EQUIPAMENTOS WHERE ATIVO = TRUE AND NM_EQUIPAMENTO LIKE '%"+dados.getNm_equipamento()+"%'"
                                            + "ORDER BY NM_EQUIPAMENTO ASC ";
        
        rs = stmt.executeQuery(sql);
        //System.out.println("Logo quando recebe o sql no rs :"+rs.getRow()); //teste
         
       //O rs começa com 0 mas o primeiro registro válido é o next que no caso é o 1. O 0 não retorna nada do sql
       while(rs.next()){ //while e if para que eu consiga manipular as linhas retornadas
       //System.out.println("Entrei no While :"+rs.getRow()); //teste
              if(rs.getRow() == this.linha_atual_select){
            //if(rs.next()){ //if caso retorno somente 1 row
                //System.out.println("Primeira linha do rs.next numero :"+rs.getRow()); //teste
                
                dados.setCd_equipamento(rs.getInt("CD_EQUIPAMENTO"));
                dados.setNm_equipamento(rs.getString("NM_EQUIPAMENTO"));
                dados.setDt_compra_equipamento(rs.getString("DT_COMPRA_EQUIPAMENTO"));
                dados.setFornecedor_equipamento(rs.getString("FORNECEDOR_EQUIPAMENTO"));
                dados.setNota_equipamento(rs.getString("NOTA_EQUIPAMENTO"));
                dados.setValor_equipamento(rs.getFloat("VALOR_EQUIPAMENTO"));
                dados.setDt_garantia_equipamento(rs.getString("DT_GARANTIA_EQUIPAMENTO"));
                dados.setDt_ultima_manutencao(rs.getString("DT_ULTIMA_MANUTENCAO"));
                dados.setEmpresa_manutencao(rs.getString("EMPRESA_MANUTENCAO"));
                dados.setDt_garantia_manutencao(rs.getString("DT_GARANTIA_MANUTENCAO"));
                dados.setDt_proxima_manutencao(rs.getString("DT_PROXIMA_MANUTENCAO"));
                dados.setProxima_empresa(rs.getString("PROXIMA_EMPRESA"));
                                
                this.linha_atual_select = rs.getRow();
                
                //System.out.println("Linha atual do select :"+rs.getRow());//teste
            } 
        }
    }
    
    //select para contar a quantidade de linhas retornadas pelo select para que quando o select retornar mais de uma linha
    //o botão frente e traz da tela cadastro funcione.
    public int selectQtLinhasTelaCadastro(ClasseCadastro dados) throws SQLException{
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
    
    public int selectQtLinhasTelaEquipamentos(ClasseEquipamentos dados) throws SQLException{
        con = ConectaBd.getConnection();
        Statement Stmt = con.createStatement();
        ResultSet rsContagem = null;

        String sql = "SELECT * FROM TB_EQUIPAMENTOS WHERE ATIVO = TRUE AND NM_EQUIPAMENTO LIKE '%"+dados.getNm_equipamento()+"%'"
                                            + "ORDER BY NM_EQUIPAMENTO ASC ";

        rsContagem = Stmt.executeQuery(sql);
        int i = 0; //contar a quantidade de linhas que o select Retornou

            while(rsContagem.next())
                i++;
            
        return(i);
    }
    
    public int selectQtLinhasTelaMensalidade(ClassePagamentoMensalidade dados) throws SQLException{
        con = ConectaBd.getConnection();
        Statement Stmt = con.createStatement();
        ResultSet rsContagem = null;

        
        String sql = "SELECT A.CD_REGISTRO, A.NOME, DATE_FORMAT(B.PROXIMO_VENCIMENTO,'%e-%m-%Y'), C.VALOR "
                + "FROM TB_ALUNOS A INNER JOIN TB_HISTORICO_PAGAMENTOS_ALUNOS B ON B.CD_REGISTRO = A.CD_REGISTRO "
                + "INNER JOIN TB_PLANOS_ALUNOS C ON C.CD_REGISTRO = A.CD_REGISTRO "
                + "WHERE NOME LIKE '%"+dados.getNome()+"%' ORDER BY A.NOME";
        
        /*
        String sql = "SELECT * FROM TB_EQUIPAMENTOS WHERE ATIVO = TRUE AND NM_EQUIPAMENTO LIKE '%"+dados.getNm_equipamento()+"%'"
                                            + "ORDER BY NM_EQUIPAMENTO ASC ";

        */

        rsContagem = Stmt.executeQuery(sql);
        int i = 0; //contar a quantidade de linhas que o select Retornou

            while(rsContagem.next())
                i++;
            
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
    
    public int selectExisteModalidadeAluno(ClasseCadastro_modalidades dados) throws SQLException{
        int n = 0;
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
                
        String sql = "SELECT MAX(CD_MOD_ALUNO) FROM TB_MOD_ALUNOS WHERE CD_REGISTRO = '"+dados.getCd_registro()+"' ";
        
        rs = stmt.executeQuery(sql);
        
            if(rs.next()){
                n = rs.getInt("MAX(CD_MOD_ALUNO)");
            } 
        return n;    
    }
    
    public int selectExistePlanoAluno(ClasseCadastro_planos dados) throws SQLException{
        int n = 0;
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
                
        String sql = "SELECT MAX(CD_PLANO_ALUNO) FROM TB_PLANOS_ALUNOS WHERE CD_REGISTRO = '"+dados.getCd_registro()+"' ";
        
        rs = stmt.executeQuery(sql);
        
            if(rs.next()){
                n = rs.getInt("MAX(CD_PLANO_ALUNO)");
            } 
        return n;    
    }

    //setar strings no objeto treinos e numeros no objeto treinosCodigos
    public void populandoTelaTreinosA() throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT * FROM TB_TREINOSA WHERE CD_TREINOA = '"+treinos.getCd_treino()+"' ";
        rs = stmt.executeQuery(sql);
        
        if(rs.next()){
            treinos.setCd_treino(rs.getInt("CD_TREINOA"));
            treinos.setDt_inicio(rs.getString("DT_INICIO"));
            treinos.setDt_fim(rs.getString("DT_FIM"));
            treinosCodigos.setGrupo_muscularA1(rs.getInt("GRUPO_MUSCULARA1"));
            treinosCodigos.setExercicioA1(rs.getInt("EXERCICIOA1"));
            treinosCodigos.setRepeticaoA1(rs.getInt("REPETICAOA1"));
            treinos.setObservacaoA1(rs.getString("OBSERVACAOA1"));
            treinosCodigos.setExercicioA1_1(rs.getInt("EXERCICIOA1_1"));
            treinosCodigos.setRepeticaoA1_1(rs.getInt("REPETICAOA1_1"));
            treinos.setObservacaoA1_1(rs.getString("OBSERVACAOA1_1"));
            treinosCodigos.setExercicioA1_2(rs.getInt("EXERCICIOA1_2"));
            treinosCodigos.setRepeticaoA1_2(rs.getInt("REPETICAOA1_2"));
            treinos.setObservacaoA1_2(rs.getString("OBSERVACAOA1_2"));
            treinosCodigos.setExercicioA1_3(rs.getInt("EXERCICIOA1_3"));
            treinosCodigos.setRepeticaoA1_3(rs.getInt("REPETICAOA1_3"));
            treinos.setObservacaoA1_3(rs.getString("OBSERVACAOA1_3"));
            treinosCodigos.setExercicioA1_4(rs.getInt("EXERCICIOA1_4"));
            treinosCodigos.setRepeticaoA1_4(rs.getInt("REPETICAOA1_4"));
            treinos.setObservacaoA1_4(rs.getString("OBSERVACAOA1_4"));
            treinosCodigos.setExercicioA1_5(rs.getInt("EXERCICIOA1_5"));
            treinosCodigos.setRepeticaoA1_5(rs.getInt("REPETICAOA1_5"));
            treinos.setObservacaoA1_5(rs.getString("OBSERVACAOA1_5"));
            treinosCodigos.setExercicioA1_6(rs.getInt("EXERCICIOA1_6"));
            treinosCodigos.setRepeticaoA1_6(rs.getInt("REPETICAOA1_6"));
            treinos.setObservacaoA1_6(rs.getString("OBSERVACAOA1_6"));

            treinosCodigos.setGrupo_muscularA2(rs.getInt("GRUPO_MUSCULARA2"));
            treinosCodigos.setExercicioA2(rs.getInt("EXERCICIOA2"));
            treinosCodigos.setRepeticaoA2(rs.getInt("REPETICAOA2"));
            treinos.setObservacaoA2(rs.getString("OBSERVACAOA2"));
            treinosCodigos.setExercicioA2_1(rs.getInt("EXERCICIOA2_1"));
            treinosCodigos.setRepeticaoA2_1(rs.getInt("REPETICAOA2_1"));
            treinos.setObservacaoA2_1(rs.getString("OBSERVACAOA2_1"));
            treinosCodigos.setExercicioA2_2(rs.getInt("EXERCICIOA2_2"));
            treinosCodigos.setRepeticaoA2_2(rs.getInt("REPETICAOA2_2"));
            treinos.setObservacaoA2_2(rs.getString("OBSERVACAOA2_2"));
            treinosCodigos.setExercicioA2_3(rs.getInt("EXERCICIOA2_3"));
            treinosCodigos.setRepeticaoA2_3(rs.getInt("REPETICAOA2_3"));
            treinos.setObservacaoA2_3(rs.getString("OBSERVACAOA2_3"));
            treinosCodigos.setExercicioA2_4(rs.getInt("EXERCICIOA2_4"));
            treinosCodigos.setRepeticaoA2_4(rs.getInt("REPETICAOA2_4"));
            treinos.setObservacaoA2_4(rs.getString("OBSERVACAOA2_4"));
            treinosCodigos.setExercicioA2_5(rs.getInt("EXERCICIOA2_5"));
            treinosCodigos.setRepeticaoA2_5(rs.getInt("REPETICAOA2_5"));
            treinos.setObservacaoA2_5(rs.getString("OBSERVACAOA2_5"));
            treinosCodigos.setExercicioA2_6(rs.getInt("EXERCICIOA2_6"));
            treinosCodigos.setRepeticaoA2_6(rs.getInt("REPETICAOA2_6"));
            treinos.setObservacaoA2_6(rs.getString("OBSERVACAOA2_6"));
            
            treinosCodigos.setGrupo_muscularA3(rs.getInt("GRUPO_MUSCULARA3"));
            treinosCodigos.setExercicioA3(rs.getInt("EXERCICIOA3"));
            treinosCodigos.setRepeticaoA3(rs.getInt("REPETICAOA3"));
            treinos.setObservacaoA3(rs.getString("OBSERVACAOA3"));
            treinosCodigos.setExercicioA3_1(rs.getInt("EXERCICIOA3_1"));
            treinosCodigos.setRepeticaoA3_1(rs.getInt("REPETICAOA3_1"));
            treinos.setObservacaoA3_1(rs.getString("OBSERVACAOA3_1"));
            treinosCodigos.setExercicioA3_2(rs.getInt("EXERCICIOA3_2"));
            treinosCodigos.setRepeticaoA3_2(rs.getInt("REPETICAOA3_2"));
            treinos.setObservacaoA3_2(rs.getString("OBSERVACAOA3_2"));
            treinosCodigos.setExercicioA3_3(rs.getInt("EXERCICIOA3_3"));
            treinosCodigos.setRepeticaoA3_3(rs.getInt("REPETICAOA3_3"));
            treinos.setObservacaoA3_3(rs.getString("OBSERVACAOA3_3"));
            treinosCodigos.setExercicioA3_4(rs.getInt("EXERCICIOA3_4"));
            treinosCodigos.setRepeticaoA3_4(rs.getInt("REPETICAOA3_4"));
            treinos.setObservacaoA3_4(rs.getString("OBSERVACAOA3_4"));
            treinosCodigos.setExercicioA3_5(rs.getInt("EXERCICIOA3_5"));
            treinosCodigos.setRepeticaoA3_5(rs.getInt("REPETICAOA3_5"));
            treinos.setObservacaoA3_5(rs.getString("OBSERVACAOA3_5"));
            treinosCodigos.setExercicioA3_6(rs.getInt("EXERCICIOA3_6"));
            treinosCodigos.setRepeticaoA3_6(rs.getInt("REPETICAOA3_6"));
            treinos.setObservacaoA3_6(rs.getString("OBSERVACAOA3_6"));
            
            treinosCodigos.setGrupo_muscularA4(rs.getInt("GRUPO_MUSCULARA4"));
            treinosCodigos.setExercicioA4(rs.getInt("EXERCICIOA4"));
            treinosCodigos.setRepeticaoA4(rs.getInt("REPETICAOA4"));
            treinos.setObservacaoA4(rs.getString("OBSERVACAOA4"));
            treinosCodigos.setExercicioA4_1(rs.getInt("EXERCICIOA4_1"));
            treinosCodigos.setRepeticaoA4_1(rs.getInt("REPETICAOA4_1"));
            treinos.setObservacaoA4_1(rs.getString("OBSERVACAOA4_1"));
            treinosCodigos.setExercicioA4_2(rs.getInt("EXERCICIOA4_2"));
            treinosCodigos.setRepeticaoA4_2(rs.getInt("REPETICAOA4_2"));
            treinos.setObservacaoA4_2(rs.getString("OBSERVACAOA4_2"));
            treinosCodigos.setExercicioA4_3(rs.getInt("EXERCICIOA4_3"));
            treinosCodigos.setRepeticaoA4_3(rs.getInt("REPETICAOA4_3"));
            treinos.setObservacaoA4_3(rs.getString("OBSERVACAOA4_3"));
            treinosCodigos.setExercicioA4_4(rs.getInt("EXERCICIOA4_4"));
            treinosCodigos.setRepeticaoA4_4(rs.getInt("REPETICAOA4_4"));
            treinos.setObservacaoA4_4(rs.getString("OBSERVACAOA4_4"));
            treinosCodigos.setExercicioA4_5(rs.getInt("EXERCICIOA4_5"));
            treinosCodigos.setRepeticaoA4_5(rs.getInt("REPETICAOA4_5"));
            treinos.setObservacaoA4_5(rs.getString("OBSERVACAOA4_5"));
            treinosCodigos.setExercicioA4_6(rs.getInt("EXERCICIOA4_6"));
            treinosCodigos.setRepeticaoA4_6(rs.getInt("REPETICAOA4_6"));
            treinos.setObservacaoA4_6(rs.getString("OBSERVACAOA4_6"));
            
            treinosCodigos.setGrupo_muscularA5(rs.getInt("GRUPO_MUSCULARA5"));
            treinosCodigos.setExercicioA5(rs.getInt("EXERCICIOA5"));
            treinosCodigos.setRepeticaoA5(rs.getInt("REPETICAOA5"));
            treinos.setObservacaoA5(rs.getString("OBSERVACAOA5"));
            treinosCodigos.setExercicioA5_1(rs.getInt("EXERCICIOA5_1"));
            treinosCodigos.setRepeticaoA5_1(rs.getInt("REPETICAOA5_1"));
            treinos.setObservacaoA5_1(rs.getString("OBSERVACAOA5_1"));
            treinosCodigos.setExercicioA5_2(rs.getInt("EXERCICIOA5_2"));
            treinosCodigos.setRepeticaoA5_2(rs.getInt("REPETICAOA5_2"));
            treinos.setObservacaoA5_2(rs.getString("OBSERVACAOA5_2"));
            treinosCodigos.setExercicioA5_3(rs.getInt("EXERCICIOA5_3"));
            treinosCodigos.setRepeticaoA5_3(rs.getInt("REPETICAOA5_3"));
            treinos.setObservacaoA5_3(rs.getString("OBSERVACAOA5_3"));
            treinosCodigos.setExercicioA5_4(rs.getInt("EXERCICIOA5_4"));
            treinosCodigos.setRepeticaoA5_4(rs.getInt("REPETICAOA5_4"));
            treinos.setObservacaoA5_4(rs.getString("OBSERVACAOA5_4"));
            treinosCodigos.setExercicioA5_5(rs.getInt("EXERCICIOA5_5"));
            treinosCodigos.setRepeticaoA5_5(rs.getInt("REPETICAOA5_5"));
            treinos.setObservacaoA5_5(rs.getString("OBSERVACAOA5_5"));
            treinosCodigos.setExercicioA5_6(rs.getInt("EXERCICIOA5_6"));
            treinosCodigos.setRepeticaoA5_6(rs.getInt("REPETICAOA5_6"));
            treinos.setObservacaoA5_6(rs.getString("OBSERVACAOA5_6"));
            }        
    }
    
    public void populandoTelaTreinosB() throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT * FROM TB_TREINOSB WHERE CD_TREINOB = '"+treinos.getCd_treino()+"' ";
        rs = stmt.executeQuery(sql);
        
        if(rs.next()){
            treinosCodigos.setGrupo_muscularB1(rs.getInt("GRUPO_MUSCULARB1"));
            treinosCodigos.setExercicioB1(rs.getInt("EXERCICIOB1"));
            treinosCodigos.setRepeticaoB1(rs.getInt("REPETICAOB1"));
            treinos.setObservacaoB1(rs.getString("OBSERVACAOB1"));
            treinosCodigos.setExercicioB1_1(rs.getInt("EXERCICIOB1_1"));
            treinosCodigos.setRepeticaoB1_1(rs.getInt("REPETICAOB1_1"));
            treinos.setObservacaoB1_1(rs.getString("OBSERVACAOB1_1"));
            treinosCodigos.setExercicioB1_2(rs.getInt("EXERCICIOB1_2"));
            treinosCodigos.setRepeticaoB1_2(rs.getInt("REPETICAOB1_2"));
            treinos.setObservacaoB1_2(rs.getString("OBSERVACAOB1_2"));
            treinosCodigos.setExercicioB1_3(rs.getInt("EXERCICIOB1_3"));
            treinosCodigos.setRepeticaoB1_3(rs.getInt("REPETICAOB1_3"));
            treinos.setObservacaoB1_3(rs.getString("OBSERVACAOB1_3"));
            treinosCodigos.setExercicioB1_4(rs.getInt("EXERCICIOB1_4"));
            treinosCodigos.setRepeticaoB1_4(rs.getInt("REPETICAOB1_4"));
            treinos.setObservacaoB1_4(rs.getString("OBSERVACAOB1_4"));
            treinosCodigos.setExercicioB1_5(rs.getInt("EXERCICIOB1_5"));
            treinosCodigos.setRepeticaoB1_5(rs.getInt("REPETICAOB1_5"));
            treinos.setObservacaoB1_5(rs.getString("OBSERVACAOB1_5"));
            treinosCodigos.setExercicioB1_6(rs.getInt("EXERCICIOB1_6"));
            treinosCodigos.setRepeticaoB1_6(rs.getInt("REPETICAOB1_6"));
            treinos.setObservacaoB1_6(rs.getString("OBSERVACAOB1_6"));
            
            treinosCodigos.setGrupo_muscularB2(rs.getInt("GRUPO_MUSCULARB2"));
            treinosCodigos.setExercicioB2(rs.getInt("EXERCICIOB2"));
            treinosCodigos.setRepeticaoB2(rs.getInt("REPETICAOB2"));
            treinos.setObservacaoB2(rs.getString("OBSERVACAOB2"));
            treinosCodigos.setExercicioB2_1(rs.getInt("EXERCICIOB2_1"));
            treinosCodigos.setRepeticaoB2_1(rs.getInt("REPETICAOB2_1"));
            treinos.setObservacaoB2_1(rs.getString("OBSERVACAOB2_1"));
            treinosCodigos.setExercicioB2_2(rs.getInt("EXERCICIOB2_2"));
            treinosCodigos.setRepeticaoB2_2(rs.getInt("REPETICAOB2_2"));
            treinos.setObservacaoB2_2(rs.getString("OBSERVACAOB2_2"));
            treinosCodigos.setExercicioB2_3(rs.getInt("EXERCICIOB2_3"));
            treinosCodigos.setRepeticaoB2_3(rs.getInt("REPETICAOB2_3"));
            treinos.setObservacaoB2_3(rs.getString("OBSERVACAOB2_3"));
            treinosCodigos.setExercicioB2_4(rs.getInt("EXERCICIOB2_4"));
            treinosCodigos.setRepeticaoB2_4(rs.getInt("REPETICAOB2_4"));
            treinos.setObservacaoB2_4(rs.getString("OBSERVACAOB2_4"));
            treinosCodigos.setExercicioB2_5(rs.getInt("EXERCICIOB2_5"));
            treinosCodigos.setRepeticaoB2_5(rs.getInt("REPETICAOB2_5"));
            treinos.setObservacaoB2_5(rs.getString("OBSERVACAOB2_5"));
            treinosCodigos.setExercicioB2_6(rs.getInt("EXERCICIOB2_6"));
            treinosCodigos.setRepeticaoB2_6(rs.getInt("REPETICAOB2_6"));
            treinos.setObservacaoB2_6(rs.getString("OBSERVACAOB2_6"));
            
            treinosCodigos.setGrupo_muscularB3(rs.getInt("GRUPO_MUSCULARB3"));
            treinosCodigos.setExercicioB3(rs.getInt("EXERCICIOB3"));
            treinosCodigos.setRepeticaoB3(rs.getInt("REPETICAOB3"));
            treinos.setObservacaoB3(rs.getString("OBSERVACAOB3"));
            treinosCodigos.setExercicioB3_1(rs.getInt("EXERCICIOB3_1"));
            treinosCodigos.setRepeticaoB3_1(rs.getInt("REPETICAOB3_1"));
            treinos.setObservacaoB3_1(rs.getString("OBSERVACAOB3_1"));
            treinosCodigos.setExercicioB3_2(rs.getInt("EXERCICIOB3_2"));
            treinosCodigos.setRepeticaoB3_2(rs.getInt("REPETICAOB3_2"));
            treinos.setObservacaoB3_2(rs.getString("OBSERVACAOB3_2"));
            treinosCodigos.setExercicioB3_3(rs.getInt("EXERCICIOB3_3"));
            treinosCodigos.setRepeticaoB3_3(rs.getInt("REPETICAOB3_3"));
            treinos.setObservacaoB3_3(rs.getString("OBSERVACAOB3_3"));
            treinosCodigos.setExercicioB3_4(rs.getInt("EXERCICIOB3_4"));
            treinosCodigos.setRepeticaoB3_4(rs.getInt("REPETICAOB3_4"));
            treinos.setObservacaoB3_4(rs.getString("OBSERVACAOB3_4"));
            treinosCodigos.setExercicioB3_5(rs.getInt("EXERCICIOB3_5"));
            treinosCodigos.setRepeticaoB3_5(rs.getInt("REPETICAOB3_5"));
            treinos.setObservacaoB3_5(rs.getString("OBSERVACAOB3_5"));
            treinosCodigos.setExercicioB3_6(rs.getInt("EXERCICIOB3_6"));
            treinosCodigos.setRepeticaoB3_6(rs.getInt("REPETICAOB3_6"));
            treinos.setObservacaoB3_6(rs.getString("OBSERVACAOB3_6"));
            
            treinosCodigos.setGrupo_muscularB4(rs.getInt("GRUPO_MUSCULARB4"));
            treinosCodigos.setExercicioB4(rs.getInt("EXERCICIOB4"));
            treinosCodigos.setRepeticaoB4(rs.getInt("REPETICAOB4"));
            treinos.setObservacaoB4(rs.getString("OBSERVACAOB4"));
            treinosCodigos.setExercicioB4_1(rs.getInt("EXERCICIOB4_1"));
            treinosCodigos.setRepeticaoB4_1(rs.getInt("REPETICAOB4_1"));
            treinos.setObservacaoB4_1(rs.getString("OBSERVACAOB4_1"));
            treinosCodigos.setExercicioB4_2(rs.getInt("EXERCICIOB4_2"));
            treinosCodigos.setRepeticaoB4_2(rs.getInt("REPETICAOB4_2"));
            treinos.setObservacaoB4_2(rs.getString("OBSERVACAOB4_2"));
            treinosCodigos.setExercicioB4_3(rs.getInt("EXERCICIOB4_3"));
            treinosCodigos.setRepeticaoB4_3(rs.getInt("REPETICAOB4_3"));
            treinos.setObservacaoB4_3(rs.getString("OBSERVACAOB4_3"));
            treinosCodigos.setExercicioB4_4(rs.getInt("EXERCICIOB4_4"));
            treinosCodigos.setRepeticaoB4_4(rs.getInt("REPETICAOB4_4"));
            treinos.setObservacaoB4_4(rs.getString("OBSERVACAOB4_4"));
            treinosCodigos.setExercicioB4_5(rs.getInt("EXERCICIOB4_5"));
            treinosCodigos.setRepeticaoB4_5(rs.getInt("REPETICAOB4_5"));
            treinos.setObservacaoB4_5(rs.getString("OBSERVACAOB4_5"));
            treinosCodigos.setExercicioB4_6(rs.getInt("EXERCICIOB4_6"));
            treinosCodigos.setRepeticaoB4_6(rs.getInt("REPETICAOB4_6"));
            treinos.setObservacaoB4_6(rs.getString("OBSERVACAOB4_6"));
            
            treinosCodigos.setGrupo_muscularB5(rs.getInt("GRUPO_MUSCULARB5"));
            treinosCodigos.setExercicioB5(rs.getInt("EXERCICIOB5"));
            treinosCodigos.setRepeticaoB5(rs.getInt("REPETICAOB5"));
            treinos.setObservacaoB5(rs.getString("OBSERVACAOB5"));
            treinosCodigos.setExercicioB5_1(rs.getInt("EXERCICIOB5_1"));
            treinosCodigos.setRepeticaoB5_1(rs.getInt("REPETICAOB5_1"));
            treinos.setObservacaoB5_1(rs.getString("OBSERVACAOB5_1"));
            treinosCodigos.setExercicioB5_2(rs.getInt("EXERCICIOB5_2"));
            treinosCodigos.setRepeticaoB5_2(rs.getInt("REPETICAOB5_2"));
            treinos.setObservacaoB5_2(rs.getString("OBSERVACAOB5_2"));
            treinosCodigos.setExercicioB5_3(rs.getInt("EXERCICIOB5_3"));
            treinosCodigos.setRepeticaoB5_3(rs.getInt("REPETICAOB5_3"));
            treinos.setObservacaoB5_3(rs.getString("OBSERVACAOB5_3"));
            treinosCodigos.setExercicioB5_4(rs.getInt("EXERCICIOB5_4"));
            treinosCodigos.setRepeticaoB5_4(rs.getInt("REPETICAOB5_4"));
            treinos.setObservacaoB5_4(rs.getString("OBSERVACAOB5_4"));
            treinosCodigos.setExercicioB5_5(rs.getInt("EXERCICIOB5_5"));
            treinosCodigos.setRepeticaoB5_5(rs.getInt("REPETICAOB5_5"));
            treinos.setObservacaoB5_5(rs.getString("OBSERVACAOB5_5"));
            treinosCodigos.setExercicioB5_6(rs.getInt("EXERCICIOB5_6"));
            treinosCodigos.setRepeticaoB5_6(rs.getInt("REPETICAOB5_6"));
            treinos.setObservacaoB5_6(rs.getString("OBSERVACAOB5_6"));
             
            }    

    }
    
    public void populandoTelaTreinosC() throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT * FROM TB_TREINOSC WHERE CD_TREINOC = '"+treinos.getCd_treino()+"' ";
        rs = stmt.executeQuery(sql);
        
        if(rs.next()){
            treinosCodigos.setGrupo_muscularC1(rs.getInt("GRUPO_MUSCULARC1"));
            treinosCodigos.setExercicioC1(rs.getInt("EXERCICIOC1"));
            treinosCodigos.setRepeticaoC1(rs.getInt("REPETICAOC1"));
            treinos.setObservacaoC1(rs.getString("OBSERVACAOC1"));
            treinosCodigos.setExercicioC1_1(rs.getInt("EXERCICIOC1_1"));
            treinosCodigos.setRepeticaoC1_1(rs.getInt("REPETICAOC1_1"));
            treinos.setObservacaoC1_1(rs.getString("OBSERVACAOC1_1"));
            treinosCodigos.setExercicioC1_2(rs.getInt("EXERCICIOC1_2"));
            treinosCodigos.setRepeticaoC1_2(rs.getInt("REPETICAOC1_2"));
            treinos.setObservacaoC1_2(rs.getString("OBSERVACAOC1_2"));
            treinosCodigos.setExercicioC1_3(rs.getInt("EXERCICIOC1_3"));
            treinosCodigos.setRepeticaoC1_3(rs.getInt("REPETICAOC1_3"));
            treinos.setObservacaoC1_3(rs.getString("OBSERVACAOC1_3"));
            treinosCodigos.setExercicioC1_4(rs.getInt("EXERCICIOC1_4"));
            treinosCodigos.setRepeticaoC1_4(rs.getInt("REPETICAOC1_4"));
            treinos.setObservacaoC1_4(rs.getString("OBSERVACAOC1_4"));
            treinosCodigos.setExercicioC1_5(rs.getInt("EXERCICIOC1_5"));
            treinosCodigos.setRepeticaoC1_5(rs.getInt("REPETICAOC1_5"));
            treinos.setObservacaoC1_5(rs.getString("OBSERVACAOC1_5"));
            treinosCodigos.setExercicioC1_6(rs.getInt("EXERCICIOC1_6"));
            treinosCodigos.setRepeticaoC1_6(rs.getInt("REPETICAOC1_6"));
            treinos.setObservacaoC1_6(rs.getString("OBSERVACAOC1_6"));
            
            treinosCodigos.setGrupo_muscularC2(rs.getInt("GRUPO_MUSCULARC2"));
            treinosCodigos.setExercicioC2(rs.getInt("EXERCICIOC2"));
            treinosCodigos.setRepeticaoC2(rs.getInt("REPETICAOC2"));
            treinos.setObservacaoC2(rs.getString("OBSERVACAOC2"));
            treinosCodigos.setExercicioC2_1(rs.getInt("EXERCICIOC2_1"));
            treinosCodigos.setRepeticaoC2_1(rs.getInt("REPETICAOC2_1"));
            treinos.setObservacaoC2_1(rs.getString("OBSERVACAOC2_1"));
            treinosCodigos.setExercicioC2_2(rs.getInt("EXERCICIOC2_2"));
            treinosCodigos.setRepeticaoC2_2(rs.getInt("REPETICAOC2_2"));
            treinos.setObservacaoC2_2(rs.getString("OBSERVACAOC2_2"));
            treinosCodigos.setExercicioC2_3(rs.getInt("EXERCICIOC2_3"));
            treinosCodigos.setRepeticaoC2_3(rs.getInt("REPETICAOC2_3"));
            treinos.setObservacaoC2_3(rs.getString("OBSERVACAOC2_3"));
            treinosCodigos.setExercicioC2_4(rs.getInt("EXERCICIOC2_4"));
            treinosCodigos.setRepeticaoC2_4(rs.getInt("REPETICAOC2_4"));
            treinos.setObservacaoC2_4(rs.getString("OBSERVACAOC2_4"));
            treinosCodigos.setExercicioC2_5(rs.getInt("EXERCICIOC2_5"));
            treinosCodigos.setRepeticaoC2_5(rs.getInt("REPETICAOC2_5"));
            treinos.setObservacaoC2_5(rs.getString("OBSERVACAOC2_5"));
            treinosCodigos.setExercicioC2_6(rs.getInt("EXERCICIOC2_6"));
            treinosCodigos.setRepeticaoC2_6(rs.getInt("REPETICAOC2_6"));
            treinos.setObservacaoC2_6(rs.getString("OBSERVACAOC2_6"));
            
            treinosCodigos.setGrupo_muscularC3(rs.getInt("GRUPO_MUSCULARC3"));
            treinosCodigos.setExercicioC3(rs.getInt("EXERCICIOC3"));
            treinosCodigos.setRepeticaoC3(rs.getInt("REPETICAOC3"));
            treinos.setObservacaoC3(rs.getString("OBSERVACAOC3"));
            treinosCodigos.setExercicioC3_1(rs.getInt("EXERCICIOC3_1"));
            treinosCodigos.setRepeticaoC3_1(rs.getInt("REPETICAOC3_1"));
            treinos.setObservacaoC3_1(rs.getString("OBSERVACAOC3_1"));
            treinosCodigos.setExercicioC3_2(rs.getInt("EXERCICIOC3_2"));
            treinosCodigos.setRepeticaoC3_2(rs.getInt("REPETICAOC3_2"));
            treinos.setObservacaoC3_2(rs.getString("OBSERVACAOC3_2"));
            treinosCodigos.setExercicioC3_3(rs.getInt("EXERCICIOC3_3"));
            treinosCodigos.setRepeticaoC3_3(rs.getInt("REPETICAOC3_3"));
            treinos.setObservacaoC3_3(rs.getString("OBSERVACAOC3_3"));
            treinosCodigos.setExercicioC3_4(rs.getInt("EXERCICIOC3_4"));
            treinosCodigos.setRepeticaoC3_4(rs.getInt("REPETICAOC3_4"));
            treinos.setObservacaoC3_4(rs.getString("OBSERVACAOC3_4"));
            treinosCodigos.setExercicioC3_5(rs.getInt("EXERCICIOC3_5"));
            treinosCodigos.setRepeticaoC3_5(rs.getInt("REPETICAOC3_5"));
            treinos.setObservacaoC3_5(rs.getString("OBSERVACAOC3_5"));
            treinosCodigos.setExercicioC3_6(rs.getInt("EXERCICIOC3_6"));
            treinosCodigos.setRepeticaoC3_6(rs.getInt("REPETICAOC3_6"));
            treinos.setObservacaoC3_6(rs.getString("OBSERVACAOC3_6"));
            
            treinosCodigos.setGrupo_muscularC4(rs.getInt("GRUPO_MUSCULARC4"));
            treinosCodigos.setExercicioC4(rs.getInt("EXERCICIOC4"));
            treinosCodigos.setRepeticaoC4(rs.getInt("REPETICAOC4"));
            treinos.setObservacaoC4(rs.getString("OBSERVACAOC4"));
            treinosCodigos.setExercicioC4_1(rs.getInt("EXERCICIOC4_1"));
            treinosCodigos.setRepeticaoC4_1(rs.getInt("REPETICAOC4_1"));
            treinos.setObservacaoC4_1(rs.getString("OBSERVACAOC4_1"));
            treinosCodigos.setExercicioC4_2(rs.getInt("EXERCICIOC4_2"));
            treinosCodigos.setRepeticaoC4_2(rs.getInt("REPETICAOC4_2"));
            treinos.setObservacaoC4_2(rs.getString("OBSERVACAOC4_2"));
            treinosCodigos.setExercicioC4_3(rs.getInt("EXERCICIOC4_3"));
            treinosCodigos.setRepeticaoC4_3(rs.getInt("REPETICAOC4_3"));
            treinos.setObservacaoC4_3(rs.getString("OBSERVACAOC4_3"));
            treinosCodigos.setExercicioC4_4(rs.getInt("EXERCICIOC4_4"));
            treinosCodigos.setRepeticaoC4_4(rs.getInt("REPETICAOC4_4"));
            treinos.setObservacaoC4_4(rs.getString("OBSERVACAOC4_4"));
            treinosCodigos.setExercicioC4_5(rs.getInt("EXERCICIOC4_5"));
            treinosCodigos.setRepeticaoC4_5(rs.getInt("REPETICAOC4_5"));
            treinos.setObservacaoC4_5(rs.getString("OBSERVACAOC4_5"));
            treinosCodigos.setExercicioC4_6(rs.getInt("EXERCICIOC4_6"));
            treinosCodigos.setRepeticaoC4_6(rs.getInt("REPETICAOC4_6"));
            treinos.setObservacaoC4_6(rs.getString("OBSERVACAOC4_6"));
            
            treinosCodigos.setGrupo_muscularC5(rs.getInt("GRUPO_MUSCULARC5"));
            treinosCodigos.setExercicioC5(rs.getInt("EXERCICIOC5"));
            treinosCodigos.setRepeticaoC5(rs.getInt("REPETICAOC5"));
            treinos.setObservacaoC5(rs.getString("OBSERVACAOC5"));
            treinosCodigos.setExercicioC5_1(rs.getInt("EXERCICIOC5_1"));
            treinosCodigos.setRepeticaoC5_1(rs.getInt("REPETICAOC5_1"));
            treinos.setObservacaoC5_1(rs.getString("OBSERVACAOC5_1"));
            treinosCodigos.setExercicioC5_2(rs.getInt("EXERCICIOC5_2"));
            treinosCodigos.setRepeticaoC5_2(rs.getInt("REPETICAOC5_2"));
            treinos.setObservacaoC5_2(rs.getString("OBSERVACAOC5_2"));
            treinosCodigos.setExercicioC5_3(rs.getInt("EXERCICIOC5_3"));
            treinosCodigos.setRepeticaoC5_3(rs.getInt("REPETICAOC5_3"));
            treinos.setObservacaoC5_3(rs.getString("OBSERVACAOC5_3"));
            treinosCodigos.setExercicioC5_4(rs.getInt("EXERCICIOC5_4"));
            treinosCodigos.setRepeticaoC5_4(rs.getInt("REPETICAOC5_4"));
            treinos.setObservacaoC5_4(rs.getString("OBSERVACAOC5_4"));
            treinosCodigos.setExercicioC5_5(rs.getInt("EXERCICIOC5_5"));
            treinosCodigos.setRepeticaoC5_5(rs.getInt("REPETICAOC5_5"));
            treinos.setObservacaoC5_5(rs.getString("OBSERVACAOC5_5"));
            treinosCodigos.setExercicioC5_6(rs.getInt("EXERCICIOC5_6"));
            treinosCodigos.setRepeticaoC5_6(rs.getInt("REPETICAOC5_6"));
            treinos.setObservacaoC5_6(rs.getString("OBSERVACAOC5_6")); 
            }    
    }
    
    //SELECT PARA TRAZER O NOMEO DO MEMBRO TENDO SOMENTE O CÓDIGO
    public String populandoTelaTreinosGruposMusculares(int codigo) throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        String nome = "";
        String sql = "SELECT NM_MEMBRO FROM TB_MEMBROS WHERE CD_MEMBRO = '"+codigo+"' ";
   
        rs = stmt.executeQuery(sql);
        
            if(rs.next())
                nome = rs.getString("NM_MEMBRO"); 
            
        return nome;             
    }
  
    public String populandoTelaTreinosExercicios(int codigo) throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        String nome = "";
        String sql = "SELECT NM_EXERCICIO FROM TB_EXERCICIOS WHERE CD_EXERCICIO = '"+codigo+"' ";
   
        rs = stmt.executeQuery(sql);
        
            if(rs.next())
                nome = rs.getString("NM_EXERCICIO"); 
          
        con.close();    
        return nome; 
        
    }
    
    public String populandoTelaTreinosRepeticoes(int codigo) throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        String nome = "";
        String sql = "SELECT NM_REPETICAO FROM TB_REPETICOES WHERE CD_REPETICAO = '"+codigo+"' ";
   
        rs = stmt.executeQuery(sql);
        
            if(rs.next())
                nome = rs.getString("NM_REPETICAO"); 
            
        return nome;             
    }
    
    //SELECT PARA TRAZER O NOME DA MODALIDADE TENDO SOMENTE O CÓDIGO
    public String populandoTelaModalidadesAlunos(int codigo) throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        String nome = "";
        String sql = "SELECT NM_MODALIDADE FROM TB_MODALIDADES WHERE CD_MODALIDADE = '"+codigo+"' ";
   
        rs = stmt.executeQuery(sql);
        
            if(rs.next())
                nome = rs.getString("NM_MODALIDADE"); 
            
        return nome;             
    }
    
    //SELECT PARA TRAZER O NOME DO ALUNO TENDO SOMENTE O CODIGO
    public String retornaNomeAluno(int codigo) throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        String nome = "";
        String sql = "SELECT NOME FROM TB_ALUNOS WHERE CD_REGISTRO = '"+codigo+"' ";
   
        rs = stmt.executeQuery(sql);
        
            if(rs.next())
                nome = rs.getString("NOME"); 
            
        return nome;             
    }
    
    public boolean retornaAlunoEntrandoOuSaindo(int codigo) throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        String nome = "";
        String sql = "SELECT * FROM TB_FREQUENCIA_ALUNOS_HISTORICO WHERE CD_REGISTRO = '"+codigo+"' ORDER BY CD_FREQUENCIA DESC LIMIT 1";
        //String sql = "SELECT HR_SAIDA FROM TB_FREQUENCIA_ALUNOS WHERE CD_REGISTRO = '"+codigo+"' ";
   
        rs = stmt.executeQuery(sql);
        
            if(rs.next() && rs.getBoolean("ON_OFF") == true){ 
                return false;
            }else if(rs.next() && rs.getBoolean("ON_OFF") == false){ //retorna vazio BEM VINDO
                return true;
            }else{
                return true;
            }
            
            //se retornar linha o aluno esta dentro da academia
                           
    }
    
    public boolean retornaAlunoPrimeiroTreino(int codigo) throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        String nome = "";
        String sql = "SELECT * FROM TB_FREQUENCIA_ALUNOS WHERE CD_REGISTRO = '"+codigo+"' ";
   
        rs = stmt.executeQuery(sql);
        
            if(rs.next()){ 
                return false;
            }else{
                return true;
            }                           
    }
    
    public void verificaDespesasProgramadas(ClasseDespesas despesas) throws SQLException{
        con = ConectaBd.getConnection();
        Statement Stmt = con.createStatement();
        ResultSet rs = null;

        String sql = "SELECT NM_DESPESA,VALOR,VENCIMENTO FROM TB_DESPESAS_PROGRAMADAS WHERE NM_DESPESA LIKE '%"+despesas.getNome()+"%' "
                + "AND PAGO <> TRUE AND PROGRAMADA = TRUE";

        rs = Stmt.executeQuery(sql);

        if(rs.next()){
            despesas.setNome(rs.getString("NM_DESPESA"));
            despesas.setValor(rs.getFloat("VALOR"));
            despesas.setVencimento(rs.getDate("VENCIMENTO"));
        }else{
            retornoVazio = true;
        }
            
    }
    
    public void verificaNaoDespesasProgramadas(ClasseDespesas despesas) throws SQLException{
        con = ConectaBd.getConnection();
        Statement Stmt = con.createStatement();
        ResultSet rs = null;

        String sql = "SELECT NM_DESPESA,VALOR,VENCIMENTO FROM TB_DESPESAS_PROGRAMADAS WHERE NM_DESPESA LIKE '%"+despesas.getNome()+"%' "
                + "AND PAGO <> TRUE AND PROGRAMADA = FALSE";

        rs = Stmt.executeQuery(sql);

        if(rs.next()){
            despesas.setNome(rs.getString("NM_DESPESA"));
            despesas.setValor(rs.getFloat("VALOR"));
            despesas.setVencimento(rs.getDate("VENCIMENTO"));
        }
            
    }
    
    public int codigoDespesa(String nome) throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        String sql = "SELECT CD_DESPESA FROM TB_DESPESAS_PROGRAMADAS WHERE NM_DESPESA = '"+nome+"' ";
        int codigo = 0;
        
        rs = stmt.executeQuery(sql);
        
            if(rs.next())
                codigo = rs.getInt("CD_DESPESA");
        
        return codigo;
    
    }
    
    public boolean existeRegistroTbHistoricoPagamentos(int codigo) throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM TB_HISTORICO_PAGAMENTOS_ALUNOS WHERE CD_REGISTRO = '"+codigo+"' ";
        
        rs = stmt.executeQuery(sql);
        
            if(rs.next())
                return true;
            else
                return false;    
    }
    
    public void retornaPagamentoMensalidade(ClassePagamentoMensalidade dados) throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();

        String sql = "SELECT A.CD_REGISTRO, A.NOME, MAX(B.PROXIMO_VENCIMENTO), C.VALOR "
                + "FROM TB_ALUNOS A "
                + "INNER JOIN TB_HISTORICO_PAGAMENTOS_ALUNOS B ON B.CD_REGISTRO = A.CD_REGISTRO "
                + "INNER JOIN TB_PLANOS_ALUNOS C ON C.CD_REGISTRO = A.CD_REGISTRO "
                + "INNER JOIN V_MAX_CD_REGISTRO V ON (C.CD_REGISTRO=V.cd_registro and c.cd_plano_aluno = v.max1) "
                + "WHERE NOME LIKE '%"+dados.getNome()+"%' GROUP BY A.CD_REGISTRO,A.NOME,C.VALOR";
        
        rs = stmt.executeQuery(sql);
         
       //O rs começa com 0 mas o primeiro registro válido é o next que no caso é o 1. O 0 não retorna nada do sql
       while(rs.next()){ //while e if para que eu consiga manipular as linhas retornadas
       //System.out.println("Entrei no While :"+rs.getRow()); //teste
              if(rs.getRow() == this.linha_atual_select){
                //if(rs.next()){ //if caso retorno somente 1 row
                //System.out.println("Primeira linha do rs.next numero :"+rs.getRow()); //teste
                
                dados.setCodigo(rs.getInt("A.CD_REGISTRO"));
                dados.setNome(rs.getString("A.NOME"));
                dados.setDtVencimento(rs.getDate("MAX(B.PROXIMO_VENCIMENTO)"));
                dados.setValorMensalidade(rs.getFloat("C.VALOR"));   
                
                this.linha_atual_select = rs.getRow();
              }
        }
    }
    
    public void retornaDespesasPagas(ClasseSituacaoFinanceira finan) throws SQLException{
        con = ConectaBd.getConnection();
        Statement Stmt = con.createStatement();
        ResultSet despesas,saldo = null;
        String sqlD,sqlS;

        
        sqlD = "SELECT SUM(VALOR) FROM TB_DESPESAS_PROGRAMADAS "
                + "WHERE DATA_PAGAMENTO BETWEEN '"+finan.getDataInicial()+"' AND '"+finan.getDataFinal()+"' "
                + "AND PAGO = 1";

        despesas = Stmt.executeQuery(sqlD);

        if(despesas.next()){
            finan.setGastos(despesas.getFloat("SUM(VALOR)"));
        }
        
        sqlS = "SELECT SUM(VALOR_PAGO) FROM TB_HISTORICO_PAGAMENTOS_ALUNOS "
                + "WHERE DT_PAGAMENTO BETWEEN '"+finan.getDataInicial()+"' AND '"+finan.getDataFinal()+"' ";
         
        saldo = Stmt.executeQuery(sqlS);
        
        if(saldo.next()){
            finan.setMensalidade(saldo.getFloat("SUM(VALOR_PAGO)"));
        }
        
        finan.setTotal(finan.getMensalidade() - finan.getGastos());
        
    }
    
    public boolean retornaAlunoEmDebito(int codigo) throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        String sql = "SELECT A.CD_REGISTRO,A.NOME,MAX(DATE_FORMAT(C.PROXIMO_VENCIMENTO,'%e/%m/%Y')) "
                + "FROM TB_ALUNOS A INNER JOIN TB_HISTORICO_PAGAMENTOS_ALUNOS C ON C.CD_REGISTRO = A.CD_REGISTRO "
                + "WHERE C.PROXIMO_VENCIMENTO < NOW() "
                + "AND C.DT_PAGAMENTO IS NULL "
                + "AND A.CD_REGISTRO = "+codigo+" "
                + "GROUP BY A.CD_REGISTRO,A.NOME";
        
        rs = stmt.executeQuery(sql);
        
            if(rs.next())
                return true;
            else
                return false;    
    }
   
    public boolean existePlanoAluno(int codigo) throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM TB_PLANOS_ALUNOS WHERE CD_REGISTRO = "+codigo+" AND SN_ATIVO = 1";
        
        rs = stmt.executeQuery(sql);
        
            if(rs.next())
                return true;
            else
                return false;  
    }
    
    
}
    

    

    

