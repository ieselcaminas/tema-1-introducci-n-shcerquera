//Diseña un programa que muestre los primeros 40 términos de la serie de Fibonacci
public class Exercise_32 {
    public static void main(String[] args) {

        int num1 = 0, num2 = 1;
        int count = 40;

        System.out.println("Primeros " + count + " términos de la serie de Fibonacci:");

        for (int i = 1; i <= count; ++i) {
            System.out.print(num1 + " ");

            // Calcular el siguiente término
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
