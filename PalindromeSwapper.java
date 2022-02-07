// Have the function PalindromeSwapper(str) take the str parameter being passed and
// determine if a palindrome can be created by swapping two adjacent characters in the string.
// If it is possible to create a palindrome, then your program should return the palindrome,
// if not then return the string -1. 
// The input string will only contain alphabetic characters.

// For example: if str is "rcaecar" then you can create a palindrome by
// swapping the second and third characters, 
// so your program should return the string racecar which is the final palindromic string.

import java.util.*; 

class PalindromeSwapper {

  public static String function (String str) {
      char [] arr = str.toCharArray();
      for(int i = 0; i < arr.length-1; i++) {
          String pAnswer = swap(str.toCharArray(), i, i+1);
          StringBuilder sb = new StringBuilder(pAnswer);
          if(sb.reverse().toString().equals(pAnswer)) 
            return sb.toString();
      }
      return "-1";
  }

  private static String swap(char[] arr, int i, int j) {
      char temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      return Arrays.toString(arr).replaceAll("[^a-z]","");
  }

  public static void main (String[] args) {  
    System.out.print(function ("rcaecar")); 
  }
}

// import java.util.*; 
// import java.io.*;

// class Main {

//   public static String PalindromeSwapper(String str) {
//     // 1. Check if it's matched with a reversed word
//     StringBuilder builder = new StringBuilder();
//     for (int i = str.toCharArray().length-1; i >= 0; i--) {
//      builder.append(str.toCharArray()[i]);   
//     }

//     if (builder.toString().equals(str)) {
//       return str;
//     } 
//     else {
//       // 2. if not matched, swap adjacent letters
//       for (int i = 0; i < str.toCharArray().length; i++) {
//         StringBuilder builder2 = new StringBuilder();
//         int nextChar = i+1;

//         // append prefix letters before the swapped letters
//         if (i != 0) {
//           builder2.append(str.substring(0, i));
//         }

//         // append swapped letters
//         builder2.append(String.valueOf(str.charAt(nextChar)))
//                 .append(String.valueOf(str.charAt(i)));

//         // append remaining letters
//         for (int j = nextChar+1; j < str.toCharArray().length; j++) {
//           builder2.append(String.valueOf(str.charAt(j)));
//         }

//         // 3. If the newly built string is matched with its reversed word
//         StringBuilder builder3 = new StringBuilder();
//         for (int h = builder2.toString().toCharArray().length-1; h >= 0; h--) {
//          builder3.append(builder2.toString().toCharArray()[h]);   
//         }

//         // If matched, return the string
//         if (builder2.toString().equals(builder3.toString())) {
//           return builder2.toString();
//         } 
//         else if (i == str.toCharArray().length-2 && 
//         !builder2.toString().equals(builder3.toString())) {
//           return "-1";
//         }
//         continue;
//       }
//     }
//     return str;
//   }

//   public static void main (String[] args) {  
//     // keep this function call here     
//     Scanner s = new Scanner(System.in);
//     System.out.print(PalindromeSwapper(s.nextLine())); 
//   }

// }