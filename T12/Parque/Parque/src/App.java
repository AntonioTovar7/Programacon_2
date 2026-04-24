import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

    private static final String URI = "jdbc:mysql://localhost:3306/parque?characterEncoding=UTF-8" ;
    private static final String USER = "root" ;
    private static final String PASS = "root" ;
    public static void main(String[] args) throws Exception {

        int opcion ;
        Connection conexion ;

        try {

            // conectamos con la base de datos
            conexion = DriverManager.getConnection(URI, USER,PASS) ;
            
            do {

                menu()  ;   // mostramos el menú
                opcion = Integer.parseInt(System.console().readLine()) ;

                
                switch(opcion) {
                    case 1:
                        listadoParques(conexion);
                    break ;
                    
                    case 2: 
                        aniadirParque(conexion);
                    break ;
                    case 3: 
                        buscarParque(conexion);
                    break ;
                    case 4: 
                        editarParque(conexion);
                    break ;
                    case 5: break ;
                    case 0: break ;
                    default: 
                        System.out.println("**ERROR: opción incorrecta.");
                }
                
                pausa();

            } while(opcion!=0) ;

            // cerramos la conexión
            conexion.close() ; 

        } catch (SQLException sqle) {
            System.out.println("Se ha producido un error con la base de datos.");
        }

    }

    /**
     */
    private static void menu() {

        System.out.println("\033[H\033[2J") ;
        System.out.println("LIBRERIA V 2.0\n================================") ;
        System.out.println("1. Listar Parques") ;
        System.out.println("2. Añadir nuevo Parque") ;
        System.out.println("3. Buscar Parque") ;
        System.out.println("4. Editar Parque") ;
        System.out.println("5. Borrar Parque") ;
        System.out.println("0. Salir") ;
        System.out.print("Opcion? ") ;

    }

    private static void pausa(){
        System.out.println("Pulsa Enter para continuar");
        System.console().readLine();
    }

    //primera sentencia
    private static void listadoParques(Connection conexion) throws SQLException{
        
        //guardamos el sql necesario
        String sql = "SELECT * FROM Parque;";
        
        //Creamos la sentencia
        Statement stmt = conexion.createStatement();

        //lanzamos la consulta
        ResultSet resultado = stmt.executeQuery(sql) ;

        // mostramos el resultado si lo hay
        while(resultado.next()){

            String nombre = resultado.getString("Nombre");
            String ubicacion = resultado.getString("Ubicacion");
            String equipamiento = resultado.getString("Equipamiento");
            

            System.out.printf("- %s, %s, %s\n\n", nombre, ubicacion, equipamiento );
        }
    }

    private static void aniadirParque(Connection conexion) throws SQLException{

        String sql = "INSERT INTO Parque(Nombre, Ubicacion, Equipamiento) VALUES (?,?,?);";
        String nombre;
        String ubicacion;
        String equipamiento;

        System.out.print("Nombre: ");
        nombre = System.console().readLine();
        System.out.print("Ubicacion: ");
        ubicacion = System.console().readLine();
        System.out.print("Equipamiento: ");
        equipamiento = System.console().readLine();
        

        PreparedStatement pstmt = conexion.prepareStatement(sql);

        pstmt.setString(1, nombre);
        pstmt.setString(2, ubicacion);
        pstmt.setString(3, equipamiento);

        int filasInsertadas = pstmt.executeUpdate();

        System.out.printf("%d filas afectadas\n",filasInsertadas);
        pstmt.close();

    }

    private static void buscarParque(Connection conexion) throws SQLException{

        String sql = "SELECT * FROM Parque WHERE Ubicacion = ?;";
        String ubicacion;

        System.out.println("Ubicación del parque/s que desea buscar: ");
        ubicacion = System.console().readLine();

        PreparedStatement pstmt = conexion.prepareStatement(sql);

        pstmt.setString(1, ubicacion);

        ResultSet resultado = pstmt.executeQuery();

        while(resultado.next()){

            String nombre = resultado.getString("Nombre");
            ubicacion = resultado.getString("Ubicacion");
            String equipamiento = resultado.getString("Equipamiento");
            

            System.out.printf("- %s, %s, %s\n\n", nombre, ubicacion, equipamiento );

            
        }
        pstmt.close();

    }

    private static void editarParque(Connection conexion) throws SQLException{

        String sql ;
        String nombre;
        String nuevonombre;
        String ubicacion;
        String equipamiento;
        

        System.out.print("Nombre del parque que desea modificar: ");
        nombre = System.console().readLine();
        System.out.print("Ingrese el nuevo nombre: ");
        nuevonombre = System.console().readLine();
        System.out.print("Ingrese la nueva ubicacion: ");
        ubicacion = System.console().readLine();
        System.out.print("Ingrese el nuevo equipamiento: ");
        equipamiento = System.console().readLine();

        if(!nuevonombre.isBlank()){
            sql = "UPDATE Parque SET Nombre = ? WHERE Nombre = ?;";
            PreparedStatement pstmt = conexion.prepareStatement(sql);
            pstmt = conexion.prepareStatement(sql);
            pstmt.setString(1, nuevonombre);
            pstmt.setString(2, nombre);

            pstmt.executeUpdate();
            pstmt.close();
            nombre = nuevonombre;
        }
        if(!ubicacion.isBlank()){
            sql = "UPDATE Parque SET Ubicacion = ? WHERE Nombre = ?;";
            PreparedStatement pstmt = conexion.prepareStatement(sql);
            pstmt = conexion.prepareStatement(sql);
            pstmt.setString(1, ubicacion);
            pstmt.setString(2, nombre);

            pstmt.executeUpdate();
            pstmt.close();
        }
        if(!equipamiento.isBlank()){
            sql = "UPDATE Parque SET Equipamiento = ? WHERE Nombre = ?;";
            PreparedStatement pstmt = conexion.prepareStatement(sql);
            pstmt = conexion.prepareStatement(sql);
            pstmt.setString(1, equipamiento);
            pstmt.setString(2, nombre);

            pstmt.executeUpdate();
            pstmt.close();
        }
        
    }

}