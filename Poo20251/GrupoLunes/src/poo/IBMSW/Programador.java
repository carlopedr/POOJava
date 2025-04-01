package poo.IBMSW;

public class Programador extends Empleado {

    private int lineasDeCodigoPorHora;
    private String lenguajeDominate;
    public Programador(String nombre, String dni, int edad, boolean casado, double salario, int lineasDeCodigoPorHora,
            String lenguajeDominate) {
        super(nombre, dni, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominate = lenguajeDominate;
    }
    public Programador() {
    }

    /*- Método double calculaSalario(), que calcula y devuelve el salario 
    del programador,  calculado con la operación 10* lineasDeCodigoPorHora. */
    public double calcularsalario(){
        double calculosalario=10*lineasDeCodigoPorHora;
        return calculosalario;
    }
    @Override
    public String toString() {
        return "Programador [lineasDeCodigoPorHora=" + lineasDeCodigoPorHora + ", lenguajeDominate=" + lenguajeDominate
                + ", toString()=" + super.toString() + "]";
    }

    

}
