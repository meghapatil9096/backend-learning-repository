package collection.list;

import java.util.*;

public class Array_List {

    public static void main(String[] args){
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(3);
        li.add(1,2);
        System.out.println(li);

        List<Integer> li1 = new ArrayList<>();
        li1.addAll(li);
        li1.addAll(2,li);

        li.get(1);
        li.set(1,4);
        li.remove(2);
        li.contains(1); // true
        li.indexOf(1); // 0
        li.size();   // 2
        li.isEmpty(); // false

//       for loop print element
        for(int i=0; i<li.size(); i++){
            System.out.println(li.get(i));
        }

    }
}
