// Have the function NumberAddition(str) take the str parameter, search for all the numbers 
// in the string, add them together, then return that final number. 

// For example: if str is "88Hello 3World!" the output should be 91. 
// You will have to differentiate between single digit numbers and multiple digit numbers 
// like in the example above. 
// So "55Hello" and "5Hello 5" should return two different answers. 
// Each string will contain at least one letter or symbol.

class NumberAddition {

  public static int function (String str) { 
    int result = 0;
    String[] array = str.split("[^\\d]+");

    for(String item : array){
      if(!item.isEmpty()){ 
          result += Integer.parseInt(item);
      }
    }
    return result;
  }
  
  // public static Integer NumberAddition(String str) {
  //   String regex = "[0-9]";
  //   int key = 0;
  //   StringBuilder builder = new StringBuilder();

  //   Map <Integer, String> map = new HashMap<>();
  //   for (int i = 0; i < str.length(); i++) {
  //     if (i == str.length()-1 && Pattern.matches(regex, String.valueOf(str.charAt(i)))) {
  //       builder.append(str.charAt(i));
  //       map.put(key++, builder.toString());
  //     }
  //     else if (Pattern.matches(regex, String.valueOf(str.charAt(i)))) {
  //       builder.append(str.charAt(i));
  //     } 
  //     else if (Pattern.matches(regex, String.valueOf(str.charAt(i-1))) && 
  //     !Pattern.matches(regex, String.valueOf(str.charAt(i)))) {
  //       map.put(key++, builder.toString());
  //       builder = new StringBuilder();
  //     }
  //   }

  //   Integer toReturn = 0;
  //   for (Map.Entry<Integer, String> entry : map.entrySet()) {
  //     toReturn += Integer.valueOf(entry.getValue());
  //   }
  //   return toReturn;
  // }


  public static void main (String[] args) {  
    System.out.print(function ("3Hello 9")); 
  }
}