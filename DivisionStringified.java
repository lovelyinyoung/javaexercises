// Have the function DivisionStringified(num1,num2) take both parameters being passed, 
// divide num1 by num2, and return the result as a string with properly formatted commas. 
// If an answer is only 3 digits long, return the number with no commas 
// (ie. 2 / 3 should output "1"). 

// For example: if num1 is 123456789 and num2 is 10000 the output should be "12,346".

class DivisionStringified {

  public static String function (int num1, int num2) {
    StringBuilder builder = new StringBuilder();
    char[] arr = ("" + (int) Math.round(num1 / (double) num2)).toCharArray();
    
    for (int i = 0; i < arr.length; i++) {
      builder.append(String.valueOf(arr[i]));
      if (arr.length > 3 && i != arr.length-1
          && ((arr.length-1)-i) % 3 == 0) {
        builder.append(",");
      }
    }
    return builder.toString();

    // Framework to do the same thing
    // import java.text.DecimalFormat;
    // DecimalFormat dm = new DecimalFormat("#,###");
    // return dm.format(num1 / num2);
  }

  public static void main (String[] args) {  
    System.out.print(function(1, 503394930)); 
  }
}