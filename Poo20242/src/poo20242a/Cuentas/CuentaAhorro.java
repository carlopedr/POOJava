package Cuentas;

import Cuentas1.Persona;

public class CuentaAhorro extends Cuenta2 {
    public double saldoMinimo;

    public CuentaAhorro(long numeroCuenta, Persona cliente, double saldoMinimo) {
        super(numeroCuenta, cliente);
        this.saldoMinimo = saldoMinimo;
    }
    

    public CuentaAhorro() {
    }


    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public void retirar(double x) {
        if (x > 0) {
            if(x<=getSaldo()){
                if(x<=0){
                    setSaldo(getSaldo()-x);
                }
                else{
                    System.out.println("Error mayor valor que máximo retirable");
                }
                
            }
            else{
                System.out.println("No puede retirar el valor "+x+" Saldo insuficiente");
            }
        } else {
            System.out.println("No se puede retirar el valor: " + x);
        }
    }

    public void mostrarPoli(){
        System.out.println("Estoy en CuentaAhorro");
    }

}
