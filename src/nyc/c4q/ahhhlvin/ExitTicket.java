package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/8/15.
 */

import java.util.Scanner;

public class ExitTicket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String response;
        boolean react = false;


        while (!react) {

            System.out.println("What should I do next? ");
            response = input.next();

            if (response.equals("exit") || response.equals("quit")) {
                break;
            } /*** for a while loop, an "IF" statement nested inside does not require "ELSE" ****/
        }







    }
}
