
import java.io.*;
import java.util.*;

public class DynamicArray {
    public static void main(String[] args) throws IOException {
        int n = 2;

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(0);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        list2.add(7);
    
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(0);
        list3.add(3);
        
        List<Integer> list4 = new ArrayList<>();
        list4.add(2);
        list4.add(1);
        list4.add(0);
        
        List<Integer> list5 = new ArrayList<>();
        list5.add(2);
        list5.add(1);
        list5.add(1);

        List<List<Integer>> queries = new ArrayList<>();
        queries.add(list1);
        queries.add(list2);
        queries.add(list3);
        queries.add(list4);
        queries.add(list5);

        Result.function(n, queries);
    }

    class Result {

        /*
         * Complete the 'dynamicArray' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. 2D_INTEGER_ARRAY queries
         */
    
        public static List<Integer> function (int n, List<List<Integer>> queries) {
            List<List<Integer>> arr = new ArrayList<>(n);
            int lastAnswer = 0;
            List<Integer> answers = new ArrayList<>();
            
            for(int i = 0; i < n; i++) {
                arr.add(new ArrayList<>());
            }
            
            int idx;
            for(List<Integer> query : queries) {
                int queryNum = query.get(0);
                int x = query.get(1);
                int y = query.get(2);
                
                if(queryNum == 1) {
                    idx = (x ^ lastAnswer) % n;
                    arr.get(idx).add(y);
                } else {
                    idx = (x ^ lastAnswer) % n;
                    lastAnswer = arr.get(idx).get(y % arr.get(idx).size());
                    answers.add(lastAnswer);
                }
            }
            return answers;
        }
    }
}
