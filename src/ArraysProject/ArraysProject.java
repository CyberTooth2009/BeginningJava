package ArraysProject;

import java.util.Scanner;
import java.lang.Math;

public class ArraysProject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("***************************************");
        System.out.println("*            Problem Solver           *");
        System.out.println("***************************************");
        System.out.println("This program offers a large variety of different problem solvers.\n Selected the one you want below by inputting the corresponding number");


        System.out.println("------Menu------");
        System.out.println("1. Problem Solution 1");
        System.out.println("2. Problem Solution 2");
        System.out.println("3. Problem Solution 3");
        System.out.println("0. QUIT");

        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        switch(choice){
            case 1:
                rootArray(0);
        }
    }

    public static double rootArray(double Square){
        int[] NumberList = {4, 9, 16, 25, 36, 49, 64, 81, 100};

        System.out.println("This program will find the square root of all the values in the following array:");
        for(int i = 0; i < NumberList.length; i++) {
            System.out.print(" " + NumberList[i] +  " ");
        }
        System.out.println();
        System.out.print("Here is the squared version: ");
        for(int i = 0; i < NumberList.length; i++){
            double SquareRoot = Math.sqrt(NumberList[i]);
            System.out.print(" " + SquareRoot + " ");
            double results = SquareRoot;
        }
        return Square;
    }
    public static boolean containsNumber(int input){
        int[] ListOfNumbers = {47, 85, 23, 5, 76, 30, 92, 11, 68, 39, 88, 14, 51, 72, 33, 9, 60, 21, 98, 44};

        while

    }


}
