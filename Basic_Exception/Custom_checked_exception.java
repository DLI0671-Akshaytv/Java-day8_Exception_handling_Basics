package Basic_Exception;

import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class Custom_checked_exception {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in );
        System.out.println("Enter your age: ");
        int age=s.nextInt();
        try {
            checkage(age);
        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }

    public static void checkage(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("Age is less than 18. Access denied.");
        }
    }
}
