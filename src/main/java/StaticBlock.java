class Mobile2
{
    String brand;
    int price;
    static String name;



    public Mobile2()
    {
        brand= "";
        price= 200;
        System.out.println("in constructor");
    }
    static                                                          //Static block is called  first all the time.
    {
        name= "Phone";
        System.out.println("in static block");
    }
    public void show3()
    {
        System.out.println(name +":" + brand + ":" + price);
    }
}
public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class.forName("Mobile2");
//        Mobile2 obj1 =new Mobile2();
//        obj1.brand= "Apple";
//        obj1.price= 1500;
//        obj1.name= "Smart phone";
//
//        Mobile2 obj2 =new Mobile2();
    }
}
