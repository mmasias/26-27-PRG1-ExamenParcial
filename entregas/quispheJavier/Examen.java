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

        if (edadAlumno > 17) {
            System.out.println("Es válida");
        } else {
            System.out.println("No es válida");
        }

        if (edadAlumno > 70) {
            System.out.println("Es válida");
        } else {
            System.out.println("No es válida");
        }

    }
}