package Cuentas;

import Cuentas1.Persona;

public class Cuenta2 {
    private long numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta2(long numeroCuenta, Persona cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
    }

    public Cuenta2() {
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

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public void ingresar(double x) {
        if (x > 0) {
            this.saldo += x;
        } else {
            System.out.println("No se puede ingresar el valor: " + x);
        }
    }
    //public abstract void retirar(double x); 

    @Override
    public String toString() {
        return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", cliente=" + cliente + "]";
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarPoli(){
        System.out.println("Estoy en Cuenta");
    }
    

}
