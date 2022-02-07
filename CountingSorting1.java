
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class CountingSorting1 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        list.add(63);
        list.add(25);
        list.add(73);
        list.add(1);
        list.add(98);
        list.add(56);
        list.add(73);
        list.add(56);
        list.add(56);
        Result.countingSort(list);
    }

    class Result {
        public static List<Integer> countingSort(List<Integer> arr) {
            Map<Integer, Integer> map = new HashMap<>(); //value, count
            for (int i = 0; i < arr.size(); i++) {
                if (map.containsKey(arr.get(i))) {
                    map.replace(arr.get(i), map.get(arr.get(i))+1);
                } else {
                    map.put(arr.get(i), 1);
                }
            }
            
            int[] array = new int[100];
            for (Map.Entry<Integer, Integer> item : map.entrySet()) {
                array[item.getKey()] = item.getValue();
            }

            return Arrays.stream(array)        // IntStream
                         .boxed()              // Stream<Integer>
                         .collect(Collectors.toList());
        }
    }
}
