package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConexion {

    private static final String URI = "jdbc:mysql://localhost:3306/parque?characterEncoding=UTF-8" ;
    private static final String USER = "root" ;
    private static final String PASS = "root" ;

    // Debe ser estático para que la clase conozca su estado SIEMPRE (antes y después de instanciarla)
    private static BDConexion instancia = null ; 

    // No tiene que ser estática ya que se crea cuando se instancia BDConexion.
    private Connection conexion ; 

    /**
     * El constructor privado garantiza que no se instancie la clase BDConexion más de una vez.
     * Cómo sólo pasaremos por aquí una vez, es aquí donde hacemos la conexión a la base de datos,
     * asegurando de esta manera que sólo habrá una única conexión.
     */
    private BDConexion() {
        try {
            conexion = DriverManager.getConnection(URI, USER, PASS) ;
        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    /**
     * La clase BDConexion gestionará su propia instancia, garantizando de esta manera que
     * no haya más de una. Finalmente, se devuelve la instancia de la clase BDConexion para
     * poder invocar al método BD que da acceso a la conexión con base de datos.
     * @return
     */
    public static BDConexion conectar() {
        if (instancia == null) { instancia = new BDConexion() ; }
        return instancia ;
    }

    /**
     * Devuelve la ÚNICA CONEXIÓN que hay con la base de datos
     * @return
     */
    public Connection bd() {
        return this.conexion ;
    }

    
}
