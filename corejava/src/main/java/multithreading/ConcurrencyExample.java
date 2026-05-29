package multithreading;

public class ConcurrencyExample {
    public static void main(String[] args){
        Thread cook1 = new Thread(()->{
            System.out.println("Cook 1: Chopping vegetables starting.... ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Cook 1: Finish Choping.");
        });

        Thread cook2 = new Thread(()->{
            System.out.println("Cook 2 : Start Boiling water....");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Cook 2: Boil water completely");
        });
        cook1.start();
        cook2.start();
    }
}
