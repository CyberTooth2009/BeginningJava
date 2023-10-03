//Code by Juan Pablo Jiménez
//Grade 10
import java.util.Scanner;
public class practice3 {
    public static <string> void main(String[] args) {
        System.out.println("This program prints a triangle that adds each number by one");
        //Number of rows and columns
        int rows = 0;
        int i = 1;
        Scanner input = new Scanner(System.in);
        //Ask user for input
        System.out.println("Type the number of rows: ");
        rows = input.nextInt();
//make the triangle depending on the amount of rows
        /*for (int x = 0; x <= rows; x++) {
            for (int y = 1; y <= x; y++) {
                    System.out.print(y);
            }
            System.out.println(" ");
        } */
        for (int x = 0; x <= rows; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(i++);
            }
            System.out.println(" ");
        }
    }
}