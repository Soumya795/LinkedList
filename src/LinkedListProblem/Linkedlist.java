package LinkedListProblem;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> s = new LinkedList<>();
        System.out.println("Welcome to Linked List:");

        s.add(70);

        System.out.println("list:" + s);
        s.addLast(30);
        s.addLast(56);

        System.out.println("new list:" + s);

        Iterator i = s.descendingIterator();
        System.out.println("Reversing list:");
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}