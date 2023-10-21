package threads;

class Power extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hi");
        }
    }
}

class Power1 extends Thread{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("How are you?");
        }
    }
}

public class MultiThreads {
    public static void main(String[] args) {
        Power object = new Power();
        Power1 object1 = new Power1();
        object.start();
        object1.start();
    }
}
