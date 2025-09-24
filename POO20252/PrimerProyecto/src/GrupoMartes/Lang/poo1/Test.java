
package GrupoMartes.Lang.poo1;

public class Test {
    public static void main(String[] args) {
        Student student1 =new Student(70);
        student1.reviewScore();
        Student student2 =new Student(50);
        student2.reviewScore();
        
        BankAccount ba=new BankAccount();
        ba.showBalance();
        ba.deposit(100);
        ba.showBalance();
        ba.deposit(87);
        ba.showBalance();
        
        Moto m=new Moto(80);
        m.showVelocidad();
        m.acelerar(20);
        m.showVelocidad();
        m.acelerar(80);
        m.showVelocidad();
        m.frenar(60);
        m.showVelocidad();
        m.frenar(100);
        m.showVelocidad();
        
    }
    
}
