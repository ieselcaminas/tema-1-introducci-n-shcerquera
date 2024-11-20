import java.util.Scanner;

// Realiza un programa que averigüe si una palabra o frase es palíndroma.
// Para averiguar el número de caracteres de una cadena se usa el método length(
//  y para acceder al carácter iésimo usa la función chartAt()
public class Exercise_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        boolean esPalindromo = true;

        for (int i = 0; i < palabra.length() ; i++) {
            int indiceDeUltimaLetra = palabra.length() - 1;
            int indiceDesdeElFinal = indiceDeUltimaLetra - i;

            char letraActual = palabra.charAt(i);
            char letraActualDesdeElFinal = palabra.charAt(indiceDesdeElFinal);

            if (letraActual != letraActualDesdeElFinal) {
                esPalindromo = false;
            }
        }

        if (esPalindromo) {
            System.out.println(palabra + " es palíndromo");
        } else {
            System.out.println(palabra + " no es palíndromo");
        }
    }
}
