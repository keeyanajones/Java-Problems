
/**
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

// Java program to illustrate while loop
public class whileLoopFunction {    
  public static void main(String[] args) {      
    int my_array[] = {1, 2, 3, 4, 5};
    int sum = 0;
    int limit = my_array.length;
    int i = 1;

    while (i <= limit) {
      sum += i++;
    }      
      System.out.println("The sum using a while loop is " + sum);
  }
}


    
    
    
    

