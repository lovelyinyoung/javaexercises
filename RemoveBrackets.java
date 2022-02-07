// Have the function RemoveBrackets(str) take the str parameter being passed, 
// which will contain only the characters "(" and ")", and 
// determine the minimum number of brackets that need to be removed 
// to create a string of correctly matched brackets. 

// For example: if str is "(()))" then your program should return the number 1. 
// The answer could potentially be 0, and there will always be at least one set of 
// matching brackets in the string.


class RemoveBrackets {

    public static String function (String str) {
    while (str.contains("()")) {
        str = str.replace("()", "");
    }
    return String.valueOf(str.length());
    }

  // public static String RemoveBrackets(String str) {
  //   int leftCount = 0;
  //   int toBeRemoved = 0;

  //   for (int i = 0; i < str.toCharArray().length; i++) {  
  //     if (str.charAt(i) == '(' && str.charAt(i++) == '(') {
  //       leftCount++;
  //     } else  if (str.charAt(i) == '(' && str.charAt(i++) == ')') {
  //       continue;
  //     } else {
  //       String a = str.substring(i, i+leftCount+1);
  //       String b = str.substring(i-leftCount-1, i);
  //       System.out.println("a: " + a);
  //       System.out.println("b: " + b);
  //       if (a.equals(b)) {
  //         leftCount = 0;
  //         continue;
  //       } else {
  //         toBeRemoved++;
  //       }
  //     }
  //   }

  //   return String.valueOf(toBeRemoved);
  // }

  public static void main (String[] args) {  
    System.out.print(function("(()))")); 
  }
}