/*Define una clase Cuenta con los siguientes datos
• Atributos privados:
- numerocuenta : entero largo
- saldo : double
- cliente : atributo de la clase Persona.
• Y los siguientes métodos:
- Constructor que recibe un cliente y un número de cuenta
- Métodos de acceso para los tres atributos
- ingresar(double x): permitirá ingresar una cantidad en la cuenta.
- retirar(double x): permitirá sacar una cantidad de la cuenta.*/
package GrupoMartes.Lang.poo1.ej8a3;

public class Cuenta {
    private int numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(int numeroCuenta, Persona cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
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
    
    public void ingresar(double x){
        this.saldo+=x;
    }
    
    public void retirar(double x){
        this.saldo-=x;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
    
}
