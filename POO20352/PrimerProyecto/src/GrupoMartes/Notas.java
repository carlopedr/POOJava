package GrupoMartes;

import java.util.Scanner;

/**
 *
 * @CARLOS PEDRAZA 2345699
 */
public class Notas {
    public static void main(String[] args) {
        float nota1,nota2,media;
        String resultado;//"apto" "no apto"
        Scanner in=new Scanner(System.in);
        System.out.print("Nota primer examén: ");
        nota1=in.nextFloat();
        System.out.print("Nota segundo examén: ");
        nota2=in.nextFloat();
        media=(nota1+nota2)/2;
        in.nextLine();
        if(media>=5){
            System.out.println("Tu nota es: "+media);
        }
        else{
            System.out.print("Examen de recuperación (apto/no apto):");
            resultado=in.nextLine();
            if(resultado.equals("apto")){
                System.out.println("Tu nota es: 5.0");
            } else {
                System.out.println("Tu nota es: "+media);
            }
                
        }
        
    }
    
}
