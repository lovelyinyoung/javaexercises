// Have the function TwoSum(arr) take the array of integers stored in arr, and determine if any two numbers
// (excluding the first element) in the array can sum up to the first element in the array. 
// For example: if arr is [7, 3, 5, 2, -4, 8, 11], then there are actually two pairs that sum 
// to the number 7: [5, 2] and [-4, 11]. 
// Your program should return all pairs, with the numbers separated by a comma, 
// in the order the first number appears in the array. Pairs should be separated by a space.
// So for the example above, your program would return: 5,2 -4,11

// If there are no two numbers that sum to the first element in the array, return -1
import java.util.*; 

class TwoSum {

  public static String function (int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>(); // number and index
    List<String> list = new ArrayList<>();
    int target = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
      map.put(arr[i], i);  // put arr values as keys to the map to remove duplicates
    }
    
    for (int i = 1; i < arr.length; i++) {
      int current = arr[i];
      int need = target - current;
      if (map.containsKey(need) && map.get(need) > i)
        list.add(current + "," + need);
    }
    
    return list.size() > 0 ? String.join(" ", list) : "-1";
  } 

    // StringBuilder sb = new StringBuilder();
    // int count = 0;
    // for (int i = 1; i < arr.length; i++) {
    //   for (int j = i+1; j < arr.length; j++) {
    //     if (arr[i]+arr[j] == arr[0]) {
    //       sb.append(String.valueOf(arr[i])).append(",")
    //         .append(String.valueOf(arr[j])).append(" ");
    //       count++;
    //     }
    //   }
    // } 

    // return count == 0 ? "-1" : sb.toString();

  public static void main (String[] args) {  
    System.out.print(function (new int[] {17, 4, 5, 6, 10, 11, 4, -3, -5, 3, 15, 2, 7})); 
  }
}