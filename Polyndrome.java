import java.util.*;
public class Polyndrome{
  public static String reverse(String s){
    int l = s.length();
    StringBuilder result = new StringBuilder(l);
    for (int i=l-1; i>=0; i--){
      result.append(s.charAt(i));
    }
    return result.toString();
  }
  public static void main(String args[]){
    Scanner input = new Scanner (System.in);
    String strings[] = new String[input.nextInt()];
    String pols[] = new String[strings.length];
    for (int i=0; i<strings.length; i++)
      strings[i]=(input.next());
    for (int i=0; i<strings.length; i++){
        if (strings[i].equals(reverse(strings[i]))){
          pols[i]=strings[i];
        }
    }
    for (int i=0; i<pols.length; i++){
      if (pols[i]!=null)
        System.out.println(pols[i]);
    }
  }
}
