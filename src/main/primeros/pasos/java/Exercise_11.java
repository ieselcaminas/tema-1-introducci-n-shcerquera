package main.primeros.pasos.java;

import java.util.Scanner;

// Diseña un algoritmo que lea dos valores y los muestre en orden ascendente
public class Exercise_11 {
    public static void main(String[] args) {

        double  number1;
        double  number2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value: ");
        number1 = sc.nextDouble();

        System.out.print("Enter second value: ");
        number2 = sc.nextDouble();

        if (number1 >= number2) {
            System.out.println("The numbers in ascending order are:" );
            System.out.println(number2);
            System.out.println(number1);
        } else {
            System.out.println("The numbers in ascending order are:");
            System.out.println(number1);
            System.out.println(number2);
        }
    }
}
