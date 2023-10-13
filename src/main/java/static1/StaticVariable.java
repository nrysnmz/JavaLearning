package static1;

class Mobile
{
    String brand;  //All variables here are instance variables.String brand,int price and String name are instance variables.
    int price;
    static String name; //This is a static variable and the static variables are shared by different objects.In non static methods you can use static variables.By using the word "static" here,you are making omethng a CLASS member not an object member.

    public void show()
    {
        System.out.println(name + ":"+ brand  + ":"+price);
    }
}



public class StaticVariable
{
    public static void main(String[] args)
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        Mobile.name = "Smart phone";
        obj1.price = 1500;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        Mobile.name = "Smart phone";
        obj2.price = 1700;

        obj1.show();
        obj2.show();


    }
}
