// Have the function FirstReverse(str) take the str parameter being passed and 
// return the string in reversed order. 
// For example: if the input string is "Hello World and Coders" 
// then your program should return the string sredoC dna dlroW olleH.


class FirstReverse {

  public static String function (String str) {
    StringBuilder builder = new StringBuilder(str);
    builder.reverse();
    return builder.toString();
  }

  public static void main (String[] args) {  
    System.out.print(function("lettersz!23z")); 
  }
}

// I get correct answers in visual studio but not in coderbyte
// 1. For input "lettersz!23z" the output was incorrect. The correct output is z32!zsrettel
// 2. For input "b" the output was incorrect. The correct output is b