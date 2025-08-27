
package GrupoMartes.Lang;

public class ArrayMulti1 {

    public static void main(String[] args) {
        int[][] mat = {{14, 7, 23, 45}, {33, 2, 11, 4}, {8, 1, 99, 45}};
        for (int fila = 0; fila < mat.length; fila++) { // bucle de las filas
            for (int col = 0; col < mat[0].length; col++) { // bucle de las columnas
                System.out.println(mat[fila][col]);
            }
        }
        System.out.println("Por columnas");
        for(int j=0;j<mat[0].length;j++){
            for(int k=0;k<mat.length;k++){
                System.out.println(mat[k][j]);
            }
        }
        
    }
    
}
