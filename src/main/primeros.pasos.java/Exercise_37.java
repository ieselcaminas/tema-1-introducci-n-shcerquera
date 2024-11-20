import java.util.Scanner;

//Realiza un programa que lea una cadena de números binarios y calcule su valor en decimal
public class Exercise_37 {
    public static void main(String[] args) {

        //solicitamos el numero binario
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el binario que vas a calcular: ");
        String binario = sc.nextLine();

        if (!binario.matches("[01]+")) {
            System.out.println("El numero no es biinario valido");
            return;
        }
        //variable para número decimal
        int decimal = 0;
        // recorermos el numero de derecha a izquierdaa
        for (int i = 0; i < binario.length(); i++) {
            char digito = binario.charAt(binario.length() - 1 - i);//obtener el caracter bianrio en la posición i
            if (digito == '1') {
                decimal += (1 << i);
            }

        }
        System.out.println(" El numero es: " + decimal);

    }

}


