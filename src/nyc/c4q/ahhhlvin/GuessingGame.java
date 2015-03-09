package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/8/15.
 */

import java.util.Scanner;
import java.util.Random;


public class GuessingGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();


        int number = random.nextInt(10) + 1;  // picks random # between 0-9 and then + 1; WILL NEVER BE "0"
        int guess;
        boolean done = false;



        while (!done) {

            System.out.println("Please enter a number between 1 and 10: ");
            guess = input.nextInt();     // waiting for next Int input by user, and then assigns that value to "guess" variable

            if (guess > 10 || guess < 1) {
                System.out.println("That is not a number between the desired range, try again: ");
            } else if (guess < number && guess <= 10) {
                System.out.println("That number is too low! ");
            } else if (guess > number && guess <= 10) {
                System.out.println("That number is too high! ");
            } else {
                System.out.println("You are correct, hooray!! :)");
                done = true;            // same as entering "break;" to break out of the "while (!done)" loop, so wo't be prompted to please enter number
            }


        }


    }
}
