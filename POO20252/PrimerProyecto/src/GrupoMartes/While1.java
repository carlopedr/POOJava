
package GrupoMartes;

public class While1 {
    public static void main(String[] args) {
        System.out.println("Con while");
        int i=6;
        while(i<5){
            System.out.println("i:"+i);
            i++;
        }
        System.out.println("if:"+i);
        
        //Usando do... while
        System.out.println("Con do .. while");
        int j=6;
        do{
           System.out.println("j:"+j);
            j++; 
        } while(j<5);
        System.out.println("jf:"+j);
    }
    
}
