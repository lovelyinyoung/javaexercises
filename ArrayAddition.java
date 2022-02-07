// Have the function ArrayAdditionI(arr) take the array of numbers stored in arr and 
// return the string true if any combination of numbers in the array 
// (excluding the largest number) can be added up to equal the largest number in the array, 
// otherwise return the string false. 

// For example: if arr contains [4, 6, 23, 10, 1, 3] the output should return true 
// because 4 + 6 + 10 + 3 = 23. The array will not be empty, 
// will not contain all the same elements, and may contain negative numbers.

import java.util.*;

class ArrayAdditionI {
  public static String function (int[] arr) {
    Arrays.sort(arr);

    int largest = arr[arr.length-1];
    int total = 0;

    for(int i = 0; i < arr.length-1; i++){
      //System.out.println("total: " + total);
      total += arr[i];
    }

    if(total < largest) {
      return "false";
    }
    
    return "true";
  }

  /**
    Arrays.sort(arr);
    // int temp;
    // for (int i = 0; i < arr.length; i++) {
    //   for (int j = i+1; j < arr.length; j++) {
    //     if (arr[i] > arr[j]) {
    //       temp = arr[i];
    //       arr[i] = arr[j];
    //       arr[j] = temp;
    //     }
    //   }
    // }

    int largest = arr[arr.length-1];
    //System.out.println("largest: " + largest);
    int addedNumber = 0;
    for (int k = 0; k < arr.length; k++) {
      if (k != arr.length -1) {
       //System.out.println("arr[k]: " + arr[k]);
        addedNumber += arr[k];
      }
    }
    //System.out.println("added number: " + addedNumber);

    return largest == addedNumber ? "true" : "false";
    **/

  public static void main (String[] args) {  
    System.out.print(function(new int[] {1,2,3,4})); 
  }
}