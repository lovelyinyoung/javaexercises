// Have the function LetterCountI(str) take the str parameter being passed and 
// return the first word with the greatest number of repeated letters. 
// For example: "Today, is the greatest day ever!" should return greatest 
// because it has 2 e's (and 2 t's) and it comes before ever which also has 2 e's. 
// If there are no words with repeating letters return -1. 
// Words will be separated by spaces.

import java.util.*; 

class LetterCount1 {
  public static String function (String str) {
    String[] arr = str.split(" ");
    String toReturn = null;
    int maxCount = 0;

    for (String word : arr) {
      int count = getRepeatedCount(word);
      if(count > maxCount){
        toReturn = word;
        maxCount = count;
      }
    }

    return maxCount == 1 ? "-1" : toReturn;
  }

  private static int getRepeatedCount(String word) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < word.length(); i++) {
      Integer count = map.get(word.charAt(i));
      if(count == null){
        map.put(word.charAt(i), 1);
        continue;
      }
      map.put(word.charAt(i), ++count);
    }
    return Collections.max(map.values());
  }

  public static void main (String[] args) {  
    System.out.print(function ("hello world")); 
  }
}