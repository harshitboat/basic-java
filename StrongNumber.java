
 import java.util.Scanner;
 public class StrongNumber{
       public static void main(String[] args){
          Scanner sc = new Scanner (System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
       int temp=num;
       int Sum =0;
       while(temp!=0){
       int digit = temp%10;
       Sum = Sum + factorial(digit);
        temp=temp/10;
       }
       if(Sum == num){
       System.out.println("Strong number");
       }
       else{
       System.out.println("not a strong number");
        }
}
       
 public static int factorial(int n){
    int fact = 1;
for(int i=1;i<=n;i++){
  fact*=i;
}
return fact;
}
}
