// There is a collection of input strings and a collection of query strings.
// For each query string, determine how many times it occurs in the list of input strings. 
// Return an array of the results.

// The first line contains and integer n, the size of string [].
// Each of the next n lines contains a string [i] .
// The next line contains q, the size of queries [].
// Each of the next q lines contains a string queries [i].

import java.io.*;
import java.util.*;

public class SparseArray {
    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<>();
        strings.add("aba");
        strings.add("baba");
        strings.add("aba");
        strings.add("xzxb");

        List<String> queries = new ArrayList<>();
        queries.add("aba");
        queries.add("xzxb");
        queries.add("ab");

        Result.matchingStrings(strings, queries);
    }

    class Result {
        public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
            Map<String, Integer> map = new HashMap<>(); //string, count
            for (int i = 0; i < strings.size(); i++) {
                if (map.containsKey(strings.get(i))) {
                    map.replace(strings.get(i),
                                Integer.valueOf(map.get(strings.get(i)) + 1));
                } 
                else {
                    map.put(strings.get(i), 1);
                }
            }

            List<Integer> returnList = new ArrayList<>();
            for (int i = 0; i < queries.size(); i++) {
                returnList.add(map.get(queries.get(i)) == null ? 0 : map.get(queries.get(i))); 
            }
            
            System.out.println(returnList);
            return returnList;
            }
        }
    }


