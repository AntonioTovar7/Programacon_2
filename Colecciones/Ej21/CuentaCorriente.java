package Colecciones.Ej21;

import java.util.ArrayList;
import java.util.Random;

public class CuentaCorriente {
    private String numeroCuenta;
    private double saldo;
    private ArrayList<String> historial;        //HACER CLASE MOVIMIENTO Y TIPOMOVIMIENTO, ARRAYLIST<MOVIMIENTO>        
                                                //TIPOMOVIMIENTO = ENUM

    public CuentaCorriente(double saldoInicial) {
        this.numeroCuenta = generarNumeroCuenta();
        this.saldo = saldoInicial;
        this.historial = new ArrayList<>();
    }

    public CuentaCorriente() {
        this(0);
    }

    private String generarNumeroCuenta() {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(rnd.nextInt(10));
        }
        return sb.toString();
    }

    public void ingreso(double cantidad) {
        this.saldo += cantidad;
        historial.add(String.format("Ingreso de %.0f €  Saldo: %.2f €", cantidad, saldo));
    }

    public void cargo(double cantidad) {
        this.saldo -= cantidad;
        historial.add(String.format("Cargo de %.0f €  Saldo: %.2f €", cantidad, saldo));
    }

    public void transferencia(CuentaCorriente destino, double cantidad) {
        // Movimiento en la cuenta que envía
        this.saldo -= cantidad;
        this.historial.add(String.format("Transf. emitida de %.0f € a la cuenta %s  Saldo: %.2f €", 
                cantidad, destino.numeroCuenta, this.saldo));
        
        // Movimiento en la cuenta que recibe
        destino.saldo += cantidad;
        destino.historial.add(String.format("Transf. recibida de %.0f € de la cuenta %s  Saldo: %.2f €", 
                cantidad, this.numeroCuenta, destino.saldo));
    }

    public void movimientos() {
        System.out.println("Movimientos de la cuenta " + numeroCuenta);
        System.out.println("-------------------------------------------");
        for (String m : historial) {
            System.out.println(m);
        }
    }

    @Override
    public String toString() {
        return String.format("Número de cta: %s Saldo: %.2f €", numeroCuenta, saldo);
    }
}