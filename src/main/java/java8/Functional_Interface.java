package java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Demo{
    void display();

    default void name(){
        System.out.println("Megha");
    }
    static void date(){
        System.out.println("26-05-2026");
    }

}
public class Functional_Interface {
    public static void main(String[] args){
        Demo.date();
        Demo d = new Demo() {
            @Override
            public void display() {
                System.out.print("Display name : ");
            }
        };

        d.display();
        d.name();

        Predicate<Integer> p = x -> x>10;
        System.out.println("Predicate : "+p.test(20));

        Function<Integer,Integer> f = x-> x * x;
        System.out.println("Function : "+f.apply(4));

        Consumer<String> c = x-> System.out.println(x);
        c.accept("Hello");

        Supplier<Double> s = () -> Math.random();
        System.out.println(s.get());
    }

}
