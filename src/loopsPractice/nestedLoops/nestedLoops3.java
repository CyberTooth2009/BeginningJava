package loopsPractice.nestedLoops;

//Code written by Samuel Ralph
//Grade: 9th

import java.util.Scanner;

public class nestedLoops3 {
    public static void main(String[] args) {
        //Define variables and import libraries
        Scanner in = new Scanner(System.in);
        int rows = 0;
        int sums = 1;


        //Greet user and prompt for input
        System.out.println("Hello and welcome to the natural number sum triangle drawer");
        System.out.println("Please input the desired amount of rows: ");
        rows = in.nextInt();


        //Use nested loops to draw triangle
        for(int j = 0; j <= rows; j++){
            for(int h = 1; h <= j; h++){
                System.out.print(sums++);
            }
            System.out.println();
        }
    }
}
