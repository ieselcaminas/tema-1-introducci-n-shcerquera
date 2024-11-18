package main.primeros.pasos.java;

import java.util.Scanner;

// Realiza un programa que calcule el resto de una división usando el método de las restas sucesivas.
public class Exercise_35 {
    public static void main(String[] args) {

        int dividend;
        int divider;
        int rest = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to substract: ");
        dividend = sc.nextInt();

        System.out.println("Enter number:");
        divider = sc.nextInt();
        rest = dividend;

        while (rest >= divider) {
            rest = rest - divider;
        }

        System.out.println("The rest is: " + rest);
    }
}
