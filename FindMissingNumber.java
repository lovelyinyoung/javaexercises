import java.util.ArrayList;
import java.util.List;

class FindMissingNumber {
    static int findMissing(List<Integer> list) {
      int sum = 0;
      for (Integer item : list) {
        sum += item;
      }
    
      int n = list.size() + 1;  // There is exactly 1 number missing 
      int actualSum = (n * (n + 1)) / 2;

      return actualSum - sum;
    }
    
    public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
      list.add(3);
      list.add(7);
      list.add(1);
      list.add(2);
      list.add(8);
      list.add(4);
      list.add(5);

      System.out.println(findMissing(list));
    }
  }