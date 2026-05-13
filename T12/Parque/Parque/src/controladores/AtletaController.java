package controladores;

import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Atleta;
import modelos.AtletaDAO;
import vistas.AtletaView;

public class AtletaController {

    private AtletaDAO dao ;
    private AtletaView vista ;
    
    /**
     * @throws SQLException
     */
    public AtletaController() throws SQLException {

        // creamos el DAO de Atleta
        this.dao = new AtletaDAO() ;

        // creamos la VISTA de Atleta
        this.vista = new AtletaView() ;
    }

    /**
     * @throws SQLException
     */
    public void listarAtletas() throws SQLException {
        
        // solicitamos al modelo el listado de atletas
        ArrayList<Atleta> datos = dao.seleccionarTodos() ;

        // invocamos a la vista y le pasamos los datos de los atletas
        vista.mostrarAtletas(datos) ;
    }
}