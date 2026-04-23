package Colecciones.EjMario21;

import java.util.ArrayList;

public class CuentaCorriente {
    private String numero;
    private double saldo;
    private ArrayList<Movimientos> historial;

    public CuentaCorriente() {
        this.numero = generarNumeroAleatorio();
        this.saldo = 0.0;
        this.historial = new ArrayList<>();
    }

    public CuentaCorriente(double saldoInicial) {
        this.numero = generarNumeroAleatorio();
        this.saldo = saldoInicial;
        this.historial = new ArrayList<>();
    }

    private String generarNumeroAleatorio() {
        String num = "";
        int i = 0;
        while (i < 10) {
            num += (int)(Math.random() * 10);
            i++;
        }
        return num;
    }

    public void ingreso(double cantidad) {
        this.saldo += cantidad;
        this.historial.add(new Movimientos(TipoMovimiento.INGRESO, cantidad, this.saldo));
        //this.historial.add(String.format("Ingreso de %.0f € Saldo: %.2f €", cantidad, this.saldo));
    }

    public void cargo(double cantidad) {
        this.saldo -= cantidad;
        this.historial.add(new Movimientos(TipoMovimiento.CARGO, cantidad, this.saldo));
        //this.historial.add(String.format("Cargo de %.0f € Saldo: %.2f €", cantidad, this.saldo));
    }

    public void transferencia(CuentaCorriente destino, double cantidad) {
        this.saldo -= cantidad;
        destino.saldo += cantidad;
        
        this.historial.add(new Movimientos(TipoMovimiento.TRANSFERENCIA_ENVIADA, cantidad, this.saldo, this.numero));
        // this.historial.add(String.format("Transf. emitida de %.0f € a la cuenta %s Saldo: %.2f €", 
        //                    cantidad, destino.numero, this.saldo));
        
        destino.historial.add(new Movimientos(TipoMovimiento.TRANSFERENCIA_RECIBIDA, cantidad, this.saldo, this.numero));
        // destino.historial.add(String.format("Transf. recibida de %.0f € de la cuenta %s Saldo: %.2f €", 
        //                       cantidad, this.numero, destino.saldo));
    }

    public void movimientos() {
        System.out.println("Movimientos de la cuenta " + this.numero);
        System.out.println("-----------------------------------");
        int i = 0;
        while (i < historial.size()) {
            System.out.println(historial.get(i));
            i++;
        }
    }

    @Override
    public String toString() {
        String salida = String.format("Número de cta: %s Saldo: %.2f €", this.numero, this.saldo);
        return salida;
    }
}
