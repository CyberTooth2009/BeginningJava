package loopsPractice.doWhileloops;

import java.util.Scanner;

//Code written by Samuel Ralph
//Grade: 9th

import java.util.Scanner;

public class doWhileLoops4 {
    public static void main(String[] args) {

            //Declare variables and libraries
            String pass = "Secret123";
            Scanner in = new Scanner(System.in);
            String input = "";
            int attempts = 3;


            System.out.println("Please enter the password: ");
            while (attempts > 0) {
                System.out.print("Enter the password: ");
                input = in.next();

                if (pass.equals(input)) {
                    System.out.println("Password accepted. Access granted!");
                    break;
                    }
                }
            }

}
