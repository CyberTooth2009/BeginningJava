//Student: Samuel Ralph Vélez
//Grade: 9th

package ArraysProject.MultidimensionalArrays;

import java.util.Scanner;

public class MultiDimensionalArraysProject {
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
        System.out.println(GREEN + "1. Grid printer");
        System.out.println(YELLOW + "2. Grid generator");
        System.out.println(BLUE + "3. Integer grid comparison");
        System.out.println(PURPLE + "4. Checkerboard filler ");
        System.out.println(RED + "5. Matrix comparision ");

        //Prompting user for selection
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        //Switch statement to allow for option selection
        switch (choice) {
            case 1:
                //Print the initialized grid
                printCharGrid(initializeGrid());
            case 2:
                //Prompt for input and store it in corresponding variables
                System.out.println("Please input your desired length and width: ");
                int dimensions = 0;
                dimensions = in.nextInt();
                System.out.println("Input your desired character: ");
                char input;
                input = in.next().charAt(0);

                //Print generated grid according to the parameters given
                printCharGrid(generateGrid(dimensions, input));


            case 3:
                //Print out integer grid
                printIntGrid();

                //Copy integer grid into the main method
                int [][] intGrid = {{1, 4, 6}, {13, 8, 5}, {9, 2, 7}};

                //Feed declared array into positiveMax method
                 System.out.println("The largest number in the grid is " + positiveMax(intGrid));

            case 4:
                //Declare checkerboard dimensions
                int lengths = 8;

                //Fill and print checkerboard given dimensions
                fillCheckerboard(lengths);



            case 5:
                //Define matrices
                int[][] m1 = {{1,2},{3,4}};
                int[][] m2 = {{2,1},{4,3}};

                //Print out matrices
                printIngGrid(m1);
                System.out.println();
                printIngGrid(m2);

                //Run comparison
                System.out.println(covers(m1, m2));



        }

    }

    public static char[][] initializeGrid() {
        //Initialize empty character 2D array
        char[][] grid = new char[5][5];

        //Iterate and populate the 2D array with 'x'
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = 'x';
            }
        }
        //Return the finished grid
        return grid;
    }
    public static void printCharGrid(char[][] gridToPrint){
        //Use for-each loop to print and add spacing after the elements in the 2D array
        for (char[] rowElm : gridToPrint) {
            for (char elm2 : rowElm) {
                System.out.print(elm2 + " ");
            }
            System.out.println();
        }
    }
    public static char[][] generateGrid(int gridSize, char symbol){
        //Create empty 2D array in accordance to the dimensions provided by the user
        char [][] userGrid = new char[gridSize][gridSize];

        //Use for loop to populate empty 2D array with the user provided character
        for(int i = 0; i < userGrid.length; i++){
            for(int j = 0; j < userGrid.length; j++){
                userGrid[i][j] = symbol;
            }
        }
        //Return the user generated array
        return userGrid;
    }
    public static void printIntGrid(){
        //Initialize 2D integer array
        int [][] intGrid = {{1, 4, 6}, {13, 8, 5}, {9, 2, 7}};

        //Use for-each loop to print the array
        for (int[] rowElm : intGrid) {
            for (int elm2 : rowElm) {
                System.out.print(elm2 + " ");
            }
            System.out.println();
        }
    }
    public static int positiveMax(int[][] arrVar){
        //Initialize maximum value integer
        int maxVal = 0;

        //Use for loop to compare all the values in the 2D array to find the maximum value
        for(int i=0; i<arrVar.length; i++) {
            for(int j=0; j<arrVar[i].length; j++) {
                if(arrVar[i][j] > maxVal) {
                    maxVal = arrVar[i][j];
                }
            }
        }
        //Return the largest value in the array
        return maxVal;
    }
    public static void fillCheckerboard(int dimension) {
        //Define 2D byte array
        byte[][] checkerboard = new byte[dimension][dimension];

        //Use for loop to calculate where to place 1s and 0s, and print out array using for-each loop
        for (int i = 0; i < checkerboard.length; i++) {
            for (int j = 0; j < checkerboard.length; j++) {
                if ((i + j) % 2 == 0) {
                    checkerboard[i][j] = 1;
                } else {
                    checkerboard[i][j] = 0;
                }
            }
            for (byte[] rowElm : checkerboard) {
                for (byte elm2 : rowElm) {
                    System.out.print(elm2 + " ");
                }
                System.out.println();
            }
        }
    }
    public static void printIngGrid(int[][] grid) {
        //Use for loop to print out sqaure matrices
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean covers(int[][] m1, int[][] m2) {
        //Define count integer
        int count = 0;
        //Run comparison with for loop and augment timer when m1 index is higher than m2 index
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] > m2[i][j]) {
                    count++;
                }
            }
        }
        //Return boolean on if the amount of m1 counts is larger than it's area/2, or, at least half its spaces.
        return count > m1.length * m1.length / 2;
    }
}
