package threads;

public class LambdaExpressionWithThreads {
    public static void main(String[] args) {
        Runnable obj1 = () ->
        {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Merhaba");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = () ->
        {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Gule gule");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);

        t1.start();
        t2.start();
    }
}






