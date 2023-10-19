package lambdaExpression;

@FunctionalInterface                //By doing this, we are making sure that we only have ONE METHOD in this interface.
interface C {
    void show();
//    class B implements A{                                // This is the first way of defining the method for the interface.
//        public void show(){
//            System.out.println("in Show");
//        }
//    }
}

public class UseLamdaInAFunctionalInterface {
    public static void main(String[] args) {
        C obj = () ->  System.out.println("in Show");                              //You can also use LAMBDA EXPRESSION in Java 8(->) to call the object of interface A.
        obj.show();                                                                //You can reduce the code and write it in one line without curly brackets.
    }
}
