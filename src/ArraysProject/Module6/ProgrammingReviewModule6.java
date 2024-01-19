//Name: Samuel Ralph
//Grade: 9th

package ArraysProject.Module6;

import java.util.Scanner;

public class ProgrammingReviewModule6 {
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
        System.out.println(GREEN + "1. Math results");
        System.out.println(YELLOW + "2. Near hundred ");
        System.out.println(BLUE + "3. Icy and Hot ");
        System.out.println(PURPLE + "4. Positives and Negatives ");
        System.out.println(RED + "5. In Specific Range");
        System.out.println(WHITE + "6. Not String ");
        System.out.println(CYAN + "7. Missing Character");
        System.out.println(YELLOW + "8. Character switcher ");
        System.out.println(BLUE + "9.  ");
        System.out.println(PURPLE + "10.  ");
        System.out.println(RED + "11. ");
        System.out.println(WHITE + "12. ");
        System.out.println(YELLOW + "13. ");
        System.out.println(ANSI_RESET + "0. QUIT");

        //Prompting user for selection
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        //Switch statement to provide menu functionality
        //Also prompts for user input when necessary and establishes testing data
        switch (choice) {
            case 1:
                System.out.println(-5 + 8 * 6);
                System.out.println((55 + 9) % 9);
                System.out.println(20 + -3 * 5 / 8);
                System.out.println(5 + 15 / 3 * 2 - 8 % 3);

            case 2:
                System.out.println("Please input a value");
                int number = 0;
                number = in.nextInt();
                System.out.println(returnVal(number));

            case 3:
                System.out.println("Please input temperature values:");
                int[] temps = {0, 0};
                System.out.println("Value 1:");
                temps[0] = in.nextInt();
                System.out.println("Value 2:");
                temps[1] = in.nextInt();
                System.out.println(returnTemp(temps));

            case 4:
                System.out.println("Please input values:");
                int[] signedNums = {0, 0};
                System.out.println("Value 1:");
                signedNums[0] = in.nextInt();
                System.out.println("Value 2:");
                signedNums[1] = in.nextInt();
                System.out.println(posNeg(signedNums));

            case 5:
                System.out.println("Please input values:");
                int[] nums = {0, 0};
                System.out.println("Value 1:");
                nums[0] = in.nextInt();
                System.out.println("Value 2:");
                nums[1] = in.nextInt();
                System.out.println(specRange(nums));

            case 6:
                System.out.println("Please input your desired string");
                String input = in.next();
                System.out.println(notString(input));

            case 7:
                System.out.println("Please input your desired string");
                String palabra = in.next();
                System.out.println("Please input the index of which character you would like to remove");
                int index = in.nextInt();
                System.out.println(missingChar(palabra, index));

            case 8:
                System.out.println("Please input your desired string");
                String stringTochange = in.next();
                System.out.println(switchedChars(stringTochange));

            case 9:
                System.out.println("Please input your desired string");
                String stringWithEs = in.next();
                System.out.println(switchedChars(stringWithEs));

            case 10:
                System.out.println("Please input your desired string");
                String waitingtoBeUpped = in.next();
                System.out.println(upperCaser(waitingtoBeUpped));
            case 11:
                int [] TestData = {1,2,2,1,13,7};
                System.out.println(unluckyNums(TestData));
            case 12:
                int [] DataForTest = {6,2,5,3};
                System.out.println(shiftLeft(DataForTest));
            case 13:
                int [] TestingData = {3, 1, 3, 1, 3};
                System.out.println(haveThree(TestingData));



        }

    }

    public static boolean returnVal(int num) {
        //Use absolute values to find whether a number is within 10 values away from 100 or 200
        boolean result = false;
        if (100 - Math.abs(num) <= 10) {
            result = true;
        } else if ((200 - Math.abs(num) <= 10)) {
            result = true;
        }

        return result;
    }

    public static boolean returnTemp(int[] plebs) {
        //Use conditionals to establish whether different temp values are in accordance to question criteria
        if ((plebs[0] < 0 && plebs[1] > 100) || (plebs[1] < 0 && plebs[0] > 100)) {
            return true;
        }
        return false;
    }

    public static boolean posNeg(int[] values) {
        //Essentially the same implementation done twice, checking both array indexes in both if statements
        if ((Math.signum(values[0]) == -1 && Math.signum(values[1]) == 1 || Math.signum(values[0]) == 1 && Math.signum(values[1]) == -1)) {
            return true;
        } else if ((Math.signum(values[0]) == -1 && Math.signum(values[1]) == -1 || Math.signum(values[0]) == -1 && Math.signum(values[1]) == -1)) {
            return true;
        }
        return false;
    }

    public static boolean specRange(int[] rangeNums) {
        //Use less or more to find whether array values fall within two different ranges
        if ((30 <= rangeNums[0] && rangeNums[1] <= 40)) {
            return true;
        } else if ((40 <= rangeNums[0] && rangeNums[1] <= 50)) {
            return true;
        }
        return false;
    }

    public static String notString(String ingress) {
        //Check if string has "not", and adds it to the beginning by concatenation if not
        if (ingress.contains("not")){
            return ingress;
        } else {
            String manipulatedString;
            manipulatedString = ("not " + ingress);
            return manipulatedString;
        }
    }
    public static String missingChar(String theWord, int whichChar) {
        //Use substrings up to the given point and then concatenate the resulting strings
        String first = theWord.substring(0, whichChar);
        String last = theWord.substring(whichChar+1);
        return first + last;
    }

    public static String switchedChars(String desiredWord){
        //Using temporary character arrays to store and then rearrange values in a string
        char[] chars = desiredWord.toCharArray();
        char temp = chars[0];
        chars[0] = chars[chars.length-1];
        chars[chars.length-1] = temp;
        return new String(chars);
    }
    public static boolean counterForE(String wordWithE) {
        //Returning a boolean if there are 1 to 3 "e" strings in a word using a for loop
        int count = 0;
        for(int i=0; i<wordWithE.length(); i++) {
            if(wordWithE.charAt(i) == 'e') {
                count++;
            }
        }
        return count >= 1 && count <= 3;
    }
    public static String upperCaser(String str) {
        //Splitting up a string using substrings to uppercase the last 3 characters and return it when needed
        if(str.length() < 3) {
            return str.toUpperCase();
        }
        String everythingElse = str.substring(0, str.length());
        String uppies = str.substring(str.length()-Math.min(str.length(),3));
        String upped = uppies.toUpperCase();
        return everythingElse + upped;
    }
    public static int unluckyNums(int[] selectedNums) {
        //Flags arrays with the number 13 with a boolean inside a for loop then continues with the addition of other values before it
        int sum = 0;
        boolean skip = false;
        for(int n : selectedNums) {
            if(n == 13) {
                skip = true;
                continue;
            }
            if(!skip) {
                sum += n;
            }
            skip = false;
        }
        return sum;
    }
    public static int[] shiftLeft(int[] array) {
        //Using the for loop to hop around the array indexes, shifting the values with temporary values
        int temp = array[0];
        for(int i=1; i<array.length; i++) {
            array[i-1] = array[i];
        }
        array[array.length-1] = temp;
        return array;
    }
    public static boolean haveThree(int[] arr) {
        //Using a variety of loops to hop around the given array, making a variety of checks that flow down the nested if statement
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 3) {
                count++;
                if(i > 0 && arr[i-1] == 3) {
                    return false;
                }
                if(i < arr.length-1 && arr[i+1] == 3) {
                    return false;
                }
            }
        }
        return count == 3;
    }

}





