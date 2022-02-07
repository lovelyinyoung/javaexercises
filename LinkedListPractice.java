import java.util.LinkedList;

class LinkedListPractice {
    public static void main (String args[]) {
        LinkedList<String> travelList = new LinkedList<>();

        // Add
        travelList.add("Florida - USA"); /// *** Time complexity - O(1)
        travelList.addFirst("Seoul - South Korea");
        travelList.addLast("Victoria - Canada");
        travelList.add(2, "Lottradam - the Netherlands");
        System.out.println(travelList);

        // Access
        System.out.println(travelList.get(2)); // not efficient
        System.out.println(travelList.getFirst()); // most efficient
        System.out.println(travelList.getLast()); // worst efficent
        System.out.println(travelList.contains("Florida - USA")); // not efficient

        // Remove
        travelList.removeFirst();
        travelList.removeLast();
        System.out.println(travelList);

        travelList.remove("Florida - USA");
        travelList.remove(0);

        System.out.println(travelList);
    }
}