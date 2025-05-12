import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int a=3, b=0;
        metodo1();
        //int c = a/b;
    }

    public static void metodo1(){
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("escribe un numero entero...");
        try{
            String in=entrada.nextLine();
            numero=Integer.parseInt(in);
            //numero = entrada.nextInt();
            int cos = numero/ numero;
            System.out.println("El cociente es: " + numero + " es " + cos);
        }
        catch(Exception e){
            //System.out.println("Esta dividiendo por cero");
            System.out.println("La exepción que se generó fue: "+e.getLocalizedMessage());
            
        }

        

    }

}
