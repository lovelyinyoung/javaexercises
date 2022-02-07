// Have the function ExOh(str) take the str parameter being passed and 
// return the string true if there is an equal number of x's and o's, 
// otherwise return the string false. 
// Only these two letters will be entered in the string, no punctuation or numbers. 

// For example: if str is "xooxxxxooxo" then the output should return false 
// because there are 6 x's and 5 o's.

class ExOh {

  public static String function (String str) {
    if (str.length() / 2 == str.replace("x", "").length()) {
        return "true";
    }
    return "false";
  }

  public static void main (String[] args) {  
    function("xoxox"); 
  }
}

/** Not efficient below */
// class Main {

//   public static String ExOh(String str) {
//     int xCount = 0;
//     int oCount = 0;

//     for (int i = 0; i < str.toCharArray().length; i++) {
//       if (str.toCharArray()[i] == 'x') {
//         xCount++;
//       } else {
//         oCount++;
//       }
//     }

//     return xCount == oCount ? "true" : "false";
//   }

//   public static void main (String[] args) {  
//     // keep this function call here     
//     Scanner s = new Scanner(System.in);
//     System.out.print(ExOh(s.nextLine())); 
//   }

// }