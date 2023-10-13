package constructor;

class Human1
{
    private int age;          //This age variable is only accesibke in the same class (here class Human for example)
    private String name;

    public Human1()                                          //This is a constructor and looks like a method itself.It will have a name,their own package,round bracket() and curly brackets{}
    {                                                        //You do not specify the return type.The constructor has the same name as the classname.(Human)
        age = 12;
        name = "Jack";                                        //constructor.Constructor never returns anything.
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age= age;
    }
    public  String getName()        //The name variable will be used by this method.
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

}
public class Constructor {
    public static void main(String[] args) {
        Human1 obj = new Human1();
        Human1 obj1 = new Human1();
        System.out.println(obj.getName() + " : " + obj.getAge() );

//        obj.setAge(11);
//        obj.setName("Pelin");

        // System.out.println(obj.getName() + ":" + obj.getAge());

    }
}
