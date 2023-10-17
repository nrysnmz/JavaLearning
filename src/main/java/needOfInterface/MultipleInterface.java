package needOfInterface;

interface N
{
    int age = 30;                               // in an interface the variable is FINAL and STATIC by default. So you cannot say int age; .You have to assign a value for the variables.
    String area = "Paris";

    void show();

    void config();
}

interface X
{
    void run();
}
interface Y extends X
{

}

class P implements N,X {                       //in this class we have three different methods coming from two different interfaces.
    public void show()
    {
        System.out.println("in show ");
    }

    public void config() {
        System.out.println("in config ");
    }

    public void run() {
        System.out.println("running..");
    }
}


public class MultipleInterface {
    public static void main(String[] args) {
        N object;
        object = new P();
        object.config();
        object.show();
        X object1;
        object1 = new P();
        object1.run();

        System.out.println("Area:" + N.area);           //Accessing the 'area' variable from the interface
        }


    }


