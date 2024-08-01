package Basic_Exception;
import java.util.*;
class NegativeNumberException extends RuntimeException{
    public NegativeNumberException(String message){
        super(message);
    }
}
public class Custom_unchecked_exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        try {
            checkNumber(number);
            System.out.println("You entered a positive number.");
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkNumber(int number) throws NegativeNumberException {
        if(number<0){
            throw new NegativeNumberException("Error: Negative number entered. Please enter a positive number.");
        }

    }
}
