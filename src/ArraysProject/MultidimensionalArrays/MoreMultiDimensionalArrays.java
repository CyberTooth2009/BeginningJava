//Name: Samuel Ralph
//Grade: 9th

package ArraysProject.MultidimensionalArrays;

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

        while(true) {
            //Printing out menu of options
            System.out.println(RED + "------Menu------");
            System.out.println(GREEN + "1. Square Array Number Finder");
            System.out.println(YELLOW + "2. Sqaure Array String Finder ");
            System.out.println(BLUE + "3. ");
            System.out.println(PURPLE + "4.  ");
            System.out.println(RED + "5.  ");
            System.out.println(RED + "0. Exit ");


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


                    break;
                case 5:
                    break;
                case 6:

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

}
