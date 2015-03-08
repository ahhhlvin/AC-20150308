package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/8/15.
 */

import java.util.Scanner;

public class MMs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int MMs = 100;
        int eatMMs;


        System.out.println(MMs + " M&Ms left");

        while (MMs > 0) {
            System.out.println("eat how many? ");
            eatMMs = input.nextInt();

            MMs = MMs - eatMMs;

            if (eatMMs < MMs) {
                System.out.println(MMs + " M&Ms left");
            } else if (eatMMs < 0) {
                System.out.println("You can't eat a negative amount of M&M!");
            } else {
                System.out.println("You don't have that many M&Ms to eat!");
            }


        }

    }
}
