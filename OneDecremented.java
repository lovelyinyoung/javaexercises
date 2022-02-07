// Have the function OneDecremented(str) count how many times a digit appears that 
// is exactly one less than the previous digit. 

// For example: if str is "5655984" then your program should return 2 
// because 5 appears directly after 6 and 8 appears directly after 9.
// The input will always contain at least 1 digit.

class OneDecremented {

  public static String function (String str) {
    char[] chars = str.toCharArray();
    int count = 0;

    for (int i = 0; i < chars.length - 1; i++) {
      if ((Character.getNumericValue(chars[i]) - 
           Character.getNumericValue(chars[i+1])) == 1) {
        count++;
      }
    }
    return String.valueOf(count);
  }

  public static void main (String[] args) {  
    System.out.print(function ("45")); 
  }
}