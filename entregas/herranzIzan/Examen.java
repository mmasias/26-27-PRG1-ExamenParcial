package entregas.herranzIzan;

import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Examen parcial prg1");

        int edad;

        do {
            System.out.print("Introduce tu edad: ");
            edad = teclado.nextInt();

            if (edad < 17 || edad > 70) {
                System.out.println("Edad no válida. Inténtalo de nuevo.");
            }

        } while (edad < 17 || edad > 70);

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        System.out.print("Introduce el número de asignaturas matriculadas: ");
        int numeroAsignaturas = teclado.nextInt();
    }
}