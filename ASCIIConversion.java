// Have the function ASCIIConversion(str) take the str parameter being passed and 
// return a new string where every character, aside from the space character, 
// is replaced with its corresponding decimal character code. 

// For example: if str is "dog" then your program should return the string 100111103 
// because d = 100, o = 111, g = 103.

class ASCIIConversion {

  public static String function (String str) {
    char[] charArray = str.toCharArray();
    StringBuilder toReturn = new StringBuilder();
    int ascii;

    for (char c : charArray) {
      if (c == ' ') {
        toReturn.append(c); 
        continue;
      }
      ascii = c;
      toReturn.append(String.valueOf(ascii));
    }
    return toReturn.toString();
  }

  public static void main (String[] args) {  
    System.out.print(function("dog")); 
  }
}