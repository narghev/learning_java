public class ArrayTransforms{

  public static void print (int array[]){
    for (int i = 0; i<array.length; i++)
      System.out.print(array[i]+" ");
    System.out.println();
  }

  public static void reverse(int array[]){
    for (int left=0, right = array.length - 1; left<right; left++, right--){
      array[left] += array[right];
      array[right] = array[left] - array[right];
      array[left] -= array[right];
    }
  }

  public static void reverse(int array[], int from, int to){
    for (int left=from, right = to; left<right; left++, right--){
      array[left] += array[right];
      array[right] = array[left] - array[right];
      array[left] -= array[right];
    }
  }

  public static void shift(int array[], int offset){
    reverse(array, 0, offset-1);
    reverse(array, offset, array.length-1);
    reverse(array);
  }

  public static void main(String args[]){
    int test[] = new int[10];
    for (int i=0; i<test.length; i++)
      test[i]=i;
    reverse(test);
    print(test);
    reverse(test);
    shift(test, 2);
    print(test);
  }
}
