package java8.questions;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI_Question {
    public static void main(String[] args) {
//        Find Even Numbers
        List<Integer> li = new ArrayList<>();
        li.add(2);
        li.add(3);
        li.add(1);
        li.add(4);
        li.add(3);
        li.add(6);
        List<Integer> even = li.stream()
                                .filter(x -> x % 2 == 0)
                                .collect(Collectors.toList());
        System.out.println("Even number from list : "+even);

//        Find Duplicate Elements
        Set<Integer> s = new HashSet<>();
        System.out.print("Duplicate element from list : ");
        li.stream().filter(x-> !s.add(x)).forEach(System.out::println);

//        Find Max Number
        int i = li.stream().max(Integer::compare).get();
        System.out.println("Max element from list : "+i);
        int i1 =li.stream().min(Integer::compare).get();
        System.out.println("Min element from list : "+i1);

//        Convert List to Uppercase
        List<String> name = new ArrayList<>();
        name.add("Rahul");
        name.add("ajay");
        name.add("vivek");
        String s1 = name.stream().map(String::toUpperCase).collect(Collectors.toList()).toString();
        System.out.println("UpperCase : "+s1);

//        Count elements
        long l = name.stream().count();
        System.out.println(l);

//        Find second-highest number
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(12);
        l1.add(21);
        l1.add(13);
        l1.add(15);
        l1.add(71);
        Integer secondHighest = l1.stream()
                                .sorted(Collections.reverseOrder())
                                .skip(1)
                                .findFirst()
                                .get();
        System.out.println("Second highest element from list : "+secondHighest);

//      Remove duplicates
        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(12);
        l2.add(21);
        l2.add(1);
        l2.add(15);
        l2.add(71);
        List<Integer> l3 = l2.stream().distinct().collect(Collectors.toList());
        System.out.println(l3);

    }
}
