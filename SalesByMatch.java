import java.io.*;
import java.util.*;

public class SalesByMatch {
    public static void main(String[] args) throws IOException {
        int n = 9;
        List<Integer> ar = new ArrayList<>();
        ar.add(10);
        ar.add(20);
        ar.add(20);
        ar.add(10);
        ar.add(10);
        ar.add(30);
        ar.add(50);
        ar.add(10);
        ar.add(20);

        Result.sockMerchant(n, ar);
    }

    class Result {
        /*
         * Complete the 'sockMerchant' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. INTEGER_ARRAY ar
         */
    
        public static int sockMerchant(int n, List<Integer> ar) {
            Map<Integer, Integer> map = new HashMap<>(); //colour number, count

            for (int i = 0; i < ar.size(); i++) {
                if (map.containsKey(ar.get(i))) {
                    map.replace(ar.get(i), map.get(ar.get(i)) + 1);
                } else {
                    map.put(ar.get(i), 1);
                }
            }

            int pairCount = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                pairCount += entry.getValue() / 2;
            }

            return pairCount;
        }
    }
}
