// Have the function AlphabetSoup(str) take the str string parameter being passed and 
// return the string with the letters in alphabetical order (ie. hello becomes ehllo). 
// Assume numbers and punctuation symbols will not be included in the string.

class AlphabeticalOrder {
public static String function (String str) { 
    boolean isSorted = false;
    char temp;
    StringBuilder builder = new StringBuilder(str);

    while(!isSorted) {
      isSorted = true;
      // System.out.println("*is sorted: " + isSorted);

      for(int i = 0; i < builder.length() - 1; i++) {
        if(builder.charAt(i) > builder.charAt(i + 1)) {
            temp = builder.charAt(i);
            builder.setCharAt(i, builder.charAt(i + 1));
            builder.setCharAt(i + 1, temp);
            
            // System.out.println("**i: " + i + ", is sorted: " + isSorted);
            isSorted = false;
        }
      }
    }
    return builder.toString();
  } 

  public static void main (String[] args) {  
    System.out.print(function("coderbyte")); 
  }
}