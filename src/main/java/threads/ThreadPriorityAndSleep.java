package threads;

class Magic extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Magic1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Run");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class ThreadPriorityAndSleep {
    public static void main(String[] args) {
        Magic obj = new Magic();
        Magic1 obj1 = new Magic1();
        System.out.println(obj.getPriority());
        obj.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj1.start();

    }
}


