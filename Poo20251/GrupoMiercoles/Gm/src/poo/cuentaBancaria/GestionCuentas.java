package poo.cuentaBancaria;

public class GestionCuentas {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456", 500, "Juan");
        System.out.println("Saldo: " + cuenta.getSaldo());
        cuenta.ingreso(300);
        System.out.println("Saldo: " + cuenta.getSaldo());
        cuenta.extraccion(600);
        System.out.println("Saldo: " + cuenta.getSaldo());
    }

}
