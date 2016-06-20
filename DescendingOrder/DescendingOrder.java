//Mauricio Calcaño 2016-06-19
public class DescendingOrder {
  public static int sortDesc(int num) {
    //Very self-explanatory 
    int result = 0;
    int numLength = String.valueOf(num).length();  
    int tempResult[] = fillArray(num, numLength);
    
    //Order the array
    for(int i = 0; i < numLength; i++) {
      for(int j = i+1; j < numLength; j++) {
        if(tempResult[j] < tempResult[i]) {
          int temp = tempResult[j];
          tempResult[j] = tempResult[i];
          tempResult[i] = temp;
        }   //EndIF
      }  //EndFor
    }  //EndFor
    
    //Fill the result with the numbers in array
    for(int i = 0; i < numLength; i++) {
      result += tempResult[i] * (int)Math.pow(10,i);
    }
    
    return result;
  }

  //Function for filling the array with the number passed
  private static int[] fillArray(int num, int numLength) {
    int arr[] = new int[numLength];
    for(int i = 0; i < numLength; i++) {
      arr[i] = num % 10;
      num = num / 10;
      System.out.println(i + ": " + arr[i]);
    }
    return arr;
  }
}