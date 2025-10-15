
package GrupoMartes.Lang.poo1.ej8a3;

public class CuentaAhorros extends Cuenta{
    
    public CuentaAhorros(int numeroCuenta, Persona cliente) {
        super(numeroCuenta, cliente);
    }
    
    @Override
    public void retirar(double x){
        double saldoParcial=getSaldo()-x;
        if(saldoParcial<100){
            System.out.println("No puede retirar la cantidad solicitada");
        }
        else{
            setSaldo(saldoParcial);
        }
    }
    
}
