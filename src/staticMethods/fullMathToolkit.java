package staticMethods;

//Code written by Samuel Ralph
//Grade: 9th

import java.util.Scanner;

public class fullMathToolkit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        float radius = 0;
        float length = 0;
        float width = 0;
        float side = 0;

        System.out.println("Welcome to your math toolkit!");
        System.out.println("Input: \n1 for area of a circle calculator \n2 for the perimeter rectangle \n3 for the heptagon area calculator \n");
        choice = in.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Please input the radius of the circle you would like to calculate. ");
                radius = in.nextFloat();
                System.out.println("The area of the circle requested is " + computeAreaCircle(radius));
                break;

            case 2:
                System.out.println("Please input the length of the desired rectangle.");
                length = in.nextFloat();
                System.out.println("Please input the width of the desired rectangle.");
                width = in.nextFloat();
                System.out.println("The perimeter of the desired rectangle " + computePerimeterRectangle(length, width));
                break;
            case 3:
                System.out.println("Please input the length of the sides of the heptagon: ");
                side = in.nextFloat();
                System.out.println("The area of the desired heptagon is " + computeHeptagonArea(side));
                break;
            default:
                System.out.println("Your input is invalid, please try again");
                break;

        }
    }

    public static double computeAreaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static double computePerimeterRectangle(double length, double width) {
        double perimeter = 2 * (length + width);
        return perimeter;
    }

    public static double computeHeptagonArea(double side)
    {
       double result = ((7.0 / 4.0) * (side * side) * ((Math.cos(Math.PI / 7.0) / Math.sin(Math.PI / 7.0))));
       return result;
    }
}
