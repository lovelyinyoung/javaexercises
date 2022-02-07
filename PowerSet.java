// input set = [1, 2, 3]
// power set = [[], [1], [2], [3], [1, 2], [2, 3], [1, 3] [1, 2, 3]]

// (1) Loop from 0 to 2N square
// (2) For each number get the binary representation of the number, e.g. 3 = 011
// (3) Determine from the binary representation whether or not to include a number from the set, e.g. 011 = [exclude, include, include]

// 0 = 000 [exclude, exclude, exclude] = []
// 1 = 001 [exclude, exclude, include] = [3]
// 2 = 010 [exclude, include, exclude] = [2]
// 3 = 011 [exclude, include, include] = [2, 3]
// 4 = 100 [include, exclude, exclude] = [1]
// 5 = 101 [include, exclude, include] = [1, 3]
// 6 = 110 [include, include, exclude] = [1, 2]
// 7 = 111 [include, include, include] = [1, 2, 3]

import java.util.*;

public class PowerSet {
    public static void main(String[] args) throws Exception {
        int[] array = new int[] {1, 2, 3};
        int total = (int) Math.pow(2, array.length);
        ArrayList<ArrayList<Integer>> results = generatePowerSets(array, total);
        System.out.println(results);
    }

    public static ArrayList<ArrayList<Integer>> generatePowerSets(int[] array, int total) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            results.add(powerSets(array, i));
        }
        return results;
    }

    public static ArrayList<Integer> powerSets(int[] array, int n) {
        ArrayList<Integer> results = new ArrayList<>();
        ArrayList<Integer> binaryList = convertToBinary(n, array.length);
        for (int i = 0; i < binaryList.size(); i++) {
            if (binaryList.get(i) == 1) {
                results.add(array[i]);
            }
        }
        return results;
    }

    public static ArrayList<Integer> convertToBinary(int n, int ZeroPadding) {
        // convert decimal to binary and zero padding
        ArrayList<Integer> results = new ArrayList<>();
        while (n > 0 || ZeroPadding > 0) { 
            results.add(0, n % 2);
            n = n / 2;
            ZeroPadding--;
        }
        return results;
    }
}