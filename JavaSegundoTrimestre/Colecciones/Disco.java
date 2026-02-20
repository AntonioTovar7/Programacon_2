
public class Disco {
    
        private String codigo;
        private String titulo;
        private String artista;
        private String genero;
        private int duracion;
    
        // Constructor vacío
        public Disco() {}
    
        // Constructor con parametros
        public Disco(String codigo, String titulo, String artista, String genero, int duracion) {
            this.codigo = codigo;
            this.titulo = titulo;
            this.artista = artista;
            this.genero = genero;
            this.duracion = duracion;
        }
    
        //Getters // Setters
        public String getCodigo() { return codigo; }
        public void setCodigo(String codigo) { this.codigo = codigo; }
    
        public String getTitulo() { return titulo; }
        public void setTitulo(String titulo) { this.titulo = titulo; }
    
        public String getArtista() { return artista; }
        public void setArtista(String artista) { this.artista = artista; }
    
        public String getGenero() { return genero; }
        public void setGenero(String genero) { this.genero = genero; }
    
        public int getDuracion() { return duracion; }
        public void setDuracion(int duracion) { this.duracion = duracion; }
    
        @Override
        public String toString() {
            return "Código: " + codigo + "\nTítulo: " + titulo + 
                   "\nArtista: " + artista + "\nGénero: " + genero + 
                   "\nDuración: " + duracion + " min" + 
                   "\n------------------------------------";
        }
    }
