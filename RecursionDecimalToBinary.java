public class RecursionDecimalToBinary {
    public static void main (String[] args) {
        System.out.println(toBinary(233, ""));
    }

    public static String toBinary(int decimal, String result) {
        if (decimal == 0) {
            return result;
        }

        result = decimal % 2 + result;
        return toBinary(decimal / 2, result);
    }
}
