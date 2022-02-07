// Have the function QuestionsMarks(str) take the str string parameter, 
// which will contain single digit numbers, letters, and question marks, 
// and check if there are exactly 3 question marks between every pair of two numbers 
// that add up to 10. If so, then your program should return the string true,
// otherwise it should return the string false. 
// If there aren't any two numbers that add up to 10 in the string, 
// then your program should return false as well.

// For example: if str is "arrb6???4xxbl5???eee5" 
// then your program should return true because there are exactly 3 question marks 
// between 6 and 4, and 3 question marks between 5 and 5 at the end of the string.

import java.util.regex.*;  

class QuestionsMarks {  

  public static String function (String str) { 
    str = str.replaceAll("[a-z]", "");
    Pattern pattern = Pattern.compile("([0-9])([?])([?])([?])([0-9])");
    Pattern falseP1 = Pattern.compile("([0-9])([?])([?])([0-9])");
    Pattern falseP2 = Pattern.compile("([0-9])([?])([0-9])");
    Matcher falseMatchP1 = falseP1.matcher(str);
    Matcher falseMatchP2 = falseP2.matcher(str);
    Matcher matchPattern = pattern.matcher(str);
    if (falseMatchP1.find() || falseMatchP2.find()){
        return "false";
    }
    if (matchPattern.find()){
        return "true";
    }
    return "false";
  } 
  public static void main (String[] args) {  
    System.out.print(function ("arrb6???4xxbl5???eee5")); 
  }
}

/** Failed test cases 
"9???1???9??1???9" false
"5??aaaaaaaaaaaaaaaaaaa?5?5" false
 */

// class Main {

//   private static Map<Integer, String> map = new HashMap<>();
//   private static char[] characters;
//   private static Map.Entry<Integer, String> current;
//   private static Map.Entry<Integer, String> prev;

//   public static boolean QuestionsMarks(String str) {
//     characters = str.toCharArray();
//     String regex = "[0-9]";
//     boolean isMatched = false;

//     // 1. if it's number, add index and value to map
//     for (int i = 0; i < characters.length; i++) {     
//       isMatched = (Pattern.matches(regex, String.valueOf(characters[i])));
//       if (isMatched) {
//         map.put(i, String.valueOf(characters[i]));
//       }
//     }

//     // 2. First check if two numbers are added up to ten
//     // 3. If number 2 is true, check if there are three questions.
//     return isTen() && hasThreeQuestions(str);
//   }

//   private static boolean isTen() {
//     int num = 0;
//     NavigableMap<Integer, String> sortedMap = new TreeMap<>(map);

//     for (Map.Entry<Integer, String> theMap : sortedMap.entrySet()) {
//       if (num == 0) {
//         num = Integer.parseInt(theMap.getValue().toString());
//       } else {
//         num += Integer.parseInt(theMap.getValue().toString());
//       }
//       if (num == 10){
//         current = theMap;
//         prev = sortedMap.lowerEntry(theMap.getKey());
//         return true;
//       }
//       num = Integer.parseInt(theMap.getValue().toString());
//     }
//     return false;
//   }

//   private static boolean hasThreeQuestions(String str){
//     String inBetween = str.substring(prev.getKey()+1, current.getKey());
//     char[] inBetweenChars = inBetween.toCharArray();
//     int count = 0;

//     for (char question : inBetweenChars) {
//       if (question == '?') {
//         count++;
//       }
//     }
//     return count == 3 ?  true : false;
//   }

