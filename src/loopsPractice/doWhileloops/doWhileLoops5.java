package loopsPractice.doWhileloops;

//Code written by Samuel Ralph
//Grade: 9th

import java.util.Scanner;

public class doWhileLoops5 {
    public static void main(String[] args) {
        //Define variables and import libraries
        long input = 0;
        Scanner in = new Scanner(System.in);

        //Prompt user and run program logic
            System.out.println("This program will give you the amount of integers in a number");
            System.out.println("Enter an integer number less than 10 billion: ");
            if (in.hasNextLong()) {
                input = in.nextLong();
                if (input > 0 && input < 10_000_000_000L) {
                    int digits = 0;
                    while (input > 0) {
                        input = input / 10;
                        digits++;
                    }
                    System.out.println("Your inputted number has " + digits + " digits");
                }
            } else {
                System.out.println("Input not valid, please try again.");
            }
        }
    }

