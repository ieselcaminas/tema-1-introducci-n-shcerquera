package main.primeros.pasos.java;
import java.util.Scanner;

// impresión de números
public class Exercise_27 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        n= sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j<= i; j++){
                System.out.print( j +" ");
            }
            System.out.println();
        }

    }
}
