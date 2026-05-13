package modelos;

public class Atleta {

    private int codAtl;
    private int peso;
    private String apodo;

    /**
     * @param codAtl
     * @param peso
     * @param apodo
     */
    public Atleta(int codAtl, int peso, String apodo) {
        this.codAtl = codAtl;
        this.peso = peso;
        this.apodo = apodo;
    }

    // Getters
    public int getCodAtl() {
        return codAtl;
    }

    public int getPeso() {
        return peso;
    }

    public String getApodo() {
        return apodo;
    }

    /**
     * @return El apodo del atleta para las vistas
     */
    @Override
    public String toString() {        
        return String.format("%s (ID: %d)", this.apodo, this.codAtl);
    }
}