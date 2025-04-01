package poo.IBMSW;

public class Empleado {
    private String nombre;
    private String dni;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /*
     * Método clasifica(), que permita mostrar por consola la clasificación según
     * la edad de acuerdo al siguiente algoritmo:
     * • Si edad es menor o igual a 21, Principiante
     * • Si edad es >=22 y <=35, Intermedio
     * • Si edad es >35, Senior.
     */
    public void clasifica() {
        if (edad <= 21) {
            System.out.println("es principiante");
        } else if (edad >= 22 && edad <= 35) {
            System.out.println("es intermedio");
        } else if (edad > 35) {
            System.out.println("es senior");
        }
    }
    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", casado=" + casado + ", salario="
                + salario + "]";
    }

    /*Método subirSalario(int x), que permita aumentar el salario en un 
    porcentaje que sería pasado como parámetro al método. */
    public void subirSalario(int x) {
        //System.out.println("El salario del empleado es: " + salario);
        this.salario = this.salario * (1 + (x / 100));
        //System.out.println("El nuevo salario del empleado es :" + nuevoSalario);
       
    }


}

    
