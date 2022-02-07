// You will be given a list of 32 bit unsigned integers. 
// Flip all the bits (0 to 1 and 1 to 0) and return the result as an unsigned integer.

import java.io.*;
import java.lang.Long;

public class FlippingBits {
    public static void main(String[] args) throws IOException {
      Result.flippingBits(9);
     
    }

    class Result {
        public static long flippingBits(long n) {
            // System.out.println("Before:" + Long.toBinaryString(n & 0xffffffffL | 0x100000000L).substring(1));
            // Java8: System.out.println(Long.toBinaryString(Integer.toUnsignedLong(9) | 0x100000000L ).substring(1));
            String bits = Long.toBinaryString(n & 0xffffffffL | 0x100000000L).substring(1);
            StringBuilder b = new StringBuilder();
            for (int i = 0; i < bits.length(); i++) {
                if (bits.charAt(i) == '0') {
                    b.append("1");
                } else {
                    b.append("0");
                }
            }

            // System.out.println("After: " + b.toString());
            
            return Long.parseLong(b.toString(), 2);   
        }
    }
}
