// Have the function DashInsert(str) insert dashes ('-') between each two odd numbers in str.

// For example: if str is 454793 the output should be 4547-9-3. 
// Don't count zero as an odd number.

class DashInsert {

  public static String function (String str) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      if (Integer.valueOf(str.charAt(i)) % 2 != 0 && 
          i+1 < str.length() && Integer.valueOf(str.charAt(i+1)) % 2 != 0) {
        builder.append(String.valueOf(str.charAt(i))).append("-");
      } else {
        builder.append(String.valueOf(str.charAt(i)));
      }
    }
    return builder.toString();
  }

  public static void main (String[] args) {  
    System.out.print(function ("1562")); 
  }
}