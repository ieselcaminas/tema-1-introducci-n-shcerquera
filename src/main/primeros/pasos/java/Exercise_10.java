package main.primeros.pasos.java;

import java.util.Scanner;

// Diseña un algoritmo que lea un valor y muestre si es positivo o negativo (0 es positivo)
public class Exercise_10 {
    public static void main(String[] args) {

        float inputNumber;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a valid number: ");

        inputNumber = sc.nextFloat();

        if (inputNumber >= 0){
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number in negative");
        }
    }
}
