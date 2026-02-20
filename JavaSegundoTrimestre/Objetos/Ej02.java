package JavaSegundoTrimestre.Objetos;


class Caballo {
    String nombre;
    String color;

    public Caballo(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public void presentarse() {
        System.out.println("Hola, me llamo " + this.nombre);
    }

    public void galopar() {
        System.out.println("Tocotoc tocotoc tocotoc");
    }

    public void relinchar() {
        System.out.println("Hiiiiiiieeeeee");
    }

    public void comer() {
        System.out.println("Ñam ñam ñam");
    }
}


public class Ej02 {
    public static void main(String[] args) {
        Caballo c1 = new Caballo("Babieca", "Blanco");
        Caballo c2 = new Caballo("Lykos", "Negro");

        c1.presentarse();
        c1.galopar();
        c1.relinchar();

        c2.presentarse();
        c2.comer();
        c2.galopar();
    }
}
