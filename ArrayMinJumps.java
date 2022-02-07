// Have the function ArrayMinJumps(arr) take the array of integers stored in arr, 
// where each integer represents the maximum number of steps that can be made from that position,
// and determine the least amount of jumps that can be made to reach the end of the array. 

// For example: if arr is [1, 5, 4, 6, 9, 3, 0, 0, 1, 3] then your program should output 
// the number 3 because you can reach the end of the array from the beginning via the following steps: 
// 1 -> 5 -> 9 -> END or 1 -> 5 -> 6 -> END. Both of these combinations produce a series of 3 steps.
// And as you can see, you don't always have to take the maximum number of jumps at a specific position, 
// you can take less jumps even though the number is higher.

// If it is not possible to reach the end of the array, return -1.

 
// didn't pass all test cases
// new int[] {1, 3, 6, 8, 2, 7, 1, 2, 1, 2, 6, 1, 2, 1, 2} 4
// new int[] {1, 0, 0, 2}  -1
// new int[] {4, 5, 2, 1, 5, 3, 1, 4, 6, 2, 1, 0, 1, 0, 4, 3, 0, 1, 2, 4, 5} 5

public class ArrayMinJumps {

  public static int function (int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      int biggest = 0;
      int biggestPosition = 0;
      if (biggestPosition == arr.length-1 || i == arr.length-1) {
        return count;
      } else if (i+arr[i] > arr.length-1) {
        return count+1;
      }

      for (int j = i+1; j <= i+arr[i]; j++) {
        if (biggest < arr[j]) {
          biggest = arr[j];
          biggestPosition = j;
        }
      }
      i = biggestPosition-1;
      count++;
    }
    return count;
  }

  public static void main (String[] args) {  
    System.out.print(function (new int[] {1, 5, 4, 6, 9, 3, 0, 0, 1, 3})); 
  }
}
