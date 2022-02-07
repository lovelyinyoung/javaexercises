import java.util.*;

class ArrayListTest {
    public static void main (String args []) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("Before:" + list);
        list.add(2, 10);
        System.out.println("After:" + list);

        list.remove(10);
        System.out.println("After removing index 10:" + list);

    }
}
