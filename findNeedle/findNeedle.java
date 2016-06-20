//Mauricio Calcaño 2016-06-20 / github.com/pharoxs
public class Kata {
  public static String findNeedle(Object[] haystack) {              
    int index = 0;
    //go through array
    for(Object o : haystack) {
      //ignore nulls
      if(o != null) {
        //Compare only String-type objects
        if(o.getClass().equals(String.class)) {        
          if(o.equals("needle")) {          
            return ("found the needle at position " + index);
          }
        }
      }
      index++;
    }       
    return "Not found";
  }
}
