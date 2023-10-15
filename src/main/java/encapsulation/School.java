package encapsulation;

class Human3 {
    private int age;          //This age variable is only accesibke in the same class (here class Human for example)
    private String name;

    public int getAge()     //The age variable will be used by this method.(private int age=11;)
    {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName()        //The name variable will be used by this method.
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class School      //The only way to access the data is with methods,no one can use your variables.You encapsulate the variables in the methods,so this is encapsulation.
{
    public static void main(String[] args) {
        Human3 obj = new Human3();
        obj.setAge(11);
        obj.setName("Pelin");

        System.out.println(obj.getName() + ":" + obj.getAge());
    }
}
