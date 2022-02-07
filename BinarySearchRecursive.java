public class BinarySearchRecursive {
    public static boolean recursive (int[] array, int x) {
        return recursive(array, x, 0, array.length - 1);
    }

    private static boolean recursive(int[] array, int x, int left, int right) {
        if (left > right) {
            return false;
        }

        int mid = left + ((right - left) / 2);
        if (array[mid] == x) {
            return true;
        } else if (x < array[mid]) {
            return recursive(array, x, left, mid - 1);
        } else {
            return recursive(array, x, mid + 1, right);
        }
    }

    public static void main (String[] arr) {
        int[] array = new int[10];

        array[0] = 0;
        array[1] = 3;
        array[2] = 5;
        array[3] = 10;
        array[4] = 20;
        array[5] = 22;
        array[6] = 33;
        array[7] = 40;
        array[8] = 44;
        array[9] = 60;

        recursive(array, 5);
    }
}
