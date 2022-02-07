public class RecursionReverseString {
    public static String reverse(String input) {
        if (input.equals("")) {
            return "";
        }

        return reverse(input.substring(1)) + input.charAt(0);
    }

    public static void main (String[] args) {
        reverse("hello");
    }
}
