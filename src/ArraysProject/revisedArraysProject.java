package ArraysProject;

//Declaring colors

//Import libraries
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class revisedArraysProject {
    //Declaring colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static void main(String[] args) {
        //Declaring libraries
        Scanner in = new Scanner(System.in);

        //Printing out purpose of program
        System.out.println(CYAN + "***************************************");
        System.out.println("*            Problem Solver           *");
        System.out.println("***************************************");
        System.out.println("This program offers a large variety of different problem solvers.\nSelected the one you want below by inputting the corresponding number");

        //Printing out menu of options
        System.out.println(RED + "------Menu------");
        System.out.println(GREEN + "1. Square Root of Array");
        System.out.println(YELLOW + "2. Contains number?");
        System.out.println(BLUE + "3. Bonaville University Scholarship checker");
        System.out.println(PURPLE + "4. Array rotator");
        System.out.println(RED + "5. Minimum and Maximum of an Array");
        System.out.println(WHITE + "6. Finding duplicate integers");
        System.out.println(CYAN + "7. Finding duplicate strings");
        System.out.println(ANSI_RESET + "0. QUIT");

        //Prompting user for selection
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        //Statement to switch from respective problem-solving methods
        switch (choice) {
            case 1:
                rootArray(0);
                break;
            case 2:
                System.out.println(GREEN + containsNumber(0));
                break;
            case 3:
                //Initialize new array
                int[] classGrades = new int[6];

                //Prompt for student grades
                System.out.println(GREEN + "Well to the Bonaville University scholarship readiness checker");
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

                //Deliver the news
                if (average(classGrades) >= 80) {
                    System.out.println("The student has an average grade of " + average(classGrades) + " , meaning they meet the scholarship criteria.");
                } else
                    System.out.println("The student has an average grade of " + average(classGrades) + " meaning they do not qualify for a scholarship. ");
                break;
            case 4:
                //Create array to be rotated
                int[] arrayToBeRotated = {10, 20, 30, 40, 50, 60};

                //Print out original array
                System.out.println("The original array is:");
                System.out.println(Arrays.toString(arrayToBeRotated));

                //Print out rotated array
                System.out.println("The rotated array is:");
                System.out.println(Arrays.toString(arrayReverser(arrayToBeRotated)));
                break;
            case 5:
                //Create array to be find values for
                int[] exampleArray = {1, 5, 8, 53, 2, 14};

                //Assign min and max values
                int [] minsAndMaxes = minMaxArray(exampleArray);
                int min = minsAndMaxes[0];
                int max = minsAndMaxes[1];

                //Print out orienting messages and result
                System.out.println("In the array: " + Arrays.toString(exampleArray) + " , the minimums and maximums are the following:");
                System.out.println("Minimum value: " + min);
                System.out.println("Maximum value: " + max); 
                break;
            case 6:
                //Create array to find duplicates in
                int [] ogArray = {1, 2, 5, 5, 6, 6, 7, 2};
                //Pass array through method
                duplicateInts(ogArray);
                break;
            case 7:
                //Create array to find duplicates in 
                String [] ogStrings = {"csi", "abd", "jude", "csi", "oiu", "gzw", "jude"}; 
                //Pass array through method
                duplicateStrings(ogStrings);
                break;
        }
    }


    public static double rootArray(double Square) {
        //Declaring integer array
        int[] NumberList = {4, 9, 16, 25, 36, 49, 64, 81, 100};

        //Greeting user and printing out original array
        System.out.println("This program will find the square root of all the values in the following array:");
        for (int i = 0; i < NumberList.length; i++) {
            System.out.print(" " + NumberList[i] + " ");
        }
        System.out.println();
        //Find square root of each value inside of array by iterating through
        //Prints out results
        System.out.print("Here is the squared version: ");
        for (int i = 0; i < NumberList.length; i++) {
            double SquareRoot = Math.sqrt(NumberList[i]);
            System.out.print(CYAN + " " + SquareRoot + " ");
            double results = SquareRoot;
        }
        return Square;
    }

    public static boolean containsNumber(int input) {
        //Declare library
        Scanner in = new Scanner(System.in);

        //Establish array
        int[] ListOfNumbers = {47, 85, 23, 5, 76, 30, 92, 11, 68, 39, 88, 14, 51, 72, 33, 9, 60, 21, 98, 44};

        //Prompt user for input
        System.out.println("Please input an integer value: ");
        input = in.nextInt();

        //Find if user input is equal to array using iteration
        boolean result = false;
        for (int i = 0; i < ListOfNumbers.length; i++) {
            if (input == ListOfNumbers[i]) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static double average(int[] studentGrades) {
        //Declaring libraries
        Scanner in = new Scanner(System.in);

        //Add all the values in given input array
        double average = 0;
        for (int i = 0; i < studentGrades.length; i++) {
            average += studentGrades[i];
        }
        //Return average grade
        return average / studentGrades.length;
    }
        public static int[] arrayReverser(int[] inputArray){
            //Store last value of array temporarily
            int tempLastValue = inputArray[inputArray.length - 1];

            for (int i = 1; i < inputArray.length; i++) {
                inputArray[i + 1] = inputArray[i];
            }

            inputArray[0] = tempLastValue;

            int[] resultingArray = inputArray;

            return resultingArray;
        }

        public static int[] minMaxArray(int[] intArray){
            //Create integer values for storing minimums and maximums
            int maxValue = 0;
            int minValue = 0;

            //Track values while combing array looking for minimums and maximums
            for (int j = 0; j < intArray.length; j++) {
                if (intArray[j] > maxValue) {
                    maxValue = intArray[j];
                }
                if (intArray[j] < minValue) {
                    minValue = intArray[j];
                }
            }
            //Create result array
            int[] resultantValues = new int[2];

            resultantValues[0] = minValue;
            resultantValues[1] = maxValue;

            //Return result
            return resultantValues;
        }

        public static void duplicateInts(int [] userInput) {
            //Create array to store duplicate values
            int [] duplicatesArray = new int[userInput.length];

            //Iterate through the array, checking whether any specific value is equal to the other
            for (int i = 0; i < userInput.length; i++) {
                for (int j = i + 1; j < userInput.length; j++) {
                    if (userInput[i] == userInput[j]) {
                        duplicatesArray[i] = userInput[i];
                    }
                }
            }
            //Print out original array
            System.out.println(GREEN + "The original array is the following: ");
            System.out.print(Arrays.toString(userInput));
            System.out.println(" ");

            //Present duplicate values
            System.out.println("Duplicate values:");
            for (int i = 0; i < duplicatesArray.length; i++) {
                if (duplicatesArray[i] != 0) {
                    System.out.println(duplicatesArray[i]);
                }
            }
        }
        public static void duplicateStrings(String [] stringsIn) {
            //Create array to store duplicate values and initialize all the indexes
            String[] duplicateStrings = new String[stringsIn.length];
            for (int i = 0; i < stringsIn.length; i++) {
                duplicateStrings[i] = "";
            }

            //Iterate through the array, checking whether any specific value is equal to the other
            for (int i = 0; i < stringsIn.length; i++) {
                for (int j = i + 1; j < stringsIn.length; j++) {
                    if (stringsIn[i].equals(stringsIn[j])) {
                        duplicateStrings[i] = stringsIn[i];
                    }
                }
            }
            //Print out original array
            System.out.println("The original array is the following: ");
            System.out.print(Arrays.toString(stringsIn));
            System.out.println(" ");

            //Present duplicate values
            System.out.println("Duplicate strings:");
            for (int i = 0; i < duplicateStrings.length; i++) {
                if (!duplicateStrings[i].equals("")) {
                    System.out.println(duplicateStrings[i]);
                }
            }
        }
}
