package collection.Questions;

import java.util.*;

public class FindDuplicate {
//    Find Common Elements Between Two Lists
    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> list2 = Arrays.asList(30, 40, 50, 60, 70);

        list1.stream().filter(list2::contains).toList().forEach(System.out::println);
    }
}
