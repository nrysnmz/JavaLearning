package whatIsEnum;

enum Status1 {
    Running, Failed, Pending, Success;
}

public class EnumWithIf {
    public static void main(String[] args) {

        Status stat = Status.Pending;

        if (stat == Status.Running)
            System.out.println("All Good");
        else if (stat == Status.Failed)
            System.out.println("Try Again");
        else if (stat == Status.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");

    }

}

