import java.util.Scanner;

// Realiza un programa que lea dos números enteros y dependiendo de la operación que indique el usuario (+, -, * , /) muestre el resultado
public class Exercise_16 {
    public static void main(String[] args) {
        int num1;
        int num2;
        String operation;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        num2 = sc.nextInt();

        System.out.println("What type of operation will you perform?" );
        operation = sc.next();

        switch (operation){
            case "+":
                System.out.println("The result of the addition is: " + (num1 + num2));
                break;
            case "-":
                System.out.println("The result of the subtraction is: " + (num1 - num2));
                break;
            case "*":
                System.out.println("The result of the multiplication is: " + (num1 * num2));
                break;
            case "/":
                System.out.println("The result of the division is: " + (num1 / num2));
                break;
            default:
                System.out.println("Unknown operation: ");

        }

    }
}
