//Code by Juan Pablo Jiménez
//Grade 10
import java.util.Scanner;
public class dowhile5 {
    public static <string> void main(String[] args) {
        //Introduce the program
        System.out.println("-----Number Digit counter-----");
        System.out.println("This program counts the number of digits in the given number that has to be less then 10 billion");
        //declare variables
        int num = 0;
        Scanner input = new Scanner(System.in);
        //Ask user for input
        System.out.println("Type a number (less than 10 billion): ");
        num = input.nextInt();
        input.hasNextLong();
        }
    }
