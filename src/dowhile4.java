//Code by Juan Pablo Jiménez
//Grade 10
import java.util.Scanner;
public class dowhile4 {
    public static <string> void main(String[] args) {
        //Introduce the program
        System.out.println("-----Password Checker-----");
        System.out.println("This program verifies that the password inputted is the same as the internally stored password");
        System.out.println("You have unlimited chances to input the correct password");
        //declare variables
        String passwd = "qwerty1234!";
        String userInput = "lol";
        int num2 = 0;
        int Attempts = 0;
        int j = 2;
        Scanner input = new Scanner(System.in);
        //Ask user for input
        System.out.println("Type the password: ");
        userInput = input.next();
        //Print if the given password is correct
        if ((userInput.equals(passwd))) {
            System.out.println("Correct!");
        }
        //If the input is not the correct password, run a while loop that gives the user 2 more chances to get the correct password
        else {
            do {
                //Ask user for input
                System.out.print("Wrong password, try again: ");
                userInput = input.next();
                if ((userInput.equals(passwd))) {
                    System.out.println("Correct!");
                    break;
                }
            }while(j==2);
        }
    }
}
