package conditionalPractice;

//Code written by Samuel Ralph
//Grade;9th

import java.util.Scanner;

public class daysWeekwithSwitch {
    public static void main(String[] args) {
        //Import libraries and init variables
        Scanner in = new Scanner(System.in);
        int input = 0;

        //Greet the user and request for input
        System.out.println("Hello and welcome to a day of the week program.");
        System.out.println("This program takes in an input from 1-7 than relays the day of the week that corresponds to that number");
        System.out.println("Please input your number here: \n");
        input = in.nextInt();

        //Run comparison switch statements
        switch(input){
            case 1:
                System.out.println("Number 1 corresponds to Sunday!");
                break;
            case 2:
                System.out.println("Number 2 corresponds to Monday!");
                break;
            case 3:
                System.out.println("Number 3 corresponds to Tuesday!");
                break;
            case 4:
                System.out.println("Number 4 corresponds to Wednesday!");
                break;
            case 5:
                System.out.println("Number 5 corresponds to Thursday!");
                break;
            case 6:
                System.out.println("Number 6 corresponds to Friday!");
                break;
            case 7:
                System.out.println("Number 7 corresponds to Saturday!");
                break;
            default:
                System.out.println("Invalid day of the week!");
                break;
        }


    }
}
