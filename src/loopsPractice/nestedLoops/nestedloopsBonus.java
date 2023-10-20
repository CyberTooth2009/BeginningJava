package loopsPractice.nestedLoops;

//Code written by Samuel Ralph
//Grade: 9th

import java.util.Scanner;

public class nestedloopsBonus {
    public static void main(String[] args) {

        //Define variables and import libraries
        Scanner in = new Scanner(System.in);
        int rows = 0;


        //Greet user and prompt for input
        System.out.println("Hello and welcome to the natural number triangle drawer");
        System.out.println("Please input the desired amount of rows: ");
        rows = in.nextInt();

        //Run loops to draw star triangle
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
