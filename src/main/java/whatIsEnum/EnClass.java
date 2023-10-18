package whatIsEnum;

enum Laptop {
    Macbook(2000), Dell(1600), ThinkPad(1800), Surface(2100);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnClass {
    public static void main(String[] args) {
        for (Laptop laptop : Laptop.values()) {
            System.out.println(laptop + ":" + laptop.getPrice());
        }
    }
}
