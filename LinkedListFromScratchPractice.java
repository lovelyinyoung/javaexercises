public class LinkedListFromScratchPractice {
    Node head;

    public void append(int data) {
        if (this.head == null) {
            this.head = new Node(data);
            return;
        } 
        
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node (data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void delete(int data) {
        if (head == null) { // zero element
            return;
        }

        if (head.data == data) { // only one element
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public static void main (String args[]) {
        LinkedListFromScratchPractice myList = new LinkedListFromScratchPractice();
        myList.append(10);
        myList.append(11);
        myList.append(12);
        myList.append(18);
        myList.prepend(1);
        System.out.println(myList.head.data);
        System.out.println(myList.head.next.data);

        myList.delete(10);
        System.out.println(myList.head.data);
        System.out.println(myList.head.next.data);
    }
}

class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data; 
    }
}
