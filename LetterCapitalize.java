// Have the function LetterCapitalize(str) take the str parameter being passed
// and capitalize the first letter of each word. Words will be separated by only one space.

class LetterCapitalize {

  public static String function (String str) {
    String[] arr = str.split(" ");
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      builder.append(String.valueOf(arr[i].toCharArray()[0]).toUpperCase())
             .append(arr[i].substring(1, arr[i].length()))
             .append(" ");
    }
    return builder.toString();
  }

  public static void main (String[] args) {  
    System.out.print(function ("hello world")); 
  }
}