
/**
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

// Java program to illustrate fibonacci function 
// without recursion
public class fibonacci0Function {
  public static void main(String[] args) {
    int a = 0, b = 1, n, i, count = 100;
    
      System.out.print("Fibonacci Series:");
      System.out.print(a+" "+b);
      
       for(i = 2; i < count; ++i){
        n = a + b;    
        
        System.out.print(" "+n);    
        a = b;    
        b = n;    
    }
  }
}

  