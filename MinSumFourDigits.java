// Given five positive integers, find the minimum and maximum values that can be calculated 
// by summing exactly four of the five integers. 
// Then print the respective minimum and maximum values as a single line of two space-separated long integers.

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class MinSumFourDigits {
    public static void main(String[] args) throws IOException {
        List<Integer> arr = new ArrayList<>();
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);

        Result.miniMaxSum(arr);
    }

    class Result {
        public static void miniMaxSum(List<Integer> arr) {
            Collections.sort(arr);
            List<BigInteger> list = new ArrayList<>();
    
            for (Integer item : arr) {
                list.add(BigInteger.valueOf(item));
            }
    
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(list.get(0).add(list.get(1)).add(list.get(2)).add(list.get(3))))
            .append(" ")
            .append(String.valueOf(list.get(1).add(list.get(2)).add(list.get(3)).add(list.get(4))));
    
            System.out.println(sb.toString());
        }
    }
}
