
package GrupoMiercoles;

public class Sw1 {
    public static void main(String[] args) {
        int valorBoton=300;
        switch (valorBoton){
            case 50: System.out.println("Sirve para calentar la torta");
            break;
            case 100: System.out.println("Sirve para el pescado");
            break;
            case 200: System.out.println("Para las papas fritas");
            break;
            default:    System.out.println("No puedo manejar esa temperatura");
        }
    }
    
}
