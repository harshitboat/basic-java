import java.io.FileNotFoundException;

public class ArithmeticExample {
    public static void main(String[] args) {
      try {
        int a = 10;
        int b = 0;
        int result = a / b; 
        System.out.println("Result: " + result);
      
      }catch (ArithmeticException e) {
        System.out.println("Arithmetic Exception occurred: "+ e.getMessage());
      }catch (Exception e) {
        System.out.println("Some other Exception occurred: " + e.getMessage());
      }
       finally {
        System.out.println("Execution completed.");
      }
    }
    
}
