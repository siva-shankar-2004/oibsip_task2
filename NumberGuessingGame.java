import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int points = 0;
        int rounds = 1;
        Random random = new Random();
        System.out.println("Welcome to the Number Guessing Game!");
        while (true) {
            int DefinedGuessedNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("\nRound " + rounds + ":");

            while (attempts < 5) {
                System.out.print("Enter your guess (1-100): ");
                int userGuess = scan.nextInt();
                attempts++;

                if (userGuess == DefinedGuessedNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    points += (6 - attempts) * 10;  
                    guessed = true;
                    break;
                } else if (userGuess < DefinedGuessedNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessed) {
                System.out.println("Sorry! You ran out of attempts. The number was: " + DefinedGuessedNumber);
            }

            System.out.println("Score: " + points);
            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scan.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
            rounds++;
        }
        System.out.println("\nGame Over! Your final score is: " + points);
        scan.close();
    }
}
