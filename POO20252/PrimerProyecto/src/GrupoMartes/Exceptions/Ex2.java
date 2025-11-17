
package GrupoMartes.Exceptions;

import Ex.*;



public class Ex2 {
    public static void main(String[] args) {
        try{
            metodo1();
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
    public static void metodo1() throws IndexOutOfBoundsException{
        System.out.println("");
        int[] a = new int[3];

        a[1] = Integer.parseInt("123");
        a[0] = 10 / 0;
        a[3] = 5;
    }
}
