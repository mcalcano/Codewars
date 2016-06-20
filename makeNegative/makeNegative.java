//Mauricio Calcaño 2016-06-19 / Pharoxs
public class Kata {

  public static int makeNegative(final int x) {
    int result = x;
    
    if(result > 0) {
      result = result * (-1);
    }
    
    return result;
  }
}