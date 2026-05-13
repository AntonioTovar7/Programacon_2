package modelos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import clases.BDConexion;

public class AtletaDAO {

    private Connection conexion;

    public AtletaDAO() {
        this.conexion = BDConexion.conectar().bd();        
    }

    /**
     * @return ArrayList con todos los atletas
     * @throws SQLException
     */
    public ArrayList<Atleta> seleccionarTodos() throws SQLException {

        ArrayList<Atleta> datos = new ArrayList<>();

        String sql = "SELECT * FROM ATLETA;";
        Statement stmt = conexion.createStatement();

        ResultSet resultado = stmt.executeQuery(sql);

        while (resultado.next()) {
            datos.add(mapearAtleta(resultado));
        }

        resultado.close();
        stmt.close();

        return datos;
    }

    /**
     * @param datos Registro de la BD
     * @return Objeto Atleta mapeado
     * @throws SQLException
     */
    private static Atleta mapearAtleta(ResultSet datos) throws SQLException {
        return new Atleta(
            datos.getInt("CodAtl"),
            datos.getInt("Peso"),
            datos.getString("Apodo")
        );
    }
}