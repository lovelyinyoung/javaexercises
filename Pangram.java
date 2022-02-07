// A pangram is a string that contains every letter of the alphabet. 
// Given a sentence determine whether it is a pangram in the English alphabet.
// Ignore case. Return either pangram or not pangram as appropriate.

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class Pangram {
    public static void main(String[] args) throws IOException {
        String s = "We promptly judged antique ivory buckles for the prize";
        Result.pangrams(s);
    }

    class Result {
        public static String pangrams(String s) {
        Map<String, Boolean> map = new HashMap<>();
        map.put("a", false);
        map.put("b", false);
        map.put("c", false);
        map.put("d", false);
        map.put("e", false);
        map.put("f", false);
        map.put("g", false);
        map.put("h", false);
        map.put("i", false);
        map.put("j", false);
        map.put("k", false);
        map.put("l", false);
        map.put("m", false);
        map.put("n", false);
        map.put("o", false);
        map.put("p", false);
        map.put("q", false);
        map.put("r", false);
        map.put("s", false);
        map.put("t", false);
        map.put("u", false);
        map.put("v", false);
        map.put("w", false);
        map.put("x", false);
        map.put("y", false);
        map.put("z", false);

        for (char c : s.toCharArray()) {
            map.replace(String.valueOf(Character.toLowerCase(c)), true);
        }

        if (map.values().contains(false)) {
            return "not pangram";
        }
        return "pangram";
        }
    }
}
