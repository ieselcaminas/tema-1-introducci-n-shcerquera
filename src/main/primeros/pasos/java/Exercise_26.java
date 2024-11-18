package main.primeros.pasos.java;
import java.util.Scanner;
// Tablas de multiplicar

public class Exercise_26 {
    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to see its multiplication table: ");
        number = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(" " + " x " + i + " = " + (number * i));

        }
    }
}
