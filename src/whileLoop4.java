//Code by Juan Pablo Jiménez
//Grade 10
import java.util.Scanner;
public class whileLoop4 {
    public static <string> void main(String[] args) {
        //Introduce the program
        System.out.println("-----Password Checker-----");
        System.out.println("This program verifies that the password inputted is the same as the internally stored password");
        System.out.println("You have 3 chances to input the correct password");
        //declare variables
        String passwd = "qwerty1234!";
        String userInput = "lol";
        int num2 = 0;
        int Attempts = 0;
        int j = 2;
        Scanner input = new Scanner(System.in);
        //Ask user for input
        System.out.println("Type the password (3 attempts left): ");
        userInput = input.next();
        //Print if the given password is correct
        if ((userInput.equals(passwd))) {
            System.out.println("Correct!");
        }
        //If the input is not the correct password, run a while loop that gives the user 2 more chances to get the correct password
        else {
            while (Attempts<2) {
            //Ask user for input
            System.out.print("Wrong password, try again (");
            System.out.print(j--);
            System.out.println(" attempts left): ");
                userInput = input.next();
                if ((userInput.equals(passwd))) {
                    System.out.println("Correct!");
                    break;
                }
                else {
                    Attempts++;
                }
                //If the user has too many incorrect attempts, stop the program
                if (j==0) {
                    System.out.println("Too many incorrect attempts!");
                }
            }
        }
    }
}
