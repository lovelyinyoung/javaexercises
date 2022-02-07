// Have the function Superincreasing(arr) take the array of numbers stored in arr 
// and determine if the array forms a superincreasing sequence 
// where each element in the array is greater than the sum of all previous elements. 
// The array will only consist of positive integers.

// For example: if arr is [1, 3, 6, 13, 54] then your program should return the string "true" 
// because it forms a superincreasing sequence. 
// If a superincreasing sequence isn't formed, 
// then your program should return the string "false"

class Superincreasing {

  public static boolean function (int[] arr) {
    if (arr.length == 2 && arr[0] >= arr[1]) {
      return false;
    }
    
    for (int i = 0; i < arr.length; i++) {
      if (i+2 < arr.length-1 && arr[i+2] <= (arr[i] + arr[i+1])) {
        return false;
      }
    }
    return true;
  }

  public static void main (String[] args) {  
    System.out.print(function(new int[] {1, 3, 6, 13, 54})); 
  }
}