
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/Ejemplo?characterEncoding=UTF-8";

        try{
            Connection conexion = DriverManager.getConnection(url,"root", "root");
            System.out.println("**INFO**: Se ha conectado con la base de datos.");

            String sql ="""
                        SELECT autor, COUNT(*) AS numero_libros
                        FROM libro
                        GROUP BY autor
                        HAVING COUNT(*) > 1;""";
            Statement stmt = conexion.createStatement(); 

            ResultSet resultado = stmt.executeQuery(sql);


            // while(resultado.next()){
            //     String autor = resultado.getString("autor");
            //     int numero_libros = resultado.getInt("numero_libros");

            //     System.out.printf("Autor : %s\nNumero de libros: %d", autor, numero_libros);
            // }


            System.out.print("ISBN:");
            String isbn = System.console().readLine();

            System.out.print("titulo:");
            String titulo = System.console().readLine();

            System.out.print("autor:");
            String autor = System.console().readLine();

            System.out.print("paginas:");
            String paginas = System.console().readLine();

            System.out.print("argumento:");
            String argumento = System.console().readLine();

            sql = String.format("INSERT INTO libro(isbn,titulo,autor,paginas,argumento) VALUES (%s,%s,%s,%s,%s);");

            stmt.executeQuery(sql);


            resultado.close();
        }  catch(SQLException sqle){
            System.out.println("**Error**: Ha sido imposible conectarse a la base de datos." + sqle.getMessage());
        }
    }
}
