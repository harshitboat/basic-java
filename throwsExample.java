import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class throwsExample {

    
    static void readFile() throws FileNotFoundException {
        File file = new File("data.txt"); 
        Scanner sc = new Scanner(file);   

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

    public static void main(String[] args) {
        try {
           
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found! Please check the file path.");
        }

        System.out.println("Program continues normally...");
    }
}
