//Name: Samuel Ralph
//Grade: 9th

package ArraysProject.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoreMultiDimensionalArrays {
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

        //While loop to loop back to menu until exited
        while(true) {
            //Printing out menu of options
            System.out.println(RED + "------Menu------");
            System.out.println(GREEN + "1. Square Array Number Finder");
            System.out.println(YELLOW + "2. Sqaure Array String Finder ");
            System.out.println(BLUE + "3. Occurence counter ");
            System.out.println(PURPLE + "4. Value Index Finder ");
            System.out.println(RED + "5. Matrix Value Comparator ");
            System.out.println(GREEN + "6. Smallest Number Cololorer ");
            System.out.println(YELLOW + "0. Exit ");


            //Prompting user for selection
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();

            //Switch statement to allow for option selection
            switch (choice) {
                case 1:
                    //Define input array
                    int[][] secArr = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};

                    //Use isFoundOnArray method to check target value
                    System.out.println(isFoundOnArray(secArr, 2));
                    System.out.println(isFoundOnArray(secArr, 10));

                    break;
                case 2:
                    //Define input array
                    String[][] strArr = {{"Andres", "Perez", "PR"}, {"Juan", "Ortiz", "PR"}, {"Marta", "Olivera", "NY"}};

                    //Use isFoundOnStrArray method to check target value
                    System.out.println(isFoundOnStrArray(strArr, "Perez"));
                    System.out.println(isFoundOnStrArray(strArr, "PR"));
                    System.out.println(isFoundOnStrArray(strArr, "Marta"));
                    System.out.println(isFoundOnStrArray(strArr, "Magnate"));

                    break;
                case 3:
                    //Define input array
                    int[][] superArray = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};

                    //Use isFoundOnArray method to check target value
                    System.out.println(countValueInArr(superArray, 4));
                    System.out.println(countValueInArr(superArray, 8));

                    break;
                case 4:
                    //Define input array
                    int[][] valueArray = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};

                    //Use value method to find the location of target value in sqaure array
                    System.out.println(Arrays.toString(valueLocation(valueArray, 3)));
                    System.out.println(Arrays.toString(valueLocation(valueArray, 4)));
                    System.out.println(Arrays.toString(valueLocation(valueArray, 11)));

                    break;
                case 5:
                    int[][] firstArr = {{8,2,1},{77,4,6},{9,33,4}};
                    int[][] secondArr = {{1,2,3},{2,4,5},{4,4,5}};

                    System.out.println(isFoundInBoth(firstArr, secondArr, 3));
                    System.out.println(isFoundInBoth(firstArr, secondArr, 2));
                    System.out.println(isFoundInBoth(firstArr, secondArr, 5));
                    System.out.println(isFoundInBoth(firstArr, secondArr, 1));

                    break;
                case 6:
                    //Initialize testing array
                    int[][] arrayToPrint = {{1,2,3},{2,4,5},{4,4,1}};

                    //Use printWIthSmallestNum to realize given function
                    printWithSmallestNum(arrayToPrint);

                case 0:
                return;
            }
        }
    }
    public static boolean isFoundOnArray(int[][] matrix, int target){
        //If statement to check if input is a sqaure array
        if(matrix[0].length == matrix.length){
            //Use for-each loop to iterate through the input, checking if the element matches the inputted target
            for(int[] rowElm : matrix){
                for(int elm2 : rowElm){
                    if(elm2 == target){
                        return true;
                    }
                }
            }
            return false;
            //Fail if input isn't sqaure matrix
        }else{
            System.out.println("You did not input an sqaure array.");
        }
        return true;
    }
    public static boolean isFoundOnStrArray(String [][] matrix, String target){
        //If statement to check if input is a sqaure array
        if(matrix[0].length == matrix.length){
            //Use for-each loop to iterate through the input, checking if the element matches the inputted target
            for(String[] rowElm : matrix){
                for(String elm2 : rowElm){
                    if(elm2.equals(target)){
                        return true;
                    }
                }
            }
            return false;
            //Fail if input isn't sqaure matrix
        }else{
            System.out.println("You did not input an sqaure array.");
        }
        return true;
    }
    public static int countValueInArr(int[][] matrix, int target){
        //Initialize count variable
        int count = 0;
        //If statement to check if input is a sqaure array
        if(matrix[0].length == matrix.length){
            //Use for-each loop to iterate through the input, checking if the element matches the inputted target
            for(int[] rowElm : matrix){
                for(int elm2 : rowElm){
                    if(elm2 == target){
                        count++;
                    }
                }
            }
            //Fail if input isn't sqaure matrix
        }else{
            System.out.println("You did not input an sqaure array.");
        }
        return count;
    }
    public static int[] valueLocation(int[][] matrix, int target){
        //If statement to check if input is a sqaure array
        if(matrix[0].length == matrix.length){
            //Create variable equal to the length of the inputted array
            int rowLength = matrix.length;

            //Use for loop to iterate through the input, checking if the element matches the inputted target
            for(int i=0; i<rowLength; i++){
                for(int j=0; j<rowLength; j++){
                    if(matrix[i][j] == target){
                        return new int[]{i,j};
                    }
                }
            }
            //Fail if input isn't sqaure matrix
        }else{
            System.out.println("You did not input an sqaure array.");
        }
        return new int[]{-1,-1};
    }
    public static boolean isFoundInBoth(int[][] matrix1, int[][] matrix2, int target){
        //If statement to check if input is a sqaure array
        if(matrix1.length != matrix2.length) {
            return false;
        }
            //Use for-each loop to iterate through the input, checking if the element matches the inputted target
        for(int[] row1 : matrix1) {
            for(int[] row2 : matrix2) {

                if(row1.length != row2.length) {
                    return false;
                }
                //Using the for-each loop, use the rows and columns from the respective matrices to iterate, finding if a value lines up between the two
                for(int value1 : row1) {
                    for(int value2 : row2) {
                        if(value1 == target && value2 == target){
                            return true;
                        }
                    }
                }

            }
        }
        return false;
    }
    public static void printWithSmallestNum(int[][] matrix) {
        //Initialize minimum value by setting it to maximum
        int minimum = Integer.MAX_VALUE;

        //Find the smallest value inside of matrix and print it out using for-each loop
        for (int[] rowElm : matrix) {
            for (int elm2 : rowElm) {
                if (elm2 < minimum) minimum = elm2;
                System.out.print(elm2 + " ");
            }
            System.out.println();
        }
        //Using a for-each loop, iterate through the matrix, printing it, coloring values that are equal to the minimum
        for (int[] rowElm : matrix) {
            for (int elm2 : rowElm) {
                if (elm2 == minimum) {
                    System.out.print(GREEN + elm2);
                } else {
                    System.out.print(ANSI_RESET + elm2);

                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
