// Have the function ABCheck(str) take the str parameter being passed and return the string true 
// if the characters a and b are separated by exactly 3 places anywhere in the string 
// at least once 

// (ie. "lane borrowed" would result in true because there is exactly three characters 
// between a and b). Otherwise return the string false.

import java.util.regex.Pattern;

class ABCheck {  
  public static String function(String str) {
    str = Pattern.compile("([aA].{3}[bB])|([bB].{3}[aA])").matcher(str).replaceAll("a   b");
    if(str.contains("a   b")){
        return "true";
    }
    return "false";
}
  
  public static void main (String[] args) {  
    function("after it"); 
  }
}


/** Not efficient below */
// import java.util.*; 
// import java.io.*;

// class Main {

//   public static String ABCheck(String str) {
//     for (int i = 0; i < str.toCharArray().length; i++) {
//       if (i+4 < str.toCharArray().length &&
//           ((str.toCharArray()[i] == 'a' && str.toCharArray()[i+4] == 'b') ||
//           (str.toCharArray()[i] == 'b' && str.toCharArray()[i+4] == 'a'))) {
//         return "true";
//       }
//     }
//     return "false";
//   }

//   public static void main (String[] args) {  
//     // keep this function call here     
//     Scanner s = new Scanner(System.in);
//     System.out.print(ABCheck(s.nextLine())); 
//   }

// }