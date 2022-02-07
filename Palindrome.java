// Have the function Palindrome(str) take the str parameter being passed and 
// return the string true if the parameter is a palindrome, 
// (the string is the same forward as it is backward) 
// otherwise return the string false. 

// For example: "racecar" is also "racecar" backwards. 
// Punctuation and numbers will not be part of the string.

class Palindrome {
  public static String function (String str) {
    StringBuilder builder = new StringBuilder(str.replaceAll("\\s", ""));
    builder.reverse();
    return builder.toString().equals(str.replaceAll("\\s", "")) ? "true" : "false";
  }

  public static void main (String[] args) {  
    System.out.print(function("racecar")); 
  }
}