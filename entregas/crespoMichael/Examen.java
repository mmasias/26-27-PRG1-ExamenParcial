package entregas.crespoMichael;

import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        int edad;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Examen parcial PRG1");
        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();

        if (edad < 16) {
            System.out.println("La edad no es valida");
        }
        if (edad >= 99) {
            System.out.println("La edad no es valida");
        }
        if (edad >= 16 && edad <= 99) {
            System.out.println("La edad es valida");
        }

        System.out.print("Cuantas asignaturas cursa? ");
        int asignaturas = scanner.nextInt();
        System.out.println("Cursa " + asignaturas + " asignaturas.");

        if (asignaturas < 1) {
            System.out.println("No es un numero valido de asignaturas.");
        } else if (asignaturas >= 1 && asignaturas <= 10) {
            System.out.println("Numero valido de asignaturas.");
        } else if (asignaturas > 10) {
            System.out.println("No es un numero valido de asignaturas.");
        }

        if (asignaturas < 1) {
            asignaturas = 0;
        } else if (asignaturas > 10) {
            asignaturas = 0;
        }

        System.out.print("Ingrese la nota de cada asignatura: ");

        int NOTAS[] = new int[asignaturas];

        for (int i = 0; i < asignaturas; i++) {
            System.out.print("Ingrese la nota de la asignatura " + (i + 1) + ": ");
            NOTAS[i] = scanner.nextInt();
        }

        double promedio;

        promedio = 0;
        for (int i = 0; i < asignaturas; i++) {
            promedio += NOTAS[i];
        }
        promedio = promedio / asignaturas;

        System.out.println("El promedio de las notas es: " + promedio);

        for (int i = 0; i < asignaturas; i++) {
            if (NOTAS[i] < 5) {

                System.out.println("El alumno reprueba la asignatura " + (i + 1) + " con nota: " + NOTAS[i]);

                int reprobadas = i++;
                System.out.println("El reprueba " + " " + reprobadas + "asignaturas.");

            } else {
                System.out.println("El alumno aprueba la asignatura " + " " + (i + 1) + " con nota: " + NOTAS[i]);
                int aprobadas = i++;
                System.out.println("El aprueba " + aprobadas + "asignaturas.");
            }

        }

        if (promedio >= 5) {
            System.out.println("El alumno aprueba.");
        } else {
            System.out.println("El alumno reprueba.");
        }

        System.out.println("ingrese todas las notas: ");      
        int notas= scanner.nextInt();
        
        if (notas < 0) {
            System.out.println("La nota no es valida");
        } else if (notas > 10) {
            System.out.println("La nota no es valida");
        } else {
            System.out.println("La nota es valida");
        }

        int NOTAS2[] = new int[notas];

        for (int i = 0; i < notas; i++) {
            System.out.print("Ingrese la nota de la asignatura " + (i + 1) + ": ");
            NOTAS2[i] = scanner.nextInt();
        }
        if (NOTAS2[0] > NOTAS2[1] && NOTAS2[1] > NOTAS2[2] && NOTAS2[2] > NOTAS2[3] && NOTAS2[3] > NOTAS2[4] && NOTAS2[4] > NOTAS2[5] && NOTAS2[5] > NOTAS2[6] && NOTAS2[6] > NOTAS2[7] && NOTAS2[7] > NOTAS2[8] && NOTAS2[8] > NOTAS2[9]) {
            System.out.println("La nota 1 es la mayor");

        if (NOTAS2[1] > NOTAS2[2] && NOTAS2[2] > NOTAS2[3] && NOTAS2[3] > NOTAS2[4] && NOTAS2[4] > NOTAS2[5] && NOTAS2[5] > NOTAS2[6] && NOTAS2[6] > NOTAS2[7] && NOTAS2[7] > NOTAS2[8] && NOTAS2[8] > NOTAS2[9]) {
            System.out.println("La nota 2 es la mayor");

        if (NOTAS2[2] > NOTAS2[3] && NOTAS2[3] > NOTAS2[4] && NOTAS2[4] > NOTAS2[5] && NOTAS2[5] > NOTAS2[6] && NOTAS2[6] > NOTAS2[7] && NOTAS2[7] > NOTAS2[8] && NOTAS2[8] > NOTAS2[9]) {
            System.out.println("La nota 3 es la mayor");
        
        if (NOTAS2[3] > NOTAS2[2] && NOTAS2[2] > NOTAS2[3] && NOTAS2[3] > NOTAS2[4] && NOTAS2[4] > NOTAS2[5] && NOTAS2[5] > NOTAS2[6] && NOTAS2[6] > NOTAS2[7] && NOTAS2[7] > NOTAS2[8] && NOTAS2[8] > NOTAS2[9]) {
            System.out.println("La nota 4 es la mayor");

        if (NOTAS2[4] > NOTAS2[5] && NOTAS2[5] > NOTAS2[6] && NOTAS2[6] > NOTAS2[7] && NOTAS2[7] > NOTAS2[8] && NOTAS2[8] > NOTAS2[9]) {
            System.out.println("La nota 5 es la mayor");
        
        if (NOTAS2[5] > NOTAS2[6] && NOTAS2[6] > NOTAS2[7] && NOTAS2[7] > NOTAS2[8] && NOTAS2[8] > NOTAS2[9]) {
            System.out.println("La nota 6 es la mayor");

        if (NOTAS2[6] > NOTAS2[7] && NOTAS2[7] > NOTAS2[8] && NOTAS2[8] > NOTAS2[9]) {
            System.out.println("La nota 7 es la mayor");
        }
        if (NOTAS2[7] > NOTAS2[8] && NOTAS2[8] > NOTAS2[9]) {
            System.out.println("La nota 8 es la mayor");
        }
        if (NOTAS2[8] > NOTAS2[9]) {
            System.out.println("La nota 9 es la mayor");
        }
        if (NOTAS2[9] == NOTAS2[8]) {
            System.out.println("La nota 10 es la mayor");
        }
        }
    }
}
        scanner.close();}
}
        }
    }
}
    


