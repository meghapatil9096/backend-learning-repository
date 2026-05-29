package multithreading;

class msg {
    public void show(String name) {
        System.out.println("Hello " + name);
        /// number of lines
        synchronized (this) {
            for (int i = 0; i < 2; i++) {
                System.out.println("How are you " + name);
            }
        }
        /// number of lines
        System.out.println("where are you from " + name);
    }
}

class OurThread extends Thread {
    msg m;
    String name;

    public OurThread(msg m, String name) {
        this.m = m;
        this.name = name;
    }

    @Override
    public void run() {
        m.show(name);
    }
}

public class SynchronizedBlock {
    public static void main(String[] args) {

        msg m = new msg();
        OurThread t1 = new OurThread(m, "Sumit");
        OurThread t2 = new OurThread(m, "Amit");

        t1.start();
        t2.start();
    }
}

