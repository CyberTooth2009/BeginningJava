package daysOfTheWeek;

//Code written by Samuel Ralph
//Grade: 9th

import java.util.Scanner;

public class daysWeek {
    public static void main(String[] args) {
        //Import libraries and init variables
        Scanner in = new Scanner(System.in);
        float input = 0;

        //Greet the user and request for input
        System.out.println("Hello and welcome to a day of the week program.");
        System.out.println("This program takes in an input from 1-7 than relays the day of the week that corresponds to that number");
        System.out.println("Please input your number here: \n");
        input = in.nextFloat();

        //Compare inputs to if statement ladder
        if (input > 7){
            System.out.println("Too big!");
        }
        else if (input < 1){
            System.out.println("Too small!");
        }
        else if (input == 1){
            System.out.println("Number 1 corresponds to Sunday!");
        }
        else if (input == 2){
            System.out.println("Number 2 corresponds to Monday!");
        }
        else if (input == 3){
            System.out.println("Number 3 corresponds to Tuesday!");
        }
        else if (input == 4){
            System.out.println("Number 4 corresponds to Wednesday!");
        }
        else if (input == 5){
            System.out.println("Number 5 corresponds to Thursday!");
        }
        else if (input == 6){
            System.out.println("Number 6 corresponds to Friday!");
        }
        else if (input == 7){
            System.out.println("Number 7 corresponds to Saturday!");
        }






    }
}
