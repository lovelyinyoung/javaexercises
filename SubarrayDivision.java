// Two children, Lily and Ron, want to share a chocolate bar. 
// Each of the squares has an integer on it.

// Lily decides to share a contiguous segment of the bar selected such that:
// The length of the segment matches Ron's birth month, and,
// The sum of the integers on the squares is equal to his birth day.
// Determine how many ways she can divide the chocolate.

import java.io.*;
import java.util.*;

public class SubarrayDivision {
    public static void main(String[] args) throws IOException {
        List<Integer> s = new ArrayList<>();
        s.add(2);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);

        int d = 4;
        int m = 3;

        Result.birthday(s, d, m);
    }

    class Result {
        public static int birthday(List<Integer> s, int d, int m) {
            int start = 0;
            int count = 0;
            int sum = 0;
            
            for(int i = 0; i < s.size(); i++) {
                sum += s.get(i);
                if(i - start + 1 == m) {
                    if(sum == d) {
                        count++;
                    }
                    
                    sum -= s.get(start);
                    start++;
                }
            }
            return count;
        }
    }
}
    // failed some tests below..
    //     public static int birthday(List<Integer> s, int d, int m) {
    //         Collections.sort(s);
            
    //         List<List<Integer>> list = new ArrayList<>();
    //         int count = 0;

    //         for (int i = 0; i < s.size(); i++) {
    //             int need = d - s.get(i);
    //             if (s.contains(need)) {
    //                 List<Integer> item = new ArrayList<>();
    //                 item.add(s.get(i));
    //                 item.add(need);

    //                 list.add(item);
    //             }
    //             if (m == 1 && s.get(i) == d) {
    //                 count++;
    //             }
    //         }
    //         return m == 1 ? count : list.size();
    //     }
    
    // }
