
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
    private static boolean plano_novo = true;
    private static ArrayList<String> listaPlanos = new ArrayList();
    Connection con;
    ResultSet rs = null;
    
    //TRAZ TODOS OS PLANOS
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

    //TRAZ O PLANO DO ALUNO
    public void populandoCombPlanoAluno() throws SQLException{
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT * FROM TB_PLANOS_ALUNOS WHERE CD_PLANO_ALUNO = '"+this.getCd_plano()+"' ";
        rs = stmt.executeQuery(sql);
        
        if(rs.next()){
//            this.cd_mod_comb1 = rs.getInt("CD_MODALIDADE1");
//            this.cd_mod_comb2 = rs.getInt("CD_MODALIDADE2");
//            this.cd_mod_comb3 = rs.getInt("CD_MODALIDADE3");
//            this.cd_mod_comb4 = rs.getInt("CD_MODALIDADE4");
//            this.cd_mod_comb5 = rs.getInt("CD_MODALIDADE5");
//            this.cd_mod_comb6 = rs.getInt("CD_MODALIDADE6");
//            this.cd_mod_comb7 = rs.getInt("CD_MODALIDADE7");
//            this.cd_mod_comb8 = rs.getInt("CD_MODALIDADE8");
        }
        //System.out.println("Modalidade 2 no select "+this.cd_mod_comb2); //teste
    
    }
    
    public float populandoValorPlano() throws SQLException{
       
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT VALOR FROM TB_PLANOS_VALORES WHERE NM_PLANO = '"+this.getNm_plano()+"' ";
        
        rs = stmt.executeQuery(sql);
        
        if(rs.next())
            this.setValor_plano(rs.getFloat("VALOR"));
      
        
        con.close();
        return (this.getValor_plano());
    }

    public void codigoPlano() throws SQLException{
       
        con = ConectaBd.getConnection();
        Statement stmt = con.createStatement();
        
        String sql = "SELECT CD_PLANO FROM TB_PLANOS_VALORES WHERE NM_PLANO = '"+this.getNm_plano()+"' ";
        
        rs = stmt.executeQuery(sql);
        
        if(rs.next())
            this.setCd_plano(rs.getInt("CD_PLANO"));   
        
        con.close();
    }
    
    public boolean getPlano_novo() {
        return plano_novo;
    }

    public void setPlano_novo(boolean treino_novo) {
        this.plano_novo = treino_novo;
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
