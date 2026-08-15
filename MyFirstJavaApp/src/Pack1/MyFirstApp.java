/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
AUTHOR: CARLOS PEDRAZA - 20262345678
*/
package Pack1;
//Se importa la clase Scanner
import java.util.Scanner;

public class MyFirstApp { //Deficición de clase
    public static void main(String[] args) {
        //Objeto de la clase Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Hola, como te llamas: ");
        //Se declara la variable para cadena de caracteres
        String name;
        //Para capturar lo que se escribe por teclado
        name=sc.nextLine(); 
        int age;
        System.out.print("Cuantos años tienes: ");
        age=sc.nextInt();
        System.out.print("Antes de hola mundo...");
        System.out.println("Hola mundo!!");
        
        System.out.println("Hola "+name+" que bueno que tengas "+age+" años");
        
    }

}
