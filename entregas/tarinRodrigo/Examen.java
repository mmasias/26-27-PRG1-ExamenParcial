
import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAYOR_DE_EDAD = 18;
        final int EDAD_MINIMA = 17;
        final int EDAD_MAXIMA = 70;
        final int ASIGNATURAS_MAX = 10;
        final int ASIGNATURAS_MIN = 1;
        final int APROBADO = 5;
        final double NOTA_MINIMA = 0.0;
        final double NOTA_MAXIMA = 10.0;

        System.out.println("Examen parcial PRG1");

        System.out.println("Cual es la edad del alumno: ");
        int edad = scanner.nextInt();

        while (edad < EDAD_MINIMA || edad > EDAD_MAXIMA) {
            System.out.println("No es valido, vuelve a intentar: ");
            edad = scanner.nextInt();
        }

        System.out.println(edad >= MAYOR_DE_EDAD ? "Es mayor de edad" : "Es menor de edad");

        System.out.println("En cuantas asignaturas estas matriculado: ");
        int matriculas = scanner.nextInt();

        if (matriculas < ASIGNATURAS_MIN || matriculas > ASIGNATURAS_MAX) {
            System.out.println("No esta dentro del rango (1-10). Vuelve a intentar: ");
            matriculas = scanner.nextInt();
        }
        double sumaNotas = 0;
        int aprobadas = 0;
        double notaMaxima = NOTA_MINIMA;

        for (int asignatura = 1; asignatura <= matriculas; asignatura++) {
            double notaAsignatura;
            boolean notaValida = false;

            do {
                System.out.println("Nota de la asignatura " + asignatura + ": ");
                notaAsignatura = scanner.nextDouble();
                notaValida = notaAsignatura >= NOTA_MINIMA && notaAsignatura <= NOTA_MAXIMA;
                if (!notaValida) {
                    System.out.println("No es valido, vuelve a intentar.");
                }
            } while (!notaValida);

            sumaNotas = sumaNotas + notaAsignatura;
            if (notaAsignatura >= APROBADO) {
                aprobadas++;
            }
            if (notaAsignatura > notaMaxima) {
                notaMaxima = notaAsignatura;
            }
        }

        double media = sumaNotas / matriculas;
        System.out.println("La media es: " + media);
        System.out.println("Asignaturas aprobadas: " + aprobadas);

        int suspensas = matriculas - aprobadas;
        System.out.println("Asignaturas suspensas: " + suspensas);
        System.out.println("La nota mas alta es: " + notaMaxima);

        scanner.close();
    }
}