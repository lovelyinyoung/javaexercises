// Have the function NumberStream(str) take the str parameter being passed 
// which will contain the numbers 2 through 9, and determine if there is a consecutive stream 
// of digits of at least N length where N is the actual digit value. 

// If so, return the string true, otherwise return the string false. 
// For example: if str is "6539923335" then your program should return 
// the string true because there is a consecutive stream of 3's of length 3. 
// The input string will always contain at least one digit.


class NumberStream {

  public static String function (String str) {
    for (int i = 0; i < str.length(); i++) {
      int num = Character.getNumericValue(str.charAt(i));
      String repeated = String.valueOf(str.charAt(i)).repeat(num);
      if (i + num <= str.length() && repeated.equals(str.substring(i, i + num))) {
        return "true";
      }
    }
    return "false";
  }

  public static void main (String[] args) {  
    System.out.print(function("6539923335")); 
  }
}