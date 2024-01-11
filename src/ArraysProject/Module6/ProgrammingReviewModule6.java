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
        System.out.println(YELLOW + "2. ");
        System.out.println(BLUE + "3. ");
        System.out.println(PURPLE + "4. ");
        System.out.println(RED + "5. ");
        System.out.println(WHITE + "6. ");
        System.out.println(CYAN + "7. ");
        System.out.println(ANSI_RESET + "0. QUIT");

        //Prompting user for selection
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        switch (choice){
            case 1:
                System.out.println(-5 +8 * 6);
                System.out.println((55 + 9) % 9);
                System.out.println(20 + -3 * 5 / 8);
                System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        }

    }
}
