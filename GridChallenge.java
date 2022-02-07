import java.io.*;
import java.util.*;

public class GridChallenge {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        list.add("eabcd");
        list.add("fghij");
        list.add("olkmn");
        list.add("trpqs");
        list.add("xywuv");

        Result.function (list);
    }

    class Result {

        /*
         * Complete the 'gridChallenge' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING_ARRAY grid as parameter.
         */
    
        public static String function (List<String> grid) {
            List<String> orderedList = new ArrayList<>();

            for (int i = 0; i < grid.size(); i++) {
                orderedList.add(sort(grid.get(i)));
    
                for (int j = 0; j < orderedList.get(0).length(); j++) {
                    if (orderedList.size() > 1 &&
                        orderedList.get(i-1).charAt(j) > orderedList.get(i).charAt(j)) {
                        return "NO";
                    }
                }
            }
            return "YES";
        }

        private static String sort (String str) { 
            boolean isSorted = false;
            char temp;
            StringBuilder builder = new StringBuilder(str);
        
            while(!isSorted) {
              isSorted = true;
              // System.out.println("*is sorted: " + isSorted);
        
              for(int i = 0; i < builder.length()-1; i++) {
                if(builder.charAt(i) > builder.charAt(i+1)) {
                    temp = builder.charAt(i);
                    builder.setCharAt(i, builder.charAt(i+1));
                    builder.setCharAt(i+1, temp);
                    
                    // System.out.println("**i: " + i + ", is sorted: " + isSorted);
                    isSorted = false;
                }
              }
            }
            return builder.toString();
          } 
    }
}