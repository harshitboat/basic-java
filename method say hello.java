import java.util.Scanner;
public class Greeting {
	public void sayHello(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java programming.");
    }
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your name: ");
		String name =sc.nextLine();
		
		Greeting g = new Greeting();
		g.sayHello(name);
	}

}
