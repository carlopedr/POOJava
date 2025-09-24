// 5. Crea una clase Student con atributo score y un método que diga si aprobó 
//(mayor o igual a 60).
package GrupoMartes.Lang.poo1;

public class Student {
    int score;

    public Student(int score) {
        this.score = score;
    }
    
    public void reviewScore(){
        if(score>=60)
            System.out.println("Aprobado");
        else
            System.out.println("No Aprobado");
    }
}
