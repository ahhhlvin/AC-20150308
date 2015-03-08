package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/8/15.
 */

import java.util.Scanner;

public class Not {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int x = 10;

        // ! is called "bang" and will flip the result
        System.out.println(!(x > 5));
        System.out.println(!(x > 15));

        String s = "grapefruit";
        System.out.println(!s.equals("pineapple"));
        // grapefruit != pineapple --> "False" will BANG or FLIP into "True"


        String response = input.next();
        if (!response.equals("yes") || !response.equals("no"))
            System.err.println("please enter yes or no!");

        if (response.equals("yes") && response.equals("no"))
            System.err.println("please enter yes or no!");

    }
}
