import java.util.Scanner;
public class neon {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = sc.nextInt();
		int square = number*number;
		int sum = 0;
		while(square>0) {
			sum = sum + square%10;
			square = square/10;
		}
		if(number == sum) {
			System.out.println(number+" is a neon number.");
		}else {
			System.out.println(number+" is not a neon number.");
		}
		sc.close();
	}

}
