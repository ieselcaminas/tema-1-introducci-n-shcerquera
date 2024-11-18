package main.primeros.pasos.java;

import java.util.Scanner;

//Diseña un algoritmo que lea dos valores y muestre el más grande de ellos
public class Exercise_12 {
    public static void main(String[] args) {

        double num1;
        double num2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value: ");
        num1 = sc.nextDouble();

        System.out.print("Enter second value: ");
        num2 = sc.nextDouble();

        System.out.println("This is the number of greatest value: ");

        if (num1 >= num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
