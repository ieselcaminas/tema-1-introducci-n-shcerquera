import java.util.Scanner;
//Realiza un programa que lea un número entero decimal (máximo 255) e imprima
// su valor en binario
public class Exercise_36 {
    public static void main(String[] args) {

       //solicitar el numero inicial
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero (maximo 255): ");
        int num = sc.nextInt();
        //verificaer que el numero este en el rango
        if (num < 0 || num > 255){
            System.out.println("El numero debe ser maximo 255: ");
        }
        //covertir numero a binario
        String binario ="";

        while (num > 0){
            binario = (num % 2) + binario;
            num = num/2;
        }
        //verificar número binario
        if (binario.isEmpty()){
            binario = "0";
        }
        //imprimir el número en binario
        System.out.println("El número es " + binario);
        }
    }
