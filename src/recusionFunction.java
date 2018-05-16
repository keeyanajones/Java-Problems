
/**
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

// Java program to find sum of array
// elements using recursion.
public class recusionFunction {
  static int my_array[] = {1, 2, 3, 4, 5}; 
  // Return sum of elements in array
  // using recursion.
  static int findSum(int A[], int N) {
    if (N <= 0)
      return 0;
    return (findSum(A, N - 1) + A[N - 1]);
  }
 
  // Driver method
  public static void main(String[] args) {
    System.out.println("The sum using "
            + "recursion is " 
            + findSum(my_array, my_array.length));
  }
}

