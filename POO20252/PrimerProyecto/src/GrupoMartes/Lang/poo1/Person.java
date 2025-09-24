
package GrupoMartes.Lang.poo1;

public class Person {
    //Atributos
    String name;
    int age;
    
    //Constructor
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Métodos    
    public void sayHello(){
        System.out.println("Hola, me llamo "+ name+" y tengo "+age+" años!!");
    }
}
