package ArraysProject;

//Declaring colors

//Import libraries
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class ArraysProject {
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
        switch(choice){
            case 1:
                rootArray(0);
                break;
            case 2:
                System.out.println(GREEN + containsNumber(0));
                break;
            case 3:
                average();
                break;
            case 4:
                System.out.println(BLUE + Arrays.toString(arrayReverser()));
                break;
            case 5:
                System.out.println(PURPLE + Arrays.toString(minMaxArray()));
                break;
            case 6:
                duplicateInts();
                break;
            case 7:
                duplicateStrings();
                break;
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
            System.out.print(CYAN + " " + SquareRoot + " ");
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

        int average = 0;

        //Calculating student's average
        average = ((classGrades[0] + classGrades[1] + classGrades [2] + classGrades[3] + classGrades [4] + classGrades[5])/6);

        //Deliver the news
        if(average >= 80){
            System.out.println("This student meets the criteria for a Bonaville University scholarship.");
        }else
            System.out.println("This student does not need the criteria for a scholarship.");
    }
    public static int[] arrayReverser(){
        //Create array
        Scanner in = new Scanner(System.in);
        int [] rotatedArray = new int[6];
        //Greet user and prompt for input
        System.out.println(CYAN + "This program will rotate a 6 value array that you define");
        System.out.println("Please input the first value");
        int firstValue = in.nextInt();
        System.out.println("Please input the second value");
        int secondValue = in.nextInt();
        System.out.println("Please input the third value");
        int thirdValue = in.nextInt();
        System.out.println("Please input the fourth value");
        int fourthValue = in.nextInt();
        System.out.println("Please input the fifth value");
        int fifthValue = in.nextInt();
        System.out.println("Please input the sixth value");
        int sixthValue = in.nextInt();

        //Print out original array
        System.out.println(RED + "Your original array is the following: ");
        System.out.print(firstValue + " ");
        System.out.print(" " + secondValue + " ");
        System.out.print(" " + thirdValue + " ");
        System.out.print(" " + fourthValue + " ");
        System.out.print(" " + fifthValue + " ");
        System.out.print(" " + sixthValue + " ");
        System.out.println(" ");

        //Rotate values in array
        rotatedArray[0] = sixthValue;
        rotatedArray[1] = secondValue;
        rotatedArray[2] = thirdValue;
        rotatedArray[3] = fourthValue;
        rotatedArray[4] = fifthValue;
        rotatedArray[5] = firstValue;

        //Print out and return result
        System.out.println("Your rotated array is the following: ");

        return rotatedArray;
    }
    public static int[] minMaxArray(){
        //Declare libraries
        Scanner in = new Scanner(System.in);
        //Prompt user for array size input
        System.out.println(BLUE + "This program will return the minimum and maximum value observed in a user-defined array.");
        System.out.println("How many values will your array have? ");
        int arraySize = in.nextInt();
        //Create array
        int[] intArray = new int[arraySize];
        //Get user to input their chosen values based on the size they gave before
        for(int i = 0; i < arraySize; i++) {
            System.out.print(PURPLE + "Enter value number " + i + ": ");
            intArray[i] = in.nextInt();
        }
        //Use loop to go through array, by tracking the array while iterating
        int maxValue = intArray[0];
        int minValue = intArray[0];

        for(int j = 0; j < intArray.length; j++){
            if (intArray[j] > maxValue){
               maxValue = intArray[j];
            }
            if (intArray[j] < minValue){
                minValue = intArray[j];
            }
        }
        //Create result array
        int[] resultantValues = new int[2];

        resultantValues[0] = minValue;
        resultantValues[1] = maxValue;
        //Return result
        System.out.println(YELLOW + "The result is given in [minValue, maxValue] format");
        return resultantValues;
    }
    public static void duplicateInts(){
        //Declare libraries
        Scanner in = new Scanner(System.in);
        //Prompt user for array length
        System.out.println("How many values will your array have? ");
        int arraySize = in.nextInt();

        //Create array
        int[] userInput= new int[arraySize];

        //Get user to input their chosen values based on the size they gave before
        for(int i = 0; i < arraySize; i++) {
            System.out.print(RED + "Enter value number " + i + ": ");
            userInput[i] = in.nextInt();
        }
        //Create array to store duplicate values
        int[] duplicatesArray = new int[arraySize];

        //Iterate through the array, checking whether any specific value is equal to the other
        for(int i = 0; i < userInput.length; i++) {
            for(int j = i+1; j < userInput.length; j++) {
                if(userInput[i] == userInput[j]) {
                    duplicatesArray[i] = userInput[i];
                }
            }
        }
        //Print out original array
        System.out.println(GREEN +"The original array is the following: ");
        System.out.print(Arrays.toString(userInput));
        System.out.println(" ");
        //Present duplicate values
        System.out.println("Duplicate values:");
        for(int i = 0; i < duplicatesArray.length; i++) {
            if(duplicatesArray[i] != 0) {
                System.out.println(duplicatesArray[i]);
            }
        }
    }
    public static void duplicateStrings(){
        //Declare libraries
        Scanner in = new Scanner(System.in);
        //Prompt user for array length
        System.out.println("How many values will your array have? ");
        int arraySize = in.nextInt();

        //Create array
        String[] listOfWords = new String[arraySize];

        //Get user to input their chosen values based on the size they gave before
        for(int i = 0; i < arraySize; i++) {
            System.out.print(CYAN + "Enter phrase number " + i + ": ");
            listOfWords[i] = in.next();
        }
        //Create array to store duplicate values and initialize all the indexes
        String[] duplicateStrings = new String[arraySize];
        for(int i=0; i < arraySize; i++) {
            duplicateStrings[i] = "";
        }

        //Iterate through the array, checking whether any specific value is equal to the other
        for(int i = 0; i < listOfWords.length; i++) {
            for(int j = i+1; j < listOfWords.length; j++) {
                if(listOfWords[i].equals(listOfWords[j])) {
                    duplicateStrings[i] = listOfWords[i];
                }
            }
        }
        //Print out original array
        System.out.println("The original array is the following: ");
        System.out.print(Arrays.toString(listOfWords));
        System.out.println(" ");

        //Present duplicate values
        System.out.println("Duplicate strings:");
        for(int i = 0; i < duplicateStrings.length; i++) {
            if(!duplicateStrings[i].equals("")) {
                System.out.println(duplicateStrings[i]);
            }
        }
    }
}
