package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    
    private final String URI = "jdbc:mysql://localhost:3306/parque?characterEncoding=UTF-8";
    private static Connection conexion;
    private static String user = "root";
    private static String password = "root";

    public Database(){
        
    }

    public static Connection conexion(){
        
    }
}
