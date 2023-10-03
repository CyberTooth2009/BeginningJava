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
        int txt = 0;
        Scanner input = new Scanner(System.in);
        //Ask user for input
        System.out.println("Type the number of rows (greater than 2): ");
        rows = input.nextInt();
        System.out.println("Type the number of columns (greater than 2): ");
        cols = input.nextInt();
        System.out.println("Type the character for the rectangle: ");
        txt = input.nextInt();

        for (int i= rows; i>= 1; i--){
            for (int j = 1; j <= cols; j++) {
                System.out.println("%");
            }
            System.out.println("");
        }
    }
}
