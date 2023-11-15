package ArraysPractice;
import java.util.Arrays;

public class ArraysExample {
    //Define variables and libraries
    public static void main(String[] args) {
        System.out.println("---------Using arrays in Java----------");

        //Define a simple array (all variables initialized to 0)
        int[] numberList =  new int[5];

        //Print current array (loop)
        print("\n");
        print("First number list array: ");
        for(int i = 0; i < numberList.length; i++ ) {
            print(numberList[i] + " ");
        }

        //Assigning values to all variables slots
        numberList[0] = 2;
        numberList[1] = 3;
        numberList[2] = 4;
        numberList[3] = 5;
        numberList[4] = 6;

        int[] numberList2 = {2, 3, 4, 5, 6};

        //Print our two arrays (loop):

        print("\n");
        print("First number list array: ");
        for(int i = 0; i < numberList2.length; i++){
            System.out.print(numberList2[i] + " ");
        }
    //Another way of printing arrays (1/2) Arrays.toString(<array>)
        print("\n");
        print("First number list array (using toString()): ");
        print(Arrays.toString(numberList));

        // Another way of printing arrays (2/2) the wrong way
        print("\n");
        print("First number array (wrong way): ");
        System.out.print(numberList);

        //Sorting arrays Arrays.sort()
        Arrays.sort(numberList2);

        //Print sorted arrays
        print("\n");
        print("Second number array (sorted): ");
        print(Arrays.toString(numberList2));

        //Find the square of all values within first number list
        for(int i = 0; i < numberList.length; i++){
            //Calculate the square of each value
            numberList[i] = numberList[i] * numberList[i];
        }

        //Print result
        print("\n");
        print("First number list array (squares): ");
        print(Arrays.toString(numberList));


    }

    public static void print(String str) {
        System.out.print(str);
    }

    public static void println(String str) {
        System.out.println(str);
    }

}
