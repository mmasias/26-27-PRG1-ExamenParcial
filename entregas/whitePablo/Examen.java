import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        System.out.println("Examen parcial PRG1.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        final int MAYORIA_EDAD = 18;
        System.out.println("Introduce tu edad: ");

        int edad = scanner.nextInt();
        edad <= MAYORIA_EDAD ? System.out.println("Eres menor de edad") : System.out.println("Eres mayor de edad");
        if (17 >= edad && edad >= 70){
            System.out.println("Introduce otra edad: ");
            edad = scanner.nextInt();
        }

        int numAsignaturas;
        do {
            System.out.print("Número de asignaturas en las que está matriculado (1-10): ");
            numAsignaturas = scanner.nextInt();
        } while (numAsignaturas < 1 || numAsignaturas > 10);
 
        int suma = 0;
        int aprobadas = 0;
        int suspensas = 0;
        int notaMax = 0;
        int notaMin = 10;
 
        for (int i = 1; i <= numAsignaturas; i++) {
            int nota;
            do {
                System.out.print("Nota de la asignatura " + i + ": ");
                nota = scanner.nextInt();
            } while (nota < 0 || nota > 10);
 
            suma += nota;
 
            if (nota >= 5) {
                aprobadas++;
            } else {
                suspensas++;
            }
 
            if (nota > notaMax) {
                notaMax = nota;
            }
            if (nota < notaMin) {
                notaMin = nota;
            }
        }
 
        double media = (double) suma / numAsignaturas;
 
        System.out.printf("Media: %.2f%n", media);
        System.out.println("Asignaturas aprobadas: " + aprobadas);
        System.out.println("Asignaturas suspensas: " + suspensas);
        System.out.println("Nota más alta: " + notaMax);
        System.out.println("Nota más baja: " + notaMin);
 
        if (media >= 5 && notaMin >= 4) {
            System.out.println("Promociona");
        } else {
            System.out.println("Recupera");
        }
    }
}