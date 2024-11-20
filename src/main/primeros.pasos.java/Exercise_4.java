import java.util.Scanner;

// Un programa que calcula y muestra el área de un cuadrado cuyo lado se introduce por pantalla
public class Exercise_4 {
    public static void main(String[] args) {

        int side;

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Enter the Side: ");
        side = inputValue.nextInt();

        int area = side * side;
        System.out.println("SquareArea: " + area);

        inputValue.close();
    }
}
