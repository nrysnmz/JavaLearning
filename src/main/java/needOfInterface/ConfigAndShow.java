package needOfInterface;

interface A{
    int age=24;                               // in an interface the variable is FINAL and STATIC by default. So you cannot say int age; .You have to assign a value for the variables.
    String area= "Mumbai";

    void show();
    void config();
}
class G implements A{
public void show(){
    System.out.println("in show ");
}
public void config(){
        System.out.println("in config ");
    }
}

public class ConfigAndShow {
    public static void main(String[] args) {
        A object;
        object = new G();
        object.config();
        object.show();
        System.out.println("Age:" + A.age);           //Accessing the 'age' variable from the interface
    }
}
