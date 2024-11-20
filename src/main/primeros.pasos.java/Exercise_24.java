import java.util.Scanner;

// Diseña un algoritmo que lea un conjunto de notas del teclado hasta que se introduzca -1 y muestre
// la nota media y si había un 10 o no.Nota media
public class Exercise_24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sumaNotas = 0;
        int cantidadNotas = 0;
        boolean huboNota10 = false;
        System.out.println("Introduzca las notas y  luego -1 para finalizar: ");
        while (true) {
            int nota = sc.nextInt();
            if (nota == -1) {
                return;
            }
            if (nota >= 0 && nota <= 10) {
                sumaNotas += nota;
                cantidadNotas++;
                // si la nota es 10
                if (nota == 10) {
                    huboNota10 = true;
                }

            } else {
                System.out.println("nota no valida.");
            }
            if (cantidadNotas > 0) {
                double media = (double) sumaNotas / cantidadNotas;
                System.out.println("La nota  media es: " + media);
                if (huboNota10) {
                    System.out.println();
                }
            }
        }

    }
}









