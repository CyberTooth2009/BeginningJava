package decimalCalculator;

//Decimal Calculator by Samuel Ralph
//Grade: 9th

//Import Java packages
import java.util.Scanner;

public class DecimalCalculator {
    public static <string> void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Introduce program
        System.out.println("Welcome to the Simple Decimal Calculator!");
        System.out.println("This program will take in two decimal values and perform addition, subtraction, multiplication and division on them.\n");

        //Initialize and define variables
        float variable = 0;
        float variable2 =0;

        //Get user input on variable value
        System.out.println("Input a number you would like to calculate:\n");
        variable = in.nextFloat();
        System.out.println("Input another number: \n");
        variable2 = in.nextFloat();

        float divresult = 0;
        float aditresult = 0;
        float subresult = 0;
        float multresult = 0;
        float remainsult =0;

        //Calculate results
        divresult = (variable / variable2);
        aditresult = (variable + variable2);
        subresult = (variable - variable2);
        multresult = (variable * variable2);
        remainsult = (variable % variable2);

        //Print out equations and results
        System.out.print(variable );
        System.out.print(" + ");
        System.out.print(variable2 );
        System.out.print(" = ");
        System.out.println(aditresult);

        System.out.print(variable );
        System.out.print(" - ");
        System.out.print(variable2 );
        System.out.print(" = ");
        System.out.println(subresult);

        System.out.print(variable );
        System.out.print(" * ");
        System.out.print(variable2 );
        System.out.print(" = ");
        System.out.println(multresult);

        System.out.print(variable );
        System.out.print(" / ");
        System.out.print(variable2 );
        System.out.print(" = ");
        System.out.println(divresult);

        System.out.print(variable );
        System.out.print(" % ");
        System.out.print(variable2 );
        System.out.print(" = ");
        System.out.println(remainsult);




    }
}
