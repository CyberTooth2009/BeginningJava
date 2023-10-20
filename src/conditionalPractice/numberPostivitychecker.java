package conditionalPractice;

//Code written by Samuel Ralph
//Grade: 9th

import java.util.Scanner;

public class numberPostivitychecker {
    public static void main(String[] args) {

        //Import libraries and define variables
        Scanner in = new Scanner(System.in);

        float input = 0;

        //Introduce and get  from user
        System.out.println("Hello! This program will tell you if the number \nthat you input is positive or negative. ");
        System.out.println("Please input your number: \n");

        input = in.nextFloat();

        //Calculate

        if(input < 0) {
            System.out.println("Your number is negative");
        }
        else if (input > 0){
            System.out.println("Your number is positive");
        }
        else{
            System.out.println("Your number is zero");
        }


    }

}
