package collection.Questions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q2 {

//    Using Java Stream API, write code to find the union of the two lists — that is,
//    a list containing all unique elements, sorted in descending order.
//    Input:
//          List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
//          List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 9);
//    Output:
//           [9, 8, 7, 6, 5, 4, 3, 2, 1]

    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 9);

//        1st way
        List<Integer> list3 = new ArrayList<>(list1);
        list3.addAll(list2);
        List<Integer> n=  list3.stream()
                            .distinct().sorted(Comparator.reverseOrder())
                            .toList();
        System.out.println("Unique element in descending order : "+n);

//        2nd way
        List<Integer> unique = Stream.concat(list1.stream(),list2.stream())
                .distinct().sorted(Comparator.reverseOrder()).toList();

        System.out.println("2nd way Unique element in descending order : "+unique);
    }

}
