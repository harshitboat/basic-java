import java.util.Scanner;

public class naturalnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Natural numbers from " + n + " to 1 :");

        while (n >= 1) {
            System.out.println(n + " ");
            n--;
        }

        sc.close();
    }
}
