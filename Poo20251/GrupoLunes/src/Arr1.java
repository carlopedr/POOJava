import java.util.Scanner;

public class Arr1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Llenando el arreglo...");
        /*System.out.print("Ingrese el dato 1: ");
        a[0]=sc.nextInt();
        System.out.print("Ingrese el dato 2: ");
        a[1]=sc.nextInt();
        System.out.print("Ingrese el dato 3: ");
        a[2]=sc.nextInt();
        */
        //Llenar el arreglo
        for(int i=0;i<a.length;i++){

            System.out.print("Ingrese el dato "+(i+1)+": ");
            //a[i]=sc.nextInt();
            a[i]=(int) (Math.random()*30+1);
        }
        

        //Leer (recorrer) el arreglo
        System.out.println("Contenido del arreglo..");
        int acum=0,acumPar=0,acumImpar=0;
        for(int k=0;k<a.length;k++){
            System.out.println(a[k]);
            acum+=a[k];
            if((a[k]%2)==0){
                acumPar++;
            }
            else
                acumImpar++;
        }
        System.out.println("Acumulado: "+acum);
        System.out.println("Pares: "+acumPar);
        System.out.println("Impares: "+acumImpar);






    }

}
