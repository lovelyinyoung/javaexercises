// Have the function FindIntersection(strArr) read the array of strings stored in strArr
// which will contain 2 elements: the first element will represent a list of 
// comma-separated numbers sorted in ascending order, 
// the second element will represent a second list of comma-separated numbers (also sorted).
// Your goal is to return a comma-separated string containing the numbers that occur 
// in elements of strArr in sorted order. 
// If there is no intersection, return the string false.

class FindIntersection {

  public static String function (String[] strArr) {
    String[] first = strArr[0].split(",");
    String[] second = strArr[1].split(",");

    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < first.length; i++) {
      for (int j = 0; j < second.length; j++) {
        if (first[i].replaceAll("\\s", "").equals
        (second[j].replaceAll("\\s", ""))) {
          builder.append(first[i]).append(",");
        }
      }
    }

    return builder.toString() == "" ? "false"
            : builder.toString().replaceAll(",$", "").replaceAll("\\s", "");
  }

  public static void main (String[] args) {  
    System.out.print(function (new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"})); 
  }
}