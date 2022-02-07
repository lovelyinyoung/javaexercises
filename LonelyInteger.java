// Given an array of integers, where all elements but one occur twice, 
// find the unique element.

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.*;

public class LonelyInteger {
    public static void main(String[] args) throws IOException {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);

        System.out.println(Result.lonelyinteger(a));
    }

    class Result {
        public static int lonelyinteger(List<Integer> a) {
            Map <Integer, Integer> map = new HashMap<>(); //number, count
            
            for (Integer item : a) {
                if (map.containsKey(item)) {
                    map.replace(item, map.get(item) + 1);
                } else {
                    map.put(item, 1);
                }
            }

            Map<Integer, Integer> sortedMap = map.entrySet().stream()
                         .sorted(Entry.comparingByValue())
                         .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

            Iterator<Map.Entry<Integer, Integer>> iterator = sortedMap.entrySet().iterator();
            return iterator.next().getKey(); 
        }
    }
}
