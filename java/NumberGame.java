import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        
        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1; // generates a random number between 1 and 100
            int attempts = 0;
            int maxAttempts = 10;
            int guess = 0;
            boolean guessedCorrectly = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have selected a number between 1 and 100. Can you guess it?");
            System.out.println("You have " + maxAttempts + " attempts.");

            // Loop for the guessing attempts
            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess number: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    guessedCorrectly = true;
                    System.out.println("Congratulations! You've guessed the correct number.");
                }

                if (attempts == maxAttempts && !guessedCorrectly) {
                    System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNumber);
                }
            }

            System.out.println("You took " + attempts + " attempts.");
            
            // Ask if the player wants to play another round
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing the Number Guessing Game!");
        scanner.close();
    }
}