// Have the function SnakeCase(str) take the str parameter being passed and 
// return it in proper snake case format 
// where each word is lowercased and separated from adjacent words via an underscore. 

// The string will only contain letters and some combination of delimiter punctuation characters
// separating each word.

// For example: if str is "BOB loves-coding" then 
// your program should return the string bob_loves_coding.

class SnakeCase {

  public static String function (String str) {
    str = str.replaceAll("[^a-zA-Z]", "_");
    return str.toLowerCase();
  }

  public static void main (String[] args) {  
    function ("BOB loves-coding"); 
  }
}