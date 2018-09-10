package arraysReview;
import java.awt.Color;
import java.util.*;

public class SimpleArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
      int num = 0;
      int[]  list = new int[10];
      int[] odds = {1,3,7,9,67,35,79};
      for(int i = 0; i < list.length; i++) {
          num += 1;
          list[i] = num;          
          System.out.println(list[i]);
      }
      System.out.println(odds[1]);
      Color[] palette = {
        Color.BLACK,
        Color.RED,
        Color.BLUE,
        new Color(0,180,45),
        Color.PINK,
        Color.DARK_GRAY,
        Color.ORANGE,
        Color.GREEN
      };
       // copying an array to another
      
      double[] b = new double[10];
      for (double i = 0; i < b.length; i++) {
          i += 1;
          System.out.println(i);
      }
      
      double[] c = new double[b.length];
      for(int i = 0; i < b.length; i++) {
          c[i] = b[i];
          System.out.println(i + 10);
      }
      double[] d = new double[c.length];
      System.arraycopy(b, 0, d, 0, b.length);
      System.out.println(d[1]);
      
      int sum = 1;
      for (double item : b) {
          if (item > 0) {
              sum = sum + 10;
          }
          
      }
      System.out.println(sum);

    }

}
