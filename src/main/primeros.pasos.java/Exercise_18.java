import java.util.Scanner;

// Diseña un algoritmo que recibe horas, minutos y segundos y muestra horas, minutos y segundos resultantes de la adición de un segundo
public class Exercise_18 {
    public static void main(String[] args) {

        int hours;
        int minutes;
        int seconds;
        int addSecond = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hours: ");
        hours = sc.nextInt();

        // comprobar hora valida
        if (hours < 0) {
            System.out.println("Invalid Hour.");
        } else {
            System.out.print("Enter the minutes: ");
            minutes = sc.nextInt();

            //comprobar los minutos validos
            if (minutes < 0 || minutes > 59) {
                System.out.println("Invalid Minutes");
            } else {
                System.out.print("Enter the seconds: ");
                seconds = sc.nextInt();
                // comprobar segundos validos
                if (seconds < 0 || seconds > 59) {
                    System.out.println("Invalid Seconds");
                } else {

                    // Añadir el minuto solicitado
                    seconds = seconds + addSecond;

                    // 1 hora son 60 min
                    // 1 min son 60 seg


                    if (seconds >= 60) {
                        seconds = 0;
                        minutes = minutes + 1;
                    }
                    if (minutes >= 60) {
                        minutes = 0;
                        hours = hours + 1;
                    }

                    System.out.println(hours + " hours.");
                    System.out.println(minutes + " minutes.");
                    System.out.println(seconds + " seconds.");
                }
            }
        }
    }
}

