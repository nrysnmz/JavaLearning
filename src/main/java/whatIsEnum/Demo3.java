package whatIsEnum;

enum Status{
    Running, Failed, Pending, Success;
}
public class Demo3 {
    public static void main(String[] args) {

        Status stat[] = Status.values();
        for(Status s : stat)
        {
            System.out.println(s +":" + s.ordinal());
        }
    }

}
