
package classes;

import conexoesbancodedados.ConectaBd;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ClasseCadastro_exercicios {
    
    private int cd_membro;
    private String membro;
    private String exercicio;
    private ArrayList<String> listaCombo = new ArrayList();
    Connection con;
    ResultSet rs = null;
    
    public void populandoCombMembros() throws SQLException{
        
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT NM_MEMBRO FROM TB_MEMBROS ORDER BY NM_MEMBRO ASC";
        
        rs = stmt.executeQuery(sql);
        
            while(rs.next()){
                listaCombo.add(rs.getString("NM_MEMBRO"));
            }
            
        //System.out.println(listaCombo); //teste   
    }

    public int getCd_membro() {
        return cd_membro;
    }

    public void setCd_membro(int cd_membro) {
        this.cd_membro = cd_membro;
    }
    
    public String getMembro() {
        return membro;
    }

    public void setMembro(String membro) {
        this.membro = membro;
    }

    public String getExercicio() {
        return exercicio;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }

    public ArrayList<String> getListaCombo() {
        return listaCombo;
    }

    public void setListaCombo(ArrayList<String> listaCombo) {
        this.listaCombo = listaCombo;
    }
    
    
    
}
