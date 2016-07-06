//Mauricio Calcaño 2016-07-06 / github.com/pharoxs
public class Kata {
  public static String HighAndLow(String numbers) {
    //Split String and store in array
    String split[] = numbers.split(" ");
    
    //Set min and max to first value
    int min = Integer.parseInt(split[0]);
    int max = Integer.parseInt(split[0]);
    
    //Loop through array - store min & max
    for(int i = 1; i < split.length; i++) {     
      if(min > Integer.parseInt(split[i])) {
        min = Integer.parseInt(split[i]);
      }
      if(max < Integer.parseInt(split[i])) {
        max = Integer.parseInt(split[i]);
      }
    }    
    
    return max + " " + min;
  }
}
