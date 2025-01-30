

public class Arrays2 {
    public static void main(String[] args) {
        //Declarar matrices
        int [][] m;
        m = new int[5][];
        m[0]=new int[3];
        m[1]=new int[2];
        m[2]=new int[4];
        m[3]=new int[1];
        m[4]=new int[5];
        //LLenar matrices
        int tempsNeiva[][]= new int[4][7];
        for(int f=0; f<tempsNeiva.length;f++){ //Cantidad de filas
            System.out.println("");
            for(int c=0;c<tempsNeiva[f].length;c++){//Cantidad de elementos por fila
                tempsNeiva[f][c]=(int) (Math.random() * (39 - 22)) + 22;
                System.out.print(tempsNeiva[f][c]+"   ");
            }
            
        }
        //int n = (int) (Math.random() * (39 - 22)) + 22;
        
        
        
    }
}
