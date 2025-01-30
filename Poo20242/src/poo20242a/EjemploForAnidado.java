

public class EjemploForAnidado {
    public static void main(String[] args) {
        System.out.println("Con for anidados...");
        for (int i=1;i<=5;i++){
            System.out.println("i: "+i);
            for(int j=1;j<=3;j++){
                System.out.println("    j: "+j);
            }
        }
        
    }
}
