import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExample {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        // Example 1: Check age
        try {
            checkAge(16);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Example 2: Handle FileNotFoundException
        try {
            File file = new File("example.txt"); // File that doesn’t exist
            Scanner sc = new Scanner(file); // May throw FileNotFoundException
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found! Please check the file name or path.");
        }

        System.out.println("Program continues normally...");
    }
}
