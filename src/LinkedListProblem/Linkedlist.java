package LinkedListProblem;

public class Linkedlist {
    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node pop(Node headRef) {
        if (headRef == null) {
            return null;
        }
        int result = headRef.data;
        headRef = headRef.next;
        System.out.println("the popped node is " + result);
        return headRef;
    }

    public static void main(String[] args) {

        int[] keys = {56, 30, 70};

        Node head = null;

        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
        head = pop(head);
        display(head);


    }
}