package arraysReview;

public class AverageNumber {
    public static double average(double ... numbers) {
        double sum;
        double average;
        sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        average = sum / numbers.length;
        return average;
        
    }

}
