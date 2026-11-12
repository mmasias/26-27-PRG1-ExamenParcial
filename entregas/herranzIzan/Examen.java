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
        int asignaturasAprobadas = 0;
        int asignaturasSuspensas = 0;
        int notaMasAlta = 0;

        for (int numero = 1; numero <= numeroAsignaturas; numero++) {

            int nota;

            do {
                System.out.print("Nota de la asignatura " + numero + ": ");
                nota = teclado.nextInt();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota no válida. Introduce una nota entre 0 y 10.");
                }

            } while (nota < 0 || nota > 10);

            sumaNotas = sumaNotas + nota;

            if (nota >= 5) {
                asignaturasAprobadas++;
            } else {
                asignaturasSuspensas++;
            }

            if (nota > notaMasAlta) {
                notaMasAlta = nota;
            }
        }

        double media = (double) sumaNotas / numeroAsignaturas;

        System.out.println("La media de las notas es: " + media);
        System.out.println("Asignaturas aprobadas: " + asignaturasAprobadas);
        System.out.println("Asignaturas suspensas: " + asignaturasSuspensas);
        System.out.println("La nota más alta es: " + notaMasAlta);
    }
}