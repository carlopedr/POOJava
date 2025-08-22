
package GrupoMartes.Lang;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op=0;
        System.out.print("Ingrese un numero entre 1 y 5: ");
        op=in.nextInt();
        switch(op){
            case 1: System.out.println("UNO");
                    break;
            case 2: System.out.println("DOS");
                    break;     
            case 3: System.out.println("TRES");           
                    break;
            case 4: System.out.println("CUATRO");
                    break;
            case 5: System.out.println("CINCO");
                    break;
            default: System.out.println("ERROR!");
        }
        System.out.println("FUERA DEL SWTICH");
        
        if(op==1){
            System.out.println("UNO");
        }else if(op==2){
            System.out.println("DOS");
        }
        
    }
            
    
}
