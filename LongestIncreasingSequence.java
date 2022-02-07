// Have the function LongestIncreasingSequence(arr) take the array of positive integers stored in arr 
// and return the length of the longest increasing subsequence (LIS).
// A LIS is a subset of the original list where the numbers are in sorted order, 
// from lowest to highest, and are in increasing order. The sequence does not need to be contiguous 
// or unique, and there can be several different subsequences. 

// For example: if arr is [4, 3, 5, 1, 6] then a possible LIS is [3, 5, 6], and another is [1, 6]. 
// For this input, your program should return 3 
// because that is the length of the longest increasing subsequence.
import java.util.*; 

public class LongestIncreasingSequence {

  public static int function (int[] arr) {
    Map<Integer, Integer> map = new TreeMap<>();
    int tempPosition = 0;

    for (int i = 0; i < arr.length; i++) {
      List<Integer> intList = new ArrayList<>();
      tempPosition = i;
      intList.add(arr[i]);
      
      for (int j = i + 1; j < arr.length; j++) {
        if (intList.size() > 1 && intList.get(intList.size()-2) < arr[j] 
        && arr[i] > arr[j]) {
          intList.remove(intList.size()-1);
          intList.add(arr[j]);
          i = j;
        } else if (arr[i] < arr[j]) {
          intList.add(arr[j]);
          i = j;
        }
      }
      
      i = tempPosition;
      map.put(i, intList.size());
    }
    
    return Collections.max(map.values());
  }

  public static void main (String[] args) {  
    System.out.print(function(new int[] {4, 3, 5, 1, 6})); 
  }
}
