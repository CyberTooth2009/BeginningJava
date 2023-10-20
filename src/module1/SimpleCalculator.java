package module1;

//Code Written by Samuel Ralph
//Grade: 9th

//Write a Java program that multiples two integers
//based on the input provided by the user
//and upload the .java code
//through PlusPortals. Make sure to write your full name and
//grade at as comments in the top of the code before submitting.


import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        //Define variables to use
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        Scanner input = new Scanner(System.in);


        //Introduce the program to the user
        System.out.println("--------------Simple Calculator--------------");
        System.out.println("\n---------------By Samuel Ralph---------------");
        System.out.println("\nThis program will multiply two integers you provide and return the result.");


        //Request input from user
        System.out.println("Insert first number: ");
        num1 = input.nextInt();
        System.out.println("Insert second number: ");
        num2 = input.nextInt();

        //Perform computation
        result = num1 * num2;

        //Show the results back to the user
        System.out.println("Your final answer is: " + result);


    }

}
