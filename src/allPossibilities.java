 
import java.util.*;

/**
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

// Java program to illustrate function 
// that prints all possibilities to 
// put + or - or nothing between the 
// numbers 1, 2, ..., 9 (in this order) 
// such that the result is always 100. 
public class allPossibilities {
  private static final int TARGET = 100;
  private static final int[] VALUES = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

  static ArrayList add(int digit, String sign, ArrayList branches) {
    for (int i = 0; i < branches.size(); i++) {
      branches.set(i, digit + sign + branches.get(i));
    }
    return branches;
  }

  static ArrayList f(int sum, int number, int index) {
    int digit = Math.abs(number % 10);
    if (index >= VALUES.length) {
      if (sum == number) {
        ArrayList result = new ArrayList();
        result.add(Integer.toString(digit));
        return result;
      }
      else {
          return new ArrayList();
        }
      }

      ArrayList branch1 = f(sum - number,  VALUES[index], index + 1);
      ArrayList branch2 = f(sum - number, -VALUES[index], index + 1);

      int concatenatedNumber = number >= 0
        ? 10 * number + VALUES[index]
        : 10 * number - VALUES[index];
      ArrayList branch3 = f(sum, concatenatedNumber, index + 1);

      ArrayList results = new ArrayList();

      results.addAll(add(digit, " + ", branch1));
      results.addAll(add(digit, " - ", branch2));
      results.addAll(add(digit, "",    branch3));

      return results;
  }

  public static void main(String[] args) {
    f(TARGET, VALUES[0], 1).forEach((string) -> {
      System.out.println(string + " = 100" );
    });
  }
}
