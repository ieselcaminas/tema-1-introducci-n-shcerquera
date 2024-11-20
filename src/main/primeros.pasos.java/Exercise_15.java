import java.util.Scanner;

// Realiza un programa que lea un número entero del 1 al 10 y que muestre su valor en letra
public class Exercise_15 {
    public static void main(String[] args) {

        int grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Grade: ");
        grade = sc.nextInt();

        switch (grade) {
            case 0:
            case 1:
            case 2:
                System.out.println("Very poor.");
                break;

            case 3:
            case 4:
                System.out.println("Insufficient");
                break;

            case 5:
                System.out.println("Sufficient");
                break;

            case 6:
                System.out.println("Good");
                break;

            case 7:
            case 8:
                System.out.println("Notable");
                break;

            case 9:
            case 10:
                System.out.println("Outstanding");
                break;

            default:
                System.out.println("Invalid grade");

        }
    }
}
