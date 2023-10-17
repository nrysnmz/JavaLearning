package innerClass;

class F                                       //You can NOT make the outer class STATIC.(F is the outer class here)
{
    int age;
    public void show(){
        System.out.println("in A show");
    }
    class G{
        public void config(){
            System.out.println("in B config");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        F obj = new F();
        obj.show();
        F.G obj1 = obj.new G();
        obj1.config();

    }
}
