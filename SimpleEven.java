// Have the function SimpleEvens(num) check whether every single number in the passed 
// in parameter is even. If so, return the string true, otherwise return the string false. 

// For example: if num is 4602225 your program should return the string false 
// because 5 is not an even number.


/** executed with correct answers in visual studio but not in coderbyte */
class SimpleEvens {

  public static boolean function (String param) {
    char[] chars = param.toCharArray();
    boolean toReturn = false;
    
    for (char c : chars) {
      if (Character.getNumericValue(c) % 2 != 0) {
        toReturn = false;
        break;
      }
      toReturn = true;
    }
    return toReturn;
  }
  public static void main (String[] args) {  
    String param = String.valueOf("2222220222");
    System.out.print(function(param)); 
  }
}

// input 2222220222 true
// input 20864646452  false
// input 222222222222228  true