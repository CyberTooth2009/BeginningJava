package loopsPractice.forLoops;

//Code written by Samuel Ralph
//Grade: 9th

import java.util.Scanner;

public class forLoopMult {
    public static void main(String[] args) {

        //Declare variables and import libraries
        Scanner in = new Scanner(System.in);
        int num = 0;
        int num2 = 0;
        int product = 0;

        //Greet the user
        System.out.println("-------Multiplication Table Drawer----------");
        System.out.println("By: Samuel Ralph");

        System.out.println("Input the number(Table to be calculated): ");
        num = in.nextInt();
        System.out.println("Input number of rows for the table: ");
        num2 = in.nextInt();

        //Use loop to create table
        System.out.println("The multiplication table of " + num + " is the following:");

        for(int i =0;i<=num2;i++){

            product = num * i;

            System.out.println(num + " X " + i + " = " + product);
        }
    }
}


