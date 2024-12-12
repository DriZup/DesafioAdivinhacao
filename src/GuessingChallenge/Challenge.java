package GuessingChallenge;

import java.util.Random;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int points = 0;
        int guess;

        System.out.println("Enter a number between 1 and 10: ");
        guess = sc.nextInt();

        int randomNumber = random.nextInt(10) + 1;

        while (randomNumber != guess) {
            if (guess == randomNumber + 1) {
                points += 5;
                System.out.println("So close! You were 1 unit away. You earned 5 points.");
            } else {
                System.out.println("Incorrect guess! You entered: " + guess + " and you have: " + points + " points.");
            }
            System.out.println("Try again! Enter a number between 1 and 10: ");
            guess = sc.nextInt();
        }
        points += 10;
        System.out.println("Congratulations! You guessed correctly. You earned 10 points.");


        System.out.println("The random number was: " + randomNumber);
        System.out.println("Your total points: " + points);

        sc.close();
    }
}
