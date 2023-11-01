package staticMethods;

//Code written by Samuel Ralph
//Grade: 9th 

import java.util.Scanner;

public class myMethodspractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        float radius = 0;
        float length = 0;
        float width = 0;

        System.out.println("Welcome to your math toolkit!");
        System.out.println("Input 1 for area of a circle calculator and 2 for the perimeter rectangle");
        choice = in.nextInt();

        if (choice == 1){
            System.out.println("Please input the radius of the circle you would like to calculate. ");
            radius = in.nextFloat();
            System.out.println("The area of the circle requested is " + computeAreaCircle(radius));
        }
        if (choice == 2){
            System.out.println("Please input the length of the desired rectangle.");
            length = in.nextFloat();
            System.out.println("Please input the width of the desired rectangle.");
            width = in.nextFloat();
            System.out.println("The perimeter of the desired rectangle " + computePerimeterRectangle(length, width));
        }
        else {
            System.out.println("Input is invalid, try again");
        }
    }

    public static double computeAreaCircle(double radius)
    {
        return Math.PI * radius * radius;
    }

    public static double computePerimeterRectangle(double length, double width)
    {
        double perimeter = 2*(length + width);
        return perimeter;
    }
}
