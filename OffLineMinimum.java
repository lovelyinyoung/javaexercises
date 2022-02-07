// Have the function OffLineMinimum(strArr) take the strArr parameter being passed 
// which will be an array of integers ranging from 1...n and the letter "E" 
// and return the correct subset based on the following rules. 
// The input will be in the following format: ["I","I","E","I",...,"E",...,"I"] 
// where the I's stand for integers and the E means take out the smallest integer currently
// in the whole set. When finished, your program should return that new set with
//  integers separated by commas. 

// For example: if strArr is ["5","4","6","E","1","7","E","E","3","2"] 
// then your program should return 4,1,5.

import java.util.*; 
import java.util.stream.Collectors;

class OffLineMinimum {

public static String function (String[] strArr) {
    LinkedList<String> list = new LinkedList<>();
    List<String> toReturn = new ArrayList<>();
    
    for (int i = 0; i < strArr.length; i++) {
      if (!strArr[i].equals("E")) {
        list.add(strArr[i]);
      } else {
        Collections.sort(list);
        toReturn.add(list.get(0));
        list.pop();
      }
    }
    return toReturn.stream().map(Object::toString).collect(Collectors.joining(","));
  }

  public static void main (String[] args) {  
    System.out.print(function (new String[] {"5","4","6","E","1","7","E","E","3","2"})); 
  }
}