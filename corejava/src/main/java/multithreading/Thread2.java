package multithreading;
class JoinMethod extends Thread{
    public void run(){
        String n =Thread.currentThread().getName();
        for(int i=0;i<3;i++){
            System.out.println(n);
        }
    }
}
public class Thread2 {
    public static void main(String[] args) throws InterruptedException {
        JoinMethod j1 = new JoinMethod();
        JoinMethod j2 = new JoinMethod();
        JoinMethod j3 = new JoinMethod();

        j1.setName("Thread 1");
        j2.setName("Thread 2");
        j3.setName("Thread 3");

        j2.start();
        j2.join();  // join thread execute 1st completely then other thread run

        j1.start();
        j3.start();
    }
}
