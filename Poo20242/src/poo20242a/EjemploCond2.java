/* Pedir una nota de 0 a 5 y mostrarla de la forma: 
Insuficiente: cuando es menor que 3
Suficiente: cuando es de 3 a 4
Bien: cuando es mayor que 4
....*/


import java.util.Scanner;

public class EjemploCond2 {
    public static void main(String[] args) {
        float nota;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese su calificación: ");
        nota=in.nextFloat();
        if(nota<0){
            System.out.println("Negativo: Valor incorrecto para nota");
        }
        else if(nota<3){
            System.out.println("Nota Insuficiente");
        }
        else if(nota<=4)
            System.out.println("Nota Sufuciente");
        else if(nota<=5)
            System.out.println("Nota Bien");
        else
            System.out.println("Nota excede valor máximo");
        in.close();
    }

}
