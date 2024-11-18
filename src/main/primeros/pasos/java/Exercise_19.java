package main.primeros.pasos.java;

import java.util.Scanner;

// Diseña un algoritmo que calcule el salario neto de un trabajador en función del número de horas de trabajo y los impuestos según las siguientes reglas
public class Exercise_19 {
    public static void main(String[] args) {
        /**
         * horas de trabajo:
         * primeras 35h normal
         * extras 1.5x
         *
         * impuestos:
         * primero 500€
         * siguientes 400€ 25%
         * el resto 45%
         */

        double hourPrice;
        double workedHours;

        // pago bruto, salario neto e impuestos
        double grossSalary = 0;
        double netSalary;
        double taxes = 0;

        double extraHours = 0;


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour price value: ");
        hourPrice = sc.nextFloat();

        System.out.print("Enter work hours value: ");
        workedHours = sc.nextFloat();

        System.out.println("---------------------------");

        if (workedHours <= 35) {
            grossSalary = hourPrice * workedHours;
        } else if (workedHours > 35) {
            grossSalary = hourPrice * 35;

            extraHours = workedHours - 35;

            grossSalary = grossSalary + (hourPrice * 1.5) * extraHours;
        }

        System.out.println("Extra hours amount: " + extraHours);

        System.out.println("---------------------------");

        System.out.println("Gross Salary: " + grossSalary);

        if (grossSalary > 500) {
            double salaryWithTax = 0;


            if (grossSalary > 900) {
                salaryWithTax = 400;
            } else {
                salaryWithTax = grossSalary - 500;
            }

            taxes = salaryWithTax * 25 / 100;
        }

        if (grossSalary > 900) {
            double salaryWithTax = grossSalary - 900;

            taxes = taxes + salaryWithTax * 45 / 100;
        }

        netSalary = grossSalary - taxes;

        System.out.println("Net Salary: " + netSalary);
        System.out.println("Taxes: " + taxes);

    }
}
