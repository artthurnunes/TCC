
package classes;

import conexoesbancodedados.ConectaBd;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ClasseCadastro_planos extends ClasseCadastro {
    
    private static String nm_plano;
    private static int cd_plano;
    private static float valor_plano;
    private static int vencimento_plano;
    private static String tp_desconto_plano;
    private static float desconto_plano;
    private static ArrayList<String> listaPlanos = new ArrayList();
    Connection con;
    ResultSet rs = null;
    
    public void populandoCombPlanos() throws SQLException{
        
        listaPlanos.clear();
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT NM_PLANO FROM TB_PLANOS_VALORES ORDER BY 1 ASC";
        
        rs = stmt.executeQuery(sql);
        
            while(rs.next()){
                listaPlanos.add(rs.getString("NM_PLANO"));
            } 
           
        con.close();
    }

    public ArrayList<String> getListaPlanos() {
        return listaPlanos;
    }

    public void setListaPlanos(ArrayList<String> listaPlanos) {
        this.listaPlanos = listaPlanos;
    }

    public String getNm_plano() {
        return nm_plano;
    }

    public void setNm_plano(String nm_plano) {
        this.nm_plano = nm_plano;
    }

    public int getCd_plano() {
        return cd_plano;
    }

    public void setCd_plano(int cd_plano) {
        this.cd_plano = cd_plano;
    }

    public float getValor_plano() {
        return valor_plano;
    }

    public void setValor_plano(float valor_plano) {
        this.valor_plano = valor_plano;
    }

    public int getVencimento_plano() {
        return vencimento_plano;
    }

    public void setVencimento_plano(int vencimento_plano) {
        this.vencimento_plano = vencimento_plano;
    }

    public String getTp_desconto_plano() {
        return tp_desconto_plano;
    }

    public void setTp_desconto_plano(String tp_desconto_plano) {
        this.tp_desconto_plano = tp_desconto_plano;
    }

    public float getDesconto_plano() {
        return desconto_plano;
    }

    public void setDesconto_plano(float desconto_plano) {
        this.desconto_plano = desconto_plano;
    }
    
    
    
    
}
