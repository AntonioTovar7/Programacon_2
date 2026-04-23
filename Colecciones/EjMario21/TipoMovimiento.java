package Colecciones.EjMario21;

public enum TipoMovimiento {
    INGRESO("Ingreso"),
    CARGO("Cargo"),
    TRANSFERENCIA_ENVIADA("Trans. emitida"),
    TRANSFERENCIA_RECIBIDA("Trans. recibida");

    private final String tipo;

    TipoMovimiento(String tipo){
        this.tipo = tipo;
    }

    public String getValue() {
        return this.tipo;
    }

    
}
