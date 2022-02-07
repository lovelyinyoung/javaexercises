// Have the function LetterChanges(str) take the str parameter being passed and
// modify it using the following algorithm. 
// Replace every letter in the string with the letter following it in the alphabet
// (ie. c becomes d, z becomes a). 

// Then capitalize every vowel in this new string (a, e, i, o, u) 
// and finally return this modified string.

import java.util.regex.Pattern;  

class LetterChanges {
  public static String function (String str) {
    // 1. increment alphabet letter if it's a letter
    String output = "";
    for (char c : str.toCharArray()) {
      String regex = "[a-zA-Z]";
      boolean isMatched = (Pattern.matches(regex, String.valueOf(c)));
      if (isMatched) {
        String next = Character.toString((char) (((c - 'a' + 1) % 26) + 'a'));
        
        // 2. change to upper case if it's a vowel
        if(next.equals("a") || next.equals("e") || next.equals("i")
         || next.equals("o") || next.equals("u")) {
            next = next.toUpperCase();
         }
        output += next;
      } else {
        output += c;
      }
    }
    return output;
  }

  public static void main (String[] args) {  
    System.out.print(function ("hello world")); 
  }
}