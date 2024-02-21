package com.coderscampus.Unit3;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		Random rand = new Random();
		int randomNumber = rand.nextInt(100) + 1;

		int counter = 0;
		int lowerGuess = 1;
		int upperGuess = 100;

		while (counter < 5) {

			if (counter == 0)
				System.out.println("Pick a number between 1 and 100");
			counter++;

			Scanner scanner = new Scanner(System.in);

			int guess = scanner.nextInt();
			{

				if (guess < lowerGuess || guess > upperGuess) {
					System.out.println("Invalid number, please try again ");
					counter--;
					
				} else if (randomNumber < guess) {
					System.out.println("Please pick a lower number");
				
				} else if (randomNumber > guess) {
					System.out.println("Please pick a higher number");

				} else if (guess == randomNumber) {
					System.out.println("You win! ");
					break;
					
				}
				if (counter == 5) {
					System.out.println("You have exceeded the number of guesses, GAME OVER! ");
					System.out.println("The number to guess was " + randomNumber);
					scanner.close();
				}
			

			}

		}
	}
}
