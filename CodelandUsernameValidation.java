// Have the function CodelandUsernameValidation(str) take the str parameter being passed and determine 
// if the string is a valid username according to the following rules:

// 1. The username is between 4 and 25 characters.
// 2. It must start with a letter.
// 3. It can only contain letters, numbers, and the underscore character.
// 4. It cannot end with an underscore character.

// If the username is valid then your program should return the string true, otherwise return the string false.

import java.util.regex.Pattern;  

class CodelandUsernameValidation {

  public static String function (String str) {
    boolean isLengthCorrect = false;

    // Option 1
    if (str.length() >= 4 && str.length() <= 25) {
      isLengthCorrect = true;
    }
    // System.out.println("isLengthCorrect:" + isLengthCorrect);
     
    // Option 2
    String regex = "[a-zA-Z]+[a-zA-Z0-9_]+[^_]";

    boolean isMatched = (Pattern.matches(regex, str));
    // System.out.println("isMatched:" + isMatched);
    System.out.println(String.valueOf(isLengthCorrect 
        && isMatched));

    return str;
  }

  public static void main (String[] args) {  
    System.out.print(function ("aaaaaaaaaa")); 
  }
}