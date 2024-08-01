package Basic_Exception;

public class Exception_hierarchy {
    public static void main(String[] args) {
        try{
            int a=10/0;
            String str=null;
            System.out.println(str.length());
        }catch(ArithmeticException e){
            System.out.println("error: Division by zero not allowed!");
        }catch(NullPointerException e){
            System.out.println("error: cannot access a null object");
        }catch(Exception e){
            System.out.println("error: an unexpected error occurred");
        }
    }
}
