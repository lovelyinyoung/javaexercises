// Have the function SumMultiplier(arr) take the array of numbers stored in arr 
// and return the string true if any two numbers can be multiplied 
// so that the answer is greater than double the sum of all the elements in the array. 
// If not, return the string false. 

// For example: if arr is [2, 5, 6, -6, 16, 2, 3, 6, 5, 3] 
// then the sum of all these elements is 42 and doubling it is 84. 
// There are two elements in the array, 16 * 6 = 96 and 96 is greater than 84, 
// so your program should return the string true.


import java.util.*; 

class SumMultiplier {

    public static boolean function(int[] arr) {     
        int sum = 0;
        for(int n: arr)
            sum += n;
        sum *= 2;
        
        Arrays.sort(arr);
        
        int multiply = arr[arr.length - 1] * arr[arr.length - 2];
            
        return multiply > sum;
    } 

//   public static String function (int[] arr) {
//     int sum = 0;
    
//     // 1. sum all the elements
//     for (int i = 0; i < arr.length; i++) {
//       sum += arr[i];
//     }

//     // 2. double the sum
//     int doubled = sum * 2;

//     // 3. find out if any of the two elemnts multiplied can be greater the doubled
//     for (int i = 0; i < arr.length; i++) {
//       for (int j = 1; j < arr.length; j++) {
//          if (i != j && arr[i] * arr[j] > doubled) {
//            return "true";
//          }
//       }
//     }
//     return "false";
//   }

  public static void main (String[] args) {  
    System.out.print(function (new int[] {2, 5, 6, -6, 16, 2, 3, 6, 5, 3})); 
  }
}
