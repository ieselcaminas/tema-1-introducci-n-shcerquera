import java.util.Random;
import java.util.Scanner;

/**
 * Diseña un algoritmo para jugar a “adivinar un número”. El algoritmo generará un número aleatorio entre 1 y 100,
 * que llamaremos el número secreto, y le pedirá al jugador que introduzca un número hasta que gane o un -1 para rendirse:
 * <p>
 * Si el número es igual al número secreto, mostrará “Has Ganado” en la pantalla y terminará
 * Si el número introducido es mayor que el número secreto, mostrará “El número secreto es más pequeño” y le pedirá que introduzca otro.
 * Si el número introducido es menor que el número secreto, mostrará “El número secreto es más grande” y le pedirá que introduzca otro.
 * Si el número introducido es -1, mostrará “Se rinde” y terminará
 */

public class Exercise_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random aleatorio = new Random(System.currentTimeMillis());

        int numeroSecreto = aleatorio.nextInt(100);

        System.out.print("Adivina un número entre el 1 y 100: ");

        int numeroUsuario = sc.nextInt();

        while (numeroUsuario != -1) {
            if (numeroUsuario == numeroSecreto) {
                System.out.println("¡¡Has ganado mil euros!!");
                break;
            } else if (numeroUsuario > numeroSecreto) {
                System.out.print("\nEl número secreto es más pequeño. Prueba otra vez (inserte otra moneda): ");
            } else {
                System.out.print("\nEl número secreto es más grande. Prueba otra vez (inserte otra moneda): ");
            }


            numeroUsuario = sc.nextInt();
        }

        if (numeroUsuario == -1) {
            System.out.println("\n¿Así que te rindes...?");
        }
    }
}
