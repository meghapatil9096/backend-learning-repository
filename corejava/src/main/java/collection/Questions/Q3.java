package collection.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
//     Find Pairs with Target Sum :  You are given two lists of integers
//      Using Java Stream API, write a program to find all pairs of elements (a, b) such that:
//          a is from list1
//          b is from list2
//      The sum of a and b is 18
//    --> Output — (a, b)

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 6, 17, 1, 10, 8);
        List<Integer> list2 = Arrays.asList(1, 17, 12, 12, 2, 4, 6);

        List<String> pair = list1.stream()
                .flatMap(a -> list2.stream()
                        .filter(b -> a + b == 18)
                        .map(b -> "{"+ a + "," + b+"}"))
                .toList();
        System.out.println("pair of element from list1 + list2 = 18 : " +pair);
    }
}
