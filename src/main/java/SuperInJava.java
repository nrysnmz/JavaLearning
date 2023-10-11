class Animal {
    public Animal()
    {
        super();                                                     //Every constructor has a method which is there even if you don't mention.That method is super.
        System.out.println("Animals make noise.");
    }
    public Animal(int life)
    {
        super();
        System.out.println("Life time may change among animals.");
    }
}

class Cat extends Animal {
    public Cat()
    {   super(5);
        System.out.println("Meow meow meow");
    }
    public Cat(int life)                               //Parameterized constructor
    {
        super();
        System.out.println("Cats live long.");
    }
}

public class SuperInJava {
    public static void main(String[] args) {
        Cat obj = new Cat(2);
    }
}
