package handlingExceptions;

public class ThrowKeyword {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 18 / i;
            throw new ArithmeticException("I don't want to print zero.");  //If you want to send a message related to exception,put the message in the constructor."I don't want to print zero." smth like this.
        }
        catch (ArithmeticException e) {
            j = 18 / 1;                                                      //If someone assigns the value of "0" to the variable "int" you may handle it instead of giving the answer of "Something went wrong."

            System.out.println("That's the default output." + e);
        }
        catch (Exception e) {
            System.out.println("Something went wrong." + e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
