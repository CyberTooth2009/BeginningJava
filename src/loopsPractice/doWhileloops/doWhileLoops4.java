package loopsPractice.doWhileloops;

import java.util.Scanner;

//Code written by Samuel Ralph
//Grade: 9th

public class doWhileLoops4 {
    public static void main(String[] args) {

        //Declare variables and libraries
        String pass = "Secret123";
        Scanner in = new Scanner(System.in);
        String input = "";

        //Run conditional loop tree to authenticate user
        System.out.println("Welcome to the password checker game!");
        do {
            System.out.println("Please enter the password: ");
            input = in.next();

            if (input.equals(pass)) {
                System.out.println("Congrats! You got the correct password!");
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }


        }while (!input.equals(pass));
    }
}
