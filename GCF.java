// Have the function GCF(arr) take the array of numbers stored in arr 
// which will always contain only two positive integers, 
// and return the greatest common factor of them. 

// For example: if arr is [45, 12] then your program should return 3. 
// There will always be two elements in the array and they will be positive integers.

class GCF {

  public static int gcf(int[] arr) {
    // NOTE: Math.min returns the smaller of a and b.
    for (int i = Math.min(arr[0], arr[1]); i > 0; i--) {
      if (arr[0] % i == 0 && arr[1] % i == 0) {
        return i;
      }
    }
    return 1;
  }

  public static void main (String[] args) {  
    gcf(new int[] {45, 12}); 
  }
}