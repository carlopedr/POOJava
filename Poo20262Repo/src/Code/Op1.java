package Code;
/**
 *
 * @author carlos pedraza
 */
public class Op1 {
    public static void main(String[] args) {
        int a,b,suma,resta,prod,res;
        double div;
        a=9;
        b=4;
        suma=a+b;
        System.out.println("Suma: "+suma);
        resta=a-b;
        System.out.println("Resta:"+resta);
        prod=a*b;
        System.out.println("Producto:"+prod);
        div=a/b;
        //Casting
        System.out.println("División:"+div);
        double div2;
        div2=(double)a/(double)b;
        System.out.println("División con casting:"+div2);
        double c=5,d=2;
        int div3;
        div3=(int)c/(int)d;
        res=a%b;
        System.out.println("Residuo:"+res);
        res++;
        ++res;
        System.out.println("Residuo incrementado:"+res);
        System.out.println(a+">"+b+"="+(a>b));
        System.out.println(a+"<"+b+"="+(a<b));
        System.out.println("\u00E1");
        
        
        
        
        
        
        
    }
    
}
