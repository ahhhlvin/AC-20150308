package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/8/15.
 */

import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String color;
        String flavor;

        System.out.println("Please list a fruit!");
        String fruit = input.next();


        if (fruit.equals("banana")) {
            /* code block of assignments for "color" & "flavor" */
            color = "yellow";
            flavor = "sweet";
        }
        else if (fruit.equals("grapefruit")) {
            color = "pink";
            flavor = "bitter";
        }
        else if (fruit.equals("lemon")) {
            color = "yellow";
            flavor = "sour";
        }
        else if (fruit.equals("orange")) {
            color = "orange";
            flavor = "tangy";
        }
        else {
            /* a statement */
            System.out.println("I don't know that fruit.");
            return; /*** if you don't initialize the variables: fruit, color, and flavor listed at the top so Java can run ***/
        }


        System.out.println("a " + fruit + " is " + color + " and tastes " + flavor);

    }
}
