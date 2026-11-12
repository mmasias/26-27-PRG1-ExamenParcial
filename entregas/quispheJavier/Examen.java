import java.util.Scanner;

public class Examen {
    public static void main (String args[]) {
        System.out.println("Examen Parcial PRG1");

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cúal es tu edad?");
        int edadAlumno = scanner.nextInt();

        if(edadAlumno >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        if (edadAlumno > 17 || edadAlumno > 70) {
            System.out.println("Es válida");
        } else {
            System.out.println("No es válida");
        }

        System.out.println("¿En cuántas materias está matriculado?");
        int materiasMatriculadas = scanner.nextInt();

        if (materiasMatriculadas > 1 || materiasMatriculadas < 10) {
            System.out.println("Cantidad de materias válida");
        } else {
            System.out.println("Cantidad de materias inválida");
        }

        System.out.println("Dime las notas de cada asignatura"); 
        int notaAsignatura = scanner.nextInt();
        System.out.println("Nota de la asignatura 1: " + notaAsignatura);


        double notaMedia = materiasMatriculadas / notaAsignatura;
        System.out.println("Nota media: " + notaMedia);


        int materiasDesaprobadas = 0;
        if (notaMedia > 5) {
            System.out.println("Materia aprobada");
        } else {
            System.out.println("Materia desaprobada");
            materiasDesaprobadas++;
        }

        System.out.println("Cantidad de materias suspensas: " + materiasDesaprobadas);

    }
}