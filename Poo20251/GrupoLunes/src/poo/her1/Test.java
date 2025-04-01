package poo.her1;

public class Test {
    public static void main(String[] args) {
        Auto a = new Auto("BMW","Black",5);
        System.out.println(a.toString());
        a.pintar("Verde");
        System.out.println(a.toString());
        Auto a1=new Auto(4);
        System.out.println(a1.toString());
        
        
    }

}
