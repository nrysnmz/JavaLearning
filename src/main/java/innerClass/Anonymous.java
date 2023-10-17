package innerClass;

class C{
    public void show()
    {
        System.out.println("in C show");
    }
}
public class Anonymous {
    public static void main(String[] args) {
        C obj = new C()
        {
            public void show()                               //This is an anonymous inner class.
            {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}
