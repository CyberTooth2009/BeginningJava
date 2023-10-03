//Code by Juan Pablo Jiménez
//Grade 10

import java.util.Scanner;

public class forloops {
    public static <string> void main(String[] args) {
        //Introduce the program
        System.out.println("This program prints a number and the ones that come before it");
        //declare variables
        int num = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        //Ask user for input
        System.out.println("Type a number: ");
        num = input.nextInt();
        //Print given number
        System.out.println("Your number is: "+num);
        //Print the numbers that come before the given number
        System.out.println("Previous numbers: ");
        for(int N = 1; N <= num;N++ ) {
            System.out.println(+N);
            sum = sum + N;
        }
        System.out.println("Sum of the previous numbers: "+sum);

    }
}
