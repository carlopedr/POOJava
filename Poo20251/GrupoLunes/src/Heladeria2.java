import java.util.Scanner;

public class Heladeria2 {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String sabores [] = {"Limón","Nuez","Lulo","Fresa","Cream"};
    int cant []=new int[5];
    int cantlimon=0,cantnuez=0,cantlulo=0,cantfresa=0,cantcrema=0;
    double ventas[]=new double[5];
    double ventalimon=0,ventanuez=0,ventalulo=0,ventafresa=0,ventacrema=0,ventaTotal=0;
    boolean continua=true;
        while(continua){
            boolean contvta=true;
            boolean cicloconti=true;
                while(contvta){
                    System.out.println("***sabores***");
                    for(int i=0;i<sabores.length;i++){
                        System.out.println((i+1)+". "+sabores[i]);
                    }
                    int sabor=sc.nextInt();
                    sc.nextLine();
                    switch (sabor) {
                        case 1:
                            //System.out.println("cantidad vendida: ");
                            //int cantFLimon=sc.nextInt();
                            //sc.nextLine();
                            int cantFLimon=capturaVenta();
                            System.out.println(cantFLimon);
                            cantlimon=cantlimon+cantFLimon;
                            break;
                        case 2:
                            System.out.println("cantidad vendida: ");
                            int cantFNuez=sc.nextInt();
                            sc.nextLine();
                            cantnuez=cantnuez+cantFNuez;
                            break;
                        case 3:
                            System.out.println("cantidad vendida: ");
                            int cantFLulo=sc.nextInt();
                            sc.nextLine();
                            cantlulo=cantlulo+cantFLulo;
                            break;
                        case 4:
                            System.out.println("cantidad vendida: ");
                            int cantFFresa=sc.nextInt();
                            sc.nextLine();
                            cantfresa=cantfresa+cantFFresa;
                            break;
                        case 5:
                            System.out.println("cantidad vendida: ");
                            int cantFCrema=sc.nextInt();
                            sc.nextLine();
                            cantcrema=cantcrema+cantFCrema;
                            break;
                        default:
                        System.out.println("sabor no identificado error");
                    }
                    boolean contsabor=true;
                    while (contsabor) {
                        System.out.println("¿desea incluir otro sabor? (S/N)");
                        String rto=sc.nextLine();
                        if (rto.toUpperCase().equals("N")) {
                            contvta=false;
                            contsabor=false;
                        } else  {if (rto.toUpperCase().equals("S")) {
                            contvta = true;
                            contsabor = false;
                        } else {
                            System.out.println("¡error!, ingrese N o S para continuar con el proceso");
                            contsabor=true;
                        }
                        }
                    }
            }
            while (cicloconti) {
                System.out.println("¿desea procesar otra factura? (S/N)");
                String rta=sc.nextLine();
                    if (rta.toUpperCase().equals("N")) {
                        continua = false;
                        cicloconti= false;} 
                    else {
                        if (rta.toUpperCase().equals("S")) {
                        continua = true;
                        cicloconti = false;} 
                    else {
                        System.out.println("¡error!, ingrese N o S para continuar con el proceso");
                        cicloconti=true;
                }  
                }
            }
    }
    System.out.println("sabror       Cantidad          valor");
    System.out.println("Limón       "+cantlimon+"        "+(cantlimon*2500));
    System.out.println("nuez        "+cantnuez+"         "+(cantlimon*2800));
    System.out.println("Lulo        "+cantlulo+"         "+(cantlulo*2600));
    System.out.println("fresa       "+cantfresa+"        "+(cantlimon*2000));
    System.out.println("crema        "+cantcrema+"         "+(cantlimon*3000));
    System.out.println("Ventas Totales="+((cantlimon*2500)+(cantnuez*2800)+(cantlulo*2600)+(cantfresa*2000)+(cantcrema*3000)));
    }
    //Métodos adicionales

    public static int capturaVenta(){
        int cantVenta=0;
        Scanner sc = new Scanner(System.in);
        boolean valido=false;
        while (!valido){
            System.out.print("Ingrese cantidad venta: ");
            cantVenta=sc.nextInt();
            sc.nextLine();
            if(cantVenta<=0){
                System.out.println("Cantida de venta no valida. Intente de nuevo!");
            }
            else{
                valido=true;
            }
        }
        return cantVenta;

    }


    }

