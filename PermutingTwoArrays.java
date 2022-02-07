// There are two n-element arrays of integers, A and B. 
// Permute them into some A' and B' such that the relation A'[i] + B'[i] >= k
// holds for all i where 0 <= i < n.
// There will be q queries consisting of A, B, and k. 
// For each query, return YES if some permutation A', B' satisfying the relation exists. 
// Otherwise, return NO.

import java.io.*;
import java.util.*;

public class PermutingTwoArrays {
    public static void main(String[] args) throws IOException {
        int k = 10;
        
        List<Integer> A = new ArrayList<>();
        A.add(2);
        A.add(1);
        A.add(3);

        List<Integer> B = new ArrayList<>();
        B.add(7);
        B.add(8);
        B.add(9);
        
        Result.twoArrays(k, A, B);
    }

    class Result {

        /*
         * Complete the 'twoArrays' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER k
         *  2. INTEGER_ARRAY A
         *  3. INTEGER_ARRAY B
         */
    
        public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
            Collections.sort(A, Collections.reverseOrder());
            Collections.sort(B);
            
            for (int i = 0; i < A.size(); i++) {
                if (!(A.get(i) + B.get(i) >= k)) {
                    return "NO";
                }
            }
            return "YES";
        }
    }
}
