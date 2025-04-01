package poo.IBMSW;

public class Test {
    public static void main(String[] args) {
        Programador p = new Programador("Elon","123",45,true,1500,100,"Java");
        System.out.println(p.toString());
        p.clasifica();
        p.subirSalario(10);
        System.out.println(p.toString());
        double salarioProgramador=p.calcularsalario();
        System.out.println("SP: "+salarioProgramador);

    }

}
