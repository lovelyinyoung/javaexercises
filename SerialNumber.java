// Have the function SerialNumber(str) take the str parameter being passed 
// and determine if it is a valid serial number with the following constraints:
// 1. It needs to contain three sets each with three digits (1 through 9) separated by a period.
// 2. The first set of digits must add up to an even number.
// 3. The second set of digits must add up to an odd number.
// 4. The last digit in each set must be larger than the two previous digits in the same set.

// If all the above constraints are met within the string, 
// the your program should return the string true, 
// otherwise your program should return the string false. 

// For example: if str is "224.315.218" then your program should return "true".

class SerialNumber {
  public static String function (String inputString) {
    return (inputString.matches("^([1-9]{3}\\.){2}[1-9]{3}")
        && inputString.charAt(2) > inputString.charAt(0) && inputString.charAt(2) > inputString.charAt(1)
        && inputString.charAt(6) > inputString.charAt(4) && inputString.charAt(6) > inputString.charAt(5)
        && inputString.charAt(10) > inputString.charAt(8) && inputString.charAt(10) > inputString.charAt(9)
        && (inputString.charAt(0) + inputString.charAt(1) + inputString.charAt(2)) % 2 == 0
        && (inputString.charAt(4) + inputString.charAt(5) + inputString.charAt(6)) % 2 != 0)
        ? "true" : "false"; 
  }

  /** Not efficient below */
//   public static String SerialNumber(String str) {
//     List<String> list = new ArrayList<>();
//     boolean isFirstEven = false;  
//     boolean isSecondOdd = false;
//     boolean isLastLargest = false;
    
//     for (String item : str.split("[.]")) {
//       list.add(item);
//     }

//     for (int i = 0; i < list.size(); i++) {
//       int count = 0;

//       // 1.
//       for (char c : list.get(i).toCharArray()) {
//         count++;
//       }
//       if (count != 3) {
//         return "false";
//       }

//       // 2.
//       if (i == 0) {
//         isFirstEven = (list.get(i).charAt(0) + list.get(i).charAt(1) + 
//         list.get(i).charAt(2)) % 2 == 0 ? true : false;
//        }

//       // 3.
//       if (i == 1) {
//        isSecondOdd = (list.get(i).charAt(0) + list.get(i).charAt(1) + 
//         list.get(i).charAt(2)) % 2 != 0 ? true : false;
//       }

//       // 4.
//       if (list.get(i).charAt(0) < list.get(i).charAt(2) &&
//        list.get(i).charAt(1) <list.get(i).charAt(2)) {
//          isLastLargest = true;
//        }
//        else {
//          return "false";
//        }
//     }

//     return String.valueOf(isFirstEven && isSecondOdd & isLastLargest);
//   }

  public static void main (String[] args) {  
    System.out.print(function ("224.315.218")); 
  }
}