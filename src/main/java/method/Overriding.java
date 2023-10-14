package method;

class Animal {
    public void show() {
        System.out.println("Animals show their feelings.");
    }

    public void makeNoise() {
        System.out.println("Animals make noise.");
    }
}

class Cat extends Animal {
    @Override
    public void show() {
        System.out.println("Cats also show their feelings.");
    }
}

public class Overriding {
    public static void main(String[] args) {

        Cat cat= new Cat();
        cat.show();
        cat.makeNoise();




    }
}
