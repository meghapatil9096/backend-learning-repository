package multithreading;

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
        }
    }
}

public class Thread_extend {
    public static void main(String[] args){

        A a=new A();
        a.start();  // Thread have start method to start and call run method.

        for (int i = 1; i <= 5; i++) {
            System.out.println("Namaste");
        }
    }
}
