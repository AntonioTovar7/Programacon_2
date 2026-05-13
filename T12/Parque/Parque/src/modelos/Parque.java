package modelos;

public class Parque {
    
    private int codpar;
    private String nombre;
    private String ubicacion;
    private String equipamiento;

    public Parque(int codpar, String nombre, String ubicacion, String equipamiento){

        codpar = this.codpar;
        nombre = this.nombre;
        ubicacion = this.ubicacion;
        equipamiento = this.equipamiento;
        
    }
    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public int getCodpar() {
        return codpar;
    }
    /**
     */
    @Override
    public String toString() {       
        return String.format("%s - %s, %s", this.nombre, this.ubicacion, this.equipamiento) ;
    }

}
