import java.util.Scanner;

// Año bisiesto
public class Exercise_21 {
    public static void main(String[] args) {

        int year;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        year = sc.nextInt();

        boolean esBisiesto = false;
        // Bandera inicializada en false

        // Comprobación de las condiciones para un año bisiesto
        if (year % 400 == 0) {
            esBisiesto = true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            esBisiesto = true;
        }

        // Mostrar el resultado
        if (esBisiesto) {
            System.out.println("The year " + year + " is leap year.");
        } else {
            System.out.println("The year " + year + " no es leap year.");
        }
    }
}
