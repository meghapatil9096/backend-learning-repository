package multithreading;

class Bus implements Runnable{
    int avaliable=1, passenger;
    public Bus(int passenger) {
        this.passenger = passenger;
    }

//    Synchronized method.
    @Override
    public synchronized void run() {
        String name = Thread.currentThread().getName();
        if(avaliable>=passenger){
            System.out.println(name+" Seat is book");
            avaliable=avaliable-passenger;
        }
        else{
            System.out.println(name+" Seat is not available");
        }
    }
}

public class SynchronizedMethod {

    public static void main(String[] args){
        Bus b = new Bus(1);

        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(b);

        t1.setName("Ram");
        t2.setName("Sham");
        t3.setName("Raju");

        t1.start();
        t2.start();
        t3.start();
    }

}
