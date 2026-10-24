/*
 *Los torniquetes van a trabajar de forma simultanea
 *afectando de forma concurrente a la variable
 */

package taller;

public class Escenario2 {
    public static int cuenta;
    public static int it=10000;
    
    public static void torniquete1(){
        System.out.println("Inicia Torniquete 1");
        for(int i=0;i<it;i++){
            cuenta=cuenta+1;
            
        }
        System.out.println("Finalizó Torniquete 1");
    }
    
    public static void torniquete2(){
        System.out.println("Inicia Torniquete 2");
        for(int i=0;i<it;i++){
            cuenta=cuenta+1;
        }
        System.out.println("Finaliza Torniquete 2");
    }
    
    public static void main(String[] args) throws InterruptedException {
        //Crear dos hilos para los procesos de los torniquetes
        System.out.println("Se crean los hilos...");
        Thread hilo1 = new Thread(()->torniquete1());
        Thread hilo2 = new Thread(()->torniquete2());
        
        //Inicia la ejecución de los hilos
        hilo1.start();
        hilo2.start();
        
        //Garantiza que los hilos terminen bien
        hilo1.join();
        hilo2.join();
        
        System.out.println("Cuenta: "+cuenta);
    }

}
