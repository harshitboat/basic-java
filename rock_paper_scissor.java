import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter your choice: Rock, Paper, or Scissors");
        String userChoice = sc.next().toLowerCase(); 

        int compChoice = rand.nextInt(3) + 1;
        String compMove = "";

        switch (compChoice) {
            case 1: compMove = "rock"; break;
            case 2: compMove = "paper"; break;
            case 3: compMove = "scissors"; break;
        }

        System.out.println("You chose: " + userChoice);
        System.out.println("Computer chose: " + compMove);

        switch (userChoice) {
            case "rock":
                switch (compMove) {
                    case "rock":
                        System.out.println("Result: Draw! Both chose Rock");
                        break;
                    case "paper":
                        System.out.println("Result: You Lose! Paper covers Rock");
                        break;
                    case "scissors":
                        System.out.println("Result: You Win! Rock breaks Scissors");
                        break;
                }
                break;

            case "paper":
                switch (compMove) {
                    case "rock":
                        System.out.println("Result: You Win! Paper covers Rock");
                        break;
                    case "paper":
                        System.out.println("Result: Draw! Both chose Paper");
                        break;
                    case "scissors":
                        System.out.println("Result: You Lose! Scissors cut Paper");
                        break;
                }
                break;

            case "scissors":
                switch (compMove) {
                    case "rock":
                        System.out.println("Result: You Lose! Rock breaks Scissors");
                        break;
                    case "paper":
                        System.out.println("Result: You Win! Scissors cut Paper");
                        break;
                    case "scissors":
                        System.out.println("Result: Draw! Both chose Scissors");
                        break;
                }
                break;

            default:
                System.out.println("Invalid choice! Please type Rock, Paper, or Scissors.");
        }

        sc.close();
    }
}
