import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        final int MAYOR_DE_EDAD = 18;
        final int EDAD_MINIMA = 17;
        final int EDAD_MAXIMA = 70;
        final int ASIGNATURAS_MAX = 10;
        final int ASIGNATURAS_MIN = 1;

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

        for (int i = 1; i <= matriculas; i++) {
            System.out.println("Nota de la asignatura " + i + ": ");
            int notaAsignatura = scanner.nextInt();
        }
        scanner.close();
    }
}