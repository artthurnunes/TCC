
package classes;

import conexoesbancodedados.ConectaBd;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ClasseCadastro_modalidades {
    
    private int cd_modalidade;
    private String nm_modalidade;
    private ArrayList<String> listaMod = new ArrayList();
    Connection con;
    ResultSet rs = null;
    
    public void populandoCombMod() throws SQLException{
        
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT NM_MODALIDADE FROM TB_MODALIDADES ORDER BY 1 ASC";
        
        rs = stmt.executeQuery(sql);
        
            while(rs.next()){
                listaMod.add(rs.getString("NM_MODALIDADE"));
            } 
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
    
    
}
