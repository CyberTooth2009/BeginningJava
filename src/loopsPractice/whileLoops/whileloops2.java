package loopsPractice.whileLoops;

//Code written by Samuel Ralph
//Grade: 9th

import java.util.Scanner;

public class whileloops2 {
    public static void main(String[] args) {
        //Define variables and libraries
        Scanner in = new Scanner(System.in);
        int input = 0;
        int counter = 1;
        int sum = 0;
        int prevnum = 0;

        //Prompt user for input
        System.out.println("Please input the number of natural numbers you would like: ");
        input = in.nextInt();

        //Run natural number tree of actions
        System.out.println("You selected the number " + input);
        System.out.println("The first " + input + " natural numbers are:");
        while(counter != input + 1){
            System.out.println(counter);
            sum = sum + counter;
            counter++;
        }

        System.out.println("The Sum of Natural Number up to " + input + " terms is " + sum);


    }
}
