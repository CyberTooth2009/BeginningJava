package StringsInJava;

//Code written by Samuel Ralph
//Grade: 9th

import java.util.Scanner;

public class Strings1 {
    public static void main(String[] args) {

        //Declare variables and libraries
        String str1 = "A fox jumped out one winter's night, and begged the moon to give him light.";
        Scanner in = new Scanner(System.in);
        String badchar = "";

        System.out.println("The string given is: 'A fox jumped out one winter's night, and begged the moon to give him light.'");
        System.out.println("Please input the character you would like to remove: ");
        badchar = in.next();

        System.out.println("Your corrected string reads: " + removeCharacter(badchar));





    }
    public static String removeCharacter(String str) {
        String correctedString = "";
        String str1 = "A fox jumped out one winter's night, and begged the moon to give him light.";
//        Scanner in = new Scanner(System.in);



        String strcorrect = str1.replace(str, "");
        return  strcorrect;

    }
}
