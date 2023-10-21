package threads;

class Counter {
    int count;

    public synchronized void increment() {                  //By using the keyword "synchronized" java will make sure that the increment will be called only by one method at a time.
        count++;
    }
}

public class SynchronizedWithMultiThreads {
    public static void main(String[] args) throws InterruptedException {
        Counter c= new Counter();
        Runnable obj = () ->
        {
            for (int i = 1; i <= 10000; i++) {
                c.increment();
            }
        };

        Runnable obj1 = () ->
        {
            for (int i = 1; i <= 10000; i++) {
                c.increment();
            }
        };

        Thread t1= new Thread(obj);
        Thread t2= new Thread(obj1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
