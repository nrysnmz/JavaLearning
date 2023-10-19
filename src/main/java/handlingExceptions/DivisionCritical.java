package handlingExceptions;

public class DivisionCritical {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        int nums[]= new int[6];
        String str= null;

        try
        {
            j = 16 / i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[6]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit.");
        }
        catch (Exception e){                                              //Exception handles all the exceptions.
            System.out.println("Something went wrong."+ e);               //Whenever you have a child and parent,make sure that your parent is at the bottom.(Exception is the parent class here.)
        }
        System.out.println(j);

        System.out.println("Bye");

    }
}
