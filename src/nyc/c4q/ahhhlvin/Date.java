package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/8/15.
 */
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {

        // object
        Scanner input = new Scanner(System.in);

        // initialize variables
        String month;
        int day;


        // begin program
        System.out.println("What is the month? ");
        month = input.next();

        System.out.println("What day in " + month + "? ");
        day = input.nextInt();

        if ( month.equalsIgnoreCase("January") && day == 1) {
            System.out.println("It is New Years Day!");
        } else if (month.equalsIgnoreCase("February") && day == 14) {
            System.out.println("It is Valentine's Day! <3");
        } else if (month.equalsIgnoreCase("April") && day == 1) {
            System.out.println("It isn't April Fools.... Just kidding it is!");
        } else if (day >= 32) {
            System.out.println("Sorry, that' is not a real day");
        } else {
            System.out.println("This isn't a special day");
        }


        if ( month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May") || month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August") || month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")) {
            /*** if the month is MARCH, then a more specific condition for that month will apply ***/
            if (month.equalsIgnoreCase("March") && day >= 8 && day <= 31) {
                System.out.println("and today counts as daylight savings!");
            }
            /*** the statement below applies to the first "if" statement for months other than March ***/
            else if (day >= 1 && day <= 31) {
                System.out.println("and today counts as daylight savings!");
                /*** this ELSE statement below applies if day is between 3/1 - 3/7 ***/
            } else {
                System.out.println("and today is not a daylight savings day!");
            }
        } else {
            System.out.println("and today is not a daylight savings day!");
        }




    }
}
