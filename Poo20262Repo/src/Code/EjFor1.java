
package Code;


public class EjFor1 {
    public static void main(String[] args) {
        int i;
        int n=23;
        for (i = 0; i < n; i++) {
            int b = 3 * i;
            System.out.println("i: " + i);
            System.out.println("b: " + b);
        }
        System.out.println("i: " + i);
        //System.out.println(b);
        for(int k=1, j=k+10; k<5; k++, j=2*k){
	System.out.println("k= " + k + "j= " + j);
}
    }

}
