package loopsPractice.whileLoops;

//Code written by Samuel Ralph
//Grade: 9th

import java.util.Scanner;

public class whileloops4 {
    public static void main(String[] args) {

                //Declare variables and libraries
                String pass = "Secret123";
                Scanner in = new Scanner(System.in);
                String input = "";
                int attempts = 3;

                while (attempts > 0) {
                    System.out.print("Enter the password: ");
                    input = in.next();

                    if (pass.equals(input)) {
                        System.out.println("Password accepted. Access granted!");
                        break; // Exit the loop if the password is correct
                    } else {
                        attempts--;
                        if (attempts > 0) {
                            System.out.println("Incorrect password. You have " + attempts + " attempt(s) remaining.");
                        } else {
                            System.out.println("Incorrect password. Access denied. You've run out of attempts.");
                        }
                    }
                }

            }
        }

