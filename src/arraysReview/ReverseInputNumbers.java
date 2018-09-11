package arraysReview;
import java.util.*;
public class ReverseInputNumbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner scanner = new Scanner(System.in);
        int [] numbers;
        int numCount;
        int num;
        
        numbers = new int[100];
        
        numCount = 0;
        System.out.println("Enter up to 100 positive numbers, enter 0 to end");
        while(true) {
            System.out.println("?");
            num = scanner.nextInt();
            if (num <= 0) 
                break;
            numbers[numCount] = num;
            numCount++;
        }
        System.out.println("\nYour numbers in reverse order are: \n");
        for(int i = numCount-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

    }

}
