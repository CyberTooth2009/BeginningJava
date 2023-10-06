//Code by Juan Pablo Jiménez
//Grade 10

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        //Introduce the program
        System.out.println("This program prints a \"*\" triangle");
        Scanner in = new Scanner(System.in);
        //Declare variables
        int rows = 0;
        System.out.println("Type the number of rows: ");
        rows = in.nextInt();

        //Print the triangle using loops
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