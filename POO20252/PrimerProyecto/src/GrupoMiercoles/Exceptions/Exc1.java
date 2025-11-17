
package GrupoMiercoles.Exceptions;

public class Exc1 {
    public static void main(String[] args) {
        int [] array = new int[3];
        //metodo1();
        try{
            //int a=Integer.parseInt("Hola");
            //array[2]=10/0;
            array[3]=5;
            array[0]=10;
        }
        catch (ArrayIndexOutOfBoundsException e){
            boolean index=true;
            System.out.println("Error: "+e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            System.out.println("Siempre se ejecuta!!!");
        }
        
    }
    
    public static void metodo1(){
        int a=10/0;
    }
    
}
