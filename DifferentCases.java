// Have the function DifferentCases(str) take the str parameter being passed and 
// return it in upper camel case format where the first letter of each word is capitalized. 
// The string will only contain letters and some combination of delimiter punctuation characters
// separating each word.

// For example: if str is "Daniel LikeS-coding" 
// then your program should return the string DanielLikesCoding.


class DifferentCases {

  public static String function (String str) {
    String[] arr = str.split("[^a-zA-Z]");
    StringBuilder builder = new StringBuilder();
    for (String item : arr) {
      String lowerString = item.toLowerCase();
      builder.append(Character.toUpperCase(lowerString.charAt(0)))
      .append(lowerString.substring(1, lowerString.length()));
    }
    return builder.toString();
  }

  public static void main (String[] args) {  
    System.out.print(function ("BOB loves-coding")); 
  }
}