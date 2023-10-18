package annotations;

@FunctionalInterface                //By doing this, we are making sure that we only have ONE METHOD in this interface.
interface A {
    void show();
//    class B implements A{                                // This is the first way of defining the method for the interface.
//        public void show(){
//            System.out.println("in Show");
//        }
//    }
}

public class NewFunctionalInterface {
    public static void main(String[] args) {
        A obj = new A() {                                            //You can also use ANONYMOUS INNER CLASS to call the object of interface A.
            public void show() {
                System.out.println("in show");
            }
        };
        obj.show();
    }
}
