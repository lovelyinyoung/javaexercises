// Have the function GroupTotals(strArr) read in the strArr parameter containing 
// key:value pairs where the key is a string and the value is an integer. 
// Your program should return a string with new key:value pairs separated by a comma 
// such that each key appears only once with the total values summed up.

// For example: if strArr is ["B:-1", "A:1", "B:3", "A:5"] 
// then your program should return the string A:6,B:2.
// Your final output string should return the keys in alphabetical order. 
// Exclude keys that have a value of 0 after being summed up.

import java.util.*;  

class MapValueGroupTotal {

  public static String function(String[] strArr) {
      TreeMap<String,Integer> map = new TreeMap<>();
      for (String s : strArr) {
          String[] str = s.split(":");
          String key = str[0];
          map.put(key, map.getOrDefault(key, 0) + Integer.parseInt(str[1]));
          if (map.get(key) == 0) map.remove(key);
      }
      return map.toString().replaceAll("[{} ]", "").replaceAll("=", ":");
  }
  
  public static void main (String[] args) {  
    System.out.print(function(new String[] {"B:-1", "A:1", "B:3", "A:5"})); 
  }
}

/** Not efficient */
// class MapValueGroupTotal {
//   public static String function (String[] strArr) {
//     Map<String, Integer> map = new HashMap<>();
//     String[] itemArr;
//     for (int i = 0; i < strArr.length; i++ ) {
//       itemArr = strArr[i].split(":");
  
//       if (hasKey(map, itemArr[0])) {
//         map.put(itemArr[0], map.get(itemArr[0]) + Integer.parseInt(itemArr[1]));
//       } else {
//         map.put(itemArr[0], Integer.parseInt(itemArr[1]));
//       }
//     }

//     TreeMap<String, Integer> sortedMap = new TreeMap<>();
//     sortedMap.putAll(map);
    
//     StringBuilder builder = new StringBuilder();
//     for (Map.Entry<String,Integer> entry : sortedMap.entrySet()) {
//       if (entry.getValue() != 0) {
//         builder.append(entry.getKey()).append(":").append(entry.getValue())
//         .append(",");
//       }
//     }
//     return builder.toString().replaceAll(",$","");
//   }

//   private static boolean hasKey(Map<String, Integer> map, String theKey) {
//     Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
//     boolean hasKey = false;
//     while(iterator.hasNext()) {
//       Map.Entry<String, Integer> entry = iterator.next();
//       if (theKey.equals(entry.getKey())) {
//         hasKey = true;
//       }
//     }
//     return hasKey;
//   }

//   public static void main (String[] args) {  
//     System.out.print(function(new String[] {"B:-1", "A:1", "B:3", "A:5"})); 
//   }
// }