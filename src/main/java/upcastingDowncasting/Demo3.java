package upcastingDowncasting;

class D {
    public void show1() {
        System.out.println("in Show D");
    }
}

class E extends D {
    public void show2() {
        System.out.println("in Show E");
    }
}

public class Demo3 {
    public static void main(String[] args) {
        D cat = (D) new E();       //This is called UPCASTING.
        cat.show1();

        E cat1 = (E) cat;           // This is called DOWN CASTING.
        cat1.show2();


    }
}