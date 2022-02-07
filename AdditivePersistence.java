// Have the function AdditivePersistence(num) take the num parameter being passed
// which will always be a positive integer and return its additive persistence 
// which is the number of times you must add the digits in num until you reach a single digit.

// For example: if num is 2718 then your program should return 2 
// because 2 + 7 + 1 + 8 = 18 and 1 + 8 = 9 and you stop at 9.


class AdditivePersistence {

   /** improved code by using recursion */
   static int count = 0;
   public static int function (int num) {
     if (String.valueOf(num).length() == 1) {
       return count;
     }
 
     int sum = 0;
     for (char c : Integer.toString(num).toCharArray()) {
       sum += Integer.parseInt(String.valueOf(c));
     }
     count++;
     return function(sum);
   }

  // public static int function (int num) {
  //   int count = 0;
  //   if (String.valueOf(num).length() < 2) {
  //     return count;
  //   }

  //   int sum;
  //   do {
  //     sum = 0;
  //     for (int i = 0; i < String.valueOf(num).toCharArray().length; i++) {
  //       sum += Integer.parseInt(String.valueOf(String.valueOf(num).toCharArray()[i]));
  //     }
  //     count++;
  //     num = sum;

  //     if (String.valueOf(sum).length() == 1) {
  //       return count;
  //     }
  //   } while (String.valueOf(sum).length() != 1);
      
  //   return count;
  // }

  public static void main (String[] args) {  
    System.out.print(function (433)); 
  }
}