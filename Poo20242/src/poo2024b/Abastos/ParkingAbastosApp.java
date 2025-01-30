package Abastos;
import java.util.Scanner;

public class ParkingAbastosApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantCamiones; 
        double tipoServicio;
        System.out.print("Ingrese la cantidad de camiones: ");
        cantCamiones=sc.nextInt();
        double [][] datosCamiones = new double[cantCamiones][6];
        for(int c=0;c<cantCamiones;c++){
            System.out.print("Ingrese el tipo de servicio: (1 - Carga 2 - Descarga)");
            tipoServicio=sc.nextDouble();
            datosCamiones[c][0]=tipoServicio;
            //Validar que la variable sea 1 o 2
            switch((int)tipoServicio){
                case 2:
                System.out.print("Ingrese el tipo de producto: 1-Per 2 -No Per ");
                datosCamiones[c][1]=sc.nextDouble();
                System.out.print("Ingrese el peso trasportado:  ");
                datosCamiones[c][2]=sc.nextDouble();
                if(datosCamiones[c][1]==1){
                    if(datosCamiones[c][2]<8){
                        datosCamiones[c][5]=datosCamiones[c][2]*15000;                        
                    }
                    else{
                        datosCamiones[c][5]=datosCamiones[c][2]*9000;
                    }
                }else {
                    if(datosCamiones[c][2]<8){
                        datosCamiones[c][5]=60000;                        
                    }
                    else{
                        datosCamiones[c][5]=60000+(datosCamiones[c][2]-10)*7000; 

                    }
                }
                break;
                case 1:
                System.out.println("Ingrese el tiempo de permanencia ");
                datosCamiones[c][3]=sc.nextDouble();
                System.out.println("Ingrese el lasgo del camión:  ");
                datosCamiones[c][4]=sc.nextDouble();


            }

        }
        System.out.println("TipoS   TipoP   Peso    Tiempo  Largo   valor");
        for(int c=0;c<cantCamiones;c++){
            System.out.println("");
            for(int d=0;d<6;d++){
                System.out.print(datosCamiones[c][d]+"  ");

            }
        

    }
    sc.close();

}
}