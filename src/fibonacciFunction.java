
/**
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

// Java program to illustrate fibonacci function 
// with recursion
public class fibonacciFunction {
  public static void main(String[] args) {
    int n, a = 0, b = 0, c = 1;
    
      System.out.print("Fibonacci Series:");
      
      for(int i = 1; i <= 100; i++) {
        a = b;
        b = c;
        c = a + b;
        
        System.out.print(a+" ");
    }
  }
}