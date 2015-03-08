package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/8/15.
 */

import java.util.Scanner;

public class OrConditions {
    public static void main(String[] args) {

        /*
        System.out.println("true  || true  = " + (true || true));
        System.out.println("true  || false = " + (true || false));
        System.out.println("false || true  = " + (false || true));
        System.out.println("false || false = " + (false || false));
*/
        Scanner input = new Scanner(System.in);

        String day;



        System.out.println("What day is it today? ");
        day = input.next();

        // while if day input is NOT EQUAL to an actual day of the week, then you will loop back to the beginning prompt!
        while ( !day.equals("monday") && !day.equals("tuesday") && !day.equals("wednesday") && !day.equals          ("thursday") && !day.equals("friday") && !day.equals("saturday") && !day.equals("sunday")) {

            System.out.println("What day is it today? ");
            day = input.next();

        }

            if (day.equalsIgnoreCase("monday")
                    || (day.equalsIgnoreCase("tuesday"))
                    || (day.equalsIgnoreCase("wednesday"))
                    || (day.equalsIgnoreCase("thursday"))
                    || (day.equalsIgnoreCase("friday"))) {
                System.out.println("Today is a weekday!");
            } else {
                System.out.println("Today is a weekend!");
            }




        /****

         System.out.println("What day is it today? ");
         day = input.next();


         if (day.equalsIgnoreCase("monday")
         || (day.equalsIgnoreCase("tuesday"))
         || (day.equalsIgnoreCase("wednesday"))
         || (day.equalsIgnoreCase("thursday"))
         || (day.equalsIgnoreCase("friday"))) {
             System.out.println("Today is a weekday!");
         } else (day.equalsIgnoreCase("saturday")
         || (day.equalsIgnoreCase("sunday")) {
            System.out.println("Today is a weekend!");
        }  else if {
                System.err.println("What planet are you from??");
            }


         ****/




        /****
            "^" true ^ true = false
               true ^ false = true
               false ^ true = true
               false ^ false = false
         ****/


    }
}
