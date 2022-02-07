// Have the function FizzBuzz(num) take the num parameter being passed and 
// return all the numbers from 1 to num separated by spaces, 
// but replace every number that is divisible by 3 with the word "Fizz", 
// replace every number that is divisible by 5 with the word "Buzz", 
// and every number that is divisible by both 3 and 5 with the word "FizzBuzz". 

// For example: if num is 16, then your program should return 
// the string "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16". 

// The input will be within the range 1 - 50.

class FizzBuzz {

  public static String function(int num) {
    String divisibleBy3 = "Fizz";
    String divisibleBy5 = "Buzz";
    String divisibleByBoth = "FizzBuzz";
    StringBuilder builder = new StringBuilder();

    for (int i = 1; i <= num; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        builder.append(divisibleByBoth).append(" "); 
      } else if (i % 3 == 0) {
        builder.append(divisibleBy3).append(" ");
      } else if (i % 5 == 0) {
        builder.append(divisibleBy5).append(" ");
      } else {
        builder.append(String.valueOf(i)).append(" ");
      }
    }
    
    System.out.println(builder.toString());
    return builder.toString();
  }

  public static void main (String[] args) {  
    function(3); 
  }
}