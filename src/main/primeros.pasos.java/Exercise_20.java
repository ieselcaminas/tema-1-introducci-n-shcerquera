import java.util.Scanner;

// Precio final
public class Exercise_20 {
    public static void main(String[] args) {

        double price;
        double discount = 0;
        double finalPrice;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  price: ");
        price = sc.nextDouble();

        if (price < 6) {
            discount = 0;
        } else if (price >= 6 && price < 60) {
            discount = 5;
        } else if (price >= 60) {
            discount = 10;
        }
        finalPrice = price - (price * discount / 100);

        System.out.println("Final Price: " + finalPrice);
        sc.close();
    }
}
