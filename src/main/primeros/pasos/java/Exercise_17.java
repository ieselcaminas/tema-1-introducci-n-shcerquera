package main.primeros.pasos.java;

import java.util.Scanner;

// Realiza un programa que pida al usuario un mes e imprima el número de días que tiene
public class


    Exercise_17 {
    public static void main(String[] args) {

        int month;
        // 1 month with 28 days
        // 4 months with 30 days
        // 7 months with 31 days

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a month: ");
        month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month has 31 days.");
                break;

            case 2:
                System.out.println("This month has 28 days.");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days.");
                break;

            default:
                System.out.println("Unknown month");
        }

    }
}
