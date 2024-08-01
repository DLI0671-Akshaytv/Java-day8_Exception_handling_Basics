package Basic_Exception;

import java.util.Scanner;

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}
class Bank{
    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount>balance){
            throw new InsufficientFundsException("Error: Insufficient balance");
        }
    }

}
public class Exception_bankingSystem {
    public static void main(String[] args) {
        Bank bank=new Bank(500);
        System.out.println("Enter withdraw amount: ");
        Scanner s=new Scanner(System.in);
        double amt=s.nextDouble();
        try{
            bank.withdraw(amt);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
