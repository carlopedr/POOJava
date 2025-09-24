//6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.

package GrupoMartes.Lang.poo1;

public class BankAccount {
    double balance;

    public BankAccount() {
        this.balance = 0;
    }
    
    public void deposit(double value){
        this.balance+=value;
    }
    
    public void showBalance(){
        System.out.println("Saldo actual: "+balance);
    }
    
    
    
}
