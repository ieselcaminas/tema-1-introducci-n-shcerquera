package main.primeros.pasos.java;

import java.util.Scanner;

//Realiza un programa que calcule la multiplicación de
// dos números usando el método de las sumas sucesivas
public class Exercise_34 {
    public static void main(String[] args) {

        int num1;
        int num2;
        int add = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to addition: ");
        num1 = sc.nextInt();

        System.out.println("Enter number:");
        num2 = sc.nextInt();

        for (int i = 0; i < num1; i++) {
            add += num2;
        }

        System.out.println("add: " + add);
    }

}


