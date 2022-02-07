// Have the function SwapCase(str) take the str parameter and swap the case of each character.
// For example: if str is "Hello World" the output should be hELLO wORLD. 
// Let numbers and symbols stay the way they are.

class SwapCase {

  public static String function (String str) {
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      if (Character.isUpperCase(str.charAt(i))) {
        builder.append(Character.toLowerCase(str.charAt(i)));    
      } else {
        builder.append(Character.toUpperCase(str.charAt(i)));    
      }
    }
    return builder.toString();
  }

  public static void main (String[] args) {  
    function("coderbyte"); 
  }
}