package main.primeros.pasos.java;

import java.util.Scanner;

//un programa que pida numeros enteros y muestre su división
public class Exercise_31 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num= sc.nextInt();

        // Verificar que el número sea natural
        if (num <= 0) {
            System.out.println("Por favor, introduce un número natural (mayor que 0).");
        } else {
            System.out.println("Los divisores de " + num + " son:");
        }

        for (int i = 1; i <= num; i++) {
            if (num% i == 0) {
                System.out.println(i);
            }
        }
   }
}
