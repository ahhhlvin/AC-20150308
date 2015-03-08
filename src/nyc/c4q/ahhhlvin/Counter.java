package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/8/15.
 */
public class Counter {
    public static void main(String[] args) {

        int count = 100;
        while (count > 10) {
            System.out.println(count);
            count = count - 5; // can also be written in a different syntax: count -= 5
        }

        while (count > 0) {
            System.out.println(count);
            count = count - 1;
        }

        if (count == 0) {
            System.out.println("Blastoff!");
        }

        //
        //
        //
        //

        int number = 0;
        while (true) {
            System.out.println(count);
            number += 1;
            if (number > 10)
                break;
        }







    }
}
