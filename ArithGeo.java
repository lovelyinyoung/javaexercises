// Have the function ArithGeo(arr) take the array of numbers stored in arr 
// and return the string "Arithmetic" if the sequence follows an arithmetic pattern 
// or return "Geometric" if it follows a geometric pattern. 
// If the sequence doesn't follow either pattern return -1. 

// An arithmetic sequence is one where the difference between each of the numbers 
// is consistent, where as in a geometric sequence, 
// each term after the first is multiplied by some constant or common ratio. 

// Arithmetic example: [2, 4, 6, 8] and Geometric example: [2, 6, 18, 54]. 
// Negative numbers may be entered as parameters, 0 will not be entered, 
// and no array will contain all the same elements.


class ArithGeo {
    public static String function(int[] arr) { 
    double difference = arr[0] - arr[1];
    double commonRatio = arr[1] / arr[0];
    boolean isArithemetic = true;
    boolean isGeometric = true;
    
    for (int i = 0; i < (arr.length - 1); i++) {
      if (arr[i] - arr[i+1] != difference) {
        isArithemetic = false;
      }
      
      if (arr[i+1] / arr[i] != commonRatio){
        isGeometric = false;
      }
    }

    if (isArithemetic){
      return "Arithmetic";
    } else if (isGeometric){
      return "Geometric";
    }
    return "-1";
  }

  public static void main (String[] args) {  
    function(new int[] {1,2,3,4}); 
  }
}