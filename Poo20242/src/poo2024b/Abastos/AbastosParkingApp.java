package Abastos;
import java.util.Scanner;

public class AbastosParkingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] datosCamion = new double[3][6];
        double tipoProducto=0, tipoServicio=0, valorPark = 0, tiempo=0, peso=0, largo=0;
        //Ingreso manual
        /* 
        for (int nCamion = 0; nCamion < datosCamion.length; nCamion++) {
            System.out.print("Servicio a realizar (1 - Descarga 2 - Carga): ");
            tipoServicio = sc.nextDouble();
            // Validar que el tipo de servicio sea 1 o 2
            if (tipoServicio == 1) {
                System.out.print("Tipo de Producto (1 - Perec 2-No perec):");
                tipoProducto = sc.nextDouble();
                System.out.print("Peso de la carga: ");
                peso = sc.nextDouble();
                switch ((int) tipoProducto) {
                    case 1:
                        if (peso < 8) {
                            valorPark = 15000 * peso;
                        } else {
                            valorPark = 9000 * peso;
                        }
                        break;
                    case 2:
                        if (peso < 8) {
                            valorPark = 60000;
                        } else {
                            valorPark = 600000 + (peso - 10) * 7000;
                        }

                }

            } else {
                System.out.print("Tiempo en el parqueadero:");
                tiempo = sc.nextDouble();
                System.out.print("Largo del camión: ");
                largo = sc.nextDouble();
                if (tiempo <= 2) {
                    valorPark = 0;
                } else {
                    if (largo <= 4) {
                        valorPark = (tiempo - 2) * 4000;
                    } else {
                        valorPark = (tiempo - 2) * 4000 * 1.25;
                    }
                }

            }
            System.out.println("Valor a pagar: " + valorPark);
            datosCamion[nCamion][0] = tipoServicio;
            datosCamion[nCamion][1] = tipoProducto;
            datosCamion[nCamion][2] = peso;
            datosCamion[nCamion][3] = tiempo;
            datosCamion[nCamion][4] = largo;
            datosCamion[nCamion][5] = valorPark;
            // Falta programar la pregunta si desea continuar??

        }
        
*/
        for (int nCamion = 0; nCamion < datosCamion.length; nCamion++){
            //int n = (int) (Math.random() * (<número_máximo + 1> - <número_mínimo>)) + <numero_mínimo>;
            tipoProducto=(((int) (Math.random()*10))%2)+1;
            tipoServicio=(((int) (Math.random()*10))%2)+1;
            tiempo=(int) (Math.random()*(10+1)-1)+1;
            peso=(int) (Math.random()*(20+1)-1)+1;
            largo=(int) (Math.random()*(10+1)-1)+1;
            if (tipoServicio == 1) {
                //System.out.print("Tipo de Producto (1 - Perec 2-No perec):");
                //tipoProducto = sc.nextDouble();
                //System.out.print("Peso de la carga: ");
                //peso = sc.nextDouble();
                switch ((int) tipoProducto) {
                    case 1:
                        if (peso < 8) {
                            valorPark = 15000 * peso;
                        } else {
                            valorPark = 9000 * peso;
                        }
                        break;
                    case 2:
                        if (peso < 8) {
                            valorPark = 60000;
                        } else {
                            valorPark = 600000 + (peso - 10) * 7000;
                        }

                }

            } else {
                //System.out.print("Tiempo en el parqueadero:");
                //tiempo = sc.nextDouble();
                //System.out.print("Largo del camión: ");
                //largo = sc.nextDouble();
                if (tiempo <= 2) {
                    valorPark = 0;
                } else {
                    if (largo <= 4) {
                        valorPark = (tiempo - 2) * 4000;
                    } else {
                        valorPark = (tiempo - 2) * 4000 * 1.25;
                    }
                }

            }
            datosCamion[nCamion][0] = tipoServicio;
            datosCamion[nCamion][1] = tipoProducto;
            datosCamion[nCamion][2] = peso;
            datosCamion[nCamion][3] = tiempo;
            datosCamion[nCamion][4] = largo;
            datosCamion[nCamion][5] = valorPark;
        }
        System.out.println("TipoS   TipoP   Peso    Tiempo  Largo   Valor");
        for (int nCamion = 0; nCamion < datosCamion.length; nCamion++) {
            System.out.println("");
            for (int nDato = 0; nDato < 6; nDato++) {
                System.out.print(datosCamion[nCamion][nDato] + "      ");

            }
        }
        sc.close();



    }
}
