import java.util.Scanner;

// Un programa que lea dos números enteros y muestre el resultado de sumarlos, restarlos, multiplicarlos y dividirlos
public class Exercise_5 {
    public static void main(String[] args) {

        int number1;
        int number2;

        Scanner inputValue = new Scanner(System.in);
        System.out.print("Insert two integer numbers: ");

        number1 = inputValue.nextInt();
        number2 = inputValue.nextInt();


        int sum = number1 + number2;
        int sub = number1 - number2;
        int multi = number1 * number2;
        float div = (float) number1 / number2;

        System.out.println("The result of the sum is:" + sum);
        System.out.println("The result of the subtraction is: " + sub);
        System.out.println("The result of the multiplication is: " + multi);
        System.out.println("The result of the division is: " + div);
    }
}
