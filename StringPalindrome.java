import java.util.Scanner;
public class StringPalindrome{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String");
    String input = sc.nextLine();

    String cleaned = input.replaceAll("[^A-Za-z0-9]","").toLowerCase();
    String reversed= new StringBuilder(cleaned).reverse().toString();
    
    if(cleaned.equals(reversed)){
     System.out.println("it is palindrome");
   }else{
    System.out.println("it is not palindrome");
}
}
}
