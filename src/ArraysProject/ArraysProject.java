package ArraysProject;

//Import libraries
import java.util.Scanner;
import java.lang.Math;

public class ArraysProject {
    public static void main(String[] args) {
        //Declaring libraries
        Scanner in = new Scanner(System.in);

        //Printing out purpose of program
        System.out.println("***************************************");
        System.out.println("*            Problem Solver           *");
        System.out.println("***************************************");
        System.out.println("This program offers a large variety of different problem solvers.\n Selected the one you want below by inputting the corresponding number");

        //Printing out menu of options
        System.out.println("------Menu------");
        System.out.println("1. Problem Solution 1");
        System.out.println("2. Problem Solution 2");
        System.out.println("3. Problem Solution 3");
        System.out.println("4. Problem Solution 4");
        System.out.println("5. Problem Solution 5");
        System.out.println("6. Problem Solution 6");
        System.out.println("7. Problem Solution 7");
        System.out.println("0. QUIT");

        //Prompting user for selection
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        //Statement to switch from respective problem-solving methods
        switch(choice){
            case 1:
                rootArray(0);
            case 2:
                System.out.println(containsNumber(0));
            case 3:
                average();


        }
    }

    public static double rootArray(double Square){
        //Declaring integer array
        int[] NumberList = {4, 9, 16, 25, 36, 49, 64, 81, 100};

        //Greeting user and printing out original array
        System.out.println("This program will find the square root of all the values in the following array:");
        for(int i = 0; i < NumberList.length; i++) {
            System.out.print(" " + NumberList[i] +  " ");
        }
        System.out.println();
        //Find square root of each value inside of array by iterating through
        //Prints out results
        System.out.print("Here is the squared version: ");
        for(int i = 0; i < NumberList.length; i++){
            double SquareRoot = Math.sqrt(NumberList[i]);
            System.out.print(" " + SquareRoot + " ");
            double results = SquareRoot;
        }
        return Square;
    }
    public static boolean containsNumber(int input){
        //Declare library
        Scanner in = new Scanner(System.in);

        //Establish array
        int[] ListOfNumbers = {47, 85, 23, 5, 76, 30, 92, 11, 68, 39, 88, 14, 51, 72, 33, 9, 60, 21, 98, 44};

        //Prompt user for input
        System.out.println("Please input an integer value: ");
        input = in.nextInt();

        //Find if user input is equal to array using iteration
        boolean result = false;
        for (int i = 0; i < ListOfNumbers.length; i++){
            if(input == ListOfNumbers[i]){
                result = true;
                break;
            }
        }
        return result;
    }
    public static void average (){
        //Declaring libraries
        Scanner in = new Scanner(System.in);

        //Asking user for student grades in respective classes
        int[] classGrades = new int[6];

        System.out.println("Well to the Bonaville University scholarship readiness checker");
        System.out.println("Please input the student's Physics grade from last semester:  ");
        classGrades[0] = in.nextInt();

        System.out.println("Please input the student's Math grade from last semester:  ");
        classGrades[1] = in.nextInt();

        System.out.println("Please input the student's Science grade from last semester:  ");
        classGrades[2] = in.nextInt();

        System.out.println("Please input the student's English grade from last semester:  ");
        classGrades[3] = in.nextInt();

        System.out.println("Please input the student's Spanish grade from last semester:  ");
        classGrades[4] = in.nextInt();

        System.out.println("Please input the student's History grade from last semester:  ");
        classGrades[5] = in.nextInt();

        int average = 0;

        //Calculating student's average
        average = ((classGrades[0] + classGrades[1] + classGrades [2] + classGrades[3] + classGrades [4] + classGrades[5])/6);

        //Deliver the news
        if(average >= 80){
            System.out.println("This student meets the criteria for a Bonaville University scholarship.");
        }else
            System.out.println("This student does not need the criteria for a scholarship.");
    }
    public static int arrayReverser(int[] ogFortnite){
        //Declare libraries
        Scanner in = new Scanner(System.in);

    }




}
