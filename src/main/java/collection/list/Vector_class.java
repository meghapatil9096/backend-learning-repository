package collection.list;

import java.util.List;
import java.util.Vector;

public class Vector_class {
    public static void main(String[] args){
        List<Integer> li = new Vector<>();
        li.add(1);
        li.add(3);
        li.add(1,2);
        System.out.println(li);

        List<Integer> li1 = new Vector<>();
        li1.addAll(li);
        System.out.println("New List : "+li1);
        li1.addAll(2,li);
        System.out.println("List added from index 2 : "+li1);
        System.out.println("get index 2 value :"+li.get(2));
        li.set(1,4);
        System.out.println("set index 1 value to 4 : "+li);
        li.remove(2);
        System.out.println("remove index 2 value : "+li);
        System.out.println("List 2 : "+li1);
        li1.removeAll(li);
        System.out.println("Remove all matching elements list from list2 : "+li1);
        li.add(1);
        li.clear();
        System.out.println("clear all elements from list : "+li);
    }
}
