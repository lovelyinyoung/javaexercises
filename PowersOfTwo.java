// Have the function PowersofTwo(num) take the num parameter being passed 
// which will be an integer and return the string true, if it's a power of two. 
// If it's not return the string false. 

// For example if the input is 16 then your program should return the string true 
// but if the input is 22 then the output should be the string false.

class PowersOfTwo {
  public static String function (int num) {
    int power = 2;

    while (num >= power) {
      if (num == power) {
        return "true";
      }
      power *= 2;
    }
    return "false";
  }

  public static void main (String[] args) {  
    System.out.print(function (22)); 
  }
}