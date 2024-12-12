import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();


        int randomNumber = random.nextInt(10) + 1;

        System.out.println(" O  numero sorteado e: " + randomNumber);

    }
}