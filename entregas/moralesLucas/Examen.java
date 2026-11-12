
import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Examen parcial prg1");

        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();

        while (edad < 16 || edad > 99) {
            System.out.println("Edad no valida. Debe estar entre 16 y 99 años.");

            System.out.print("Introduce tu edad: ");
            edad = teclado.nextInt();
        }

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        System.out.print("Introduce el numero de asignaturas matriculadas: ");
        int asignaturas = teclado.nextInt();

        while (asignaturas < 1 || asignaturas > 10) {
            System.out.println("Numero de asignaturas no valido. Debe estar entre 1 y 10.");

            System.out.print("Introduce el numero de asignaturas matriculadas: ");
            asignaturas = teclado.nextInt();
        }

        System.out.println("Numero de asignaturas: " + asignaturas);

        double suma = 0;

        for (int i = 1; i <= asignaturas; i++) {
            System.out.print("Nota de la asignatura " + i + ": ");
            int nota = teclado.nextInt();

            suma = suma + nota;
        }

        double media = suma / asignaturas;

        System.out.println("La media de las notas es: " + media);

        teclado.close();
    }
}


