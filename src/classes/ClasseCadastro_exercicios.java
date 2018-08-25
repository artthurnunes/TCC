
package classes;

import conexoesbancodedados.ConectaBd;
import conexoesbancodedados.SelectBd;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ClasseCadastro_exercicios {
    
    SelectBd selects = new SelectBd();
    
    private int cd_membro;
    private String nm_membro;
    private String nm_exercicio;
    private ArrayList<String> listaComboGrupos = new ArrayList();
    private ArrayList<String> listaComboExercicios = new ArrayList();
    Connection con;
    ResultSet rs = null;
    
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
    
    
    
    
    
}
