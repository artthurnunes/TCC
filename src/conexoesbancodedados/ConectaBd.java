
package conexoesbancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


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
}
