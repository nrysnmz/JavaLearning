package lambdaExpression;

@FunctionalInterface                //By doing this, we are making sure that we only have ONE METHOD in this interface.
interface D {
    void show(int i);                                 //You can also add variables inside the method.
//    class B implements A{                                // This is the first way of defining the method for the interface.
//        public void show(){
//            System.out.println("in Show");
//        }
//    }
}

public class InterfaceWithAVariableAndLambdaExpression{
    public static void main(String[] args) {
        D obj = i ->  System.out.println("in Show " + i  );          //You can also use LAMBDA EXPRESSION in Java 8(->) to call the object of interface D.
        obj.show(6);                                                                //You can reduce the code and write it in one line without curly brackets.
    }
}
