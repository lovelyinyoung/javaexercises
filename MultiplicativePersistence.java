// Have the function MultiplicativePersistence(num) take the num parameter being passed 
// which will always be a positive integer and return its multiplicative persistence 
// which is the number of times you must multiply the digits in num until you reach a single digit. 

// For example: if num is 39 then your program should return 3 because 3 * 9 = 27 then 2 * 7 = 14
// and finally 1 * 4 = 4 and you stop at 4.

class MultiplicativePersistence {

  public static int function (int num) {
    int count = 0;
    if (String.valueOf(num).length() < 2) {
      return count;
    }

    int sum;
    do {
      sum = 1;
      for (int i = 0; i < String.valueOf(num).toCharArray().length; i++) {
        sum *= Integer.parseInt(String.valueOf(String.valueOf(num).toCharArray()[i]));
      }
      count++;
      num = sum;

      if (String.valueOf(sum).length() == 1) {
        return count;
      }
    } while (String.valueOf(sum).length() != 1);
      
    return count;
  }

  public static void main (String[] args) {  
    System.out.print(function (0)); 
  }
}