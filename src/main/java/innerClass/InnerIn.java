package innerClass;

class A {
    int lifeOfACat;

    public void move() {
        System.out.println("Cats can easily climb trees.");
    }

    static class B {
        public void sleep() {
            System.out.println("Cats can sleep during the day.");
        }
    }
}

public class InnerIn {
    public static void main(String[] args) {
        A object = new A();
        object.move();
        A.B object1 = new A.B();             //This statement only works when inner class(which is B here) STATIC.
        object1.sleep();
    }

}
