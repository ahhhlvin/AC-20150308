package nyc.c4q.ahhhlvin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your score? ");

        int score = scanner.nextInt();

        if (score == 100)
                System.out.println("Perfect score!");
            else if (score >= 90)
                System.out.println("Great!");
            else if (score >= 75)
                System.out.println("Not bad!");
            else if (score >= 60)
                System.out.println("You passed.");
            else /* if (true) <-- same thing as "else" */
                System.out.println("you failed. :(");

        System.out.println("We're done!");
    }
}
