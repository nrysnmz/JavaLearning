class Mobile0
{
    String brand;  //All variables here are instance variables.String brand,int price and String name are instance variables.
    int price;
    static String name; //This is a static variable and the static variables are shared by different objects.In non static methods you can use static variables.By using the word "static" here,you are making omethng a CLASS member not an object member.

    public void show()
    {
        System.out.println(name + ":"+ brand  + ":"+price);
    }
    public static void show1(Mobile obj)
    {

        System.out.println("in static method");
        System.out.println(obj.name + ":"+ obj.brand  + ":"+obj.price);   //You can use a static variable inside a static method,but you can not directly use a non-static variable inside a static method just when you have an OBJECT reference.
    }
}



public class StaticMethod
{
    public static void main(String[] args) {
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

        //You can call a static method directly with the help of a class name.But you can not call a non static method with the help of a class name.
        Mobile0.show1(obj1);


    }
}
