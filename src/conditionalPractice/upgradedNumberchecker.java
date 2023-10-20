package conditionalPractice;

//Code written by Samuel Ralph
//Grade: 9th

import java.util.Scanner;


public class upgradedNumberchecker {
    public static void main(String[] args) {

        //Import and variables
        Scanner in = new Scanner(System.in);

        float input = 0;

        //Get input from user
        System.out.println("Hello! This program checks for number size and sign.");
        System.out.println("Please input your desired number: \n");

        input = in.nextFloat();

        //Verify the sign and absolute values of the inputted number 
        if ((input < 0) && (Math.abs(input) < 1)){
            System.out.println("Your number is a small negative value");
        }
        else if ((input > 0) && (Math.abs(input) < 1)){
            System.out.println("Your number is small positive value");
        }
        else if ((input < 0) && (Math.abs(input) < 1000000)){
            System.out.println("Your number is a negative value");
        }
        else if ((input > 0) && (Math.abs(input) > 1000000)) {
            System.out.println("Your number is a large positive value");
        }
        else if ((input > 0) && (Math.abs(input) < 1000000)) {
            System.out.println("Your number is a positive value");
        }
        else if ((input < 0) && (Math.abs(input) > 1000000)){
            System.out.println("Your number is a large negative value");
        }
        else if (input == 0){
            System.out.println("Your number is zero");
        }


    }

}
