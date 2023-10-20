package loopsPractice.nestedLoops;

//Code written by Samuel Ralph
//Grade: 9th

import java.util.Scanner;

public class nestedLoops1 {
    public static void main(String[] args) {

        //Define variables and import libraries
        Scanner in = new Scanner(System.in);
        int rows = 0;


        //Greet user and prompt for input
        System.out.println("Hello and welcome to the natural number triangle drawer");
        System.out.println("Please input the desired amount of rows: ");
        rows = in.nextInt();


        //Run nest of loops
        for(int i = 0; i <= rows; i++){
            for(int j = 1; j <= i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }


    }
}
