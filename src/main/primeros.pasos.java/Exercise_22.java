import java.util.Scanner;

// Números positivos
public class Exercise_22 {
    public static void main(String[] args) {

        String positiveNumbers = "";

        Scanner sc = new Scanner(System.in);


        for (int index = 1; index <= 10; index++) {
            System.out.print("Enter number " + index +": ");

            int nextInt = sc.nextInt();

            if (nextInt >= 0) {
                positiveNumbers = positiveNumbers + nextInt + ", ";
            }
        }

        System.out.println("The positive numbers are: " + positiveNumbers);
    }
}
