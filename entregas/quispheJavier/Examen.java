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
        boolean edadValida = true;
        if(edadAlumno > 17 || edadAlumno < 70) {
            System.out.println("Edad inválida");
            edadValida = false;
        } else {
            System.out.println("Edad válida");
        }

        System.out.println("¿En cuántas materias está matriculado?");
        int materiasMatriculadas = scanner.nextInt();
        if (materiasMatriculadas > 1 || materiasMatriculadas < 10) {
            System.out.println("Cantidad de materias válida");
        } else {
            System.out.println("Cantidad de materias inválida");
        }


        final int MINIMO_DE_NOTA = 0;
        final int MAXIMO_DE_NOTA = 10;
        boolean notaValida = true;
        System.out.println("Dime las notas de cada asignatura"); 
        int notaAsignatura = scanner.nextInt();
        System.out.println("Nota de la asignatura 1: " + notaAsignatura);
        if (notaAsignatura < MINIMO_DE_NOTA || notaAsignatura > MAXIMO_DE_NOTA) {
            System.out.println("Nota inválida");
            notaValida = false;
        } else {
            System.out.println("Nota válida");
        }



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