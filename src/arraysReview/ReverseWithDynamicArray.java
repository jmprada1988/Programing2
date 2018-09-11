package arraysReview;
import java.util.*;

public class ReverseWithDynamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DynamicArrayOfInt
        numbers;  // To hold the input numbers.
        int numCount;  // The number of numbers stored in the array.
        int num;    // One of the numbers input by the user.
        numbers = new DynamicArrayOfInt();
        numCount = 0;
        System.out.println("Enter some positive integers; Enter 0 to end");
                while (true) {  // Get numbers and put them in the dynamic array
                    System.out.println("? ");
                    num = scanner.nextInt();
                    if (num <= 0)
                        break;
                    numbers.put(numCount, num);
                    // Store num in the dynamic array.
                    numCount++;
                }
                System.out.println("\nYour numbers in reverse order are:\n");
                for (int i = numCount - 1; i >= 0; i--) {
                    System.out.println(
                            numbers.get(i)
                            );  // Print the i-th number.
                }
    } // end main();
}  // end class ReverseWithDynamicArray