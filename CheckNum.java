// Have the function CheckNums(num1,num2) take both parameters being passed and 
// return the string true if num2 is greater than num1, otherwise return the string false. 
// If the parameter values are equal to each other then return the string -1.

class CheckNum {
  public static String function (int num1, int num2) {
    if (num1 > num2) {
      return "false";
    } else if (num1 < num2) {
      return "true";
    }
    return "-1";
  }

  public static void main (String[] args) {  
    function(1, 122); 
  }
}