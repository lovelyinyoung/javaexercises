// Have the function TimeConvert(num) take the num parameter being passed and 
// return the number of hours and minutes the parameter converts to 
// (ie. if num = 63 then the output should be 1:3). 
// Separate the number of hours and minutes with a colon.

class TimeConvert {

  public static String function (int num) {
    StringBuilder builder = new StringBuilder();
    if (num >= 60) {
      builder.append(String.valueOf(num / 60)).append(":")
      .append(num - (60 * (num / 60)));
    } else {
      builder.append("0:").append(String.valueOf(num));
    }
    return builder.toString();
  }

  public static void main (String[] args) {  
    System.out.print(function (40)); 
  }
}