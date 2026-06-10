package java8;

import java.util.Arrays;
import java.util.List;

public class Square_Q2 {
    public static void main(String[] args){
//        Square of each Number
        List<Integer> li = Arrays.asList(1,2,3,4);
        List<Integer> square = li.stream()
                .map(x->x*x)
                .toList();
        System.out.println("Square of each Number from list : "+square);
    }
}
