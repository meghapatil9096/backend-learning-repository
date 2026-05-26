package java8;

import java.util.function.Consumer;

public class Method_Reference {
    public static void main(String[] args){
//        Consumer<String> c = x->System.out.println(x);
//        After using method reference
        Consumer<String> c = System.out::println;
        c.accept("Method Reference");
    }
}
