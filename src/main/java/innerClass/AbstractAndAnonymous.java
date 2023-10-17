package innerClass;

abstract class N {
    public abstract void show();

    public abstract void config();
}

public class AbstractAndAnonymous {
    public static void main(String[] args) {
        N object = new N() {            //This the object of anonymous inner class.You want to implement the ABSTRACT CLASS only ONCE then you can use ANONYMOUS INNER CLASS.
            public void show() {
                System.out.println("in new show");
            }

            public void config() {
                System.out.println("in config");
            }
        };
        object.show();
        object.config();
    }
}
