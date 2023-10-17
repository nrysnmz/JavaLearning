package needOfInterface;

interface Computer{
 void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Code , compile, run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Code, compile, run : Faster ");
    }
}
class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}
public class CodeDeveloper {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer name= new Developer();
        name.devApp(desk);

    }
}
