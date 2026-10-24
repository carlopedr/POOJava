package Concurrencia;
public class Procesos {
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
    
    public static void main(String[] args) {
        torniquete1();
        torniquete2();
        System.out.println("Cuantos:"+cuenta);
        
    }
    
    

}
