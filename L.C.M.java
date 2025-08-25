import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int a = num1;
        int b = num2;
        while(b!=0){
            int temp = b;
            b=a%b;
            a = temp;
        }
        int gcd = a;
        int lcm = (num1*num2)/gcd;
        System.out.println("lcm is  "+lcm);
        
    }
}
