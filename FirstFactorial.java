// Have the function FirstFactorial(num) take the num parameter being passed and 
// return the factorial of it. 

// For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24.
// For the test cases, the range will be between 1 and 18 and the input will always be an integer.

class FirstFactorial {

  public static int function (int num) {
    int toReturn = 1;
    while (num > 0) {
      toReturn = num * toReturn;
      num--;
    }
    return toReturn;
  }

  public static void main (String[] args) {
    System.out.print(function (1)); 
  }
}