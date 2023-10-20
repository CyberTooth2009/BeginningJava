package conditionalPractice;

//Code written by Samuel Ralph
//Grade: 9th

import java.util.Scanner;

public class comparePractice {
    public static void main(String[] args) {

        //Import scanner and define variables
        Scanner in = new Scanner(System.in);
        float num1 = 0;
        float num2 = 0;

        //Show the user what the use of the program is
        System.out.println("Numerical Comparison Program");
        System.out.println("This program takes in two decimal values and tells you which one is greater");

        //Get user input
        System.out.println("Please input the first number: \n");
        num1 = in.nextFloat();

        System.out.println("Please input the second number \n");
        num2 = in.nextFloat();


        //Run comparisons
        if (num1 == num2) {
            System.out.print(num1);
            System.out.print(" == ");
            System.out.println(num2);
        }

        if (num1 <= num2) {
            System.out.print(num1);
            System.out.print(" <= ");
            System.out.println(num2);
        }

        if (num1 >= num2) {
            System.out.print(num1);
            System.out.print(" >= ");
            System.out.println(num2);
        }

        if (num1 != num2) {
            System.out.print(num1);
            System.out.print(" != ");
            System.out.println(num2);
        }
    }

}