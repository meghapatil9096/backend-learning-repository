package java8;

interface calculator {
    int add(int a, int b);
}

public class Lambda_Expression {

    public static void main(String[] args) {
        calculator c = (a, b) -> a + b;
        System.out.println("Sum of a & b is " + c.add(10, 20));
    }
}
