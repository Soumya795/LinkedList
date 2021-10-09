package LinkedListProblem;

public class Linkedlist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int size;
    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {

            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("list is empty.");
            return;
        }
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    void popMiddleElement() {
        Node temp, current;
        if (head == null) {
            System.out.println("list is empty");
            return;
        } else {

            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);

            if (head != tail) {
                temp = head;
                current = null;

                for (int i = 0; i < count; i++) {
                    current = temp;
                    temp = temp.next;
                }
                if (current != null) {

                    current.next = temp.next;
                    temp = null;
                } else {
                    head = tail = temp.next;

                    temp = null;
                }
            } else {
                head = tail = null;
            }
            size--;
        }
    }

    public void searchNode(int data) {
        Node current = head;
        int i = 1;
        boolean flag = false;

        if (head == null) {
            System.out.println("list is empty");
        } else {
            while (current != null) {

                if (current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if (flag)
            System.out.println("Element present in the at the position :" + i);
        else
            System.out.print("Element is not present in the list");
    }

    public static void main(String[] args) {

        Linkedlist s = new Linkedlist();
        System.out.println("Welcome to Linked List:");

        s.addNode(56);
        s.addNode(30);
        s.addNode(40);
        s.addNode(70);

        System.out.println("Original list");
        s.display();

        s.searchNode(40);
        s.popMiddleElement();
        System.out.println("updated list:");
        s.display();


    }

}