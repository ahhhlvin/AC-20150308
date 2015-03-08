package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/8/15.
 */

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = 10;
        while (x < 100) {   /*** boolean is what is within the parentheses after "while"  ***/
            System.out.println("the number is " + x);
            System.out.println("what's another number? ");
            x = input.nextInt();
        }

    }
}
