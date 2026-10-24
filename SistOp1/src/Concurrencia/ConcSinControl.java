
package Concurrencia;


public class ConcSinControl {
    public static int cuenta;
    public static int it=10000;
    
    public static void torniquete1(){
        System.out.println("Inicia torniquete 1");
        for(int i=0;i<it;i++){
           cuenta=cuenta+1; 
        }
        System.out.println("Torniquete 1 ha finalizado");
    }
    
    public static void torniquete2(){
        System.out.println("Inicia torniquete 2");
        for(int i=0;i<it;i++){
           cuenta=cuenta+1; 
        }
        System.out.println("Torniquete 2 ha finalizado");
    }
    
    public static void main(String[] args) throws InterruptedException  {
        //Se crean hilos para cada torniquete
        Thread hilo1 = new Thread(()->torniquete1());
        Thread hilo2 = new Thread(()->torniquete2());
        //Inicia la ejecución de los hilos
        hilo1.start();
        hilo2.start();
        //Asegura que los hilos se ejecuten hasta el final
        hilo1.join();
        hilo2.join();
        
        System.out.println("Cuantos: "+cuenta);
        
        
        
    }

}
