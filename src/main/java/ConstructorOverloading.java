class Human2
{
    private int age;          //This age variable is only accesibke in the same class (here class Human for example)
    private String name;

    public Human2()           //default constructor           //This is a constructor and looks like a method itself.It will have a name,their own package,round bracket() and curly brackets{}
    {                                                        //You do not specify the return type.The constructor has the same name as the classname.(Human)
        age = 12;
        name = "Jack";                                       //Constructor never returns anything.
    }
    public Human2(int a,String n)                   //Parameterized Constructor
    {
        age = a;
        name = n;
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
public class ConstructorOverloading {
    public static void main(String[] args) {
        Human2 obj = new Human2();
        Human2 obj1 = new Human2(18, "Jill");
        System.out.println(obj.getName() + " : " + obj.getAge() );
        System.out.println(obj1.getName() + " : " + obj1.getAge() );
//        obj.setAge(11);
//        obj.setName("Pelin");

        // System.out.println(obj.getName() + ":" + obj.getAge());

    }
}


