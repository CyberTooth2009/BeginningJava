//Code by Juan Pablo Jiménez
//Grade 10

import java.util.Scanner;

public class dowhile2 {
    public static <string> void main(String[] args) {
        //Introduce the program
        System.out.println("This program prints a number and the ones that come before it using do-while loops");
        //declare variables
        int num = 0;
        int sum = 0;
        int N = 0;
        Scanner input = new Scanner(System.in);
        //Ask user for input
        System.out.println("Type a number: ");
        num = input.nextInt();
        //Print given number
        System.out.println("Your number is: "+num);
        //Print the numbers that come before the given number
        System.out.println("Previous numbers: ");
        //Loop that prints calculates the numbers and the sum of the numbers that come before the given number
        do {
            N++;
            System.out.println(N);
            sum = sum + N;

        }while(N < num);
        //Print the sum of the previous numbers
        System.out.println("Sum of the previous numbers: "+sum);

    }
}
