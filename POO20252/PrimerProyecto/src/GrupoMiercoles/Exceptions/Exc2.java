
package GrupoMiercoles.Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exc2 {
    public static void main(String[] args)  {
        try{
           metodo1(); 
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        try {
            metodo2();
        } catch (IOException ex) {
            System.getLogger(Exc2.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        
        
    }
    
    public static void metodo1() throws ArrayIndexOutOfBoundsException, ArithmeticException{
        int a=10/10;
    }
    
    public static void metodo2() throws IOException {
        String rutaArchivo = "archivo_inexistente.txt";
        BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
        String linea;
        
        while ((linea = lector.readLine()) != null) {
            System.out.println(linea);
        }

    }

}
