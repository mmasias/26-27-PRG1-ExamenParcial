import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Examen parcial PRG1:");
        System.out.println("Dígame su edad");
        int edad = scanner.nextInt();

        if (edad < 17 || edad > 70) {
            System.out.println("Edad invalidada, vuelva a poner su edad");
        } else if (edad < 18) {
            System.out.println("Usted es menor de edad");
        } else {
            System.out.println("Usted es mayor de edad");
        }

        System.out.println ("Dígame el número de asginaturas en las que está matriculado");
        int numeroAsignaturas = scanner.nextInt();
        
        if (numeroAsignaturas < 1 || numeroAsignaturas > 10) {
            System.out.println("Número de asignaturas invalidado, vuelva a poner el número de asignaturas");
        } else {
            System.out.println("Usted está matriculado en " + numeroAsignaturas + " asignaturas");
        }
        System.out.println("Nota de asignatura 1:");
        int notaAsignatura1 = scanner.nextInt();
        System.out.println("Nota de asignatura 2:");
        int notaAsignatura2 = scanner.nextInt();
        System.out.println("Nota de asignatura 3:");
        int notaAsignatura3 = scanner.nextInt();
        System.out.println("Nota de asignatura 4:");
        int notaAsignatura4 = scanner.nextInt();
        System.out.println("Nota de asignatura 5:");
        int notaAsignatura5 = scanner.nextInt();
        System.out.println("Nota de asignatura 6:");
        int notaAsignatura6 = scanner.nextInt();
        System.out.println("Nota de asignatura 6:");
        int notaAsignatura7 = scanner.nextInt();
        System.out.println("Nota de asignatura 8:");
        int notaAsignatura8 = scanner.nextInt();
        System.out.println("Nota de asignatura 9:");
        int notaAsignatura9 = scanner.nextInt();
        System.out.println("Nota de asignatura 10:");
        int notaAsignatura10 = scanner.nextInt();

        System.out.println ("Media de las notas");
        double media = (notaAsignatura1 + notaAsignatura2 + notaAsignatura3 + notaAsignatura4 + notaAsignatura5 + notaAsignatura6 + notaAsignatura7 + notaAsignatura8 + notaAsignatura9 + notaAsignatura10) / 10.0;
        System.out.println("La media de las notas es: " + media);
        int numeroAprobados = (notaAsignatura1 > 5) + (notaAsignatura2 > 5) + (notaAsignatura3 > 5) + (notaAsignatura4 > 5) + (notaAsignatura5 > 5) + (notaAsignatura6 > 5) + (notaAsignatura7 > 5) + (notaAsignatura8 > 5) + (notaAsignatura9 > 5) + (notaAsignatura10 > 5);
            System.out.println("Usted ha suspendido " + numeroAprobados + " asignatura"); 
        int numeroSuspensos = (notaAsignatura1 < 5) + (notaAsignatura2 < 5) + (notaAsignatura3 < 5) + (notaAsignatura4 < 5) + (notaAsignatura5 < 5) + (notaAsignatura6 < 5) + (notaAsignatura7 < 5) + (notaAsignatura8 < 5) + (notaAsignatura9 < 5) + (notaAsignatura10 < 5);
            System.out.println("Usted ha suspendido " + numeroSuspensos + " asignaturas");   

        if (notaAsignatura1 < 0 || notaAsignatura1 > 10 || notaAsignatura2 < 0 || notaAsignatura2 > 10 || notaAsignatura3 < 0 || notaAsignatura3 > 10 || notaAsignatura4 < 0 || notaAsignatura4 > 10 || notaAsignatura5 < 0 || notaAsignatura5 > 10 || notaAsignatura6 < 0 || notaAsignatura6 > 10 || notaAsignatura7 < 0 || notaAsignatura7 > 10 || notaAsignatura8 < 0 || notaAsignatura8 > 10 || notaAsignatura9 < 0 || notaAsignatura9 > 10 || notaAsignatura10 < 0 || notaAsignatura10 > 10) {
            System.out.println("Nota invalidada, vuelva a poner la nota");
        } else {
            System.out.println("Notas válidas");
        } 
        int notaMasAlta = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(notaAsignatura1, notaAsignatura2), notaAsignatura3), notaAsignatura4), notaAsignatura5), notaAsignatura6), notaAsignatura7), notaAsignatura8), notaAsignatura9), notaAsignatura10);
        System.out.println("La nota más alta es: " + notaMasAlta);
        int notaMasBaja = Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(notaAsignatura1, notaAsignatura2), notaAsignatura3), notaAsignatura4), notaAsignatura5), notaAsignatura6), notaAsignatura7), notaAsignatura8), notaAsignatura9), notaAsignatura10);
        System.out.println("La nota más baja es: " + notaMasBaja);
        if (media >= 5 && (notaAsignatura1 >= 4 && notaAsignatura2 >= 4 && notaAsignatura3 >= 4 && notaAsignatura4 >= 4 && notaAsignatura5 >= 4 && notaAsignatura6 >= 4 && notaAsignatura7 >= 4 && notaAsignatura8 >= 4 && notaAsignatura9 >= 4 && notaAsignatura10 >= 4)) {
            System.out.println("Promociona");
        } else {
            System.out.println("Recupera");
        }
    }

}