package number_game_task;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random randomNumber = new Random();
		int minRange = 1;
		int maxRange = 100;
		int numberGenerated = randomNumber.nextInt(maxRange - minRange + 1) + minRange;

		boolean guessedCorrectly = false;
		int numberOfAttempts = 0;

		System.out.println("Welcome to the number game !");
		System.out.println("\nLets Begin !! \n\nGuess the number between " + minRange + " and " + maxRange);

		do {
			System.out.print("\nEnter your guess: "); // Ask user to enter the guess.
			int numberGuessedByUser = sc.nextInt();

			if (numberGuessedByUser == numberGenerated) { // comparing number guessed by user with generated number.
				guessedCorrectly = true;
			} else if (numberGuessedByUser < numberGenerated) {
				System.out.println("Too low! Please Try again.");
			} else {
				System.out.println("Too high! Please Try again.");
			}

			numberOfAttempts++;

		} while (!guessedCorrectly);

		System.out.println("Congratulations! You guessed the number " + numberGenerated + " correctly in "
				+ numberOfAttempts + " attempts. Thankyou for playing the game.");

		sc.close();
	}
}
