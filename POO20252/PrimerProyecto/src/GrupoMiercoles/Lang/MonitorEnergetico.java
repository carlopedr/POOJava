
package GrupoMiercoles.Lang;

public class MonitorEnergetico {
    public static void main(String[] args) {
        int[] zona1 = new int[52];
        int[] zona2 = new int[52];
        int[] zona3 = new int[52];
        int[] zona4 = new int[52];
        zona1=generaConsumos(52);
        mostrarConsumos(zona1);
        System.out.println("Promedio: "+calcularPromedio(zona1));
        zona2=generaConsumos(52);
        zona3=generaConsumos(52);
        zona4=generaConsumos(52);
        
        
    }
    public static int [] generaConsumos(int cantidad){
        int [] consumos= new int[cantidad];
        int max=1000, min=100;
        for(int i=0;i<cantidad;i++){
            consumos[i]=(int)((Math.random()*(max-min))+min);
        }
        return consumos;
    }
    
    public static void mostrarConsumos(int [] zona){
         for(int i=0;i<zona.length;i++){
            System.out.println(zona[i]);
        }
    }
    public static int calcularPromedio(int [] datos){
        int acumulado=0,promedio=0;
        for(int i=0;i<datos.length;i++){
            acumulado+=datos[i];
        }
        promedio=acumulado/datos.length;
        return promedio;
       
    }
    
}
