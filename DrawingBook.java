import java.io.*;

public class DrawingBook {
    public static void main(String[] args) throws IOException {
        int n = 4;
        int p = 4;

        Result.pageCount(n, p);
    }

    class Result {

        /*
         * Complete the 'pageCount' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. INTEGER p
         */
        public static int pageCount(int n, int p) {
            int half = n / 2;

            if(p <= half){
                return p / 2;
            }
            return half - (p / 2);

            // int readFromFront = 0;
            // int readFromBack = 0;
            
            // if (p == 1 || n == p) {
            //     return 0;
            // }

            // if (n % 2 != 0 && p % 2 != 0) {
            //     // odd total number and odd page number
            //     readFromFront = (p - 1) / 2;
            //     readFromBack = (n - p) / 2;
            // } else if ((n % 2 == 0 && p % 2 == 0)) { 
            //     // even total numbers and even page number
            //     readFromFront = p / 2;
            //     readFromBack = (n - p) / 2;
            // } else if (n % 2 == 0 && p % 2 != 0) { 
            //     // even total numbers and odd page number
            //     readFromFront = p / 2;
            //     readFromBack = (n - p - 1) / 2;
            // } else if (n % 2 != 0 && p % 2 == 0) { 
            //     // odd total numbers and even page number
            //     readFromFront = p / 2;
            //     readFromBack = (n -1 - p) / 2;
            // }
            
            // return Math.min(readFromFront, readFromBack);
        }
    }
}
