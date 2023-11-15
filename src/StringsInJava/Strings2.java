package StringsInJava;

import java.util.Scanner;

public class Strings2 {
    public static void main(String[] args) {
     //Define variables and libraries
        Scanner in = new Scanner(System.in);
        String str1 = "A fox jumped out one winter's night, and begged the moon to give him light.";

        //Greet user and prompt for input
        System.out.println("Hello! The string reads as follows " + str1);
        System.out.println("Please enter a character to count occurrences in the string: ");
        String str = in.nextLine();

        char target = str.charAt(0);

        //Print results
        System.out.println("The character " + target + " occurs " + countOccurrences(str1, target) + " times in the string.");


    }

        public static int countOccurrences(String str, char target) {
        //Define variables
        int count = 0;

            //Use loop to count occurrences
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == target) {
                    count++;
                }
            }
            return count;
        }
    }


