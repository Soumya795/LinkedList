package LinkedListProblem;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args ) {
        LinkedList<Integer> s = new LinkedList<>();
        System.out.println("Welcome to Linked List:");

        s.add(56);

        System.out.println("list:"+s);
        s.addLast(30);
        s.addLast(70);

        System.out.println("new list:"+s);


    }
}