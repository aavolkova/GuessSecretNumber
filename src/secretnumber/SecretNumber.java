package secretnumber;

import java.util.Scanner;
import java.util.Random;

public class SecretNumber {

	public static void main(String[] args) {
		
		//Declare variables
		int secretNumber;
		int guessedNumber = 0;
		String response = "y";
		
		//Generate random number
		Random r = new Random();
		secretNumber = 1 + r.nextInt(10);
		System.out.println(secretNumber);
		
		
		//Create a scanner
		Scanner scan = new Scanner (System.in);
		
		while (response.equalsIgnoreCase("Y") && secretNumber != guessedNumber)
		{
			System.out.println("------------------------------------");
			System.out.print("Enter your number: ");
			
			guessedNumber = scan.nextInt();
		
			if(guessedNumber < secretNumber)
			{
				System.out.println("You guessed too low, try again? (Y/N)");
				scan.nextLine();
				response = scan.next();
				while(!(response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("N")))
				{
					System.out.println("Incorrect answer. You should answer (Y/N).");
					System.out.println("You guessed too low, try again? (Y/N)");
					response = scan.next();
				}
			}
			else if (guessedNumber > secretNumber)
			{
				System.out.println("You guessed too high, try again? (Y/N)");
				scan.nextLine();
				response = scan.next();
				while(!(response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("N")))
				{
					System.out.println("Incorrect answer. You should answer (Y/N).");
					System.out.println("You guessed too low, try again? (Y/N)");
					response = scan.next();
				}
			}
			
		}
		
		if(secretNumber == guessedNumber)
		{
			System.out.print("Your guess is correct! The secret number is " + secretNumber);
		}
		else
		{
			System.out.print("Your didn't guess the secret number. Exiting program.");
		}
	}

}

/*
Output Case 1:
------------------------------------
Enter your number: 99
You guessed too high, try again? (Y/N)
Y
------------------------------------
Enter your number: 88
You guessed too high, try again? (Y/N)
yes
Incorrect answer. You should answer (Y/N).
You guessed too low, try again? (Y/N)
y
------------------------------------
Enter your number: -100
You guessed too low, try again? (Y/N)
no
Incorrect answer. You should answer (Y/N).
You guessed too low, try again? (Y/N)
N
Your didn't guess the secret number. Exiting program.




Output Case 2:

*/
