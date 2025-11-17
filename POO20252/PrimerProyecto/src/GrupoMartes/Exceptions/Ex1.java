
package GrupoMartes.Exceptions;

import Ex.*;
import java.io.IOException;


public class Ex1 {
    public static void main(String[] args) {
        
        metodo1();
        
    }
    public static void metodo1(){
        System.out.println("");
        int [] a=new int[3];
        try{
            a[1]=Integer.parseInt("123");
            a[0]=10/0;
            a[3]=5;
            
        } 
        catch (IndexOutOfBoundsException e){
            System.out.println("Error en el indice!!");
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Otra excepció"+e.getMessage());
        }
        finally{
            System.out.println("Siempre se ejecuta!!!");
        }
        
    }
}
