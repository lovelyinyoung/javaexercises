// Have the function SecondGreatLow(arr) take the array of numbers stored in arr and
// return the second lowest and second greatest numbers, respectively, separated by a space. 

// For example: if arr contains [7, 7, 12, 98, 106] the output should be 12 98. 
// The array will not be empty and will contain at least 2 numbers. 
// It can get tricky if there's just two numbers!


class SecondGreatLow {

  public static String function (int[] arr) {
    int temp = 0;
    for (int i = 0; i < arr.length; i++) { // sort the array
      for (int j = i+1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }

    StringBuilder builder = new StringBuilder();
    for (int k = 0; k < arr.length; k++) { //find second lowest
      if (arr.length == 2 || arr[k] != arr[k+1]) {
        builder.append(arr[k+1]).append(" ");
        break;
      }
    }
    for (int k = arr.length-1; k > 0; k--) { //find second largest
      if (arr.length == 2 || arr[k] != arr[k-1]) {
        builder.append(arr[k-1]);
        break;
      }
    }

    return builder.toString();
  }

  public static void main (String[] args) {  
    System.out.print(function (new int[] {1,2,2,3})); 
  }
}