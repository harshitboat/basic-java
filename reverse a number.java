import java.util.Scanner;
public class reverseNumber {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your number:");
	int number = sc.nextInt();
	int rev = 0;
	while(number>0) {
		int n = number%10;
		rev = rev*10+n;
		number = number/10;
	
	}
	System.out.print(rev);
	sc.close();
}

}
