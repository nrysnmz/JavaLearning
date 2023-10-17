package whatIsEnum;

enum Status2 {
    Running, Failed, Pending, Success;
}

public class SwitchEnum {
    public static void main(String[] args) {

        Status stat = Status.Success;

        switch (stat) {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            default:
                System.out.println("Done");
                break;

        }
    }
}




