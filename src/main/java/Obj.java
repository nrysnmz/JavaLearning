public class Obj {  // PUBLIC, DEFAULT, PRIVATE METHOD,

     void a() {

    }

    public void b(){
        a();
    }

}

class NewClass {

 public void c(){
     Obj obj = new Obj();
     obj.a();
 }
}
