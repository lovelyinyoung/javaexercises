// Have the function StringMerge(str) read the str parameter being passed which 
// will contain a large string of alphanumeric characters with a single asterisk character 
// splitting the string evenly into two separate strings. 
// Your goal is to return a new string by pairing up the characters 
// in the corresponding locations in both strings. 

// For example: if str is "abc1*kyoo" then your program should return 
//the string akbyco1o because a pairs with k, b pairs with y, etc. 
// The string will always split evenly with the asterisk in the center.

class StringMerge {

  public static String function (String str) {
    String[] words = str.split("[*]");
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < words[0].length(); i++) {
      builder.append(words[0].charAt(i)).append(words[1].charAt(i));
    }
    
    return builder.toString();
  }

  public static void main (String[] args) {  
    System.out.print(function ("abc1*kyoo")); 
  }
}