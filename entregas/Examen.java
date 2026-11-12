import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("17:70");

        int edad = teclado.nextInt();

        System.out.println("La edad del alumno es: " + edad);

        teclado.close();
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int asignaturas;

        do {
            System.out.println("Introduce el número de asignaturas (entre 1 y 10):");
            asignaturas = teclado.nextInt();

            if (asignaturas < 1 || asignaturas > 10) {
                System.out.println("Error. Debes introducir un número entre 1 y 10.");
            }

        } while (asignaturas < 1 || asignaturas > 10);

        System.out.println("Número de asignaturas: " + asignaturas);

        teclado.close();
    }
int[] notas = new int[asignaturas];

        double suma = 0;
        double media;

        int aprobadas = 0;
        int suspensas = 0;

        int notaMaxima = 0;
        int notaMinima = 10;

        // 4. Pedir las notas de cada asignatura
        for (int i = 1; i <= asignaturas; i++) {

            int nota;

            do {
                System.out.println("Nota de la asignatura " + i + ":");
                nota = teclado.nextInt();

                if (nota < 0 || nota > 10) {
                    System.out.println("Error. La nota debe estar entre 0 y 10.");
                }

            } while (nota < 0 || nota > 10);

            // Guardar la nota en el array
            notas[i - 1] = nota;

            // Sumar las notas
            suma = suma + nota;

            // Contar aprobadas y suspensas
            if (nota >= 5) {
                aprobadas++;
            } else {
                suspensas++;
            }

            // Buscar la nota mas alta
            if (nota > notaMaxima) {
                notaMaxima = nota;
            }

            // Buscar la nota mas baja
            if (nota < notaMinima) {
                notaMinima = nota;
            }
        }

        // 5. Calcular la media
        media = suma / asignaturas;

        // 6. Mostrar los resultados
        System.out.println("\n===== RESULTADOS DEL ALUMNO =====");

        System.out.println("Edad del alumno: " + edad);

        System.out.println("Numero de asignaturas: " + asignaturas);

        System.out.printf("Media de las notas: %.2f%n", media);

        System.out.println("Asignaturas aprobadas: " + aprobadas);

        System.out.println("Asignaturas suspensas: " + suspensas);

        System.out.println("Nota mas alta: " + notaMaxima);

        System.out.println("Nota mas baja: " + notaMinima);

        teclado.close();
    }

