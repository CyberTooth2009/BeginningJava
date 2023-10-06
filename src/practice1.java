//Code by Juan Pablo Jiménez
//Grade 10

import java.util.Scanner;

public class practice1 {
    public static <string> void main(String[] args) {
        //Introduce the program
        System.out.println("This program is a number triangle");
        //Number of rows
        int rows = 0;
        Scanner input = new Scanner(System.in);
        //Ask user for input
        System.out.println("Type the number of rows: ");
        rows = input.nextInt();
//make the triangle depending on the amount of rows
        for (int x = 0; x <= rows; x++){
            for (int y = 1; y <= x; y++){
                System.out.print(y);
            }
            System.out.println(" ");
        }
        }
    }
