package staticMethods;

import java.util.Scanner;


public class methodsPractice {

    public static void main(String[] args) {

        //Declare variables
        int amountNum = 0;

        //Present purpose of program to user
        System.out.println("This program will print natural numbers!\n");

        //Request input from user
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers would you like to print: ");
        amountNum = input.nextInt();

        //Print natural numbers based on user's input
        printNaturalNumbers(amountNum);

        System.out.print("------------- Area Circle -------------\n\n");
        System.out.print("The area of a circle with radius 0.5 is: " + computeAreaCircle(0.5));


    }
    public static void printNaturalNumbers(int maxNumbers){
        System.out.println("Here are the" + maxNumbers + " natural numbers:\n");

        for(int i = 1; i<=maxNumbers; i++){
            System.out.println(i);
        }
    }

    public static double computeAreaCircle(double radius)
    {
        return Math.PI * radius * radius;
    }


}
