package constructor;

public class Calculator {
    private static int a;
    private static int b;

    Calculator() {

    }

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public static int add() {
        return 0;
    }


    public static void main(String[] args) {

        Calculator obj1 = new Calculator(2, 5);
        obj1.add();

    }
}
