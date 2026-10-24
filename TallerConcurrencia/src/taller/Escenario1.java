//Escenario 1: Dos torniquetes trabajando de manera
//independiente. Sin concurrencia
package taller;

public class Escenario1 {
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
    
    public static void main(String[] args) {
        System.out.println("Inician los procesos...");
        
        torniquete1();
        torniquete2();
        
        System.out.println("Cuenta: "+cuenta);
        
    }
    

}
