import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAsignaturas = 0;

        do {
            System.out.print("Ingrese el número de asignaturas: ");
            numAsignaturas = scanner.nextInt();
            if (numAsignaturas < 1 || numAsignaturas > 10) {
                System.out.println("El número de asignaturas debe estar entre 1 y 10.");
            }
        } while (numAsignaturas < 1 || numAsignaturas > 10);

        int[] notas = new int[numAsignaturas];
        int sumaNotas = 0;
        int aprobadas = 0;
        int AltaNota = 0;
        int BajaNota = 10;

        for (int i = 0; i < numAsignaturas; i++) {
            do {
                System.out.print("Ingrese la nota de la asignatura " + (i + 1) + ": ");
                notas[i] = scanner.nextInt();
                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("La nota debe estar entre 0 y 10.");
                }
            } while (notas[i] < 0 || notas[i] > 10);

            sumaNotas += notas[i];

            if (notas[i] >= 5) {
                System.out.println("La asignatura " + (i + 1) + " está aprobada.");
                aprobadas++;
            } else {
                System.out.println("La asignatura " + (i + 1) + " está reprobada.");
            }

            if (notas[i] > AltaNota) {
                AltaNota = notas[i];
            }
            if (notas[i] < BajaNota) {
                BajaNota = notas[i];
            }

          
        }

        double promedio = (double) sumaNotas / numAsignaturas;
        System.out.println("El promedio general es: " + promedio);
        System.out.println("Total de asignaturas aprobadas: " + aprobadas);
        System.out.println("La nota más baja hasta ahora es: " + BajaNota);
        System.out.println("La nota más alta hasta ahora es: " + AltaNota);

    
        if (promedio >= 5 && aprobadas == numAsignaturas) {
            System.out.println("El alumno promociona.");
        } else {
            System.out.println("El alumno recupera.");
        }

        scanner.close();
    }
}
