package handlingExceptions;

class JackException extends Exception                 //You can your custom exception by creating a class which extends the "Exception class"  or "Runtime Exception class." it self.
{
    public JackException(String str) {                 //If you are accepting the message,you have to pass the message here(Runtime Exception Constructor or Exception constructor.
        super(str);
    }
}
public class CustomException {
    public static void main(String[] args) {

        int i = 3;
        int j = 0;

        try {
            j = 30 / i;
            if (j == 0) ;
            throw new JackException("I don't want to print zero.");
        } catch (JackException e) {
            j = 30 / 1;
            System.out.println("That is the default value.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        System.out.println(j);
        System.out.println("Bye");

    }
}
