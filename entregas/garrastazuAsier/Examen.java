import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EXAMEN PRG 1");

        int edad;
        do {
            edad = sc.nextInt();
        } while (edad < 17 || edad > 70);

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        int asignaturas;
        do {
            asignaturas = sc.nextInt();
        } while (asignaturas < 1 || asignaturas > 10);

        int suma = 0;
        int aprobadas = 0;
        int suspensas = 0;
        int notaMaxima = 0;
        int notaMinima = 10;

        for (int n = 1; n <= asignaturas; n++) {
            int nota;

            do {
                System.out.print("Nota de la asignatura " + n + ": ");
                nota = sc.nextInt();
            } while (nota < 0 || nota > 10);

            suma += nota;

            if (nota >= 5) {
                aprobadas++;
            } else {
                suspensas++;
            }

            if (nota > notaMaxima) {
                notaMaxima = nota;
            }

            if (nota < notaMinima) {
                notaMinima = nota;
            }
        }

        double media = (double) suma / asignaturas;

        System.out.println("Media: " + media);
        System.out.println("Asignaturas aprobadas: " + aprobadas);
        System.out.println("Asignaturas suspensas: " + suspensas);
        System.out.println("Nota más alta: " + notaMaxima);
        System.out.println("Nota más baja: " + notaMinima);

        if (media > 5) {
            System.out.println("Pasa de curso");
        } else {
            System.out.println("Repite");
        }
    }
}