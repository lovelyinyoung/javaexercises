// Have the function CountingMinutesI(str) take the str parameter being passed 
// which will be two times (each properly formatted with a colon and am or pm) 
// separated by a hyphen and return the total number of minutes between the two times. 
// The time will be in a 12 hour clock format. 

// For example: if str is 9:00am-10:00am then the output should be 60. 
// If str is 1:00pm-11:00am the output should be 1320.

class CountingMinutes {
  public static int function (String str) {
    String[] arr = str.split("-");
    char[] amOrPm = new char[2];
    amOrPm[0] = arr[0].charAt(arr[0].length()-2);
    amOrPm[1] = arr[1].charAt(arr[1].length()-2);

    Integer firstHour, secondHour;
    if (amOrPm[0] == 'p') {
      firstHour = Integer.valueOf(arr[0].substring(0, arr[0].indexOf(":"))) + 12;
    } else {
      firstHour = Integer.valueOf(arr[0].substring(0, arr[0].indexOf(":")));
    }

    if (amOrPm[1] == 'p') {
      secondHour = Integer.valueOf(arr[1].substring(0, arr[1].indexOf(":"))) + 12;
    } else {
      secondHour = Integer.valueOf(arr[1].substring(0, arr[1].indexOf(":")));
    }

    Integer firstMin = Integer.valueOf(arr[0].substring(arr[0].indexOf(":")+1, arr[0].length()-2));
    Integer secondMin = Integer.valueOf(arr[1].substring(arr[1].indexOf(":")+1, arr[1].length()-2));

    if (amOrPm[0] == amOrPm[1]) {
      if (firstHour < secondHour || (firstHour == secondHour && firstMin < secondMin)) { //first hour comes first
        return (secondHour * 60 + secondMin) - (firstHour * 60 + firstMin);
      } else {
        return (24 * 60) - (firstHour * 60 + firstMin) + (secondHour * 60 + secondMin);
      }
    } else {
      if (amOrPm[0] == 'a') {
        return ((12 - firstHour) * 60 - firstMin) + ((secondHour-12) * 60 + secondMin);
      } else {
        return ((24 - firstHour) * 60) - firstMin + (secondHour * 60 + secondMin);
      }
    }
  }

  public static void main (String[] args) {  
    System.out.print(function ("12:30pm-12:00am")); 
  }
}