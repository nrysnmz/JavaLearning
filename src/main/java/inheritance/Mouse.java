package inheritance;

public class Mouse {
    public void leftClick() {
        System.out.println("Click");
    }

    public void rightClick() {
        System.out.println("Click");
    }

    public void scrollUp() {
        System.out.println("Scrolled up");
    }

    public void scrollDown() {
        System.out.println("Scrolled down");
    }

    public static void main(String[] args) {
        Mouse2 m2= new Mouse2();
        m2.connect();
        m2.leftClick();
        m2.rightClick();
        m2.scrollDown();
        m2.scrollUp();

        Mouse1 m1= new Mouse1();
        m1.leftClick();
        m1.rightClick();
        m1.setColor("pink");

    }
}
