package modelos;

import clases.BDConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ParqueDAO {

    private Connection conexion;

    public ParqueDAO() {
        this.conexion = BDConexion.conectar().bd();
    }

    /**
     * Selecciona todos los parques de la tabla
     * @return ArrayList de objetos Parque
     * @throws SQLException
     */
    public ArrayList<Parque> selecionarTodos() throws SQLException {

        ArrayList<Parque> datos = new ArrayList<>();

        // Consulta simple ya que no hay tabla relacionada ahora mismo
        String sql = "SELECT * FROM PARQUE;";
        Statement stmt = conexion.createStatement();

        ResultSet resultado = stmt.executeQuery(sql);
        
        while(resultado.next()) {
            datos.add(mapearParque(resultado));
        }

        resultado.close();
        return datos;
    }

    /**
     * Inserta un nuevo parque
     * @param parque objeto con los datos
     * @return true si se insertó correctamente
     * @throws SQLException
     */
    public boolean insertar(Parque parque) throws SQLException {
        
        // 1. Sentencia para tus 4 campos: CodPar, Nombre, Ubicacion, Equipamiento
        String sql = "INSERT INTO PARQUE (CodPar, Nombre, Ubicacion, Equipamiento) VALUES (?, ?, ?, ?);";
        PreparedStatement pstmt = conexion.prepareStatement(sql);

        // 2. Vinculamos los datos (asegurando el orden de tu tabla)
        pstmt.setInt(1, parque.getCodpar());
        pstmt.setString(2, parque.getNombre());
        pstmt.setString(3, parque.getUbicacion());
        pstmt.setString(4, parque.getEquipamiento());

        // 3. Ejecutamos
        int resultado = pstmt.executeUpdate();

        pstmt.close();
        return resultado > 0;
    }

    /**
     * Busca un parque por su código (ID)
     * @param codPar código del parque
     * @return objeto Parque o null
     * @throws SQLException
     */
    public Parque buscarPorCodigo(int codPar) throws SQLException {

        Parque parque = null;
        String sql = "SELECT * FROM PARQUE WHERE CodPar = ?;";
        PreparedStatement pstmt = conexion.prepareStatement(sql);

        pstmt.setInt(1, codPar);

        ResultSet resultado = pstmt.executeQuery();

        if (resultado.next()) {
            parque = mapearParque(resultado);
        }

        pstmt.close();
        return parque;
    }

    /**
     * Borra un parque por su código
     * @param codPar código del parque a borrar
     * @return true si se borró
     * @throws SQLException
     */
    public boolean borrar(int codPar) throws SQLException {

        String sql = "DELETE FROM PARQUE WHERE CodPar = ?;";
        PreparedStatement pstmt = conexion.prepareStatement(sql);

        pstmt.setInt(1, codPar);

        int resultado = pstmt.executeUpdate();

        pstmt.close();
        return resultado > 0;
    }

    /**
     * Mapea un registro de la base de datos a un objeto Java Parque
     */
    private static Parque mapearParque(ResultSet datos) throws SQLException {
        return new Parque( 
            datos.getInt("CodPar"),
            datos.getString("Nombre"),
            datos.getString("Ubicacion"),
            datos.getString("Equipamiento")
        );
    }
}