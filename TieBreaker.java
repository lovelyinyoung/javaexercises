import java.io.*;

public class TieBreaker {
    public static void main(String[] args) throws IOException {
        int n = 100000;
        int m = 1;
        Result.towerBreakers(n, m);
    }

    class Result {

        /*
         * Complete the 'towerBreakers' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. INTEGER m
         */
    
        public static int towerBreakers(int n, int m) {
            return (n % 2 == 0 || m == 1) ? 2 : 1;
        } 
    }
}
