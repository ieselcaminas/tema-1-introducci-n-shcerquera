package main.primeros.pasos.java;

import java.util.Scanner;

// Un programa que pida el radio de una circunferencia y muestre su área y su perímetro
public class Exercise_6 {
    public static void main(String[] args) {

        double radio;

        Scanner inputValue = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radio = inputValue.nextDouble();

        double area = radio * Math.PI;

        System.out.println("The area is: " + area);

        double perimeter = 2 * Math.PI * radio;

        System.out.println("The perimeter is: " + perimeter);
    }
}
