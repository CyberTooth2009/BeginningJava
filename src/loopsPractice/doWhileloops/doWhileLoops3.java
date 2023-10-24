package loopsPractice.doWhileloops;

//Code written by Samuel Ralph
//Grade: 9th

import java.util.Scanner;

public class doWhileLoops3 {
    public static void main(String[] args) {
        //Define variables and libraries
        Scanner in = new Scanner(System.in);
        int rows = 0;

        //Greet user and prompt for input
        System.out.println("Hello and welcome to the hashtag triangle drawer");
        System.out.println("Please input the desired amount of rows: ");
        rows = in.nextInt();

        //Run loops to draw triangle
        for (int i = rows; i >= 1; i--) {
            for(int j = 1; j < i; j++){
                System.out.print(" ");
                }
            for (int k = i; k <= rows; k++) {
                System.out.print("#");
               }

            System.out.println();


        }
    }
}
