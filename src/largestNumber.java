
import java.util.*;
/**
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

// Java program to illustrate function 
// that prints a araaylist of numbers with
// the largest value

public class largestNumber { 
  // The function accepts a ArrayList of strings    
  static void printLargest(ArrayList<String> array){     
    Collections.sort(array, (String X, String Y) -> {
      // first append Y at the end of X
      String XY = X + Y;
            
      // then append X at the end of Y
      String YX = Y + X;
            
      // Now see which of the two formed numbers
      // is greater
      return XY.compareTo(YX) > 0 ? -1:1;
      } // A comparison function which is used by
      // sort() in printLargest()
    );
         
  Iterator it = array.iterator();
    
  System.out.print("The Largest Formed Number is : ");
    
  while(it.hasNext())
    System.out.print(it.next());     
  }
     
  // driver program
  public static void main (String[] args) {         
    ArrayList<String> array;
    array = new ArrayList<>();
       
    // the largest formed number should be 95021
    array.add("50");
    array.add("2");
    array.add("1");
    array.add("9");
    printLargest(array);        
  }
}
