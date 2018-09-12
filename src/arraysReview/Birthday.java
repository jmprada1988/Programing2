package arraysReview;
import java.util.*;
/**
 * Simulate choosing people at random and checking if the day of the year they were 
 * born on. if the birthday was the same as a person previewsly seen stops and outputs of the 
 * person who was checked 
 * @return a boolean 
 *
 */

public class Birthday {

    /**
     *  How many random people do you have to select before you find
     *  a duplicate birthday (that is, two peole who were born on the
     *  same day of the same month, but not necessarily in the same
     *  year).  This program simulates the process.  (It ignores the
     *  possibility of people born on leap day.)
     */

    public static class BirthdayProblemDemo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); 
            System.out.println("This program simulates taking people at random");
            System.out.println("until two have been found who were born on the");
            System.out.println("same day of the year.\n");

            do {
                birthdayProblem();
                System.out.println("\nAgain? (Y/N):  ");
            } while ( scanner.nextBoolean() );

            System.out.println("\n\nOK.  Goodbye.");

        } // end main()


        private static void  birthdayProblem() {
            boolean[] used;
            int count;
            used = new boolean[365];

            count = 0;
            while(true) {
                int birthday;
                birthday = (int)(Math.random()* 365);
                count++;
                if (used[birthday])
                    break;
                used[birthday] = true;
            }
            System.out.println("Aduplicate was found after " + count + " tries.");
        }
    }
