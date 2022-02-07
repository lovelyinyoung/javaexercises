// Given a square matrix, calculate the absolute difference between the sums of its diagonals.

// For example, the square matrix  is shown below:
// 1 2 3
// 4 5 6
// 9 8 9 
// The left-to-right diagonal 1+5+9=15. The right to left diagonal 3+5+8=17. 
// Their absolute difference is 2. 


import java.io.*;
import java.util.*;

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        // 11 2 4
        // 4 5 6
        // 10 8 -12

        List<Integer> inner1 = new ArrayList<>();
        inner1.add(11);
        inner1.add(2);
        inner1.add(4);
        List<Integer> inner2 = new ArrayList<>();
        inner2.add(4);
        inner2.add(5);
        inner2.add(6);
        List<Integer> inner3 = new ArrayList<>();
        inner3.add(10);
        inner3.add(8);
        inner3.add(-12);

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(inner1);
        outer.add(inner2);
        outer.add(inner3);

        Result.diagonalDifference(outer);
    }

    class Result {
        public static int diagonalDifference(List<List<Integer>> arr) {
            int sum1 = 0;
            int sum2 = 0;
            int num = arr.size()-1;
            
            for (int i = 0; i <= arr.size()-1; i++) {
                sum1 += arr.get(i).get(i);
                sum2 += arr.get(i).get(num);
                num--;
            }

            return Math.abs(sum1-sum2);
        }
    }
}
