package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/8/15.
 */

import java.util.Scanner;

public class GuessProfession {
    public static void main(String[] args) {

        String sword;
        String helmet;
        String shovel;

        Scanner input = new Scanner(System.in);

        System.out.println("Do you carry a sword? (y/n)");
        sword = input.next();

        System.out.println("Do you wear a helmet? (y/n)");
        helmet = input.next();

        System.out.println("Do you use a shovel? (y/n)");
        shovel = input.next();

        if (sword.equalsIgnoreCase("y") && helmet.equalsIgnoreCase("y") && shovel.equalsIgnoreCase("n")) {
            System.out.println("Your profession is Samurai");
        } else if (sword.equalsIgnoreCase("y") && helmet.equalsIgnoreCase("n") && shovel.equalsIgnoreCase("n")) {
            System.out.println("Your profession is Ninja");
        } else if (sword.equalsIgnoreCase("n") && helmet.equalsIgnoreCase("y") && shovel.equalsIgnoreCase("y")) {
            System.out.println("Your profession is a Construction Worker");
        } else if (sword.equalsIgnoreCase("n") && helmet.equalsIgnoreCase("n") && shovel.equalsIgnoreCase("y")) {
            System.out.println("Your profession is a Gardener");
        } else if (sword.equalsIgnoreCase("n") && helmet.equalsIgnoreCase("y") && shovel.equalsIgnoreCase("n")) {
            System.out.println("Your profession is an Astronaut");
        } else if (sword.equalsIgnoreCase("n") && helmet.equalsIgnoreCase("n") && shovel.equalsIgnoreCase("n")) {
            System.out.println("Your profession is a Coder");
        } else if (sword.equalsIgnoreCase("y") && helmet.equalsIgnoreCase("n") && shovel.equalsIgnoreCase("y")) {
            System.out.println("Your profession is a Badass Post-Apocalyptic Lumberjack");
        }


        /****
         *
         * ALSO CAN BE DONE WITH BOOLEAN VARIABLES...
         *
         *
         *
         * System.out.print("Do you carry a sword? ");
         * String input = scanner.next();
         * boolean sword =
         *  input.equalsIgnoreCase("yes")
         *
         *     " SCANNER_NAME.equals " == TRUE BOOLEAN
         *
         * System.out.print("Do you wear a helmet? ");
         * input = scanner.next();    <-- "removing string will allow "String input" to be reused!
         * boolean sword =
         *  input.equalsIgnoreCase("yes")
         *
         *
         * String profession;
         * if (sword && helmet && !shovel)
         *      profession = "samurai";
         * else if (sword && !helmet && !shovel)
         *      profession = "ninja";
         *  ...
         *
         *****/


        //
        //
        //
        //
        //


        int x = 5;
        int y = 10;
        boolean number;


        if (x == y) {
            number = false;
        } else /* x != y OR "not true" */ {
            number = true;
        }

        System.out.println("5 = 10 is " + (x != y));
        System.out.println("5 = 10 is " + number);
    }
}
