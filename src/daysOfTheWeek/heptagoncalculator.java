package daysOfTheWeek;

import java.util.Scanner;

public class heptagoncalculator {
    public static void main(String[] args) {

        //Define scanner usage and initialize variables
        Scanner in = new Scanner(System.in);
        double length = 0;

        //Greet user with introductory message
        System.out.println("Hello and welcome to the heptagon area calculator!\n");
        System.out.println("This program will take a side length decimal value as an input\nand return the area of the heptagon in question.\n ");

        //Request user input
        System.out.println("Please enter side length:\n ");
        length = in.nextDouble();

        //Compute and print out area of the heptagon
        System.out.println("The area of the heptagon is " + ((7.0/4.0) * (length * length) * ((Math.cos(Math.PI/7.0)/Math.sin(Math.PI/7.0)))));

    }
}
