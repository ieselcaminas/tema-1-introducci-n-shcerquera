import java.util.Scanner;

// Diseña un algoritmo que lea un valor numérico entero correspondiente a la nota de un examen y muestre su valor en letra
public class Exercise_14 {
    public static void main(String[] args) {

        int grade;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade: ");
        grade = sc.nextInt();

        if (grade >= 0 && grade < 3) {
            System.out.println("Very Poor");
        } else if (grade >= 3 && grade < 5) {
            System.out.println("Insufficient");
        } else if (grade >= 5 && grade < 6) {
            System.out.println("Sufficient");
        } else if (grade >= 6 && grade < 7) {
            System.out.println("Good");
        } else if (grade >= 7 && grade < 9) {
            System.out.println("Notable");
        } else if (grade >= 9 && grade <= 10) {
            System.out.println("Outstanding");
        } else {
            System.out.println("Invalid Grade.");
        }

    }
}
