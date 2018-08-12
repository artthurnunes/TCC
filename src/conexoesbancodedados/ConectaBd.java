
package conexoesbancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConectaBd {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/tcc?useSSL=false";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getConnection(){
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USER,PASS);
        }catch(ClassNotFoundException | SQLException ex){
            throw new RuntimeException("Problemas de comunicação com o banco de Dados",ex);
        }
    }
    
    //fecha conexão
    public static void closeConnection(Connection con){
        try{
            if(con != null){
                con.close();
            }
        }catch(SQLException ex){
            Logger.getLogger(ConectaBd.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    //fecha conexão
    public static void closeConnection(Connection con, PreparedStatement stmt){
        closeConnection(con);
        try{
            if(stmt != null){
                stmt.close();
            }
        }catch(SQLException ex){
            Logger.getLogger(ConectaBd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //fecha conexão
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        closeConnection(con,stmt);
        try{
            if(rs != null){
                rs.close();
            }
        }catch(SQLException ex){
            Logger.getLogger(ConectaBd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
