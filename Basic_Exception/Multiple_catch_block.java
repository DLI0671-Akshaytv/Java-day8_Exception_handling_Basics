package Basic_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiple_catch_block {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("Enter first number: ");
            int first=s.nextInt();
            System.out.println("Enter second number: ");
            int second=s.nextInt();
            int result = first / second;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integer values.");
        }
    }
}
