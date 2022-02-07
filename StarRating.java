// Have the function StarRating(str) take the str parameter being passed which 
// will be an average rating between 0.00 and 5.00, 
// and convert this rating into a list of 5 image names to be displayed 
// in a user interface to represent the rating as a list of stars and half stars. 

// Ratings should be rounded to the nearest half. 
// There are 3 image file names available: "full.jpg", "half.jpg", "empty.jpg". 
// The output will be the name of the 5 images (without the extension), 
// from left to right, separated by spaces. 

// For example: if str is "2.36" then this should be displayed by 2 and a half star

import java.util.*; 

class StarRating {

  public static String function (String str) {
    String[] arr = str.split("[.]");
    List<String> list = new ArrayList<String>();
    int beforePeriod = Integer.valueOf(arr[0]);
    int afterPeriod = Integer.valueOf(arr[1]);

    while (beforePeriod != 0 && beforePeriod > 0) {
      list.add("full");
      beforePeriod--;
    }

    if (afterPeriod != 0) {
      int round = Math.round(afterPeriod);
      if ((String.valueOf(round).length() == 2 && round >= 25 && round < 75) ||
      (String.valueOf(round).length() == 1 && (round >= 5 && round < 8))) {
        list.add("half");
      } else if (String.valueOf(round).length() == 2 && round >= 75 ||
      (String.valueOf(round).length() == 1 && round >= 8)) {
        list.add("full");
      }
    }

    while(list.size() < 5) {
      list.add("empty");
    }

    StringBuilder builder = new StringBuilder();
    for (String item : list) {
      builder.append(item).append(" ");
    }
    return builder.toString();
  }

  public static void main (String[] args) {  
    System.out.print(function("2.36")); 
  }
}