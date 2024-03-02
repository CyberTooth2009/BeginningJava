//Name: Samuel Ralph
//Grade: 9th

package ArraysProject.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class irregularArrays {
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

            //Printing out menu of options
            System.out.println(RED + "------Menu------");
            System.out.println(GREEN + "1. Overloaded Methods");
            System.out.println(YELLOW + "2. Array Merger");
            System.out.println(BLUE + "3. Jagged Merge");
            System.out.println(YELLOW + "0. Exit ");


            //Prompting user for selection
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();

            //Switch statement to allow for option selection
            switch (choice) {
                case 1:
                    //Create test data
                    int num1 = 5;
                    int num2 = 10;
                    int[] arr1 = new int[]{1, 2, 3, 4, 5};
                    int[] arr2 = new int[]{6, 7, 8, 9, 10};

                    //Use overloaded sum method to realize a variety of actions
                    System.out.println(sum(num1,num2));
                    System.out.println(sum(arr1));
                    System.out.println(Arrays.toString(sum(arr1, arr2)));

                    break;
                case 2:
                    //Create test data
                    int[] array1 = new int[]{1,2,3,4,5};
                    int[] array2 = new int[]{6,7,8,9,10,11,12};

                    //Use merge function to combine two arrays
                    System.out.println(Arrays.toString(merge(array1, array2)));

                    break;
                case 3:
                    //Create test data
                    int[] test1 = new int[]{1,2,3,4,5};
                    int[] test2 = new int[]{6,7,8,9,10,11,12};

                    //Use merge function to combine two arrays
                    mergeEnhanced(test1,test2);

                    break;
            }
    }
        static public int sum(int num1, int num2){
            //Add integers
            return num1 + num2;
        }
        static public int sum(int[] arr1){
        //Sum all elements within the array
            int result = 0;
            for(int elm: arr1){
                result += elm;
            }
            return result;
        }
        static public int[] sum(int[] arr1, int[] arr2){
            //Create result array
            int[] finalarray = new int[2];

            //Run for-each loops to add values in arrays
            int result = 0;
            for(int elm: arr1){
                result += elm;
            }

            int result2 = 0;
            for(int elm: arr2){
                result2 += elm;
            }

            //Assign result values to ending array
            finalarray[0] = result;
            finalarray[1] = result2;

            return finalarray;
        }
        public static int[] merge(int[] arr1, int[] arr2){
            // Get lengths of original arrays
            int length1 = arr1.length;
            int length2 = arr2.length;

            // Calculate total length of new array
            int length3 = length1 + length2;

            // Create new array to hold all elements
            int[] arr3 = new int[length3];

            //Create index variable
            int index = 0;

            //Use for-each loops to place values from respective arrays
            for (int elm : arr1) {
                arr3[index] = elm;
                index++;
            }

            for (int elm : arr2) {
                arr3[index] = elm;
                index++;
            }

            return arr3;
        }
        public static void mergeEnhanced(int[] arr1, int[] arr2){
            // Get lengths of original arrays
            int length1 = arr1.length;
            int length2 = arr2.length;

            // Calculate total length of new array
            int length3 = length1 + length2;

            // Create new array to hold all elements
            int[] arr3 = new int[length3];

            //Declaring a 2D array with odd columns
            int[][] arr = new int[3][];
            arr[0] = new int[length1];
            arr[1] = new int[length2];
            arr[2] = new int[length3];

            //Create index variable
            int index = 0;


            // Copy first array
            for(int element : arr1) {
                arr[0][index] = element;
                index++;
            }

            //Reset index value
            index = 0;

            // Copy second array
            for(int element : arr2) {
                arr[1][index] = element;
                index++;
            }

            //Reset index
            index = 0;

            // Combine into third array
            //Use for loops to add values from iterated arrays to the arr[2] sub-array
            for(int i=0; i<arr1.length; i++) {
                arr[2][index++] = arr1[i];
            }

            for(int j=0; j<arr2.length; j++) {
                arr[2][index++] = arr2[j];
            }

            // Printing the jagged array
            System.out.println("Result:");
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
