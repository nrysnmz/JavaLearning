public class String1
{
    public static void main(String[] args)
    {
        String name= "Nuray";   //Creates the object for you.
        name =name+ " Korganci";     //you change the address and create a new object "nuray Korganci"(reference number changes)
        System.out.println("Hello " + name);
        String s1 = "Nuray";
        String s2 = "Nuray";         //This String does not make a new object because the first one and this second one shares the same value(Nuray)
        System.out.println(s1==s2);  //This statement proves that it did not make a new object because it executes "true".
    }

}
