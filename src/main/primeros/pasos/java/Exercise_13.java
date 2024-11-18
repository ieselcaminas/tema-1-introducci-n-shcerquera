package main.primeros.pasos.java;

import java.util.Scanner;

// Realiza un programa que lea dos valores y los orden ascendente o descendentemente según elija el usuario
public class Exercise_13 {
    public static void main(String[] args) {

        double num1;
        double num2;
        int sortPreference;


        Scanner sc = new Scanner(System.in);
        System.out.println("In what order do you want the numbers?");
        System.out.println("Enter 1 for Ascending and 2 for Descending:  ");
        sortPreference = sc.nextInt();


        System.out.print("Enter first value:  ");
        num1 = sc.nextDouble();

        System.out.print("Enter second value:  ");
        num2 = sc.nextDouble();

        if (sortPreference == 1) {
            // preferencia ascendente
            if (num1 > num2) {
                System.out.println(num2 + ", " + num1);
            } else {
                System.out.println(num1 + ", " + num2);
            }

        } else if (sortPreference == 2) {
            // preferencia descendenete
            if (num2 < num1) {
                System.out.println(num1 + ", " + num2);
            } else {
                System.out.println(num2 + ", " + num1);
            }
        }
    }
}
