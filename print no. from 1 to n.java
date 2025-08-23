import java.util.Scanner;

public class naturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n = sc.nextInt();

        int i = 1;
        System.out.println("Natural numbers from 1 to " + n + " are:");

        while (i <= n) {
            System.out.println(i + " ");
            i++;
        }

        sc.close();
    }
}
