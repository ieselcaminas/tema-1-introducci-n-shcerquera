package main.primeros.pasos.java;

// Modifica el programa anterior para que muestre la relación (división) entre el valor n y el (n - 1)
// de la serie de Fibonacci (40 veces). Esta es una manera de obtener una aproximación al Número Áureo.
public class Exercise_33 {

    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        int count = 40;

        for (int i = 1; i <= count; ++i) {
            // START código nuevo
            int num = num1;
            int numMenosUno = num - 1;

            double relacion = (double) num / numMenosUno;
            System.out.println("La relación áurea del número de Fibonacci # " + num + " (" + num + "/" + numMenosUno + ") es igual a " + relacion);
            // END código nuevo

            // Calcular el siguiente término
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}

