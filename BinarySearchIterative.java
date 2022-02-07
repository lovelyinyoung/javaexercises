public class BinarySearchIterative {
    public static boolean iterative(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (array[mid] == x) {
                return true;
            } else if (x < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main (String[] args) {
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

        iterative(array, 5);
    }
}
