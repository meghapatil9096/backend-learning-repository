package multithreading;
class Demo implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Hello");
        }
    }
}
public class Runnable_imp {
   public static void main(String[] args){
       Demo d = new Demo();
       Thread t = new Thread(d);
//       runnable don't have start method so we create thread reference and call start method.
       t.start();
       for(int i=0;i<5;i++){
           System.out.println("Main Thread");
       }
    }
}
