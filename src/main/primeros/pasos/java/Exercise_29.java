package main.primeros.pasos.java;
//Realiza un programa que imprima todos los números primos entre 3 y 100.
//Este caso es una unión del algoritmo anterior pero repetido un número determinado de veces.
// Por tanto, usamos un bucle for

public class Exercise_29 {
    public static void main(String[] args) {
        System.out.print("Los números primos son: ");

        for (int numero = 3; numero <= 100; numero++) {
            boolean esDivisible = false; // Variable para indicar si encontramos un divisor

            // Verificamos si el número es divisible por algún número desde 2 hasta (numero - 1)
            for (int div = 2; div < numero; div++) {
                if (numero % div == 0) { // Si el número es divisible por otro número, no es primo
                    esDivisible = true; // Encontramos un divisor
                    break; // No necesitamos seguir, ya sabemos que no es primo
                }
            }

            // Si no encontramos ningún divisor, es primo; de lo contrario, no lo es
            if (!esDivisible) {
                System.out.print(numero + ", ");
            }
        }

        /**
         * Intento sin usar el ejercicio anterior (al final funcionó)
         */
        // leer numeros del 3 al 100
//        for (int num = 3; num <= 100; num++) {
//            boolean numEsPrimo = true;
//            // num = 5
//
//            // dividir el numero entre si mismo y numeros mas bajos
//            for (int div = num -1; div >= 2; div--) {
//                // div = 5, 4, 3, 2, 1
//
//                // System.out.println("dividiendo " + num + " / " + div + " %" + num % div);
//                if (num % div == 0) {
//                    numEsPrimo = false;
//                    break;
//                }
//            }
//
//            if (numEsPrimo) {
//                System.out.print(num + ", ");
//            }
//        }
    }
}
