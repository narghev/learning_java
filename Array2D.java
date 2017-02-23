import java.util.*;
import java.text.*;

class Array2D{
  public static void print1D(int[] array1D){
    DecimalFormat twoDigits = new DecimalFormat(" 00");
    for (int i=0; i<array1D.length; i++)
      System.out.print(twoDigits.format(array1D[i]));
    System.out.println();
  }
  public static int sum1D(int[] array1D){
    int result = 0;
    for (int i=0; i<array1D.length; i++)
      result+=array1D[i];
    return result;
  }
  public static void print2D(int[][] array2D){
    for (int row = 0; row < array2D.length; row++){
      print1D(array2D[row]);
    }
    System.out.println();
  }
  public static void  main(String[] args){
    int test[] = {17, 2, 23};
    print1D(test);
    int[][] zeros = new int[3][5];
    print2D(zeros);
    int[][] ones = new int[3][5];
    for (int row = 0; row < zeros.length; row++){
      for (int column = 0; column < zeros[row].length; column++)
        ones[row][column] = 1;
    }
    print2D(ones);
    int[][] forward = new int[10][10];
    for (int row = 0; row < forward.length; row++){
      for (int column = 0; column < forward[row].length; column++)
        forward[row][column] = row * forward[row].length + column;
    }
    print2D(forward);
  }
}
