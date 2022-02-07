// Have the function VowelCount(str) take the str string parameter being passed 
// and return the number of vowels the string contains 
// (ie. "All cows eat grass and moo" would return 8). 
// Do not count y as a vowel for this challenge.

import java.util.regex.Pattern;

class VowelCount {

    public static int function (String str) {
        return Pattern.compile("[^aeiouAEIOU]").matcher(str).replaceAll("").length();
    }

/** not efficient */
//   public static String function (String str) {
//     char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
//     int count = 0;

//     for (int i = 0; i < str.toCharArray().length; i++) {
//       for (int j = 0; j < vowels.length; j++) {
//         if (str.toCharArray()[i] == vowels[j]) {
//           count++;
//         }
//       }
//     }
//     return String.valueOf(count);
//   }

  public static void main (String[] args) {  
    System.out.print(function ("coderbyte")); 
  }
}