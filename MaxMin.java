import java.io.*;
import java.util.*;

public class MaxMin {
    public static void main(String[] args) throws IOException {
        int k = 3;
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(7);
        arr.add(2);

        Result.maxMin(k, arr);
    }

    class Result {

        /*
         * Complete the 'maxMin' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER k
         *  2. INTEGER_ARRAY arr
         */
    
        public static int maxMin(int k, List<Integer> arr) {
            Collections.sort(arr);
          
            int lowestGap = Integer.MAX_VALUE, candidate;
            
            for(int i=0; i <= arr.size() - k; i++) {
              candidate = arr.get(i + k - 1) - arr.get(i);
              lowestGap = candidate < lowestGap ? candidate: lowestGap;
            }
            return lowestGap;
        }
    
    }
}
