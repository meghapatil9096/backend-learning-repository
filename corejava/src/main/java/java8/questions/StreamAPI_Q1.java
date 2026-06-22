package java8.questions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class StreamAPI_Q1 {
    public static void main(String[] args){
//        Find Even number in a list using stream
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evenNo = list.stream()
                .filter(x->x%2==0)
                .toList();
        System.out.println("Even Number from list : "+evenNo);

        Consumer<String> li = (s)-> System.out.println(s);
        Supplier<String> li1 = ()->"Hello Supplier";
    }
}
