package helloWorld;

//Code written by Samuel Ralph
//Grade: 9th

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

//        //int num1 = 10;
//        //int num2 = 10;
//        //int resultado = 0;
//
//        //Peform computation
//        //resultado = num1 + num2;
//
//        //Print results
//        //System.out.println("El resultado de la suma es: " + resultado);
//
//        System.out.print("Hola a todos");
//        System.out.print("Mi nombre es Pablito");

        int num1 = 0;
        Scanner in =new Scanner(System.in);

        System.out.println("Please input your first desired number:");
        num1 = in.nextInt();

        System.out.println("The number that you have inputted is " + num1);

    }

}
