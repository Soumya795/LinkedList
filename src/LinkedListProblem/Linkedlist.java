package LinkedListProblem;

public class Linkedlist {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }


    static void insertAtMid(int x) {

        if (head == null)
            head = new Node(x);
        else {

            Node newNode = new Node(x);

            Node ptr = head;
            int len = 0;

            while (ptr != null) {
                len++;
                ptr = ptr.next;
            }
            int count = ((len % 2) == 0) ? (len / 2) : (len + 1) / 2;
            ptr = head;
            while (count-- > 1)
                ptr = ptr.next;

            newNode.next = ptr.next;
            ptr.next = newNode;
        }
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        head = new Node(56);
        head.next = new Node(70);

        System.out.println("linked list before insertion:");
        display();

        int x = 30;
        insertAtMid(x);
        System.out.println("linked list after insertion:");
        display();


    }
}