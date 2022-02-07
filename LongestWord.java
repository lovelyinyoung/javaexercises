// Have the function LongestWord(sen) take the sen parameter being passed and 
// return the longest word in the string. 
// If there are two or more words that are the same length, 
// return the first word from the string with that length. 
// Ignore punctuation and assume sen will not be empty. 
// Words may also contain numbers, for example "Hello world123 567"

import java.util.*; 

class LongestWord {

  public static String function (String sen) {
    // Break a string into words
    String[] words = sen.split(" ");

    // Replace non alphanumberic characters to empty string
    ArrayList<String> stringList = new ArrayList<>();
    for (String word : words) {
       stringList.add(word.replaceAll("[^a-zA-Z0-9]", ""));
    }

    // Compare size of string
    String longestWord = 
    Collections.max(stringList, Comparator.comparing(String::length));

    return longestWord;
  }

  public static void main (String[] args) {  
    System.out.print(function ("hello world")); 
  }
}