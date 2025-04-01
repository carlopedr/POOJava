import java.util.Scanner;
public class Rep1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num=sc.nextInt();
        System.out.println("Solución con for");

        for(int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+(num*i));
        }
        //System.out.println(i);

        System.out.println("Solución con while");

        int zaira=1;
        while(zaira<=10){
            System.out.println(num+"*"+zaira+"="+(num*zaira));
            zaira++;
        }
        System.out.println(zaira);

    }

}
