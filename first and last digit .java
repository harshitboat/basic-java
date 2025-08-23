import java.util.Scanner;
public class firstAndLastDigit {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = sc.nextInt();
		int lastdigit = num%10;
		int firstdigit = num;
		while(firstdigit>=10) {
			firstdigit= firstdigit/10;
			
		}
		System.out.println("firstdigit: "+firstdigit);
		System.out.print("lastdigit: "+lastdigit);
		sc.close();
	}

}
