package multithreading;
class C extends Thread{
//    sleep method
    public void run(){
        String s = Thread.currentThread().getName();
        for(int i=0;i<5;i++){
            System.out.println(s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
public class Thread1{
    public static void main(String[] args){
        C t1 =new C();
        C t2 =new C();
        C t3 =new C();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }

}
