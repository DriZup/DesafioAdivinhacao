package GuessingChallenge;

import java.util.Random;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    int points = 0;
    int guess;

        System.out.println("Enter a number: ");
    guess = sc.nextInt();

    int randomNumber = random.nextInt(10) + 1;

        if (guess == randomNumber) {
        points += 10;
        System.out.println("You guessed correctly! You earned 10 points.");
    } else if (guess == randomNumber + 1) {
        points += 5;
        System.out.println("So close! You were 1 unit away. You earned 5 points.");
    } else {
        System.out.println("You did not guess correctly! The number you entered is: " + guess + " and you have: " + points + " points.");
    }

        System.out.println("The random number was: " + randomNumber);
        System.out.println("Your total points: " + points);

        sc.close();
}
}
