package Cuentas1;

import Cuentas.Persona;

public class Cuenta {
    private long numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(long numeroCuenta, Persona cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", cliente=" + cliente + "]";
    }

    public void ingresar(double x) {
        if (x > 0) {
            this.saldo += x;
        } else {
            System.out.println("Importe no valido: " + x);
        }
    }
    public void retirar(double x) {
        if (x > 0) {
            if (x <= saldo) {
                this.saldo -= x;
            } else {
                System.out.println("Saldo insuficiente para retiro!");
            }

        } else {
            System.out.println("Importe no valido: " + x);
        }
    }

}
