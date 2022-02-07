// Have the function StringPeriods(str) take the str parameter being passed and determine 
// if there is some substring K that can be repeated N > 1 times to produce the input string
// exactly as it appears. 
// Your program should return the longest substring K, 
// and if there is none, it should return the string -1.

// For example: if str is "abcababcababcab" then your program should return abcab 
// because that is the longest substring that is repeated 3 times to create the final string. 

// Another example: if str is "abababababab" then your program should return ababab 
// because it is the longest substring. 
// If the input string contains only a single character, 
// your program should return the string -1.

class StringPeriods {
  public static boolean isMatched = false;

  public static String function (String str) {
    if (str.length() == 1) {
      return "-1";
    }

    String leftString = new String();
    int position = 0;    

    for (int i = 2; i < str.length(); i++) {
      leftString = str.substring(0, i-1);
      //System.out.println("sub string: " + leftString);
      recursive (leftString, position, i, str);
     }

     return isMatched ? leftString : "-1";
  }

  public static boolean recursive(String leftString, int position, int i, String str) {
    int num = i+position;
    if (num >= str.length()) {
      return false;
    }
    char letter = str.charAt(num);
    // System.out.println("letter: " + letter + ", position: " + position + ", i: " + i
    // + ", strlength: " + str.length());

    if  (leftString.length() > position && 
    leftString.charAt(position) == letter && num <= str.length()) {
      // System.out.println("**letter: " + letter + ", i+position: " + num);
      recursive (leftString, position+1, i, str);
      // isMatched = true;
    }

    return false;
  }
 
  public static void main (String[] args) {  
    System.out.print(function ("abcababcababcab")); 
  }
}