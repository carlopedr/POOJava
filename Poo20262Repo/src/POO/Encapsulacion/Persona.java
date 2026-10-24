package POO.Encapsulacion;

public class Persona {
    
    //Atributos
    private String name;
    private int age;
    
    //Constructores

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Persona() {
    }
    
    //Getters y setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.name=upperCaseName(this.name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
   public static String upperCaseName(String name){
       name=name.toUpperCase();
       return name;
   }
    

}
