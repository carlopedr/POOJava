package Cuentas;

import Cuentas1.Cuenta;
import Cuentas1.Persona;

public class Prueba {
    public static void main(String[] args) {
        Persona cl =new Persona("Carlos","123");
        //Cuenta2 c2=new Cuenta2(123456,cl);
        
        System.out.println("CC:");

        CuentaCorriente cc=new CuentaCorriente(67890, cl, 1000);
        System.out.println(cc.toString());

        Cuenta2 c3=new Cuenta2(); {
        CuentaAhorro ca=new CuentaAhorro();
        CuentaCorriente cc1=new CuentaCorriente();

        c3.mostrarPoli();
        ca.mostrarPoli();
        cc1.mostrarPoli();

        Cuenta2 [] cuentasVarias = new Cuenta2[4];
        cuentasVarias[0]=c3;
        cuentasVarias[1]=ca;
        cuentasVarias[2]=cc1;
        


        
        };

        

    }

}
