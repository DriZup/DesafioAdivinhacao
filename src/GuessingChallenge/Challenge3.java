package GuessingChallenge;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        boolean playagain = true;
        int totalpoints = 0;

        System.out.println("Choose a difficulty level: Easy, Medium, Hard");
        String difficulty = sc.next().toLowerCase();
        int maxNumber = switch (difficulty) {
            case "easy" -> 10;
            case "medium" -> 50;
            case "hard" -> 100;
            default -> 10;
        };

        while (playagain) {

            int points = 0;
            int guess;

            System.out.println("Enter a number between 1 and 10: ");
            guess = sc.nextInt();

            int randomNumber = random.nextInt(maxNumber) + 1;

            while (randomNumber != guess) {
                if (guess == randomNumber + 1 || guess == randomNumber - 1) {

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

            totalpoints += points;

            System.out.println("Do you want to play again: yes/no");
            String response = sc.next().toLowerCase(Locale.ROOT);

            if (!response.equals("yes")) {
                playagain = false;
                System.out.println("Goodbye!");
            }
            System.out.println("The random number was: " + randomNumber);
            System.out.println("Your total points: " + totalpoints);
        }

        sc.close();
    }

}