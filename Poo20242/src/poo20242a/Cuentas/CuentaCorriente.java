package Cuentas;

import Cuentas1.Cuenta;
import Cuentas1.Persona;

public class CuentaCorriente extends Cuenta2 {
    private double maximoRetirable;

    public CuentaCorriente(long numeroCuenta, Persona cliente, double maximoRetirable) {
        super(numeroCuenta, cliente);
        this.maximoRetirable = maximoRetirable;
    }

    

    public CuentaCorriente() {
    }



    public double getMaximoRetirable() {
        return maximoRetirable;
    }

    public void setMaximoRetirable(double maximoRetirable) {
        this.maximoRetirable = maximoRetirable;
    }

    @Override
    public void retirar(double x) {
        if (x > 0) {
            if(x<=getSaldo()){
                if(x<=this.maximoRetirable){
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

    @Override
    public String toString() {
        return "CuentaCorriente [maximoRetirable=" + maximoRetirable + " " + super.toString()+"]";
    }

    public void mostrarPoli(){
        System.out.println("Estoy en CuentaCorriente");
    }

    

    

}
