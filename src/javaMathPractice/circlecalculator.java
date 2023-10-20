package javaMathPractice;

//Code Written by Sam Ralph
//Grade: 9th
//Circle Calculator

import java.util.Scanner;

public class circlecalculator {
    public static void main(String[] args) {

        //Define scanner usage and initialize variables
        Scanner in = new Scanner(System.in);
        float radius = 0;


        //Greet user with introductory message
        System.out.println("Hello and welcome to the circle area and perimeter calculator!\n");
        System.out.println("This program will take a radius decimal value as an input\nand return the perimeter and area of the circle in question.\n ");

        //Request user input
        System.out.println("Please enter radius:\n ");
        radius = in.nextFloat();

        //Compute and print perimeter of circle
        System.out.println("The perimeter of the circle is " + (Math.PI * 2)*radius );

        //Compute and print area of circle
        System.out.println("The area of the circle is " + (Math.PI * (radius * radius)));


    }
}
