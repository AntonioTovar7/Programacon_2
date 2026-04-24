
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {

        String sql;
        String email;
        String password;
        
        String uri = "jdbc:mysql://localhost:3306/Ejemplo?characterEncoding=UTF-8";

        try {
            
            Connection conexion = DriverManager.getConnection(uri, "root", "root");


            System.out.println("Conexion correcta con la Base de Datos.");
            System.out.println("email:");
            email = System.console().readLine();
            System.out.println("password:");
            password = System.console().readLine();

            sql = "SELECT * FROM usuario WHERE email= ? AND clave= ?;";

            
            
            //3* CREAMOS SENTENCIA PREPARADA
            //vulnerable inyeccion sql
            //Statement stmt = conexion.createStatement();
            //solucion:
            PreparedStatement stmt = conexion.prepareStatement(sql);



            //4* INDICAMOS QUE VALORES DEBEN INSERTARSE EN LOS MARCADORES 
            // + CREAMOS RESULTSET PARA GUARDAR RESUTLADO DE LA EJECUCION DE LA SENTENCIA SQL.
            stmt.setString(1, email);
            stmt.setString(2, password);


            ResultSet resultado = stmt.executeQuery(sql);

            //5* COMPROBAMOS SI TENEMOS RESULTADO:

            if (resultado.next() == true) {
                System.out.println("Login correcto!!!!!!!!!!!");        
            }else{
                System.out.println("Nombre de usuario o contraseña incorrectos.");
            }



            conexion.close();

        } catch (SQLException sqle) {
            System.out.println("ERROR de la conexion con la Base de Datos.\n" + sqle.getMessage()+ "\n" + sqle.getSQLState());
        }
    }
}
