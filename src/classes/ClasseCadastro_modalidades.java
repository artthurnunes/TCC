
package classes;

import conexoesbancodedados.ConectaBd;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ClasseCadastro_modalidades extends ClasseCadastro {
    
    private static String nm_mod_comb1;
    private static String nm_mod_comb2;
    private static String nm_mod_comb3;
    private static String nm_mod_comb4;
    private static String nm_mod_comb5;
    private static String nm_mod_comb6;
    private static String nm_mod_comb7;
    private static String nm_mod_comb8;
    
    private static int cd_mod_comb1;
    private static int cd_mod_comb2;
    private static int cd_mod_comb3;
    private static int cd_mod_comb4;
    private static int cd_mod_comb5;
    private static int cd_mod_comb6;
    private static int cd_mod_comb7;
    private static int cd_mod_comb8;
    
    private static String nm_modalidade;
    private int cd_mod_aluno;
    private static boolean novo = true;
    private static ArrayList<String> listaMod = new ArrayList();
    Connection con;
    ResultSet rs = null;
    
    public void populandoCombMod() throws SQLException{
        
        listaMod.clear();
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT NM_MODALIDADE FROM TB_MODALIDADES ORDER BY 1 ASC";
        
        rs = stmt.executeQuery(sql);
        
            while(rs.next()){
                listaMod.add(rs.getString("NM_MODALIDADE"));
            } 
            System.out.println(listaMod);
    }
    
    public void populandoCombModCadAluno() throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT * FROM TB_MOD_ALUNOS WHERE CD_MOD_ALUNO = '"+this.cd_mod_aluno+"' ";
        rs = stmt.executeQuery(sql);
        
        if(rs.next()){
            this.cd_mod_comb1 = rs.getInt("CD_MODALIDADE1");
            this.cd_mod_comb2 = rs.getInt("CD_MODALIDADE2");
        }
        System.out.println("Modalidade 2 no select "+this.cd_mod_comb2);
    
    }

    public boolean getNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    public int getCd_mod_comb1() {
        return cd_mod_comb1;
    }

    public void setCd_mod_comb1(int cd_mod_comb1) {
        this.cd_mod_comb1 = cd_mod_comb1;
    }

    public int getCd_mod_comb2() {
        return cd_mod_comb2;
    }

    public void setCd_mod_comb2(int cd_mod_comb2) {
        this.cd_mod_comb2 = cd_mod_comb2;
    }

    public int getCd_mod_comb3() {
        return cd_mod_comb3;
    }

    public void setCd_mod_comb3(int cd_mod_comb3) {
        this.cd_mod_comb3 = cd_mod_comb3;
    }

    public int getCd_mod_comb4() {
        return cd_mod_comb4;
    }

    public void setCd_mod_comb4(int cd_mod_comb4) {
        this.cd_mod_comb4 = cd_mod_comb4;
    }

    public int getCd_mod_comb5() {
        return cd_mod_comb5;
    }

    public void setCd_mod_comb5(int cd_mod_comb5) {
        this.cd_mod_comb5 = cd_mod_comb5;
    }

    public int getCd_mod_comb6() {
        return cd_mod_comb6;
    }

    public void setCd_mod_comb6(int cd_mod_comb6) {
        this.cd_mod_comb6 = cd_mod_comb6;
    }

    public int getCd_mod_comb7() {
        return cd_mod_comb7;
    }

    public void setCd_mod_comb7(int cd_mod_comb7) {
        this.cd_mod_comb7 = cd_mod_comb7;
    }

    public int getCd_mod_comb8() {
        return cd_mod_comb8;
    }

    public void setCd_mod_comb8(int cd_mod_comb8) {
        this.cd_mod_comb8 = cd_mod_comb8;
    }
    
    

    public ArrayList<String> getListaMod() {
        return listaMod;
    }

    public void setListaMod(ArrayList<String> listaMod) {
        this.listaMod = listaMod;
    }

    public String getNm_modalidade() {
        return nm_modalidade;
    }

    public void setNm_modalidade(String nm_modalidade) {
        this.nm_modalidade = nm_modalidade;
    }

    public int getCd_mod_aluno() {
        return cd_mod_aluno;
    }

    public void setCd_mod_aluno(int cd_mod_aluno) {
        this.cd_mod_aluno = cd_mod_aluno;
    }

    public String getNm_mod_comb1() {
        return nm_mod_comb1;
    }

    public void setNm_mod_comb1(String nm_mod_comb1) {
        this.nm_mod_comb1 = nm_mod_comb1;
    }

    public String getNm_mod_comb2() {
        return nm_mod_comb2;
    }

    public void setNm_mod_comb2(String nm_mod_comb2) {
        this.nm_mod_comb2 = nm_mod_comb2;
    }

    public String getNm_mod_comb3() {
        return nm_mod_comb3;
    }

    public void setNm_mod_comb3(String nm_mod_comb3) {
        this.nm_mod_comb3 = nm_mod_comb3;
    }

    public String getNm_mod_comb4() {
        return nm_mod_comb4;
    }

    public void setNm_mod_comb4(String nm_mod_comb4) {
        this.nm_mod_comb4 = nm_mod_comb4;
    }

    public String getNm_mod_comb5() {
        return nm_mod_comb5;
    }

    public void setNm_mod_comb5(String nm_mod_comb5) {
        this.nm_mod_comb5 = nm_mod_comb5;
    }

    public String getNm_mod_comb6() {
        return nm_mod_comb6;
    }

    public void setNm_mod_comb6(String nm_mod_comb6) {
        this.nm_mod_comb6 = nm_mod_comb6;
    }

    public String getNm_mod_comb7() {
        return nm_mod_comb7;
    }

    public void setNm_mod_comb7(String nm_mod_comb7) {
        this.nm_mod_comb7 = nm_mod_comb7;
    }

    public String getNm_mod_comb8() {
        return nm_mod_comb8;
    }

    public void setNm_mod_comb8(String nm_mod_comb8) {
        this.nm_mod_comb8 = nm_mod_comb8;
    }
    
    


    
    
    
}
