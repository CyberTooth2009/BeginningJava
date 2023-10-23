//Code by Juan Pablo Jiménez
//Grade 10

import java.util.Scanner;

public class dowhile3 {
    public static <string> void main(String[] args) {
        //Introduce the program
        System.out.println("This program prints a \"#\" triangle using do-while loops");
        //Number of rows
        int rows = 5;
        int counter = 1;
        int space = 0;
        int i = 1;
        int j = 1;
        int k = 1;
        Scanner input = new Scanner(System.in);
        //Ask user for input
        System.out.println("Type the number of rows: ");
        rows = input.nextInt();
//make the triangle depending on the amount of rows
//Print the triangle using loops
       do {
            i--;
            do {
                j++;
                System.out.print(" ");
            } while (j <= rows);
            do {
                k++;
                System.out.print("*");
            } while (k <= i);
           System.out.println();
        } while (i == rows);
    }
}