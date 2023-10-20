package loopsPractice.nestedLoops;

//Code written by Samuel Ralph
//Grade: 9th


import java.util.Scanner;

public class LoopswithInput {
    public static void main(String[] args) {
        //Import libraries and declare variables

        Scanner in = new Scanner(System.in);

        int input = 0;
        int sum = 0;

        //Greet user and prompt for input
        System.out.println("Hello and welcome to the natural number printer. Please input the amount of numbers you would like to see: ");
        input = in.nextInt();

        //Run loop for numbers and their sums
        System.out.println("The natural numbers requested and their sums are ");
        for(int i = 0;i<=input;i++) {

            sum = sum + i;

            System.out.println("The number is " + i + " and the sum is " + sum);
        }
    }
}
