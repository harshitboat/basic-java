import java.util.Scanner;
public class armstrongNum {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = sc.nextInt();
		for(int i=1;i<num;i++) {
			if(isarmstrong(i)) {
				System.out.println(i);
			}
		}
		sc.close();
	}
	public static boolean isarmstrong(int num) {
		int originalnum = num;
		int sum = 0;
		int digits = String.valueOf(num).length();
		while(num>0) {
			int digit = num%10;
			sum = sum +(int )Math.pow(digit ,digits);
			num = num/10;
		}
		return sum == originalnum;
	}	

}
