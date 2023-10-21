package userInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws IOException {

        int num = 0;


//            InputStreamReader in = new InputStreamReader(System.in);      //this is one way or you can write like the one below.
//            bf = new BufferedReader(in);

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));) {                     //this here is called "try with resources."
            num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
//"finally" block will be executed irrespective of the exception.Finally makes sense whenever you want to close the resource.
