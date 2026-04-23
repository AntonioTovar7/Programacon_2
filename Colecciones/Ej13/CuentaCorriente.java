package Colecciones.Ej13;
import java.util.Random;

public class CuentaCorriente {
    private String numeroCuenta;
    private double saldo;

    // Constructor con saldo inicial
    public CuentaCorriente(double saldoInicial) {
        this.numeroCuenta = generarNumeroCuenta();
        this.saldo = saldoInicial;
    }

    // Constructor sin saldo inicial (por defecto a cero)
    public CuentaCorriente() {
        this(0);
    }

    // Genera un número aleatorio de 10 dígitos como String
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
    }

    public void cargo(double cantidad) {
        this.saldo -= cantidad;
    }

    public void transferencia(CuentaCorriente destino, double cantidad) {
        this.cargo(cantidad);
        destino.ingreso(cantidad);
    }

    @Override
    public String toString() {
        return String.format("Número de cta: %s Saldo: %.2f €", numeroCuenta, saldo);
    }


    
}