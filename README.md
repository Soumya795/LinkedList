# LinkedList
public class Linked {
    //Node class
    static class Node {
        int data;
        Node next;

        //constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public int size;
    //Represent the head and tail of the linked list
    public Node head = null;
    public Node tail = null;


    //addNode() will add a new node to list
    public void addNode(int data) {
        Node newNode = new Node(data);

        //checks if te list is empty
        if (head == null) {
            //if list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        //size will count the no.of nodes present in the list
        size++;
    }


    //function to insert node at the middle of the list
    public void insertAtMid(int data) {
        //create a new node
        Node newNode = new Node(data);

        //checks if list is empty
        if (head == null) {
            // if list is empty, both head and tail would point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            Node temp, current;
            //Store the mid position of the list
            int count = (size %2 == 0) ? (size/2) : ((size+1)/2);
            //node temp will point to head
            temp = head;
            current = null;

            //Traverse through the list
            for (int i = 0; i<count; i++) {
                //Node current will point to temp
                current = temp;
                //Node temp will point to node next to it.
                temp = temp.next;
            }
            //current will point to new node
            current.next = newNode;
            //new node will point to temp
            newNode.next = temp;
        }
        size++;

    }
    // function for display linked list
    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("list is empty.");
            return;
        }
        while (current != null) {
            System.out.println(current.data +" ");
            current = current.next;
        }
        System.out.println();
    }
    //delete first Element from the List
    public static Node pop(Node headRef) {
        if (headRef == null) {
            return null;
        }
        int result = headRef.data;
        headRef = headRef.next;
        System.out.println("the popped node is "+result);
        return headRef;
    }
    //delete last Element from the list
    public void popFromLast () {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        else {
            if(head!= tail) {
                Node current = head;
                //loop through the list till the second last element
                while (current.next != tail) {
                    current = current.next;
                }
                //Second last element will become new tail
                tail = current;
                tail.next = null;
            }
            else {
                head = tail = null;
            }
        }
    }
    //pop middle element from a linked list
    void popMiddleElement() {
        Node temp, current;
        //checks if the list is empty
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        else {
            //store the mid position of the list
            int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);
            //checks whether the head is equal to the tail or not
            if (head != tail) {
                //initially , temp will point to head
                temp = head;
                current = null;
                //current will point to node previous to temp
                for (int i =0; i<count; i++) {
                    current = temp;
                    temp = temp.next;
                }
                if (current!=null) {
                    //temp is the middl that needs to be removed
                    current.next = temp.next;
                    //Delete temp
                    temp = null;
                }
                //if current point to NULL, head and tail will point to node next to temp.
                else {
                    head = tail = temp.next;
                    //Delete temp
                    temp = null;
                }
            }
            //if the list contains only one element
            //then it will removw it and both head and tail will point to null
            else {
                head = tail = null;
            }
            size--;
        }
    }
    //SearchNode will search for a given node in the list
    public void searchNode(int data) {
        Node current = head;
        int i = 1;
        boolean flag = false;
        //checks whether list is empty
        if (head == null) {
            System.out.println("list is empty");
        }
        else {
            while(current != null) {
                //compares node to be found with each node present in the list
                if (current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if (flag)
            System.out.println("Element present in the at the position :"+i);
        else
            System.out.print("Element is not present in the list");
    }


    //Driver program to test above
    public static void main(String[] args ) {
        /*creating list
        head = null;
        head = new Node(56);
        head.next = new Node(70); */
        Linked li = new Linked();
        System.out.println("Welcome to Linked List:");
        //adds data to the list.
        li.addNode(56);
        li.addNode(30);
        li.addNode(40);
        li.addNode(70);

        System.out.println("Original list");
        li.display();

        //inserting node 30 in between 56 & 70
        //li.insertAtMid(30);
        //System.out.println("updated list: ");
        //li.display();

        //li.searchNode(30);
        //li.pop();
        //System.out.println("Updated list");
        //li.display();

        //inserting node 40 in between 56,30 & 70.
        //li.insertAtMid(40);
        //System.out.println("updated list:");
        //li.display();

        li.searchNode(40);
        li.popMiddleElement();
        //print updated list
        System.out.println("updated list:");
        li.display();

