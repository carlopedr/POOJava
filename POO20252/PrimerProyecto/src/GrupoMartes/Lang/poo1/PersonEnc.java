
package GrupoMartes.Lang.poo1;

public class PersonEnc {
    //Atributos
    private int id;
    private String name;
    private int age;
    private String email;
    
    //Constructor
    public PersonEnc() {
    }

    public PersonEnc(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
   

    //Métodos    
    public void sayHello(){
        System.out.println("Hola, me llamo "+ name+" y tengo "+age+" años, mi id es "+id + " y mi email es "+email);
    }
}
