
package classes;

import conexoesbancodedados.ConectaBd;
import conexoesbancodedados.SelectBd;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ClasseCadastro_exercicios extends ClasseCadastro {
    
    SelectBd selects = new SelectBd();
    
    private int cd_membro;
    private String nm_membro;
    private String nm_exercicio;
    private String nm_repeticao;
    private ArrayList<String> listaComboGrupos = new ArrayList();
    private ArrayList<String> listaComboExercicios = new ArrayList();
    private ArrayList<String> listaComboRepeticoes = new ArrayList();
    Connection con;
    ResultSet rs = null;
    
    private int cd_treino;
    private String dt_inicio;
    private String dt_fim;
    private String grupo_muscularA1;
    private String exercicioA1;
    private String repeticaoA1;
    private String observacaoA1;
    private String exercicioA1_1;
    private String repeticaoA1_1;
    private String observacaoA1_1;
    private String exercicioA1_2;
    private String repeticaoA1_2;
    private String observacaoA1_2;
    private String exercicioA1_3;
    private String repeticaoA1_3;
    private String observacaoA1_3;
    private String exercicioA1_4;
    private String repeticaoA1_4;
    private String observacaoA1_4;
    private String exercicioA1_5;
    private String repeticaoA1_5;
    private String observacaoA1_5;
    private String exercicioA1_6;
    private String repeticaoA1_6;
    private String observacaoA1_6;
    
    private String grupo_muscularA2;
    private String exercicioA2;
    private String repeticaoA2;
    private String observacaoA2;
    private String exercicioA2_1;
    private String repeticaoA2_1;
    private String observacaoA2_1;
    private String exercicioA2_2;
    private String repeticaoA2_2;
    private String observacaoA2_2;
    private String exercicioA2_3;
    private String repeticaoA2_3;
    private String observacaoA2_3;
    private String exercicioA2_4;
    private String repeticaoA2_4;
    private String observacaoA2_4;
    private String exercicioA2_5;
    private String repeticaoA2_5;
    private String observacaoA2_5;
    private String exercicioA2_6;
    private String repeticaoA2_6;
    private String observacaoA2_6;
    
    private String grupo_muscularA3;
    private String exercicioA3;
    private String repeticaoA3;
    private String observacaoA3;
    private String exercicioA3_1;
    private String repeticaoA3_1;
    private String observacaoA3_1;
    private String exercicioA3_2;
    private String repeticaoA3_2;
    private String observacaoA3_2;
    private String exercicioA3_3;
    private String repeticaoA3_3;
    private String observacaoA3_3;
    private String exercicioA3_4;
    private String repeticaoA3_4;
    private String observacaoA3_4;
    private String exercicioA3_5;
    private String repeticaoA3_5;
    private String observacaoA3_5;
    private String exercicioA3_6;
    private String repeticaoA3_6;
    private String observacaoA3_6;
    
    private String grupo_muscularA4;
    private String exercicioA4;
    private String repeticaoA4;
    private String observacaoA4;
    private String exercicioA4_1;
    private String repeticaoA4_1;
    private String observacaoA4_1;
    private String exercicioA4_2;
    private String repeticaoA4_2;
    private String observacaoA4_2;
    private String exercicioA4_3;
    private String repeticaoA4_3;
    private String observacaoA4_3;
    private String exercicioA4_4;
    private String repeticaoA4_4;
    private String observacaoA4_4;
    private String exercicioA4_5;
    private String repeticaoA4_5;
    private String observacaoA4_5;
    private String exercicioA4_6;
    private String repeticaoA4_6;
    private String observacaoA4_6;
    
    private String grupo_muscularA5;
    private String exercicioA5;
    private String repeticaoA5;
    private String observacaoA5;
    private String exercicioA5_1;
    private String repeticaoA5_1;
    private String observacaoA5_1;
    private String exercicioA5_2;
    private String repeticaoA5_2;
    private String observacaoA5_2;
    private String exercicioA5_3;
    private String repeticaoA5_3;
    private String observacaoA5_3;
    private String exercicioA5_4;
    private String repeticaoA5_4;
    private String observacaoA5_4;
    private String exercicioA5_5;
    private String repeticaoA5_5;
    private String observacaoA5_5;
    private String exercicioA5_6;
    private String repeticaoA5_6;
    private String observacaoA5_6;
   
    private String grupo_muscularB1;
    private String exercicioB1;
    private String repeticaoB1;
    private String observacaoB1;
    private String exercicioB1_1;
    private String repeticaoB1_1;
    private String observacaoB1_1;
    private String exercicioB1_2;
    private String repeticaoB1_2;
    private String observacaoB1_2;
    private String exercicioB1_3;
    private String repeticaoB1_3;
    private String observacaoB1_3;
    private String exercicioB1_4;
    private String repeticaoB1_4;
    private String observacaoB1_4;
    private String exercicioB1_5;
    private String repeticaoB1_5;
    private String observacaoB1_5;
    private String exercicioB1_6;
    private String repeticaoB1_6;
    private String observacaoB1_6;
    
    private String grupo_muscularB2;
    private String exercicioB2;
    private String repeticaoB2;
    private String observacaoB2;
    private String exercicioB2_1;
    private String repeticaoB2_1;
    private String observacaoB2_1;
    private String exercicioB2_2;
    private String repeticaoB2_2;
    private String observacaoB2_2;
    private String exercicioB2_3;
    private String repeticaoB2_3;
    private String observacaoB2_3;
    private String exercicioB2_4;
    private String repeticaoB2_4;
    private String observacaoB2_4;
    private String exercicioB2_5;
    private String repeticaoB2_5;
    private String observacaoB2_5;
    private String exercicioB2_6;
    private String repeticaoB2_6;
    private String observacaoB2_6;
    
    private String grupo_muscularB3;
    private String exercicioB3;
    private String repeticaoB3;
    private String observacaoB3;
    private String exercicioB3_1;
    private String repeticaoB3_1;
    private String observacaoB3_1;
    private String exercicioB3_2;
    private String repeticaoB3_2;
    private String observacaoB3_2;
    private String exercicioB3_3;
    private String repeticaoB3_3;
    private String observacaoB3_3;
    private String exercicioB3_4;
    private String repeticaoB3_4;
    private String observacaoB3_4;
    private String exercicioB3_5;
    private String repeticaoB3_5;
    private String observacaoB3_5;
    private String exercicioB3_6;
    private String repeticaoB3_6;
    private String observacaoB3_6;
    
    private String grupo_muscularB4;
    private String exercicioB4;
    private String repeticaoB4;
    private String observacaoB4;
    private String exercicioB4_1;
    private String repeticaoB4_1;
    private String observacaoB4_1;
    private String exercicioB4_2;
    private String repeticaoB4_2;
    private String observacaoB4_2;
    private String exercicioB4_3;
    private String repeticaoB4_3;
    private String observacaoB4_3;
    private String exercicioB4_4;
    private String repeticaoB4_4;
    private String observacaoB4_4;
    private String exercicioB4_5;
    private String repeticaoB4_5;
    private String observacaoB4_5;
    private String exercicioB4_6;
    private String repeticaoB4_6;
    private String observacaoB4_6;
    
    private String grupo_muscularB5;
    private String exercicioB5;
    private String repeticaoB5;
    private String observacaoB5;
    private String exercicioB5_1;
    private String repeticaoB5_1;
    private String observacaoB5_1;
    private String exercicioB5_2;
    private String repeticaoB5_2;
    private String observacaoB5_2;
    private String exercicioB5_3;
    private String repeticaoB5_3;
    private String observacaoB5_3;
    private String exercicioB5_4;
    private String repeticaoB5_4;
    private String observacaoB5_4;
    private String exercicioB5_5;
    private String repeticaoB5_5;
    private String observacaoB5_5;
    private String exercicioB5_6;
    private String repeticaoB5_6;
    private String observacaoB5_6;
    
    private String grupo_muscularC1;
    private String exercicioC1;
    private String repeticaoC1;
    private String observacaoC1;
    private String exercicioC1_1;
    private String repeticaoC1_1;
    private String observacaoC1_1;
    private String exercicioC1_2;
    private String repeticaoC1_2;
    private String observacaoC1_2;
    private String exercicioC1_3;
    private String repeticaoC1_3;
    private String observacaoC1_3;
    private String exercicioC1_4;
    private String repeticaoC1_4;
    private String observacaoC1_4;
    private String exercicioC1_5;
    private String repeticaoC1_5;
    private String observacaoC1_5;
    private String exercicioC1_6;
    private String repeticaoC1_6;
    private String observacaoC1_6;
    
    private String grupo_muscularC2;
    private String exercicioC2;
    private String repeticaoC2;
    private String observacaoC2;
    private String exercicioC2_1;
    private String repeticaoC2_1;
    private String observacaoC2_1;
    private String exercicioC2_2;
    private String repeticaoC2_2;
    private String observacaoC2_2;
    private String exercicioC2_3;
    private String repeticaoC2_3;
    private String observacaoC2_3;
    private String exercicioC2_4;
    private String repeticaoC2_4;
    private String observacaoC2_4;
    private String exercicioC2_5;
    private String repeticaoC2_5;
    private String observacaoC2_5;
    private String exercicioC2_6;
    private String repeticaoC2_6;
    private String observacaoC2_6;
    
    private String grupo_muscularC3;
    private String exercicioC3;
    private String repeticaoC3;
    private String observacaoC3;
    private String exercicioC3_1;
    private String repeticaoC3_1;
    private String observacaoC3_1;
    private String exercicioC3_2;
    private String repeticaoC3_2;
    private String observacaoC3_2;
    private String exercicioC3_3;
    private String repeticaoC3_3;
    private String observacaoC3_3;
    private String exercicioC3_4;
    private String repeticaoC3_4;
    private String observacaoC3_4;
    private String exercicioC3_5;
    private String repeticaoC3_5;
    private String observacaoC3_5;
    private String exercicioC3_6;
    private String repeticaoC3_6;
    private String observacaoC3_6;
    
    private String grupo_muscularC4;
    private String exercicioC4;
    private String repeticaoC4;
    private String observacaoC4;
    private String exercicioC4_1;
    private String repeticaoC4_1;
    private String observacaoC4_1;
    private String exercicioC4_2;
    private String repeticaoC4_2;
    private String observacaoC4_2;
    private String exercicioC4_3;
    private String repeticaoC4_3;
    private String observacaoC4_3;
    private String exercicioC4_4;
    private String repeticaoC4_4;
    private String observacaoC4_4;
    private String exercicioC4_5;
    private String repeticaoC4_5;
    private String observacaoC4_5;
    private String exercicioC4_6;
    private String repeticaoC4_6;
    private String observacaoC4_6;
    
    private String grupo_muscularC5;
    private String exercicioC5;
    private String repeticaoC5;
    private String observacaoC5;
    private String exercicioC5_1;
    private String repeticaoC5_1;
    private String observacaoC5_1;
    private String exercicioC5_2;
    private String repeticaoC5_2;
    private String observacaoC5_2;
    private String exercicioC5_3;
    private String repeticaoC5_3;
    private String observacaoC5_3;
    private String exercicioC5_4;
    private String repeticaoC5_4;
    private String observacaoC5_4;
    private String exercicioC5_5;
    private String repeticaoC5_5;
    private String observacaoC5_5;
    private String exercicioC5_6;
    private String repeticaoC5_6;
    private String observacaoC5_6;
    
    public void populandoCombMembros() throws SQLException{
        
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT NM_MEMBRO FROM TB_MEMBROS ORDER BY NM_MEMBRO ASC";
        
        rs = stmt.executeQuery(sql);
        
            while(rs.next()){
                listaComboGrupos.add(rs.getString("NM_MEMBRO"));
            }
            
        //System.out.println(listaCombo); //teste   
    }
    
    public void populandoCombRepeticoes() throws SQLException{
        
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT NM_REPETICAO FROM TB_REPETICOES ORDER BY NM_REPETICAO ASC";
        
        rs = stmt.executeQuery(sql);
        
            while(rs.next()){
                listaComboRepeticoes.add(rs.getString("NM_REPETICAO"));
            } 
    }   
    
    public void populandoCombExercicios() throws SQLException{
        listaComboExercicios.clear();
        selects.retornaCdGrupoMuscular(this);
        
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        
        //PAREI AQUI NA MODIFICAÇÃO. FAZER O SELECT PARA A TABELA DE EXERCICIOS
        String sql = "SELECT NM_EXERCICIO FROM TB_EXERCICIOS WHERE CD_MEMBRO = '"+this.getCd_membro()+"' ORDER BY 1";
        //String sql = "SELECT NM_MEMBRO FROM TB_MEMBROS ORDER BY NM_MEMBRO ASC";
        
        rs = stmt.executeQuery(sql);
        
            while(rs.next()){
                listaComboExercicios.add(rs.getString("NM_EXERCICIO"));
            }
            
        //System.out.println(listaCombo); //teste   
    }

    public int getCd_membro() {
        return cd_membro;
    }

    public void setCd_membro(int cd_membro) {
        this.cd_membro = cd_membro;
    }
    
    public String getNm_membro() {
        return nm_membro;
    }

    public void setNm_membro(String nm_membro) {
        this.nm_membro = nm_membro;
    }

    public String getNm_exercicio() {
        return nm_exercicio;
    }

    public void setNm_exercicio(String nm_exercicio) {
        this.nm_exercicio = nm_exercicio;
    }

    public String getNm_repeticao() {
        return nm_repeticao;
    }

    public void setNm_repeticao(String nm_repeticao) {
        this.nm_repeticao = nm_repeticao;
    }

    public ArrayList<String> getListaComboGrupos() {
        return listaComboGrupos;
    }

    public void setListaComboGrupos(ArrayList<String> listaCombo) {
        this.listaComboGrupos = listaCombo;
    }

    public ArrayList<String> getListaComboExercicios() {
        return listaComboExercicios;
    }

    public void setListaComboExercicios(ArrayList<String> listaComboExercicios) {
        this.listaComboExercicios = listaComboExercicios;
    }

    public ArrayList<String> getListaComboRepeticoes() {
        return listaComboRepeticoes;
    }

    public void setListaComboRepeticoes(ArrayList<String> listaComboRepeticoes) {
        this.listaComboRepeticoes = listaComboRepeticoes;
    }
    
    public int getCd_treino() {
        return cd_treino;
    }

    public void setCd_treino(int cd_treino) {
        this.cd_treino = cd_treino;
    }

    public String getDt_inicio() {
        return dt_inicio;
    }

    public void setDt_inicio(String dt_inicio) {
        this.dt_inicio = dt_inicio;
    }

    public String getDt_fim() {
        return dt_fim;
    }

    public void setDt_fim(String dt_fim) {
        this.dt_fim = dt_fim;
    }

    public String getGrupo_muscularA1() {
        return grupo_muscularA1;
    }

    public void setGrupo_muscularA1(String grupo_muscularA1) {
        this.grupo_muscularA1 = grupo_muscularA1;
    }

    public String getExercicioA1() {
        return exercicioA1;
    }

    public void setExercicioA1(String exercicioA1) {
        this.exercicioA1 = exercicioA1;
    }

    public String getRepeticaoA1() {
        return repeticaoA1;
    }

    public void setRepeticaoA1(String repeticaoA1) {
        this.repeticaoA1 = repeticaoA1;
    }

    public String getObservacaoA1() {
        return observacaoA1;
    }

    public void setObservacaoA1(String observacaoA1) {
        this.observacaoA1 = observacaoA1;
    }

    public String getExercicioA1_1() {
        return exercicioA1_1;
    }

    public void setExercicioA1_1(String exercicioA1_1) {
        this.exercicioA1_1 = exercicioA1_1;
    }

    public String getRepeticaoA1_1() {
        return repeticaoA1_1;
    }

    public void setRepeticaoA1_1(String repeticaoA1_1) {
        this.repeticaoA1_1 = repeticaoA1_1;
    }

    public String getObservacaoA1_1() {
        return observacaoA1_1;
    }

    public void setObservacaoA1_1(String observacaoA1_1) {
        this.observacaoA1_1 = observacaoA1_1;
    }

    public String getExercicioA1_2() {
        return exercicioA1_2;
    }

    public void setExercicioA1_2(String exercicioA1_2) {
        this.exercicioA1_2 = exercicioA1_2;
    }

    public String getRepeticaoA1_2() {
        return repeticaoA1_2;
    }

    public void setRepeticaoA1_2(String repeticaoA1_2) {
        this.repeticaoA1_2 = repeticaoA1_2;
    }

    public String getObservacaoA1_2() {
        return observacaoA1_2;
    }

    public void setObservacaoA1_2(String observacaoA1_2) {
        this.observacaoA1_2 = observacaoA1_2;
    }

    public String getExercicioA1_3() {
        return exercicioA1_3;
    }

    public void setExercicioA1_3(String exercicioA1_3) {
        this.exercicioA1_3 = exercicioA1_3;
    }

    public String getRepeticaoA1_3() {
        return repeticaoA1_3;
    }

    public void setRepeticaoA1_3(String repeticaoA1_3) {
        this.repeticaoA1_3 = repeticaoA1_3;
    }

    public String getObservacaoA1_3() {
        return observacaoA1_3;
    }

    public void setObservacaoA1_3(String observacaoA1_3) {
        this.observacaoA1_3 = observacaoA1_3;
    }

    public String getExercicioA1_4() {
        return exercicioA1_4;
    }

    public void setExercicioA1_4(String exercicioA1_4) {
        this.exercicioA1_4 = exercicioA1_4;
    }

    public String getRepeticaoA1_4() {
        return repeticaoA1_4;
    }

    public void setRepeticaoA1_4(String repeticaoA1_4) {
        this.repeticaoA1_4 = repeticaoA1_4;
    }

    public String getObservacaoA1_4() {
        return observacaoA1_4;
    }

    public void setObservacaoA1_4(String observacaoA1_4) {
        this.observacaoA1_4 = observacaoA1_4;
    }

    public String getExercicioA1_5() {
        return exercicioA1_5;
    }

    public void setExercicioA1_5(String exercicioA1_5) {
        this.exercicioA1_5 = exercicioA1_5;
    }

    public String getRepeticaoA1_5() {
        return repeticaoA1_5;
    }

    public void setRepeticaoA1_5(String repeticaoA1_5) {
        this.repeticaoA1_5 = repeticaoA1_5;
    }

    public String getObservacaoA1_5() {
        return observacaoA1_5;
    }

    public void setObservacaoA1_5(String observacaoA1_5) {
        this.observacaoA1_5 = observacaoA1_5;
    }

    public String getExercicioA1_6() {
        return exercicioA1_6;
    }

    public void setExercicioA1_6(String exercicioA1_6) {
        this.exercicioA1_6 = exercicioA1_6;
    }

    public String getRepeticaoA1_6() {
        return repeticaoA1_6;
    }

    public void setRepeticaoA1_6(String repeticaoA1_6) {
        this.repeticaoA1_6 = repeticaoA1_6;
    }

    public String getObservacaoA1_6() {
        return observacaoA1_6;
    }

    public void setObservacaoA1_6(String observacaoA1_6) {
        this.observacaoA1_6 = observacaoA1_6;
    }

    public String getGrupo_muscularA2() {
        return grupo_muscularA2;
    }

    public void setGrupo_muscularA2(String grupo_muscularA2) {
        this.grupo_muscularA2 = grupo_muscularA2;
    }

    public String getExercicioA2() {
        return exercicioA2;
    }

    public void setExercicioA2(String exercicioA2) {
        this.exercicioA2 = exercicioA2;
    }

    public String getRepeticaoA2() {
        return repeticaoA2;
    }

    public void setRepeticaoA2(String repeticaoA2) {
        this.repeticaoA2 = repeticaoA2;
    }

    public String getObservacaoA2() {
        return observacaoA2;
    }

    public void setObservacaoA2(String observacaoA2) {
        this.observacaoA2 = observacaoA2;
    }

    public String getExercicioA2_1() {
        return exercicioA2_1;
    }

    public void setExercicioA2_1(String exercicioA2_1) {
        this.exercicioA2_1 = exercicioA2_1;
    }

    public String getRepeticaoA2_1() {
        return repeticaoA2_1;
    }

    public void setRepeticaoA2_1(String repeticaoA2_1) {
        this.repeticaoA2_1 = repeticaoA2_1;
    }

    public String getObservacaoA2_1() {
        return observacaoA2_1;
    }

    public void setObservacaoA2_1(String observacaoA2_1) {
        this.observacaoA2_1 = observacaoA2_1;
    }

    public String getExercicioA2_2() {
        return exercicioA2_2;
    }

    public void setExercicioA2_2(String exercicioA2_2) {
        this.exercicioA2_2 = exercicioA2_2;
    }

    public String getRepeticaoA2_2() {
        return repeticaoA2_2;
    }

    public void setRepeticaoA2_2(String repeticaoA2_2) {
        this.repeticaoA2_2 = repeticaoA2_2;
    }

    public String getObservacaoA2_2() {
        return observacaoA2_2;
    }

    public void setObservacaoA2_2(String observacaoA2_2) {
        this.observacaoA2_2 = observacaoA2_2;
    }

    public String getExercicioA2_3() {
        return exercicioA2_3;
    }

    public void setExercicioA2_3(String exercicioA2_3) {
        this.exercicioA2_3 = exercicioA2_3;
    }

    public String getRepeticaoA2_3() {
        return repeticaoA2_3;
    }

    public void setRepeticaoA2_3(String repeticaoA2_3) {
        this.repeticaoA2_3 = repeticaoA2_3;
    }

    public String getObservacaoA2_3() {
        return observacaoA2_3;
    }

    public void setObservacaoA2_3(String observacaoA2_3) {
        this.observacaoA2_3 = observacaoA2_3;
    }

    public String getExercicioA2_4() {
        return exercicioA2_4;
    }

    public void setExercicioA2_4(String exercicioA2_4) {
        this.exercicioA2_4 = exercicioA2_4;
    }

    public String getRepeticaoA2_4() {
        return repeticaoA2_4;
    }

    public void setRepeticaoA2_4(String repeticaoA2_4) {
        this.repeticaoA2_4 = repeticaoA2_4;
    }

    public String getObservacaoA2_4() {
        return observacaoA2_4;
    }

    public void setObservacaoA2_4(String observacaoA2_4) {
        this.observacaoA2_4 = observacaoA2_4;
    }

    public String getExercicioA2_5() {
        return exercicioA2_5;
    }

    public void setExercicioA2_5(String exercicioA2_5) {
        this.exercicioA2_5 = exercicioA2_5;
    }

    public String getRepeticaoA2_5() {
        return repeticaoA2_5;
    }

    public void setRepeticaoA2_5(String repeticaoA2_5) {
        this.repeticaoA2_5 = repeticaoA2_5;
    }

    public String getObservacaoA2_5() {
        return observacaoA2_5;
    }

    public void setObservacaoA2_5(String observacaoA2_5) {
        this.observacaoA2_5 = observacaoA2_5;
    }

    public String getExercicioA2_6() {
        return exercicioA2_6;
    }

    public void setExercicioA2_6(String exercicioA2_6) {
        this.exercicioA2_6 = exercicioA2_6;
    }

    public String getRepeticaoA2_6() {
        return repeticaoA2_6;
    }

    public void setRepeticaoA2_6(String repeticaoA2_6) {
        this.repeticaoA2_6 = repeticaoA2_6;
    }

    public String getObservacaoA2_6() {
        return observacaoA2_6;
    }

    public void setObservacaoA2_6(String observacaoA2_6) {
        this.observacaoA2_6 = observacaoA2_6;
    }

    public String getGrupo_muscularA3() {
        return grupo_muscularA3;
    }

    public void setGrupo_muscularA3(String grupo_muscularA3) {
        this.grupo_muscularA3 = grupo_muscularA3;
    }

    public String getExercicioA3() {
        return exercicioA3;
    }

    public void setExercicioA3(String exercicioA3) {
        this.exercicioA3 = exercicioA3;
    }

    public String getRepeticaoA3() {
        return repeticaoA3;
    }

    public void setRepeticaoA3(String repeticaoA3) {
        this.repeticaoA3 = repeticaoA3;
    }

    public String getObservacaoA3() {
        return observacaoA3;
    }

    public void setObservacaoA3(String observacaoA3) {
        this.observacaoA3 = observacaoA3;
    }

    public String getExercicioA3_1() {
        return exercicioA3_1;
    }

    public void setExercicioA3_1(String exercicioA3_1) {
        this.exercicioA3_1 = exercicioA3_1;
    }

    public String getRepeticaoA3_1() {
        return repeticaoA3_1;
    }

    public void setRepeticaoA3_1(String repeticaoA3_1) {
        this.repeticaoA3_1 = repeticaoA3_1;
    }

    public String getObservacaoA3_1() {
        return observacaoA3_1;
    }

    public void setObservacaoA3_1(String observacaoA3_1) {
        this.observacaoA3_1 = observacaoA3_1;
    }

    public String getExercicioA3_2() {
        return exercicioA3_2;
    }

    public void setExercicioA3_2(String exercicioA3_2) {
        this.exercicioA3_2 = exercicioA3_2;
    }

    public String getRepeticaoA3_2() {
        return repeticaoA3_2;
    }

    public void setRepeticaoA3_2(String repeticaoA3_2) {
        this.repeticaoA3_2 = repeticaoA3_2;
    }

    public String getObservacaoA3_2() {
        return observacaoA3_2;
    }

    public void setObservacaoA3_2(String observacaoA3_2) {
        this.observacaoA3_2 = observacaoA3_2;
    }

    public String getExercicioA3_3() {
        return exercicioA3_3;
    }

    public void setExercicioA3_3(String exercicioA3_3) {
        this.exercicioA3_3 = exercicioA3_3;
    }

    public String getRepeticaoA3_3() {
        return repeticaoA3_3;
    }

    public void setRepeticaoA3_3(String repeticaoA3_3) {
        this.repeticaoA3_3 = repeticaoA3_3;
    }

    public String getObservacaoA3_3() {
        return observacaoA3_3;
    }

    public void setObservacaoA3_3(String observacaoA3_3) {
        this.observacaoA3_3 = observacaoA3_3;
    }

    public String getExercicioA3_4() {
        return exercicioA3_4;
    }

    public void setExercicioA3_4(String exercicioA3_4) {
        this.exercicioA3_4 = exercicioA3_4;
    }

    public String getRepeticaoA3_4() {
        return repeticaoA3_4;
    }

    public void setRepeticaoA3_4(String repeticaoA3_4) {
        this.repeticaoA3_4 = repeticaoA3_4;
    }

    public String getObservacaoA3_4() {
        return observacaoA3_4;
    }

    public void setObservacaoA3_4(String observacaoA3_4) {
        this.observacaoA3_4 = observacaoA3_4;
    }

    public String getExercicioA3_5() {
        return exercicioA3_5;
    }

    public void setExercicioA3_5(String exercicioA3_5) {
        this.exercicioA3_5 = exercicioA3_5;
    }

    public String getRepeticaoA3_5() {
        return repeticaoA3_5;
    }

    public void setRepeticaoA3_5(String repeticaoA3_5) {
        this.repeticaoA3_5 = repeticaoA3_5;
    }

    public String getObservacaoA3_5() {
        return observacaoA3_5;
    }

    public void setObservacaoA3_5(String observacaoA3_5) {
        this.observacaoA3_5 = observacaoA3_5;
    }

    public String getExercicioA3_6() {
        return exercicioA3_6;
    }

    public void setExercicioA3_6(String exercicioA3_6) {
        this.exercicioA3_6 = exercicioA3_6;
    }

    public String getRepeticaoA3_6() {
        return repeticaoA3_6;
    }

    public void setRepeticaoA3_6(String repeticaoA3_6) {
        this.repeticaoA3_6 = repeticaoA3_6;
    }

    public String getObservacaoA3_6() {
        return observacaoA3_6;
    }

    public void setObservacaoA3_6(String observacaoA3_6) {
        this.observacaoA3_6 = observacaoA3_6;
    }

    public String getGrupo_muscularA4() {
        return grupo_muscularA4;
    }

    public void setGrupo_muscularA4(String grupo_muscularA4) {
        this.grupo_muscularA4 = grupo_muscularA4;
    }

    public String getExercicioA4() {
        return exercicioA4;
    }

    public void setExercicioA4(String exercicioA4) {
        this.exercicioA4 = exercicioA4;
    }

    public String getRepeticaoA4() {
        return repeticaoA4;
    }

    public void setRepeticaoA4(String repeticaoA4) {
        this.repeticaoA4 = repeticaoA4;
    }

    public String getObservacaoA4() {
        return observacaoA4;
    }

    public void setObservacaoA4(String observacaoA4) {
        this.observacaoA4 = observacaoA4;
    }

    public String getExercicioA4_1() {
        return exercicioA4_1;
    }

    public void setExercicioA4_1(String exercicioA4_1) {
        this.exercicioA4_1 = exercicioA4_1;
    }

    public String getRepeticaoA4_1() {
        return repeticaoA4_1;
    }

    public void setRepeticaoA4_1(String repeticaoA4_1) {
        this.repeticaoA4_1 = repeticaoA4_1;
    }

    public String getObservacaoA4_1() {
        return observacaoA4_1;
    }

    public void setObservacaoA4_1(String observacaoA4_1) {
        this.observacaoA4_1 = observacaoA4_1;
    }

    public String getExercicioA4_2() {
        return exercicioA4_2;
    }

    public void setExercicioA4_2(String exercicioA4_2) {
        this.exercicioA4_2 = exercicioA4_2;
    }

    public String getRepeticaoA4_2() {
        return repeticaoA4_2;
    }

    public void setRepeticaoA4_2(String repeticaoA4_2) {
        this.repeticaoA4_2 = repeticaoA4_2;
    }

    public String getObservacaoA4_2() {
        return observacaoA4_2;
    }

    public void setObservacaoA4_2(String observacaoA4_2) {
        this.observacaoA4_2 = observacaoA4_2;
    }

    public String getExercicioA4_3() {
        return exercicioA4_3;
    }

    public void setExercicioA4_3(String exercicioA4_3) {
        this.exercicioA4_3 = exercicioA4_3;
    }

    public String getRepeticaoA4_3() {
        return repeticaoA4_3;
    }

    public void setRepeticaoA4_3(String repeticaoA4_3) {
        this.repeticaoA4_3 = repeticaoA4_3;
    }

    public String getObservacaoA4_3() {
        return observacaoA4_3;
    }

    public void setObservacaoA4_3(String observacaoA4_3) {
        this.observacaoA4_3 = observacaoA4_3;
    }

    public String getExercicioA4_4() {
        return exercicioA4_4;
    }

    public void setExercicioA4_4(String exercicioA4_4) {
        this.exercicioA4_4 = exercicioA4_4;
    }

    public String getRepeticaoA4_4() {
        return repeticaoA4_4;
    }

    public void setRepeticaoA4_4(String repeticaoA4_4) {
        this.repeticaoA4_4 = repeticaoA4_4;
    }

    public String getObservacaoA4_4() {
        return observacaoA4_4;
    }

    public void setObservacaoA4_4(String observacaoA4_4) {
        this.observacaoA4_4 = observacaoA4_4;
    }

    public String getExercicioA4_5() {
        return exercicioA4_5;
    }

    public void setExercicioA4_5(String exercicioA4_5) {
        this.exercicioA4_5 = exercicioA4_5;
    }

    public String getRepeticaoA4_5() {
        return repeticaoA4_5;
    }

    public void setRepeticaoA4_5(String repeticaoA4_5) {
        this.repeticaoA4_5 = repeticaoA4_5;
    }

    public String getObservacaoA4_5() {
        return observacaoA4_5;
    }

    public void setObservacaoA4_5(String observacaoA4_5) {
        this.observacaoA4_5 = observacaoA4_5;
    }

    public String getExercicioA4_6() {
        return exercicioA4_6;
    }

    public void setExercicioA4_6(String exercicioA4_6) {
        this.exercicioA4_6 = exercicioA4_6;
    }

    public String getRepeticaoA4_6() {
        return repeticaoA4_6;
    }

    public void setRepeticaoA4_6(String repeticaoA4_6) {
        this.repeticaoA4_6 = repeticaoA4_6;
    }

    public String getObservacaoA4_6() {
        return observacaoA4_6;
    }

    public void setObservacaoA4_6(String observacaoA4_6) {
        this.observacaoA4_6 = observacaoA4_6;
    }

    public String getGrupo_muscularA5() {
        return grupo_muscularA5;
    }

    public void setGrupo_muscularA5(String grupo_muscularA5) {
        this.grupo_muscularA5 = grupo_muscularA5;
    }

    public String getExercicioA5() {
        return exercicioA5;
    }

    public void setExercicioA5(String exercicioA5) {
        this.exercicioA5 = exercicioA5;
    }

    public String getRepeticaoA5() {
        return repeticaoA5;
    }

    public void setRepeticaoA5(String repeticaoA5) {
        this.repeticaoA5 = repeticaoA5;
    }

    public String getObservacaoA5() {
        return observacaoA5;
    }

    public void setObservacaoA5(String observacaoA5) {
        this.observacaoA5 = observacaoA5;
    }

    public String getExercicioA5_1() {
        return exercicioA5_1;
    }

    public void setExercicioA5_1(String exercicioA5_1) {
        this.exercicioA5_1 = exercicioA5_1;
    }

    public String getRepeticaoA5_1() {
        return repeticaoA5_1;
    }

    public void setRepeticaoA5_1(String repeticaoA5_1) {
        this.repeticaoA5_1 = repeticaoA5_1;
    }

    public String getObservacaoA5_1() {
        return observacaoA5_1;
    }

    public void setObservacaoA5_1(String observacaoA5_1) {
        this.observacaoA5_1 = observacaoA5_1;
    }

    public String getExercicioA5_2() {
        return exercicioA5_2;
    }

    public void setExercicioA5_2(String exercicioA5_2) {
        this.exercicioA5_2 = exercicioA5_2;
    }

    public String getRepeticaoA5_2() {
        return repeticaoA5_2;
    }

    public void setRepeticaoA5_2(String repeticaoA5_2) {
        this.repeticaoA5_2 = repeticaoA5_2;
    }

    public String getObservacaoA5_2() {
        return observacaoA5_2;
    }

    public void setObservacaoA5_2(String observacaoA5_2) {
        this.observacaoA5_2 = observacaoA5_2;
    }

    public String getExercicioA5_3() {
        return exercicioA5_3;
    }

    public void setExercicioA5_3(String exercicioA5_3) {
        this.exercicioA5_3 = exercicioA5_3;
    }

    public String getRepeticaoA5_3() {
        return repeticaoA5_3;
    }

    public void setRepeticaoA5_3(String repeticaoA5_3) {
        this.repeticaoA5_3 = repeticaoA5_3;
    }

    public String getObservacaoA5_3() {
        return observacaoA5_3;
    }

    public void setObservacaoA5_3(String observacaoA5_3) {
        this.observacaoA5_3 = observacaoA5_3;
    }

    public String getExercicioA5_4() {
        return exercicioA5_4;
    }

    public void setExercicioA5_4(String exercicioA5_4) {
        this.exercicioA5_4 = exercicioA5_4;
    }

    public String getRepeticaoA5_4() {
        return repeticaoA5_4;
    }

    public void setRepeticaoA5_4(String repeticaoA5_4) {
        this.repeticaoA5_4 = repeticaoA5_4;
    }

    public String getObservacaoA5_4() {
        return observacaoA5_4;
    }

    public void setObservacaoA5_4(String observacaoA5_4) {
        this.observacaoA5_4 = observacaoA5_4;
    }

    public String getExercicioA5_5() {
        return exercicioA5_5;
    }

    public void setExercicioA5_5(String exercicioA5_5) {
        this.exercicioA5_5 = exercicioA5_5;
    }

    public String getRepeticaoA5_5() {
        return repeticaoA5_5;
    }

    public void setRepeticaoA5_5(String repeticaoA5_5) {
        this.repeticaoA5_5 = repeticaoA5_5;
    }

    public String getObservacaoA5_5() {
        return observacaoA5_5;
    }

    public void setObservacaoA5_5(String observacaoA5_5) {
        this.observacaoA5_5 = observacaoA5_5;
    }

    public String getExercicioA5_6() {
        return exercicioA5_6;
    }

    public void setExercicioA5_6(String exercicioA5_6) {
        this.exercicioA5_6 = exercicioA5_6;
    }

    public String getRepeticaoA5_6() {
        return repeticaoA5_6;
    }

    public void setRepeticaoA5_6(String repeticaoA5_6) {
        this.repeticaoA5_6 = repeticaoA5_6;
    }

    public String getObservacaoA5_6() {
        return observacaoA5_6;
    }

    public void setObservacaoA5_6(String observacaoA5_6) {
        this.observacaoA5_6 = observacaoA5_6;
    }

    public String getGrupo_muscularB1() {
        return grupo_muscularB1;
    }

    public void setGrupo_muscularB1(String grupo_muscularB1) {
        this.grupo_muscularB1 = grupo_muscularB1;
    }

    public String getExercicioB1() {
        return exercicioB1;
    }

    public void setExercicioB1(String exercicioB1) {
        this.exercicioB1 = exercicioB1;
    }

    public String getRepeticaoB1() {
        return repeticaoB1;
    }

    public void setRepeticaoB1(String repeticaoB1) {
        this.repeticaoB1 = repeticaoB1;
    }

    public String getObservacaoB1() {
        return observacaoB1;
    }

    public void setObservacaoB1(String observacaoB1) {
        this.observacaoB1 = observacaoB1;
    }

    public String getExercicioB1_1() {
        return exercicioB1_1;
    }

    public void setExercicioB1_1(String exercicioB1_1) {
        this.exercicioB1_1 = exercicioB1_1;
    }

    public String getRepeticaoB1_1() {
        return repeticaoB1_1;
    }

    public void setRepeticaoB1_1(String repeticaoB1_1) {
        this.repeticaoB1_1 = repeticaoB1_1;
    }

    public String getObservacaoB1_1() {
        return observacaoB1_1;
    }

    public void setObservacaoB1_1(String observacaoB1_1) {
        this.observacaoB1_1 = observacaoB1_1;
    }

    public String getExercicioB1_2() {
        return exercicioB1_2;
    }

    public void setExercicioB1_2(String exercicioB1_2) {
        this.exercicioB1_2 = exercicioB1_2;
    }

    public String getRepeticaoB1_2() {
        return repeticaoB1_2;
    }

    public void setRepeticaoB1_2(String repeticaoB1_2) {
        this.repeticaoB1_2 = repeticaoB1_2;
    }

    public String getObservacaoB1_2() {
        return observacaoB1_2;
    }

    public void setObservacaoB1_2(String observacaoB1_2) {
        this.observacaoB1_2 = observacaoB1_2;
    }

    public String getExercicioB1_3() {
        return exercicioB1_3;
    }

    public void setExercicioB1_3(String exercicioB1_3) {
        this.exercicioB1_3 = exercicioB1_3;
    }

    public String getRepeticaoB1_3() {
        return repeticaoB1_3;
    }

    public void setRepeticaoB1_3(String repeticaoB1_3) {
        this.repeticaoB1_3 = repeticaoB1_3;
    }

    public String getObservacaoB1_3() {
        return observacaoB1_3;
    }

    public void setObservacaoB1_3(String observacaoB1_3) {
        this.observacaoB1_3 = observacaoB1_3;
    }

    public String getExercicioB1_4() {
        return exercicioB1_4;
    }

    public void setExercicioB1_4(String exercicioB1_4) {
        this.exercicioB1_4 = exercicioB1_4;
    }

    public String getRepeticaoB1_4() {
        return repeticaoB1_4;
    }

    public void setRepeticaoB1_4(String repeticaoB1_4) {
        this.repeticaoB1_4 = repeticaoB1_4;
    }

    public String getObservacaoB1_4() {
        return observacaoB1_4;
    }

    public void setObservacaoB1_4(String observacaoB1_4) {
        this.observacaoB1_4 = observacaoB1_4;
    }

    public String getExercicioB1_5() {
        return exercicioB1_5;
    }

    public void setExercicioB1_5(String exercicioB1_5) {
        this.exercicioB1_5 = exercicioB1_5;
    }

    public String getRepeticaoB1_5() {
        return repeticaoB1_5;
    }

    public void setRepeticaoB1_5(String repeticaoB1_5) {
        this.repeticaoB1_5 = repeticaoB1_5;
    }

    public String getObservacaoB1_5() {
        return observacaoB1_5;
    }

    public void setObservacaoB1_5(String observacaoB1_5) {
        this.observacaoB1_5 = observacaoB1_5;
    }

    public String getExercicioB1_6() {
        return exercicioB1_6;
    }

    public void setExercicioB1_6(String exercicioB1_6) {
        this.exercicioB1_6 = exercicioB1_6;
    }

    public String getRepeticaoB1_6() {
        return repeticaoB1_6;
    }

    public void setRepeticaoB1_6(String repeticaoB1_6) {
        this.repeticaoB1_6 = repeticaoB1_6;
    }

    public String getObservacaoB1_6() {
        return observacaoB1_6;
    }

    public void setObservacaoB1_6(String observacaoB1_6) {
        this.observacaoB1_6 = observacaoB1_6;
    }

    public String getGrupo_muscularB2() {
        return grupo_muscularB2;
    }

    public void setGrupo_muscularB2(String grupo_muscularB2) {
        this.grupo_muscularB2 = grupo_muscularB2;
    }

    public String getExercicioB2() {
        return exercicioB2;
    }

    public void setExercicioB2(String exercicioB2) {
        this.exercicioB2 = exercicioB2;
    }

    public String getRepeticaoB2() {
        return repeticaoB2;
    }

    public void setRepeticaoB2(String repeticaoB2) {
        this.repeticaoB2 = repeticaoB2;
    }

    public String getObservacaoB2() {
        return observacaoB2;
    }

    public void setObservacaoB2(String observacaoB2) {
        this.observacaoB2 = observacaoB2;
    }

    public String getExercicioB2_1() {
        return exercicioB2_1;
    }

    public void setExercicioB2_1(String exercicioB2_1) {
        this.exercicioB2_1 = exercicioB2_1;
    }

    public String getRepeticaoB2_1() {
        return repeticaoB2_1;
    }

    public void setRepeticaoB2_1(String repeticaoB2_1) {
        this.repeticaoB2_1 = repeticaoB2_1;
    }

    public String getObservacaoB2_1() {
        return observacaoB2_1;
    }

    public void setObservacaoB2_1(String observacaoB2_1) {
        this.observacaoB2_1 = observacaoB2_1;
    }

    public String getExercicioB2_2() {
        return exercicioB2_2;
    }

    public void setExercicioB2_2(String exercicioB2_2) {
        this.exercicioB2_2 = exercicioB2_2;
    }

    public String getRepeticaoB2_2() {
        return repeticaoB2_2;
    }

    public void setRepeticaoB2_2(String repeticaoB2_2) {
        this.repeticaoB2_2 = repeticaoB2_2;
    }

    public String getObservacaoB2_2() {
        return observacaoB2_2;
    }

    public void setObservacaoB2_2(String observacaoB2_2) {
        this.observacaoB2_2 = observacaoB2_2;
    }

    public String getExercicioB2_3() {
        return exercicioB2_3;
    }

    public void setExercicioB2_3(String exercicioB2_3) {
        this.exercicioB2_3 = exercicioB2_3;
    }

    public String getRepeticaoB2_3() {
        return repeticaoB2_3;
    }

    public void setRepeticaoB2_3(String repeticaoB2_3) {
        this.repeticaoB2_3 = repeticaoB2_3;
    }

    public String getObservacaoB2_3() {
        return observacaoB2_3;
    }

    public void setObservacaoB2_3(String observacaoB2_3) {
        this.observacaoB2_3 = observacaoB2_3;
    }

    public String getExercicioB2_4() {
        return exercicioB2_4;
    }

    public void setExercicioB2_4(String exercicioB2_4) {
        this.exercicioB2_4 = exercicioB2_4;
    }

    public String getRepeticaoB2_4() {
        return repeticaoB2_4;
    }

    public void setRepeticaoB2_4(String repeticaoB2_4) {
        this.repeticaoB2_4 = repeticaoB2_4;
    }

    public String getObservacaoB2_4() {
        return observacaoB2_4;
    }

    public void setObservacaoB2_4(String observacaoB2_4) {
        this.observacaoB2_4 = observacaoB2_4;
    }

    public String getExercicioB2_5() {
        return exercicioB2_5;
    }

    public void setExercicioB2_5(String exercicioB2_5) {
        this.exercicioB2_5 = exercicioB2_5;
    }

    public String getRepeticaoB2_5() {
        return repeticaoB2_5;
    }

    public void setRepeticaoB2_5(String repeticaoB2_5) {
        this.repeticaoB2_5 = repeticaoB2_5;
    }

    public String getObservacaoB2_5() {
        return observacaoB2_5;
    }

    public void setObservacaoB2_5(String observacaoB2_5) {
        this.observacaoB2_5 = observacaoB2_5;
    }

    public String getExercicioB2_6() {
        return exercicioB2_6;
    }

    public void setExercicioB2_6(String exercicioB2_6) {
        this.exercicioB2_6 = exercicioB2_6;
    }

    public String getRepeticaoB2_6() {
        return repeticaoB2_6;
    }

    public void setRepeticaoB2_6(String repeticaoB2_6) {
        this.repeticaoB2_6 = repeticaoB2_6;
    }

    public String getObservacaoB2_6() {
        return observacaoB2_6;
    }

    public void setObservacaoB2_6(String observacaoB2_6) {
        this.observacaoB2_6 = observacaoB2_6;
    }

    public String getGrupo_muscularB3() {
        return grupo_muscularB3;
    }

    public void setGrupo_muscularB3(String grupo_muscularB3) {
        this.grupo_muscularB3 = grupo_muscularB3;
    }

    public String getExercicioB3() {
        return exercicioB3;
    }

    public void setExercicioB3(String exercicioB3) {
        this.exercicioB3 = exercicioB3;
    }

    public String getRepeticaoB3() {
        return repeticaoB3;
    }

    public void setRepeticaoB3(String repeticaoB3) {
        this.repeticaoB3 = repeticaoB3;
    }

    public String getObservacaoB3() {
        return observacaoB3;
    }

    public void setObservacaoB3(String observacaoB3) {
        this.observacaoB3 = observacaoB3;
    }

    public String getExercicioB3_1() {
        return exercicioB3_1;
    }

    public void setExercicioB3_1(String exercicioB3_1) {
        this.exercicioB3_1 = exercicioB3_1;
    }

    public String getRepeticaoB3_1() {
        return repeticaoB3_1;
    }

    public void setRepeticaoB3_1(String repeticaoB3_1) {
        this.repeticaoB3_1 = repeticaoB3_1;
    }

    public String getObservacaoB3_1() {
        return observacaoB3_1;
    }

    public void setObservacaoB3_1(String observacaoB3_1) {
        this.observacaoB3_1 = observacaoB3_1;
    }

    public String getExercicioB3_2() {
        return exercicioB3_2;
    }

    public void setExercicioB3_2(String exercicioB3_2) {
        this.exercicioB3_2 = exercicioB3_2;
    }

    public String getRepeticaoB3_2() {
        return repeticaoB3_2;
    }

    public void setRepeticaoB3_2(String repeticaoB3_2) {
        this.repeticaoB3_2 = repeticaoB3_2;
    }

    public String getObservacaoB3_2() {
        return observacaoB3_2;
    }

    public void setObservacaoB3_2(String observacaoB3_2) {
        this.observacaoB3_2 = observacaoB3_2;
    }

    public String getExercicioB3_3() {
        return exercicioB3_3;
    }

    public void setExercicioB3_3(String exercicioB3_3) {
        this.exercicioB3_3 = exercicioB3_3;
    }

    public String getRepeticaoB3_3() {
        return repeticaoB3_3;
    }

    public void setRepeticaoB3_3(String repeticaoB3_3) {
        this.repeticaoB3_3 = repeticaoB3_3;
    }

    public String getObservacaoB3_3() {
        return observacaoB3_3;
    }

    public void setObservacaoB3_3(String observacaoB3_3) {
        this.observacaoB3_3 = observacaoB3_3;
    }

    public String getExercicioB3_4() {
        return exercicioB3_4;
    }

    public void setExercicioB3_4(String exercicioB3_4) {
        this.exercicioB3_4 = exercicioB3_4;
    }

    public String getRepeticaoB3_4() {
        return repeticaoB3_4;
    }

    public void setRepeticaoB3_4(String repeticaoB3_4) {
        this.repeticaoB3_4 = repeticaoB3_4;
    }

    public String getObservacaoB3_4() {
        return observacaoB3_4;
    }

    public void setObservacaoB3_4(String observacaoB3_4) {
        this.observacaoB3_4 = observacaoB3_4;
    }

    public String getExercicioB3_5() {
        return exercicioB3_5;
    }

    public void setExercicioB3_5(String exercicioB3_5) {
        this.exercicioB3_5 = exercicioB3_5;
    }

    public String getRepeticaoB3_5() {
        return repeticaoB3_5;
    }

    public void setRepeticaoB3_5(String repeticaoB3_5) {
        this.repeticaoB3_5 = repeticaoB3_5;
    }

    public String getObservacaoB3_5() {
        return observacaoB3_5;
    }

    public void setObservacaoB3_5(String observacaoB3_5) {
        this.observacaoB3_5 = observacaoB3_5;
    }

    public String getExercicioB3_6() {
        return exercicioB3_6;
    }

    public void setExercicioB3_6(String exercicioB3_6) {
        this.exercicioB3_6 = exercicioB3_6;
    }

    public String getRepeticaoB3_6() {
        return repeticaoB3_6;
    }

    public void setRepeticaoB3_6(String repeticaoB3_6) {
        this.repeticaoB3_6 = repeticaoB3_6;
    }

    public String getObservacaoB3_6() {
        return observacaoB3_6;
    }

    public void setObservacaoB3_6(String observacaoB3_6) {
        this.observacaoB3_6 = observacaoB3_6;
    }

    public String getGrupo_muscularB4() {
        return grupo_muscularB4;
    }

    public void setGrupo_muscularB4(String grupo_muscularB4) {
        this.grupo_muscularB4 = grupo_muscularB4;
    }

    public String getExercicioB4() {
        return exercicioB4;
    }

    public void setExercicioB4(String exercicioB4) {
        this.exercicioB4 = exercicioB4;
    }

    public String getRepeticaoB4() {
        return repeticaoB4;
    }

    public void setRepeticaoB4(String repeticaoB4) {
        this.repeticaoB4 = repeticaoB4;
    }

    public String getObservacaoB4() {
        return observacaoB4;
    }

    public void setObservacaoB4(String observacaoB4) {
        this.observacaoB4 = observacaoB4;
    }

    public String getExercicioB4_1() {
        return exercicioB4_1;
    }

    public void setExercicioB4_1(String exercicioB4_1) {
        this.exercicioB4_1 = exercicioB4_1;
    }

    public String getRepeticaoB4_1() {
        return repeticaoB4_1;
    }

    public void setRepeticaoB4_1(String repeticaoB4_1) {
        this.repeticaoB4_1 = repeticaoB4_1;
    }

    public String getObservacaoB4_1() {
        return observacaoB4_1;
    }

    public void setObservacaoB4_1(String observacaoB4_1) {
        this.observacaoB4_1 = observacaoB4_1;
    }

    public String getExercicioB4_2() {
        return exercicioB4_2;
    }

    public void setExercicioB4_2(String exercicioB4_2) {
        this.exercicioB4_2 = exercicioB4_2;
    }

    public String getRepeticaoB4_2() {
        return repeticaoB4_2;
    }

    public void setRepeticaoB4_2(String repeticaoB4_2) {
        this.repeticaoB4_2 = repeticaoB4_2;
    }

    public String getObservacaoB4_2() {
        return observacaoB4_2;
    }

    public void setObservacaoB4_2(String observacaoB4_2) {
        this.observacaoB4_2 = observacaoB4_2;
    }

    public String getExercicioB4_3() {
        return exercicioB4_3;
    }

    public void setExercicioB4_3(String exercicioB4_3) {
        this.exercicioB4_3 = exercicioB4_3;
    }

    public String getRepeticaoB4_3() {
        return repeticaoB4_3;
    }

    public void setRepeticaoB4_3(String repeticaoB4_3) {
        this.repeticaoB4_3 = repeticaoB4_3;
    }

    public String getObservacaoB4_3() {
        return observacaoB4_3;
    }

    public void setObservacaoB4_3(String observacaoB4_3) {
        this.observacaoB4_3 = observacaoB4_3;
    }

    public String getExercicioB4_4() {
        return exercicioB4_4;
    }

    public void setExercicioB4_4(String exercicioB4_4) {
        this.exercicioB4_4 = exercicioB4_4;
    }

    public String getRepeticaoB4_4() {
        return repeticaoB4_4;
    }

    public void setRepeticaoB4_4(String repeticaoB4_4) {
        this.repeticaoB4_4 = repeticaoB4_4;
    }

    public String getObservacaoB4_4() {
        return observacaoB4_4;
    }

    public void setObservacaoB4_4(String observacaoB4_4) {
        this.observacaoB4_4 = observacaoB4_4;
    }

    public String getExercicioB4_5() {
        return exercicioB4_5;
    }

    public void setExercicioB4_5(String exercicioB4_5) {
        this.exercicioB4_5 = exercicioB4_5;
    }

    public String getRepeticaoB4_5() {
        return repeticaoB4_5;
    }

    public void setRepeticaoB4_5(String repeticaoB4_5) {
        this.repeticaoB4_5 = repeticaoB4_5;
    }

    public String getObservacaoB4_5() {
        return observacaoB4_5;
    }

    public void setObservacaoB4_5(String observacaoB4_5) {
        this.observacaoB4_5 = observacaoB4_5;
    }

    public String getExercicioB4_6() {
        return exercicioB4_6;
    }

    public void setExercicioB4_6(String exercicioB4_6) {
        this.exercicioB4_6 = exercicioB4_6;
    }

    public String getRepeticaoB4_6() {
        return repeticaoB4_6;
    }

    public void setRepeticaoB4_6(String repeticaoB4_6) {
        this.repeticaoB4_6 = repeticaoB4_6;
    }

    public String getObservacaoB4_6() {
        return observacaoB4_6;
    }

    public void setObservacaoB4_6(String observacaoB4_6) {
        this.observacaoB4_6 = observacaoB4_6;
    }

    public String getGrupo_muscularB5() {
        return grupo_muscularB5;
    }

    public void setGrupo_muscularB5(String grupo_muscularB5) {
        this.grupo_muscularB5 = grupo_muscularB5;
    }

    public String getExercicioB5() {
        return exercicioB5;
    }

    public void setExercicioB5(String exercicioB5) {
        this.exercicioB5 = exercicioB5;
    }

    public String getRepeticaoB5() {
        return repeticaoB5;
    }

    public void setRepeticaoB5(String repeticaoB5) {
        this.repeticaoB5 = repeticaoB5;
    }

    public String getObservacaoB5() {
        return observacaoB5;
    }

    public void setObservacaoB5(String observacaoB5) {
        this.observacaoB5 = observacaoB5;
    }

    public String getExercicioB5_1() {
        return exercicioB5_1;
    }

    public void setExercicioB5_1(String exercicioB5_1) {
        this.exercicioB5_1 = exercicioB5_1;
    }

    public String getRepeticaoB5_1() {
        return repeticaoB5_1;
    }

    public void setRepeticaoB5_1(String repeticaoB5_1) {
        this.repeticaoB5_1 = repeticaoB5_1;
    }

    public String getObservacaoB5_1() {
        return observacaoB5_1;
    }

    public void setObservacaoB5_1(String observacaoB5_1) {
        this.observacaoB5_1 = observacaoB5_1;
    }

    public String getExercicioB5_2() {
        return exercicioB5_2;
    }

    public void setExercicioB5_2(String exercicioB5_2) {
        this.exercicioB5_2 = exercicioB5_2;
    }

    public String getRepeticaoB5_2() {
        return repeticaoB5_2;
    }

    public void setRepeticaoB5_2(String repeticaoB5_2) {
        this.repeticaoB5_2 = repeticaoB5_2;
    }

    public String getObservacaoB5_2() {
        return observacaoB5_2;
    }

    public void setObservacaoB5_2(String observacaoB5_2) {
        this.observacaoB5_2 = observacaoB5_2;
    }

    public String getExercicioB5_3() {
        return exercicioB5_3;
    }

    public void setExercicioB5_3(String exercicioB5_3) {
        this.exercicioB5_3 = exercicioB5_3;
    }

    public String getRepeticaoB5_3() {
        return repeticaoB5_3;
    }

    public void setRepeticaoB5_3(String repeticaoB5_3) {
        this.repeticaoB5_3 = repeticaoB5_3;
    }

    public String getObservacaoB5_3() {
        return observacaoB5_3;
    }

    public void setObservacaoB5_3(String observacaoB5_3) {
        this.observacaoB5_3 = observacaoB5_3;
    }

    public String getExercicioB5_4() {
        return exercicioB5_4;
    }

    public void setExercicioB5_4(String exercicioB5_4) {
        this.exercicioB5_4 = exercicioB5_4;
    }

    public String getRepeticaoB5_4() {
        return repeticaoB5_4;
    }

    public void setRepeticaoB5_4(String repeticaoB5_4) {
        this.repeticaoB5_4 = repeticaoB5_4;
    }

    public String getObservacaoB5_4() {
        return observacaoB5_4;
    }

    public void setObservacaoB5_4(String observacaoB5_4) {
        this.observacaoB5_4 = observacaoB5_4;
    }

    public String getExercicioB5_5() {
        return exercicioB5_5;
    }

    public void setExercicioB5_5(String exercicioB5_5) {
        this.exercicioB5_5 = exercicioB5_5;
    }

    public String getRepeticaoB5_5() {
        return repeticaoB5_5;
    }

    public void setRepeticaoB5_5(String repeticaoB5_5) {
        this.repeticaoB5_5 = repeticaoB5_5;
    }

    public String getObservacaoB5_5() {
        return observacaoB5_5;
    }

    public void setObservacaoB5_5(String observacaoB5_5) {
        this.observacaoB5_5 = observacaoB5_5;
    }

    public String getExercicioB5_6() {
        return exercicioB5_6;
    }

    public void setExercicioB5_6(String exercicioB5_6) {
        this.exercicioB5_6 = exercicioB5_6;
    }

    public String getRepeticaoB5_6() {
        return repeticaoB5_6;
    }

    public void setRepeticaoB5_6(String repeticaoB5_6) {
        this.repeticaoB5_6 = repeticaoB5_6;
    }

    public String getObservacaoB5_6() {
        return observacaoB5_6;
    }

    public void setObservacaoB5_6(String observacaoB5_6) {
        this.observacaoB5_6 = observacaoB5_6;
    }

    public String getGrupo_muscularC1() {
        return grupo_muscularC1;
    }

    public void setGrupo_muscularC1(String grupo_muscularC1) {
        this.grupo_muscularC1 = grupo_muscularC1;
    }

    public String getExercicioC1() {
        return exercicioC1;
    }

    public void setExercicioC1(String exercicioC1) {
        this.exercicioC1 = exercicioC1;
    }

    public String getRepeticaoC1() {
        return repeticaoC1;
    }

    public void setRepeticaoC1(String repeticaoC1) {
        this.repeticaoC1 = repeticaoC1;
    }

    public String getObservacaoC1() {
        return observacaoC1;
    }

    public void setObservacaoC1(String observacaoC1) {
        this.observacaoC1 = observacaoC1;
    }

    public String getExercicioC1_1() {
        return exercicioC1_1;
    }

    public void setExercicioC1_1(String exercicioC1_1) {
        this.exercicioC1_1 = exercicioC1_1;
    }

    public String getRepeticaoC1_1() {
        return repeticaoC1_1;
    }

    public void setRepeticaoC1_1(String repeticaoC1_1) {
        this.repeticaoC1_1 = repeticaoC1_1;
    }

    public String getObservacaoC1_1() {
        return observacaoC1_1;
    }

    public void setObservacaoC1_1(String observacaoC1_1) {
        this.observacaoC1_1 = observacaoC1_1;
    }

    public String getExercicioC1_2() {
        return exercicioC1_2;
    }

    public void setExercicioC1_2(String exercicioC1_2) {
        this.exercicioC1_2 = exercicioC1_2;
    }

    public String getRepeticaoC1_2() {
        return repeticaoC1_2;
    }

    public void setRepeticaoC1_2(String repeticaoC1_2) {
        this.repeticaoC1_2 = repeticaoC1_2;
    }

    public String getObservacaoC1_2() {
        return observacaoC1_2;
    }

    public void setObservacaoC1_2(String observacaoC1_2) {
        this.observacaoC1_2 = observacaoC1_2;
    }

    public String getExercicioC1_3() {
        return exercicioC1_3;
    }

    public void setExercicioC1_3(String exercicioC1_3) {
        this.exercicioC1_3 = exercicioC1_3;
    }

    public String getRepeticaoC1_3() {
        return repeticaoC1_3;
    }

    public void setRepeticaoC1_3(String repeticaoC1_3) {
        this.repeticaoC1_3 = repeticaoC1_3;
    }

    public String getObservacaoC1_3() {
        return observacaoC1_3;
    }

    public void setObservacaoC1_3(String observacaoC1_3) {
        this.observacaoC1_3 = observacaoC1_3;
    }

    public String getExercicioC1_4() {
        return exercicioC1_4;
    }

    public void setExercicioC1_4(String exercicioC1_4) {
        this.exercicioC1_4 = exercicioC1_4;
    }

    public String getRepeticaoC1_4() {
        return repeticaoC1_4;
    }

    public void setRepeticaoC1_4(String repeticaoC1_4) {
        this.repeticaoC1_4 = repeticaoC1_4;
    }

    public String getObservacaoC1_4() {
        return observacaoC1_4;
    }

    public void setObservacaoC1_4(String observacaoC1_4) {
        this.observacaoC1_4 = observacaoC1_4;
    }

    public String getExercicioC1_5() {
        return exercicioC1_5;
    }

    public void setExercicioC1_5(String exercicioC1_5) {
        this.exercicioC1_5 = exercicioC1_5;
    }

    public String getRepeticaoC1_5() {
        return repeticaoC1_5;
    }

    public void setRepeticaoC1_5(String repeticaoC1_5) {
        this.repeticaoC1_5 = repeticaoC1_5;
    }

    public String getObservacaoC1_5() {
        return observacaoC1_5;
    }

    public void setObservacaoC1_5(String observacaoC1_5) {
        this.observacaoC1_5 = observacaoC1_5;
    }

    public String getExercicioC1_6() {
        return exercicioC1_6;
    }

    public void setExercicioC1_6(String exercicioC1_6) {
        this.exercicioC1_6 = exercicioC1_6;
    }

    public String getRepeticaoC1_6() {
        return repeticaoC1_6;
    }

    public void setRepeticaoC1_6(String repeticaoC1_6) {
        this.repeticaoC1_6 = repeticaoC1_6;
    }

    public String getObservacaoC1_6() {
        return observacaoC1_6;
    }

    public void setObservacaoC1_6(String observacaoC1_6) {
        this.observacaoC1_6 = observacaoC1_6;
    }

    public String getGrupo_muscularC2() {
        return grupo_muscularC2;
    }

    public void setGrupo_muscularC2(String grupo_muscularC2) {
        this.grupo_muscularC2 = grupo_muscularC2;
    }

    public String getExercicioC2() {
        return exercicioC2;
    }

    public void setExercicioC2(String exercicioC2) {
        this.exercicioC2 = exercicioC2;
    }

    public String getRepeticaoC2() {
        return repeticaoC2;
    }

    public void setRepeticaoC2(String repeticaoC2) {
        this.repeticaoC2 = repeticaoC2;
    }

    public String getObservacaoC2() {
        return observacaoC2;
    }

    public void setObservacaoC2(String observacaoC2) {
        this.observacaoC2 = observacaoC2;
    }

    public String getExercicioC2_1() {
        return exercicioC2_1;
    }

    public void setExercicioC2_1(String exercicioC2_1) {
        this.exercicioC2_1 = exercicioC2_1;
    }

    public String getRepeticaoC2_1() {
        return repeticaoC2_1;
    }

    public void setRepeticaoC2_1(String repeticaoC2_1) {
        this.repeticaoC2_1 = repeticaoC2_1;
    }

    public String getObservacaoC2_1() {
        return observacaoC2_1;
    }

    public void setObservacaoC2_1(String observacaoC2_1) {
        this.observacaoC2_1 = observacaoC2_1;
    }

    public String getExercicioC2_2() {
        return exercicioC2_2;
    }

    public void setExercicioC2_2(String exercicioC2_2) {
        this.exercicioC2_2 = exercicioC2_2;
    }

    public String getRepeticaoC2_2() {
        return repeticaoC2_2;
    }

    public void setRepeticaoC2_2(String repeticaoC2_2) {
        this.repeticaoC2_2 = repeticaoC2_2;
    }

    public String getObservacaoC2_2() {
        return observacaoC2_2;
    }

    public void setObservacaoC2_2(String observacaoC2_2) {
        this.observacaoC2_2 = observacaoC2_2;
    }

    public String getExercicioC2_3() {
        return exercicioC2_3;
    }

    public void setExercicioC2_3(String exercicioC2_3) {
        this.exercicioC2_3 = exercicioC2_3;
    }

    public String getRepeticaoC2_3() {
        return repeticaoC2_3;
    }

    public void setRepeticaoC2_3(String repeticaoC2_3) {
        this.repeticaoC2_3 = repeticaoC2_3;
    }

    public String getObservacaoC2_3() {
        return observacaoC2_3;
    }

    public void setObservacaoC2_3(String observacaoC2_3) {
        this.observacaoC2_3 = observacaoC2_3;
    }

    public String getExercicioC2_4() {
        return exercicioC2_4;
    }

    public void setExercicioC2_4(String exercicioC2_4) {
        this.exercicioC2_4 = exercicioC2_4;
    }

    public String getRepeticaoC2_4() {
        return repeticaoC2_4;
    }

    public void setRepeticaoC2_4(String repeticaoC2_4) {
        this.repeticaoC2_4 = repeticaoC2_4;
    }

    public String getObservacaoC2_4() {
        return observacaoC2_4;
    }

    public void setObservacaoC2_4(String observacaoC2_4) {
        this.observacaoC2_4 = observacaoC2_4;
    }

    public String getExercicioC2_5() {
        return exercicioC2_5;
    }

    public void setExercicioC2_5(String exercicioC2_5) {
        this.exercicioC2_5 = exercicioC2_5;
    }

    public String getRepeticaoC2_5() {
        return repeticaoC2_5;
    }

    public void setRepeticaoC2_5(String repeticaoC2_5) {
        this.repeticaoC2_5 = repeticaoC2_5;
    }

    public String getObservacaoC2_5() {
        return observacaoC2_5;
    }

    public void setObservacaoC2_5(String observacaoC2_5) {
        this.observacaoC2_5 = observacaoC2_5;
    }

    public String getExercicioC2_6() {
        return exercicioC2_6;
    }

    public void setExercicioC2_6(String exercicioC2_6) {
        this.exercicioC2_6 = exercicioC2_6;
    }

    public String getRepeticaoC2_6() {
        return repeticaoC2_6;
    }

    public void setRepeticaoC2_6(String repeticaoC2_6) {
        this.repeticaoC2_6 = repeticaoC2_6;
    }

    public String getObservacaoC2_6() {
        return observacaoC2_6;
    }

    public void setObservacaoC2_6(String observacaoC2_6) {
        this.observacaoC2_6 = observacaoC2_6;
    }

    public String getGrupo_muscularC3() {
        return grupo_muscularC3;
    }

    public void setGrupo_muscularC3(String grupo_muscularC3) {
        this.grupo_muscularC3 = grupo_muscularC3;
    }

    public String getExercicioC3() {
        return exercicioC3;
    }

    public void setExercicioC3(String exercicioC3) {
        this.exercicioC3 = exercicioC3;
    }

    public String getRepeticaoC3() {
        return repeticaoC3;
    }

    public void setRepeticaoC3(String repeticaoC3) {
        this.repeticaoC3 = repeticaoC3;
    }

    public String getObservacaoC3() {
        return observacaoC3;
    }

    public void setObservacaoC3(String observacaoC3) {
        this.observacaoC3 = observacaoC3;
    }

    public String getExercicioC3_1() {
        return exercicioC3_1;
    }

    public void setExercicioC3_1(String exercicioC3_1) {
        this.exercicioC3_1 = exercicioC3_1;
    }

    public String getRepeticaoC3_1() {
        return repeticaoC3_1;
    }

    public void setRepeticaoC3_1(String repeticaoC3_1) {
        this.repeticaoC3_1 = repeticaoC3_1;
    }

    public String getObservacaoC3_1() {
        return observacaoC3_1;
    }

    public void setObservacaoC3_1(String observacaoC3_1) {
        this.observacaoC3_1 = observacaoC3_1;
    }

    public String getExercicioC3_2() {
        return exercicioC3_2;
    }

    public void setExercicioC3_2(String exercicioC3_2) {
        this.exercicioC3_2 = exercicioC3_2;
    }

    public String getRepeticaoC3_2() {
        return repeticaoC3_2;
    }

    public void setRepeticaoC3_2(String repeticaoC3_2) {
        this.repeticaoC3_2 = repeticaoC3_2;
    }

    public String getObservacaoC3_2() {
        return observacaoC3_2;
    }

    public void setObservacaoC3_2(String observacaoC3_2) {
        this.observacaoC3_2 = observacaoC3_2;
    }

    public String getExercicioC3_3() {
        return exercicioC3_3;
    }

    public void setExercicioC3_3(String exercicioC3_3) {
        this.exercicioC3_3 = exercicioC3_3;
    }

    public String getRepeticaoC3_3() {
        return repeticaoC3_3;
    }

    public void setRepeticaoC3_3(String repeticaoC3_3) {
        this.repeticaoC3_3 = repeticaoC3_3;
    }

    public String getObservacaoC3_3() {
        return observacaoC3_3;
    }

    public void setObservacaoC3_3(String observacaoC3_3) {
        this.observacaoC3_3 = observacaoC3_3;
    }

    public String getExercicioC3_4() {
        return exercicioC3_4;
    }

    public void setExercicioC3_4(String exercicioC3_4) {
        this.exercicioC3_4 = exercicioC3_4;
    }

    public String getRepeticaoC3_4() {
        return repeticaoC3_4;
    }

    public void setRepeticaoC3_4(String repeticaoC3_4) {
        this.repeticaoC3_4 = repeticaoC3_4;
    }

    public String getObservacaoC3_4() {
        return observacaoC3_4;
    }

    public void setObservacaoC3_4(String observacaoC3_4) {
        this.observacaoC3_4 = observacaoC3_4;
    }

    public String getExercicioC3_5() {
        return exercicioC3_5;
    }

    public void setExercicioC3_5(String exercicioC3_5) {
        this.exercicioC3_5 = exercicioC3_5;
    }

    public String getRepeticaoC3_5() {
        return repeticaoC3_5;
    }

    public void setRepeticaoC3_5(String repeticaoC3_5) {
        this.repeticaoC3_5 = repeticaoC3_5;
    }

    public String getObservacaoC3_5() {
        return observacaoC3_5;
    }

    public void setObservacaoC3_5(String observacaoC3_5) {
        this.observacaoC3_5 = observacaoC3_5;
    }

    public String getExercicioC3_6() {
        return exercicioC3_6;
    }

    public void setExercicioC3_6(String exercicioC3_6) {
        this.exercicioC3_6 = exercicioC3_6;
    }

    public String getRepeticaoC3_6() {
        return repeticaoC3_6;
    }

    public void setRepeticaoC3_6(String repeticaoC3_6) {
        this.repeticaoC3_6 = repeticaoC3_6;
    }

    public String getObservacaoC3_6() {
        return observacaoC3_6;
    }

    public void setObservacaoC3_6(String observacaoC3_6) {
        this.observacaoC3_6 = observacaoC3_6;
    }

    public String getGrupo_muscularC4() {
        return grupo_muscularC4;
    }

    public void setGrupo_muscularC4(String grupo_muscularC4) {
        this.grupo_muscularC4 = grupo_muscularC4;
    }

    public String getExercicioC4() {
        return exercicioC4;
    }

    public void setExercicioC4(String exercicioC4) {
        this.exercicioC4 = exercicioC4;
    }

    public String getRepeticaoC4() {
        return repeticaoC4;
    }

    public void setRepeticaoC4(String repeticaoC4) {
        this.repeticaoC4 = repeticaoC4;
    }

    public String getObservacaoC4() {
        return observacaoC4;
    }

    public void setObservacaoC4(String observacaoC4) {
        this.observacaoC4 = observacaoC4;
    }

    public String getExercicioC4_1() {
        return exercicioC4_1;
    }

    public void setExercicioC4_1(String exercicioC4_1) {
        this.exercicioC4_1 = exercicioC4_1;
    }

    public String getRepeticaoC4_1() {
        return repeticaoC4_1;
    }

    public void setRepeticaoC4_1(String repeticaoC4_1) {
        this.repeticaoC4_1 = repeticaoC4_1;
    }

    public String getObservacaoC4_1() {
        return observacaoC4_1;
    }

    public void setObservacaoC4_1(String observacaoC4_1) {
        this.observacaoC4_1 = observacaoC4_1;
    }

    public String getExercicioC4_2() {
        return exercicioC4_2;
    }

    public void setExercicioC4_2(String exercicioC4_2) {
        this.exercicioC4_2 = exercicioC4_2;
    }

    public String getRepeticaoC4_2() {
        return repeticaoC4_2;
    }

    public void setRepeticaoC4_2(String repeticaoC4_2) {
        this.repeticaoC4_2 = repeticaoC4_2;
    }

    public String getObservacaoC4_2() {
        return observacaoC4_2;
    }

    public void setObservacaoC4_2(String observacaoC4_2) {
        this.observacaoC4_2 = observacaoC4_2;
    }

    public String getExercicioC4_3() {
        return exercicioC4_3;
    }

    public void setExercicioC4_3(String exercicioC4_3) {
        this.exercicioC4_3 = exercicioC4_3;
    }

    public String getRepeticaoC4_3() {
        return repeticaoC4_3;
    }

    public void setRepeticaoC4_3(String repeticaoC4_3) {
        this.repeticaoC4_3 = repeticaoC4_3;
    }

    public String getObservacaoC4_3() {
        return observacaoC4_3;
    }

    public void setObservacaoC4_3(String observacaoC4_3) {
        this.observacaoC4_3 = observacaoC4_3;
    }

    public String getExercicioC4_4() {
        return exercicioC4_4;
    }

    public void setExercicioC4_4(String exercicioC4_4) {
        this.exercicioC4_4 = exercicioC4_4;
    }

    public String getRepeticaoC4_4() {
        return repeticaoC4_4;
    }

    public void setRepeticaoC4_4(String repeticaoC4_4) {
        this.repeticaoC4_4 = repeticaoC4_4;
    }

    public String getObservacaoC4_4() {
        return observacaoC4_4;
    }

    public void setObservacaoC4_4(String observacaoC4_4) {
        this.observacaoC4_4 = observacaoC4_4;
    }

    public String getExercicioC4_5() {
        return exercicioC4_5;
    }

    public void setExercicioC4_5(String exercicioC4_5) {
        this.exercicioC4_5 = exercicioC4_5;
    }

    public String getRepeticaoC4_5() {
        return repeticaoC4_5;
    }

    public void setRepeticaoC4_5(String repeticaoC4_5) {
        this.repeticaoC4_5 = repeticaoC4_5;
    }

    public String getObservacaoC4_5() {
        return observacaoC4_5;
    }

    public void setObservacaoC4_5(String observacaoC4_5) {
        this.observacaoC4_5 = observacaoC4_5;
    }

    public String getExercicioC4_6() {
        return exercicioC4_6;
    }

    public void setExercicioC4_6(String exercicioC4_6) {
        this.exercicioC4_6 = exercicioC4_6;
    }

    public String getRepeticaoC4_6() {
        return repeticaoC4_6;
    }

    public void setRepeticaoC4_6(String repeticaoC4_6) {
        this.repeticaoC4_6 = repeticaoC4_6;
    }

    public String getObservacaoC4_6() {
        return observacaoC4_6;
    }

    public void setObservacaoC4_6(String observacaoC4_6) {
        this.observacaoC4_6 = observacaoC4_6;
    }

    public String getGrupo_muscularC5() {
        return grupo_muscularC5;
    }

    public void setGrupo_muscularC5(String grupo_muscularC5) {
        this.grupo_muscularC5 = grupo_muscularC5;
    }

    public String getExercicioC5() {
        return exercicioC5;
    }

    public void setExercicioC5(String exercicioC5) {
        this.exercicioC5 = exercicioC5;
    }

    public String getRepeticaoC5() {
        return repeticaoC5;
    }

    public void setRepeticaoC5(String repeticaoC5) {
        this.repeticaoC5 = repeticaoC5;
    }

    public String getObservacaoC5() {
        return observacaoC5;
    }

    public void setObservacaoC5(String observacaoC5) {
        this.observacaoC5 = observacaoC5;
    }

    public String getExercicioC5_1() {
        return exercicioC5_1;
    }

    public void setExercicioC5_1(String exercicioC5_1) {
        this.exercicioC5_1 = exercicioC5_1;
    }

    public String getRepeticaoC5_1() {
        return repeticaoC5_1;
    }

    public void setRepeticaoC5_1(String repeticaoC5_1) {
        this.repeticaoC5_1 = repeticaoC5_1;
    }

    public String getObservacaoC5_1() {
        return observacaoC5_1;
    }

    public void setObservacaoC5_1(String observacaoC5_1) {
        this.observacaoC5_1 = observacaoC5_1;
    }

    public String getExercicioC5_2() {
        return exercicioC5_2;
    }

    public void setExercicioC5_2(String exercicioC5_2) {
        this.exercicioC5_2 = exercicioC5_2;
    }

    public String getRepeticaoC5_2() {
        return repeticaoC5_2;
    }

    public void setRepeticaoC5_2(String repeticaoC5_2) {
        this.repeticaoC5_2 = repeticaoC5_2;
    }

    public String getObservacaoC5_2() {
        return observacaoC5_2;
    }

    public void setObservacaoC5_2(String observacaoC5_2) {
        this.observacaoC5_2 = observacaoC5_2;
    }

    public String getExercicioC5_3() {
        return exercicioC5_3;
    }

    public void setExercicioC5_3(String exercicioC5_3) {
        this.exercicioC5_3 = exercicioC5_3;
    }

    public String getRepeticaoC5_3() {
        return repeticaoC5_3;
    }

    public void setRepeticaoC5_3(String repeticaoC5_3) {
        this.repeticaoC5_3 = repeticaoC5_3;
    }

    public String getObservacaoC5_3() {
        return observacaoC5_3;
    }

    public void setObservacaoC5_3(String observacaoC5_3) {
        this.observacaoC5_3 = observacaoC5_3;
    }

    public String getExercicioC5_4() {
        return exercicioC5_4;
    }

    public void setExercicioC5_4(String exercicioC5_4) {
        this.exercicioC5_4 = exercicioC5_4;
    }

    public String getRepeticaoC5_4() {
        return repeticaoC5_4;
    }

    public void setRepeticaoC5_4(String repeticaoC5_4) {
        this.repeticaoC5_4 = repeticaoC5_4;
    }

    public String getObservacaoC5_4() {
        return observacaoC5_4;
    }

    public void setObservacaoC5_4(String observacaoC5_4) {
        this.observacaoC5_4 = observacaoC5_4;
    }

    public String getExercicioC5_5() {
        return exercicioC5_5;
    }

    public void setExercicioC5_5(String exercicioC5_5) {
        this.exercicioC5_5 = exercicioC5_5;
    }

    public String getRepeticaoC5_5() {
        return repeticaoC5_5;
    }

    public void setRepeticaoC5_5(String repeticaoC5_5) {
        this.repeticaoC5_5 = repeticaoC5_5;
    }

    public String getObservacaoC5_5() {
        return observacaoC5_5;
    }

    public void setObservacaoC5_5(String observacaoC5_5) {
        this.observacaoC5_5 = observacaoC5_5;
    }

    public String getExercicioC5_6() {
        return exercicioC5_6;
    }

    public void setExercicioC5_6(String exercicioC5_6) {
        this.exercicioC5_6 = exercicioC5_6;
    }

    public String getRepeticaoC5_6() {
        return repeticaoC5_6;
    }

    public void setRepeticaoC5_6(String repeticaoC5_6) {
        this.repeticaoC5_6 = repeticaoC5_6;
    }

    public String getObservacaoC5_6() {
        return observacaoC5_6;
    }

    public void setObservacaoC5_6(String observacaoC5_6) {
        this.observacaoC5_6 = observacaoC5_6;
    }
    
    
    
    
    
}
