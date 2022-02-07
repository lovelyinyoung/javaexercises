// Have the function StringChanges(str) take the str parameter being passed,
// which will be a string containing letters from the alphabet, 
// and return a new string based on the following rules. 
// Whenever a capital M is encountered, duplicate the previous character (then remove the M),
// and whenever a capital N is encountered remove the next character from the string 
// (then remove the N). All other characters in the string will be lowercase letters.

// For example: "abcNdgM" should return "abcgg". The final string will never be empty.

import java.util.*; 

class StringChanges {

  public static String function (String str) {
    List<String> list = new ArrayList<>();
    for (String s : str.split("")) {
      list.add(s);
    }

    List<String> newList = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
       //DEBUG: System.out.println("***i: " + i + ", character: " + list.get(i));

      if (list.get(i).equals("M")) {
        if (newList.size() != 0) {
          //DEBUG: System.out.println("add last one of new list: " + newList.get(newList.size()-1));
          newList.add(newList.get(newList.size()-1)); //duplicate previous
        }
      } else if (list.get(i).equals("N")) {
        if (i+1 < list.size()) {
          //DEBUG:System.out.println("remove next character : " + list.get(i+1));
          list.remove(i+1);
        }
      } else{
        //DEBUG:System.out.println("add the character: " + list.get(i).toLowerCase());
        newList.add(list.get(i).toLowerCase());
      }
    }

    StringBuilder builder = new StringBuilder();
    for (String item : newList) {
      builder.append(item);
    }
    return builder.toString();
  }

  public static void main (String[] args) {  
    System.out.print(function ("abcNdgM")); 
  }
}