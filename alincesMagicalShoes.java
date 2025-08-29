import java.util.Scanner;

public class alincesMagicalShoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter number of houses: ");
        int n = sc.nextInt();

        int[] A = new int[n];
        System.out.println("Enter number of stairs for each house:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Alice can reach roofs with stairs: ");
        boolean found = false;

        for (int stairs : A) {
            if (stairs % 3 == 0) {
                System.out.print(stairs + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("None");
        }
    }
}
