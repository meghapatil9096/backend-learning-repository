package collection;

import java.util.*;

public class Queue_Interface {
    public static void main(String[] args) {
//      Implement Queue using LinkedList
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        System.out.println(q1.poll()); //show and remove first element
        System.out.println(q1);
        System.out.println(q1.peek()); // only show first element

//        Reverse a Queue
        List<Integer> l1 = new ArrayList<>(q1);
        l1.sort(Comparator.reverseOrder());
        System.out.println("Reverse a Queue : " + l1);
//        Find size of Queue
        System.out.println("Queue size is : "+q1.size());
//        Check Queue empty or not
        System.out.println("Queue is empty? : "+q1.isEmpty());



    }
}
