
package Code;

import java.util.Scanner;


public class Metodo1 {
    public static void main(String[] args) {
        saludar();
        int a=pedir();
        int b=pedir();
        int suma=suma2(a,b);
        System.out.println("Las suma es: "+suma);
        String msg=mayor(a,b);
        System.out.println(msg);
        
    }
    
    //Método que no pide nada y no devuelve nada
    public static void saludar(){
        System.out.println("Bienvenidos al programa!!");
    }
    
    //Método que retorna un valor y no pide nada
    public static int pedir(){
        Scanner sc = new Scanner(System.in);
        int x;
        do{
            System.out.print("Ingrese un numero positivo: ");
            x=sc.nextInt();
            if(x<0)
                System.out.println("No ingreso un numero positivo");
        }while(x<0);
        return x;
    }
    
    //Método que pide valores(argumentos) y retorna algo
    public static int suma2(int op1, int op2){
        int resultado=op1+op2;
        return resultado;
    }
    //Debe devolver un mensaje con el valor mayor entre los operandos
    public static String mayor(int op1,int op2){
        String msg="";
        if(op1<op2)
            msg="El mayor es "+op2;
        else if (op1>op2)
            msg="El mayor es "+op1;
        else
            msg="Son iguales";
        return msg;
        
    }

}
