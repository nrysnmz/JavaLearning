package handlingExceptions;

class NavinException extends RuntimeException {
    public NavinException(String str) {
        super(str);
    }
}

class B {
    public void show() throws ClassNotFoundException{
        try {
            Class.forName("Demo");
        } catch (
                ClassNotFoundException e) {
            System.out.println("Not able to find the class.");
        }
    }
}

public class ThrowsKeyword {
    static {
        System.out.println("Class Loaded");
    }
    public static void main(String[] args)  {
        B obj = new B();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

