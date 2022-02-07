// Given an array of integers, calculate the ratios of its elements that are 
// positive, negative, and zero. 
// Print the decimal value of each fraction on a new line with  places after the decimal.
// Print the following  lines, each to  decimals:

// proportion of positive values
// proportion of negative values
// proportion of zeros

import java.util.*;

public class SixDecimals {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // [-4, 3, -9, 0, 4, 1]
        list.add(-4);
        list.add(3);
        list.add(-9);
        list.add(0);
        list.add(4);
        list.add(1);

        Result.plusMinus(list);
    }

    class Result {
        public static void plusMinus(List<Integer> arr) {
            List<Integer> zeros = new ArrayList<>();
            List<Integer> positives = new ArrayList<>();
            List<Integer> negatives = new ArrayList<>();
    
            for (Integer item : arr) {
                if (item == 0) {
                    zeros.add(item);
                } else if (item > 0) {
                    positives.add(item);
                } else if (item < 0) {
                    negatives.add(item);
                }
            }
    
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%.6f", positives.size() / (double) arr.size())).append("\n")
            .append(String.format("%.6f", negatives.size() / (double) arr.size())).append("\n")
            .append(String.format("%.6f", zeros.size() / (double) arr.size()));
    
            System.out.println(sb.toString());
        }
    }
}
