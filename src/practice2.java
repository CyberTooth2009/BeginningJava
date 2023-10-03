//Code by Juan Pablo Jiménez
//Grade 10

import java.util.Scanner;

public class practice2 {
    public static <string> void main(String[] args) {
        System.out.println("This program prints a rectangle");
        //Number of rows and columns
        int rows = 0;
        int cols = 0;
        int num = 0;
        String txt;
        Scanner input = new Scanner(System.in);
        //Ask user for the number of rows
        System.out.println("Type the number of rows (greater than 2): ");
        rows = input.nextInt();
        //if the inputted number is less than or equal to 2, display an error and ask the user for a number greater than 2
        if (rows <= 2){
           for (int x= rows; x<=2;) {
               System.out.println("Please type a number greater than 2: ");
               rows = input.nextInt();
               if (rows > 2){
                   break;
               }
            }
        }
        //Ask user for the number of columns
        System.out.println("Type the number of columns (greater than 2): ");
        cols = input.nextInt();
        //if the inputted number is less than or equal to 2, display an error and ask the user for a number greater than 2
        if (cols <= 2){
            for (int x= cols; x<=2;) {
                System.out.println("Please type a number greater than 2: ");
                cols = input.nextInt();
                if (cols > 2){
                    break;
                }
            }
        }
        //Ask user for the character of the rectangle
        System.out.println("Type the character for the rectangle: ");
        txt = input.next();
//Draw the triangle based on the conditions given
        for (int i= rows; i>= 1; i--){
            for (int j = 1; j <= cols; j++) {
                System.out.print(txt);
            }
            System.out.println("");
        }
    }
}
