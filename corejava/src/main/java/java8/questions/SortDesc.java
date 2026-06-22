package java8.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDesc {
    //        Sort list in Descending order
    public static void main(String[] args){
        List<Integer> li = Arrays.asList(8,4,1,3,2,5,7);
        List<Integer> sortDesc = li.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Sort list in Descending order : "+sortDesc);
    }
}
