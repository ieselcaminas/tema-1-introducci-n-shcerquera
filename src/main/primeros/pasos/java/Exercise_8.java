package main.primeros.pasos.java;

import java.util.Scanner;

// Realiza un programa que pida la edad al usuario y muestre un mensaje si es mayor de edad
public class Exercise_8 {
    public static void main(String[] args) {

        int age;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are of legal age.");
        }
    }
}
