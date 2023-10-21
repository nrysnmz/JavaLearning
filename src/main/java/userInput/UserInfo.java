package userInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
//        InputStreamReader in = new InputStreamReader(System.in);             //This is how you take the input from the user.
//        BufferedReader bf=new BufferedReader(in);
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        System.out.println(num);
       // bf.close();                                                      //It is always a good idea to close the resource.
    }
}
