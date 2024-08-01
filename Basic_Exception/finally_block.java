package Basic_Exception;

import java.util.Scanner;

public class finally_block {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();
        try{
            int result=100/num;
            System.out.println(result);
        }catch(Exception e){
            System.out.println(e.getMessage()+" Exception");

        }
        finally{
            System.out.println("Divison operation completed!");
        }
    }
}
