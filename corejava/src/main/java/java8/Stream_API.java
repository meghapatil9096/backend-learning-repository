package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream_API {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>(Arrays.asList(1, 24, 3, 41, 5, 5, 16));

        System.out.println("filter() : ");
        li.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println("map() : ");
        li.stream().map(x -> x * x).forEach(System.out::println);

        System.out.println("sorted() : ");
        li.stream().sorted().forEach(System.out::println);

        System.out.println("distinct() : ");
        li.stream().distinct().forEach(System.out::println);

        List<Integer> even = li.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Number from List using colect() : " + even);

        System.out.println("Count() : " + li.stream().count());
        System.out.println("FindFirst: " + li.stream().findFirst());

        List<Integer> i = li.parallelStream()
                            .filter(x -> x % 2 == 0)
                            .collect(Collectors.toList());
        System.out.println(i);

        System.out.println(li);
//        convert to Set
        Set<Integer> i1= li.stream().collect(Collectors.toSet());
        System.out.println(i1);

    }
}
