package whatIsEnum;

enum Laptop1 {
    Macbook(2000), Dell(1600), ThinkPad(1800), Surface;

    private int price;

    private Laptop1() {                           /*
                                                  If you don't have default constructor you should give a value to your objects in your enum class.For example, you CAN'T just leave 'the loptop called
                                                   Surface without a value(Surface;)
                                                  */
        price=400;
    }

    private Laptop1(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnClass1 {
    public static void main(String[] args) {
        for (Laptop1 laptop : Laptop1.values()) {
            System.out.println(laptop + ":" + laptop.getPrice());
        }
    }
}


