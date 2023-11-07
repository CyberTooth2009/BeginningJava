package multiTemperatureProgram;

/*
Code written by Samuel Ralph
Grade: 9th
*/

import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {

    //Import libraries and define variables
    Scanner in = new Scanner(System.in);
    int choice = 0;
    double temp = 0;


    //Introduction to the program
    System.out.println("=========================================================================");
    System.out.println("==                      Temperature Converter                          ==");
    System.out.println("== This will convert one unit value of temperature to a different unit ==");
    System.out.println("=========================================================================");


    //Prompt user for input selection
    System.out.println("");
    System.out.println("Input: \n1 for Fahrenheit to Celsius\n2 for Celsius to Fahrenheit\n3 for Fahrenheit to Kelvin\n4 for Celsius to Kelvin\n5 for Kelvin to Fahrenheit\n6 for Kelvin to Celsius ");
    choice = in.nextInt();

    //Run switch statement to begin conversion

        switch (choice){
            case 1:
                System.out.println("Please input your to be converted value: ");
                temp = in.nextDouble();
                System.out.println("Your Fahrenheit value is " + fahrenheitToCelsius(temp) + " degrees centigrade.");
                break;
            case 2:
                System.out.println("Please input your to be converted value: ");
                temp = in.nextDouble();
                System.out.println("Your Celsius value is " + celsiusToFahrenheit(temp) + " degrees Fahrenheit.");
                break;
            case 3:
                System.out.println("Please input your to be converted value: ");
                temp = in.nextDouble();
                System.out.println("Your Fahrenheit value is " + fahrenheitToKelvin(temp) + " degrees Kelvin.");
                break;
            case 4:
                System.out.println("Please input your to be converted value: ");
                temp = in.nextDouble();
                System.out.println("Your Celsius value is " + celsiusToKelvin(temp) + " degrees Kelvin.");
                break;
            case 5:
                System.out.println("Please input your to be converted value: ");
                temp = in.nextDouble();
                System.out.println("Your Kelvin value is " + kelvinToFahrenheit(temp) + " degrees Fahrenheit.");
                break;
            case 6:
                System.out.println("Please input your to be converted value: ");
                temp = in.nextDouble();
                System.out.println("Your Kelvin value is " + kelvinToCelsius(temp) + " degrees centigrade.");
                break;
            default:
                System.out.println("Your input is invalid, please try again.");
        }

    //Converters written as methods
    }
    public static double fahrenheitToCelsius(double temp){
        double CelFahrenConvert = ((temp - 32) * (5/9));
        return CelFahrenConvert;
    }
    public static double celsiusToFahrenheit(double temp){
        double FahrenCelConvert = (temp * (9/5) + 32);
        return FahrenCelConvert;
    }
    public static double fahrenheitToKelvin(double temp){
        double KelFarenConvert = ((temp + 459.67) * (5/9));
        return KelFarenConvert;
    }
    public static double celsiusToKelvin(double temp){
        double KelCelConvert = (temp + 273.15);
        return KelCelConvert;
    }
    public static double kelvinToFahrenheit(double temp){
        double FarenKelConvert = ((1.8) * (temp - 273.15)) + 32;
        return FarenKelConvert;
    }
    public static double kelvinToCelsius(double temp){
        double CelKelConvert = temp - 273.15;
        return CelKelConvert;
    }
}



