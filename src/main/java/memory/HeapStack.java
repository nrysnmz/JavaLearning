package memory;

class Calculator {
    int num = 5;

    public int add(int n1, int n2, int n3) {
        System.out.println(num);
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }

}

public class HeapStack {

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();
        obj.num = 8;
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }

}

