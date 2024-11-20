import java.util.Scanner;

//Factorial: Diseña un programa que calcule el factorial de un número
public class Exercise_25 {
    public static void main(String[] args) {

        //5! = 1 * 2 * 3 * 4 * 5;
        int factorial = 1; //


        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        if(num > 31){
            System.out.println("Error ingrese un numero menor");
        }else {

            for (int i = num; i > 0; i--) {
                factorial = factorial * i;
                System.out.print("El factoria de " + num + ", es: " + factorial);
            }
        }

    }
}
