/*
 * Ejercicio CuentaBancaria. Escribir una clase CuentaBancaria que represente 
 * una cuenta bancaria con estos atributos: numerocuenta, saldo, nombretitular. 
 * Hacer métodos que hagan estas funciones:
• void ingreso (int cantidad) - hacer un ingreso en la cuenta
• void extraccion (int cantidad) - hacer una extracción de la cuenta
La clase ha de tener un constructor con todos los atributos.
Hacer otra clase GestionCuentas que en un método main haga;
• crear una cuenta con saldo inicial 500
• consultar el saldo
• hacer un ingreso de 300
• consultar el saldo
• hacer una extracción de 600
• consultar el saldo
 */
package poo.cuentaBancaria;

public class CuentaBancaria {
    private String numeroCuenta;
    private int saldo;
    private String nombreTitular;
    public CuentaBancaria(String numeroCuenta, int saldo, String nombreTitular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
    }
    public CuentaBancaria() {
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public String getNombreTitular() {
        return nombreTitular;
    }
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    //Método para hacer un ingreso en la cuenta
    public void ingreso(int cantidad){
        //validar cantidad
        //this.saldo=this.saldo+cantidad;
        this.saldo+=cantidad;

    }

    public void extraccion(int cantidad){
        //validar cantidad
        //this.saldo=this.saldo-cantidad;
        //validar que el saldo sea mayor o igual a la cantidad a extraer
        this.saldo-=cantidad;
    }

}
