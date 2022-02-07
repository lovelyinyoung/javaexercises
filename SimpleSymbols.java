// Have the function SimpleSymbols(str) take the str parameter being passed and determine
// if it is an acceptable sequence by either returning the string true or false.
// The str parameter will be composed of + and = symbols with several characters 
// between them (ie. ++d+===+c++==a) and 
// for the string to be true each letter must be surrounded by a + symbol. 
// So the string to the left would be false. 
// The string will not be empty and will have at least one letter.

import java.util.regex.*;

class SimpleSymbols {

  public static String function (String str) {
    for (int i = 0; i < str.toCharArray().length; i++) {
      if(Pattern.compile("[a-zA-Z]")
         .matcher(String.valueOf(str.toCharArray()[i])).matches() && 
        (i == 0 || i == str.toCharArray().length || 
        str.toCharArray()[i-1] != '+' || str.toCharArray()[i+1] != '+')) {
        return "false";
      }  
    }
    return "true";
  }

  public static void main (String[] args) {  
    System.out.print(function ("+d+")); 
  }
}