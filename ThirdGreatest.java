// Have the function ThirdGreatest(strArr) take the array of strings stored in strArr 
// and return the third largest word within it.

// So for example: if strArr is ["hello", "world", "before", "all"] 
// your output should be world because "before" is 6 letters long, 
// and "hello" and "world" are both 5, 
// but the output should be world because it appeared as the last 5 letter word in the array.

// If strArr was ["hello", "world", "after", "all"] 
// the output should be after because the first three words are all 5 letters long,
// so return the last one. 
// The array will have at least three strings and each string will only contain letters.

import java.util.*; 

class ThirdGreatest {

  public static String function (String[] strArr) {
    Map<Integer, List<String>> map = new TreeMap<>(); //count, list of words
    List<String> list = null;

    for (int i = 0; i < strArr.length; i++) { 
      if (!map.containsKey(strArr[i].length())) {
        list = new ArrayList<>(); 
        list.add(strArr[i]);
        map.put(strArr[i].length(), list);
      } else {
        map.get(strArr[i].length()).add(strArr[i]);
      }
    }

    TreeMap<Integer, List<String>> mapSorted = new TreeMap<>(map);
    int countValue = 0;
    for (Map.Entry<Integer, List<String>> entry : mapSorted.descendingMap().entrySet()) {
     for (int i = 0; i < entry.getValue().size(); i++) {
       countValue++;
       if (countValue == 3) {
         return entry.getValue().get(i);
       }
     }
    }

    return strArr[0];
  }

  public static void main (String[] args) {  
    System.out.print(function (new String[] {"hello","world","world"})); 
  }
}