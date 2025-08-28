
package GrupoMiercoles.Lang;

public class ForArray {
    public static void main(String[] args) {
        //Declaración de arreglos
        int[] lista = new int[4];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * 20);
            System.out.println("el elemento añadido es " + lista[i]);
        }
        int suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma = suma + lista[i];
        }
        System.out.println("La suma es " + suma);
    }

}
