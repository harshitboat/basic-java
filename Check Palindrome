import java.util.Scanner;
public class Palindrome {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your number:");
	int number = sc.nextInt();
	int temp = number;
	int rev = 0;
	while(number>0) {
		int n = number%10;
		rev = rev*10+n;
		number = number/10;
	}
	if(temp == rev) {
		System.out.print(temp+" is a palindrome.");
	}else {
		System.out.println(temp+" is a palindrome.");
	}
	sc.close();
}

}
