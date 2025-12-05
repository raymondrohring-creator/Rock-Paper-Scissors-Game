package rockPaperScissorsGame;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {

		System.out.println("Welcome to the Rock, Paper, Scissors Game!");
		
		// User input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose your play...");
		System.out.println("0 => Rock");
		System.out.println("1 => Paper");
		System.out.println("2 => Scissors");
		int userChoice = scanner.nextInt();
		System.out.println(userChoice);
		
		// Validate User input - userChoice
		if (userChoice < 0 || userChoice > 2)
		{
			System.out.println("Invalid choice. Please run the program again and enter 0, 1, or 2.");
			return; // Exit the program
		}
		
		// Generate Computer's random choice between 0 and 2
		int computerChoice = new Random().nextInt(3); // It can generate random numbers between 0 and 2
		System.out.println(computerChoice);
		
		// Determine winner
		if (userChoice==computerChoice)
		{
			System.out.println("It's a tie!");
		}
		
		// User to win
		else if ((userChoice == 0 && computerChoice == 2) ||
				(userChoice == 1 && computerChoice == 0) ||
				(userChoice == 2 && computerChoice == 1))
		{
			System.out.println("You win; congratulations!");
		}
		
		else
		{
			System.out.println("Computer wins!");
		}

		scanner.close();

	}

}
