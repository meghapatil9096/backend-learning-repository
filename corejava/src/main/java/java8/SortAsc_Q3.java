package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortAsc_Q3 {
    public static void main(String[] args){
//        Sort list in Ascending order
        List<Integer> list = Arrays.asList(3,5,12,2,8,1);
        List<Integer> sortAsc = list.stream().sorted().toList();
        System.out.println(sortAsc);

        List<Integer> sortA = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortA);

    }
}
