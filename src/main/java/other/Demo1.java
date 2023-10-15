package other;


import other.tools.A;

public class Demo1 {
    public static void main(String[] args) {
        A dog = new B();            //Under normal conditions this assignment should be like this:B dog= new B(); but we can it like this A dog = new B(); because it is possible to create a RERERENCE of a SUPER class and the OBJECT of a subclass
        dog.show();

        dog= new B();          //This part(From A dog =new B(); till the end.) of the code is called DYNAMIC METHOD DISPATCH because that's dynamic.Because which matter it will call we are not sure.
        dog.show();
                               //DYNAMIC DISPATCH is only possible when you have INHERITANCE.
        dog= new C();
        dog.show();

    }
}
