package collection.list;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {
    public static void main(String[] args){
        List<String> li = new LinkedList<>();
        li.add("Hello");
        li.add("Welcome");
        li.add(1,"and");
        System.out.println(li);

        List<String> li1 = new LinkedList<>();
        li1.addAll(li);
        System.out.println("New List : "+li1);
        li1.addAll(2,li);
        System.out.println("List added from index 2 : "+li1);
        System.out.println("get index 1 value : "+li.get(1));
        li.set(1,"And");
        System.out.println("set index 1 value to And : "+li);
        li.remove("And");
        System.out.println("remove And object from list : "+li);

        LinkedList<Integer> l2= new LinkedList<>();
        l2.add(1);
        l2.addFirst(2);
        l2.addLast(5);
        l2.getFirst(); // 1
        l2.getLast();  //5
        l2.isEmpty(); // false
        l2.contains(2);

    }
}
