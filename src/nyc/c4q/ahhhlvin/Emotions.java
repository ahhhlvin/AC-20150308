package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/8/15.
 */

import java.util.Scanner;

public class Emotions {
    public static void main(String[] args) {    /*** the FUNCTION is called "main" ***/


        // creating the object, Scanner
        Scanner input = new Scanner(System.in);

        // "initializing" or assigning variable
        /**** SHIFT + FN + F6 will rename all variables ****/
        String emoticon;

        System.out.println("How are you feeling today?");
        emoticon = input.next();


        // defining the variable
        if (emoticon.equals(":)")) {
            System.out.println("You are happy!");
        } else if (emoticon.equals(":(")) {
            System.out.println("You are sad...");
        } else if (emoticon.equals(":D")) {
            System.out.println("You are excited!!!!!");
        } else {                                         // need an ELSE statement for when users enter in something that does not follow any rules
            System.out.println("I don't understand that as an emoticon, sorry!");
            return;
        }


       /*************************************************************
        *
        * OR...BUT THE FIRST METHOD IS CLEANER + BETTER

        if (emoticon.equals(":)")) {
            emoticon = "happy";
        } else if (emoticon.equals(":(")) {
            emoticon = "sad";
        } else if (emoticon.equals(":D")) {
        System.out.println("You are excited!!!!!");

        System.out.println("You are feeling " + emoticon + ".");

        ***************************************************************/

    }
}
