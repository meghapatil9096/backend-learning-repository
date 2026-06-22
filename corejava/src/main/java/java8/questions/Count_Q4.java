package java8.questions;

import java.util.Arrays;
import java.util.List;

public class Count_Q4 {
    public static void main(String[] main){
//        Count elements in a list
        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7);
        Long count = li.stream().count();

        Long count2 = (long) li.size();

//        Find first element from list
        List<Integer> list = Arrays.asList(2,3,4,7,1);
        List<Integer> findFirst = list.stream().findFirst().stream().toList();
        System.out.println("first element from list : "+findFirst);

//        Find Maximum number from list
        List<Integer> max = list.stream().max(Integer::compare).stream().toList();
        System.out.println("Maximum number from list : "+max);

//        Find Maximum number from list
        List<Integer> min = list.stream().min(Integer::compare).stream().toList();
        System.out.println("Minimum number from list : "+min);
    }
}
