package controladores;

import java.sql.SQLException;
import java.util.ArrayList;

import modelos.Parque;
import modelos.ParqueDAO;
import vistas.ParqueView;

public class ParqueController {

    private ParqueDAO dao ;
    private ParqueView vista ;

    /**
     * Constructor del controlador
     */
    public ParqueController() throws SQLException {    
        
        // creamos el DAO para el modelo PARQUE
        this.dao = new ParqueDAO() ;

        // creamos la VISTA para el controlador PARQUECONTROLLER
        this.vista = new ParqueView() ;        
    }

    /**
     * Listado de parques
     */
    public void listarParques() throws SQLException {
        
        // 1. solicitamos al DAO información sobre parques
        ArrayList<Parque> datos = dao.selecionarTodos() ;

        // 2. Una vez tenemos todos los parques, los mostramos
        vista.mostrarParques(datos) ;
        
    }

    /**
     * Insertar un nuevo parque
     */
    public void insertarParque() throws SQLException {

        // 1. mostramos VISTA solicitud información
        Parque parque = vista.solicitarParque() ;

        // 2. comprobar si hay un parque disponible para insertar
        if (parque != null) {
            if (!dao.insertar(parque)) {
                vista.mostrarMensaje("**ERROR: El parque no se ha insertado correctamente en la base de datos.");
            } else {
                vista.mostrarMensaje("Parque insertado con éxito.");
            }
        }
    }

    /**
     * Buscar un parque por código
     */
    public void buscarParque() throws SQLException {

        // 1. solicita a la VISTA el código (ahora es int)
        int codigo = vista.solicitarCodigo() ;

        // 2. comprobamos que no sea 0 (nuestro valor de salida)
        if (codigo != 0) {

            // 3. Solicitamos al DAO buscar el parque
            Parque parque = dao.buscarPorCodigo(codigo) ;

            if (parque == null) {
                vista.mostrarMensaje("**ERROR: el parque no se ha encontrado en la base de datos.");
            } else {
                vista.mostrarMensaje(parque.toString()) ;
            }
        }
    }

    /**
     * Borrar un parque por código
     */
    public void borrarParque() throws SQLException {

        // 1. solicita a la VISTA el código
        int codigo = vista.solicitarCodigo() ;

        // 2. comprobamos que no sea 0
        if (codigo != 0) {

            // 3. Solicitamos al DAO borrar el parque
            if (dao.borrar(codigo)) {
                vista.mostrarMensaje("El parque se ha borrado correctamente.");
            } else {                
                vista.mostrarMensaje("**ERROR: el parque no se ha encontrado en la base de datos.");
            } 
        }
    }
}