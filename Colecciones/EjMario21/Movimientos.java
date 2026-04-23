package Colecciones.EjMario21;

public class Movimientos {
    private double cantidad;
    private double saldo;
    private TipoMovimiento tipo;
    private String numero = "";

    Movimientos(TipoMovimiento ingreso, double cantidad, double saldo) {
        this.tipo = ingreso;
        this.cantidad = cantidad;
        this.saldo = saldo;
    }

    Movimientos(TipoMovimiento transferenciaEnviada, double cantidad, double saldo, String numero) {
        this.tipo = transferenciaEnviada;
        this.cantidad = cantidad;
        this.saldo = saldo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        String mensaje = "de la cuenta ";
        // if(this.numero != null){
        //     mensaje = String.format("%s de %.2f €, de la cuenta %s saldo: %.2f €\n", this.tipo, this.cantidad, this.numero, this.saldo);
        // }else {
        //     mensaje =  String.format("%s de %.2f €, saldo: %.2f €\n", this.tipo, this.cantidad, this.saldo);
        // }
        if (this.tipo.equals(TipoMovimiento.TRANSFERENCIA_ENVIADA)) {
            mensaje = "a la cuenta ";
        }
        return String.format("%s de %.2f € %s Saldo %.2f €", this.tipo.getValue(), this.cantidad, (this.numero.isBlank())?"":mensaje + this.numero, this.saldo);
    }
}
