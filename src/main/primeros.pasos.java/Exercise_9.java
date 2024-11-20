import java.util.Scanner;

// Igual que el anterior pero que también muestre un mensaje si es menor de edad
public class Exercise_9 {
    public static void main(String[] args) {
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are of legal age.");
        } else {
            System.out.println("Your are underage.");
        }
    }
}
