import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
 {

    public static void main(String[] args)
   {
        Scanner scanner = new Scanner(System.in);
        int minNumber = 1; 
        int maxNumber = 100;
        int numberOfAttempts = 5; 

        Random random = new Random();
        int targetNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;

        int guessCount = 0;
        int userGuess;

        while (guessCount < numberOfAttempts)
        {
            System.out.println("Guess a number between " + minNumber + " and " + maxNumber + ": ");
            userGuess = scanner.nextInt();

            if (userGuess == targetNumber)
            {
                System.out.println("Congratulations! You guessed the number in " + (guessCount + 1) + " attempts.");
                break;
            } 
            else if (userGuess < targetNumber) 
            {
                System.out.println("Your guess is too low. Try again!");
            } else
            {
                System.out.println("Your guess is too high. Try again!");
            }
            guessCount++;
        }

        if (guessCount == numberOfAttempts)
        {
            System.out.println("Sorry, you ran out of attempts. The number was: " + targetNumber);
        }

        scanner.close();
    }
}
