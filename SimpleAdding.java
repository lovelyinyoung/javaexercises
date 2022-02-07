// Have the function SimpleAdding(num) add up all the numbers from 1 to num. 
// For example: if the input is 4 then your program should return 10 
// because 1 + 2 + 3 + 4 = 10. 

// For the test cases, the parameter num will be any number from 1 to 1000.

class SimpleAdding {

  public static int function (int num) {
    int result = 0;
    for (int i = 1; i <= num; i++) {
      result += i;  
    } 
    return result;
  }

  public static void main (String[] args) {  
    System.out.print(function (45)); 
  }
}