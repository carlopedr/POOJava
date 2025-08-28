package GrupoMiercoles.Lang;

public class For1 {
    public static void main(String[] args) {
        int numIter=0;
        int vc;
        for (vc = 1; vc <= 10; vc++) {
            numIter++;
            System.out.println("2 por " + vc + "es " + (2 * vc));
        }
        System.out.println("No. Iteraciones: "+numIter);
        System.out.println("vc="+vc);
    }
    
}
