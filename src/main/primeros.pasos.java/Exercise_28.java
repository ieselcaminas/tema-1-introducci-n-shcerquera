import java.util.Scanner;
//*Escribe un programa que muestre si un número es primo o no.
//Los números primos tienen la siguiente característica: un número primo es solamente divisible por
// sí mismo y por la unidad, por tanto, un número primo no puede ser par excepto el 2.
//Para saber si un número impar es primo, dividimos dicho número por todos los números impares
// comprendidos entre 3 y la mitad de dicho número.
//Por ejemplo, para saber si 13 es un número primo basta dividirlo por 3, y 5. Para saber si 25 es
//número primo se divide entre 3, 5, 7, 9, y 11. Si el resto de la división (operación módulo %) es
// cero, el número no es primo.

public class Exercise_28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Crear un objeto para leer la entrada del usuario
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt(); // Leer el número ingresado

        if (numero <= 1) {
            System.out.println(numero + " no es un número primo."); // Los números menores o iguales a 1 no son primos
        } else {
            boolean esDivisible = false; // Variable para indicar si encontramos un divisor

            // Verificamos si el número es divisible por algún número desde 2 hasta (numero - 1)
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) { // Si el número es divisible por otro número, no es primo
                    esDivisible = true; // Encontramos un divisor
                    break; // No necesitamos seguir, ya sabemos que no es primo
                }
            }
            // Si no encontramos ningún divisor, es primo; de lo contrario, no lo es
            if (!esDivisible) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }

        }

    }
}
