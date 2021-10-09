package LinkedListProblem;

public class Linkedlist {
    class Node {
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
            System.out.println("List is empty.");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void pop() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        } else {
            if (head != tail) {
                Node current = head;

                while (current.next != tail) {
                    current = current.next;
                }

                tail = current;
                tail.next = null;
            } else {
                head = tail = null;
            }
        }
    }

    public static void main(String[] args) {
        Linkedlist s = new Linkedlist();
        System.out.println("Welcome to Linked List:");

        s.addNode(56);
        s.addNode(30);
        s.addNode(70);

        System.out.println("Original list");
        s.display();


        s.pop();
        System.out.println("Updated list");
        s.display();


    }
}