public class ArrayStats{

  public static int sum(int array[]){
        int result= 0;
        for (int i=0; i<array.length; i++)
          result += array[i];
        return result;
  }

  public static int max(int array[]){
        int result=array[0];
        for (int i=1; i<array.length; i++)
          if (array[i] > result)
            result = array[i];
        return result;
  }

  public static int maxsum(int array[]){
    int result = array[0];
    int sum = result;
    for (int i=1; i<array.length; i++){
      sum = array[i] + sum < 0 ? 0 : sum;
      if (sum > result)
        result = sum;
    }
    return result;
  }

  public static void main(String args[]){
    int test[] = new int[10];
    for (int i=0; i<test.length; i++)
      test[i]=i;
    System.out.println(sum(test));
    System.out.println(max(test));
    test[1] = -test[1];
    test[4] = -test[4];
    System.out.println(maxsum(test));
  }
}
