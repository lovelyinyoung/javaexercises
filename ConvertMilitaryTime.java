// Given a time in -hour AM/PM format, convert it to military (24-hour) time.

// Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
//       - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

import java.io.*;

class Result {
    public static String timeConversion(String s) {
        String amOrPm = s.substring(s.length()-2, s.length());
        String[] arr = s.substring(0, s.length()-2).split(":");
        String hour = arr[0];
        StringBuilder sb = new StringBuilder();

        if (amOrPm.equals("AM") && hour.equals("12")) {
            return sb.append("00").append(":").append(arr[1]).append(":").append(arr[2]).toString();
        } 
        else if (amOrPm.equals("PM") && Integer.valueOf(hour) < 12) {
            return sb.append( String.valueOf(Integer.valueOf(hour) + 12))
            .append(":").append(arr[1]).append(":").append(arr[2]).toString();

        }
        return s.substring(0, s.length()-2);
    }
}

public class ConvertMilitaryTime {
    public static void main(String[] args) throws IOException {
    //  Result.timeConversion("12:01:33PM");
     Result.timeConversion("12:01:33AM");
    }
}
