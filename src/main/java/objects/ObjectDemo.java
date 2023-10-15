package objects;

class A
{
    public A()
    {
        System.out.println("object created");
    }
public void show()
{
    System.out.println("At night");
}
}

public class ObjectDemo {
    public static void main(String[] args)
    {
       new A().show();                         //anonymous object because they don't have a name.For anonymous objects there is no reference.
    }


}



