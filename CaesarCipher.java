import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CaesarCipher {
    public static void main(String[] args) throws IOException {
        String s = "Www.abc.xy";
        int k = 87;  
        Result.caesarCipher(s, k);
    }

    class Result {

        /*
         * Complete the 'caesarCipher' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. STRING s
         *  2. INTEGER k
         */
    
        public static String caesarCipher(String s, int k) {
            // k = k % 26;
            // int length = s.length();
            // for (int i = 0; i < length; i++) {
            //     if (!Character.isAlphabetic(s.charAt(i))) {
            //         s += Character.toString(s.charAt(i));
            //         continue;
            //     }
            //     if (k > 0 && Character.toLowerCase(s.charAt(i)) + k > 'z') {
            //         s += Character.toString(s.charAt(i) - 26 + k);
            //         continue;
            //     }
            //     s += Character.toString(s.charAt(i) + k);
            // }

            // return s.substring(length);

            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            Map<String, Integer> map = new HashMap<>(); //letter, index
            for (int i = 0; i < alphabet.toCharArray().length; i++) {
                map.put(String.valueOf(alphabet.charAt(i)), i);
            }

            int length = s.length();
            for (int i = 0; i < length; i++) {
                String originalLetter = String.valueOf(s.charAt(i)).toLowerCase();
                char newLetter;
                
                if (map.get(originalLetter) == null) { //special characters
                    newLetter = s.charAt(i);
                } else if (map.get(originalLetter).intValue() + k < alphabet.length()) {
                    newLetter = alphabet.charAt(map.get(originalLetter).intValue() + k);
                } else {
                    newLetter = alphabet.charAt((map.get(originalLetter).intValue() + k) % alphabet.length());
                }

                if (Character.isUpperCase(s.charAt(i))) {
                    s += Character.toUpperCase(newLetter);
                } else {
                    s += newLetter;
                }
            }
            System.out.println(s.substring(length));
            return s.substring(length);
        }
    }
}
