package threads;

class Yum implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Yum1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println("Bye");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class RunnableVsThread {
    public static void main(String[] args) {
        Runnable obj = new Yum();
        Runnable obj1 = new Yum1();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();

    }
}
