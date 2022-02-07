// Have the function CamelCase(str) take the str parameter being passed and return it
// in proper camel case format where the first letter of each word is capitalized 
// (excluding the first letter). 
// The string will only contain letters and some combination of 
// delimiter punctuation characters separating each word.

// For example: if str is "BOB loves-coding" then your program should return 
// the string bobLovesCoding.

import java.lang.StringBuilder; 

class Main {

  public static String function(String str) {
    String[] array = (str.replaceAll("[^a-zA-Z]", " ").split(" "));
    StringBuilder builder = new StringBuilder();
    builder.append(array[0].toLowerCase());
    char[] chars;

    for (int i = 1; i < array.length; i++) {
      chars = array[i].toLowerCase().toCharArray();
      chars[0] = Character.toUpperCase(chars[0]);
      builder.append(String.valueOf(chars));
    }

    return builder.toString();
  }

  public static void main (String[] args) {  
    function("BOB loves-coding"); 
  }
}