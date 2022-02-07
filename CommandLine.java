// Have the function CommandLine(str) take the str parameter being passed which 
// represents the parameters given to a command in an old PDP system. 
// The parameters are alphanumeric tokens (without spaces) followed by an equal sign and 
// by their corresponding value. 
// Multiple parameters/value pairs can be placed on the command line with a single space 
// between each pair. Parameter tokens and values cannot contain equal signs 
// but values can contain spaces.
// The purpose of the function is to isolate the parameters and values to return 
// a list of parameter and value lengths. It must provide its result in the same format 
// and in the same order by replacing each entry (tokens and values) 
// by its corresponding length.

// For example, 
// if str is: "SampleNumber=3234 provider=Dr. M. Welby patient=John Smith priority=High" 
// then your function should return the string "12=4 8=12 7=10 8=4" 
// because "SampleNumber" is a 12 character token with a 4 character value ("3234") 
// followed by "provider" which is an 8 character token 
// followed by a 12 character value ("Dr. M. Welby"), etc.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CommandLine {

public static String function (String str) {
    Pattern patternBeforeEqualSign = Pattern.compile("(\\w+)(?=\\=)");
    Matcher matcher1 = patternBeforeEqualSign.matcher(str);
    Pattern patternAfterEqualSign = Pattern.compile("(?<=(\\=))(.*?)(?=(( \\w*)\\=)|$)");
    Matcher matcher2 = patternAfterEqualSign.matcher(str);
    StringBuilder answer = new StringBuilder();
    while(matcher1.find() && matcher2.find()){
        answer.append(matcher1.group().length()).append("=").append(matcher2.group().length()).append(" ");
    }
    return answer.toString().trim();
    }

/** not efficient below and didn't pass all test cases */
//   public static String function (String str) {
//     String[] arr = str.split("[=]");
//     List<String> keys = new ArrayList<>();
//     List<String> values = new ArrayList<>();
//     int count = 0;

//     for (int i = 0; i < arr.length; i++) {
//       StringBuilder sb = new StringBuilder(arr[i]);  
//       sb.reverse();  

//       for (int j = 0; j < sb.toString().toCharArray().length; j++) {
//         if (i == 0) { //first element
//           keys.add(String.valueOf(sb.toString().length()));
//           break;
//         } 
//         else if (i == arr.length-1) { //last element
//           values.add(String.valueOf(sb.toString().length()));
//           break;
//         }
//         else { //elements between first and last
//           if (sb.toString().charAt(j) != ' ') {
//             count++;
//           } else {
//             keys.add(String.valueOf(count));
//             String remaining = sb.toString().substring(count, sb.toString().length());
//             values.add(String.valueOf(remaining.length()-1)); //remove space
//             count = 0;
//             break;
//          }
//         }
//       }
//     }

//     StringBuilder builder = new StringBuilder();
//     for (int i = 0; i < keys.size(); i++) {
//       builder.append(keys.get(i)).append("=").append(values.get(i)).append(" ");
//     }

//     return builder.toString();
//   }

  public static void main (String[] args) {  
    System.out.print(function ("SampleNumber=3234 provider=Dr. M. Welby patient=John Smith priority=High")); 
  }
}

// "a=3 b=4 a=23 b=a 4 23 c="  1=1 1=1 1=2 1=6 1=0
// "Options= operation=ADD priority=" 7=0 9=3 8=0
// "empty="  5=0