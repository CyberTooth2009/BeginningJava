package loopsPractice.nestedLoops;

//Code written by Samuel Ralph
//Grade: 9th

import java.util.Scanner;

public class nestedLoops2 {

    public static void main(String[] args) {

        //Define variables and import libraries
        Scanner in = new Scanner(System.in);
        int rows = 0;
        int cols = 0;

        //Greet user and prompt for input
        System.out.println("Hello and welcome to the character charter");
        System.out.println("Please input the desired amount of rows (greater than 2): ");
        rows = in.nextInt();
        System.out.println("Please input the desired amount of columns (greater than 2 and not equal to num of rows): ");
        cols = in.nextInt();
        System.out.println("Please input drawing character: ");
        String chara = in.next();

        //Check for input validity
        if (rows <= 2) {
            System.out.println("Sorry, the inputted amounts of rows are invalid");
        }

        if (cols <= 2) {
            System.out.println("Sorry, the inputted amounts of columns are invalid");
        }

        if (rows == cols) {
            System.out.println("Sorry the amount of rows and columns are not allowed to be equal");
        }

        //Draw triangle using loops
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(chara);
            }
            System.out.println();
        }
    }
}