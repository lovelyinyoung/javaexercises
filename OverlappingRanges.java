// Have the function OverlappingRanges(arr) take the array of numbers stored in arr 
// which will contain 5 positive integers, the first two representing a range of numbers 
// (a to b), the next 2 also representing another range of integers (c to d),
// and a final 5th element (x) which will also be a positive integer,
// and return the string true if both sets of ranges overlap by at least x numbers. 

// For example: if arr is [4, 10, 2, 6, 3] then your program should return the string true. 
// The first range of numbers are 4, 5, 6, 7, 8, 9, 10 and 
// the second range of numbers are 2, 3, 4, 5, 6. The last element in the array is 3,
// and there are 3 numbers that overlap between both ranges: 4, 5, and 6. 

// If both ranges do not overlap by at least x numbers, 
// then your program should return the string false.

import java.util.*; 

class OverlappingRanges {

  public static String function (int[] arr) {
    int overlapCount = arr[arr.length-1];
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    for (int i = arr[0]; i <= arr[1]; i++) {
      list1.add(i);
    }
    for (int j = arr[2]; j <= arr[3]; j++) {
      list2.add(j);
    }

    Set<Integer> commonList = new HashSet<Integer>(list1);
    commonList.retainAll(list2);
    
    return commonList.size() >= overlapCount ? "true" : "false";
  }

  public static void main (String[] args) {  
    System.out.print(function (new int[] {4,10,2,6,3})); 
  }
}