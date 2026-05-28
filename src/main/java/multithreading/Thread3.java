package multithreading;
class WaitNotify extends Thread{
    public void run(){
        String name = Thread.currentThread().getName();
        for(int i=0;i<3;i++){
            System.out.println(name);
        }
    }
}
public class Thread3 {
    public static void main(String[] args) throws InterruptedException {
        WaitNotify s1 = new WaitNotify();
        WaitNotify s2 = new WaitNotify();
        WaitNotify s3 = new WaitNotify();

        s1.setName("Anmol");
        s2.setName("Mayur");
        s3.setName("Jon");

        s1.start();
        synchronized (s1){
            s1.wait();
        }

        s2.start();
        synchronized (s1){
            System.out.println("Notify");
            s1.notify();
        }
//        if i don't call notify still this code is work because JVM internally call notifyAll().
        s3.start();


    }
}
