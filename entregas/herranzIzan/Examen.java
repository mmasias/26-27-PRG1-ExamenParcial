package entregas.herranzIzan;

import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Examen parcial PRG1");

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

        int numeroAsignaturas;

        do {
            System.out.print("Introduce el número de asignaturas matriculadas: ");
            numeroAsignaturas = teclado.nextInt();

            if (numeroAsignaturas < 1 || numeroAsignaturas > 10) {
                System.out.println("Número de asignaturas no válido. Inténtalo de nuevo.");
            }

        } while (numeroAsignaturas < 1 || numeroAsignaturas > 10);

        int sumaNotas = 0;

        for (int numero = 1; numero <= numeroAsignaturas; numero++) {
            System.out.print("Nota de la asignatura " + numero + ": ");
            int nota = teclado.nextInt();

            sumaNotas = sumaNotas + nota;
        }

        double media = (double) sumaNotas / numeroAsignaturas;

        System.out.println("La media de las notas es: " + media);
    }
}