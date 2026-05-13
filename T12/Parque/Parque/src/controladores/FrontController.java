package controladores ;

import java.sql.SQLException;

public class FrontController {

    private ParqueController parqueController ;
    private AtletaController atletaController ;

    /**
     * Instanciamos cada uno de los controladores que maneja el
     * controlador frontal.
     * @throws SQLException
     */
    public FrontController() throws SQLException {
        this.parqueController = new ParqueController() ;
        this.atletaController = new AtletaController() ;
    }

    /**
     * @param opcion
     */
    public void despachar(int opcion) throws SQLException {

         switch(opcion) {
            case 1:                
                parqueController.listarParques(); 
                break ;
            case 2:                
                parqueController.insertarParque() ;                        
                break ;

            case 3:                        
                parqueController.buscarParque() ;
                break ;
                
            case 4: 
                System.out.println("\nEDITAR PARQUE\n==================================================================");
                // Aquí iría el método de editar si decides implementarlo en el ParqueController
                break ;

            case 5:                        
                parqueController.borrarParque() ;
                break ;

            case 6:
                atletaController.listarAtletas() ;
                break ;

            case 0: 
                break ;
                
            default: 
                System.out.println("**ERROR: opción incorrecta.");
        }
    }
}