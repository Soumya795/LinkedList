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
        System.out.println("null");
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
        s.addNode(70);

        System.out.println("Original list");
        s.display();

        s.searchNode(30);
    }
}