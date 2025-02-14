/*
 * El dueño de una empresa desea planificar las decisiones financieras que tomara en el siguiente
año. La manera de planificarlas depende de lo siguiente:
Si actualmente su capital se encuentra con saldo negativo, pedirá un préstamo bancario para
que su nuevo saldo sea de U$10.000. Si su capital tiene actualmente un saldo positivo pedirá un
préstamo bancario para tener un nuevo saldo de U$20.000, pero si su capital tiene actualmente
un saldo superior a los U$20.000 no pedirá ningún préstamo.
Posteriormente repartirá su presupuesto de la siguiente manera:
• U$5.000 para equipo de computo
• U$2.000 para mobiliario
• El resto la mitad será para la compra de insumos y la otra para otorgar incentivos al personal.
Desplegar que cantidades se destinaran para la compra de insumos e incentivos al personal y,
en caso de que fuera necesario, a cuánto ascendería la cantidad que se pediría al banco.
 */

import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        double insumos,incentivos,prestamo;//Salidas
        double capital;//Entrada
        Scanner input = new Scanner(System.in);
        System.out.print("Capital inicial: ");//Pedir el valor del capital inicial
        capital=input.nextDouble();
        if(capital<0){
            prestamo=10000-(capital);
            capital=10000;
        }else if(capital<20000){
            prestamo=20000-capital;
            capital=20000;
        }else{
            prestamo=0;
        }
        insumos=(capital-7000)/2;
        incentivos=(capital-7000)/2;
        System.out.println("Prestamo a solicitar: "+prestamo);
        System.out.println("Insumos: "+insumos);
        System.out.println("Incentivos: "+incentivos);


        
    }

}
