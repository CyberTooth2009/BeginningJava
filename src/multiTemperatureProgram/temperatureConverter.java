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


    //Introduction to the program
    System.out.println("=========================================================================");
    System.out.println("==                      Temperature Converter                          ==");
    System.out.println("== This will convert one unit value of temperature to a different unit ==");
    System.out.println("=========================================================================");


    //Prompt user for input selection
    System.out.println("");
    System.out.println("Input: \n1 for Fahrenheit to Celsius\n2 for Celsius to Fahrenheit\n3 for Fahrenheit to Kelvin\n4 for Celsius to Kelvin\n5 for Kelvin to Fahrenheit\n6 for Kelvin to Celsius ");




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
}



