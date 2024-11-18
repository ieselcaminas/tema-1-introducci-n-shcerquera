package main.primeros.pasos.java;

import java.util.Scanner;

// Números positivos II
public class Exercise_23 {
    public static void main(String[] args) {
        int num;
        int contadoPositivo = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");

        for (int i = 0; i < 10; i++) {
            System.out.println("Number" + (i + 1) + ":");

            num = sc.nextInt();

            if (num > 0) {
                contadoPositivo++;
            }
        }
        System.out.println("la cantidad de numeros positivos es:" + contadoPositivo);
    }
}
