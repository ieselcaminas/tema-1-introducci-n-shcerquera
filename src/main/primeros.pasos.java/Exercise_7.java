package primeros.pasos.java;

import java.util.Scanner;

// Un programa que pida el precio real de un producto, el precio rebajado y muestre el descuento realizado
public class Exercise_7 {
    public static void main(String[] args) {

        float basePrice;
        float discountedPrice;

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Enter the actual price: ");
        basePrice = inputValue.nextFloat();

        System.out.println("Enter the discounted Price: ");
        discountedPrice = inputValue.nextFloat();

        float appliedDiscount = (basePrice - discountedPrice)/ basePrice * 100;

        System.out.println("The discount applied is: " + appliedDiscount + "%");
    }
}
