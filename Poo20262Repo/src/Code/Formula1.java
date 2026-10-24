

package Code;

import java.util.Scanner;


public class Formula1 {
    public static void main(String[] args) {
        double [] tiempoPracticas;
        double [] tiempoClasificacion;
        double [] tiempoCarrera;
        double [] promedioPiloto;
        Scanner sc = new Scanner (System.in);
        int cantPilotos, numPiloto;
        cantPilotos=pedirCantPilotos(sc);
        tiempoPracticas=generarVector(cantPilotos,90,120);
        //mostrarVector(tiempoPracticas);
        tiempoClasificacion=generarVector(cantPilotos,81,108);
        tiempoCarrera=generarVector(cantPilotos,85,115);
        promedioPiloto=calcularPromedios(tiempoPracticas,tiempoClasificacion,tiempoCarrera);
        numPiloto=solicitarNumeroPiloto(sc,cantPilotos);
        mostrarReporteIndividual(1,tiempoPracticas,tiempoClasificacion,tiempoCarrera);
    }
    
    //Metodo para pedir la cantidad de piloto
    
    public static int pedirCantPilotos(Scanner sc){
        int cant=0;
        while(cant<=0){
            System.out.print("Cantidad de pilotos: ");
            cant=sc.nextInt();
        }
        return cant;
    }
    
    //Método generarVector
    
    public static double[] generarVector(int cantidad, double minimo, double maximo){
        double vector [];
        if((cantidad <=0)||(minimo>=maximo)){
            System.out.println("Error en parametros");
            vector=null;
        }
        else{
            vector=new double[cantidad];
            for(int i=0;i<vector.length;i++){
                vector[i]=(Math.random()*(maximo+1-minimo))+(minimo);
            }
        }
        return vector;
    }
    
    public static void mostrarVector(double [] vector){
        for(int i=0;i<vector.length;i++){
                System.out.println("Pos "+i+":"+vector[i]);
            }
    }
    
    public static double[] calcularPromedios(double[] pr, double[] cl, double[] carrera){
        double vectorProm []=new double[pr.length];
        for(int i=0;i<vectorProm.length;i++){
                vectorProm[i]=(pr[i]+cl[i]+carrera[i])/3;
        }
        return vectorProm;
    }
    
    public static int solicitarNumeroPiloto(Scanner sc, int n){
        int numPiloto=0;
        do{
            System.out.print("Número de piloto: ");
            numPiloto=sc.nextInt();
            
        }while((numPiloto<=0)|(numPiloto>n));
        return numPiloto;
    }
    
    public static double calcularPromedioPiloto(double practica, double clas, double carrera){
        double prom;
        if((practica<=0)|(clas<=0)|carrera<=0){
            System.out.println("Error arguemtos");
            prom=0;
        }
        else{
            prom=(practica+clas+carrera)/3;
        }
        return prom;
    }
    public static void mostrarReporteIndividual(int numeroPiloto, double[] pr, double[] cl, double[] carrera){
        int pos=numeroPiloto-1;
        double promPiloto=calcularPromedioPiloto(pr[pos],cl[pos],carrera[pos]);
        System.out.println("No. Piloto: "+numeroPiloto);
        System.out.println("Tiempo Prácticas: "+pr[pos]);
        System.out.println("Tiempo Clasificación: "+cl[pos]);
        System.out.println("Tiempo Carrera: "+carrera[pos]);
        System.out.println("Promedio general del fin de semana: "+promPiloto);
    }

}
