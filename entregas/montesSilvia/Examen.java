import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Examen parcial PRG1");

        int edad;

        do {
            System.out.print("Introduce la edad del alumno (17-70): ");
            edad = sc.nextInt();

            if (edad < 17 || edad > 70) {
                System.out.println("Edad no valida. Intentalo de nuevo.");
            }

        } while (edad < 17 || edad > 70);

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        int asignaturas;

        do {
            System.out.print("Introduce el numero de asignaturas (1-10): ");
            asignaturas = sc.nextInt();

            if (asignaturas < 1 || asignaturas > 10) {
                System.out.println("Numero de asignaturas no valido. Intentalo de nuevo.");
            }

        } while (asignaturas < 1 || asignaturas > 10);

        int suma = 0;
        int aprobadas = 0;
        int suspensas = 0;
        int notaMaxima = 0;
        int notaMinima = 10;

        for (int i = 1; i <= asignaturas; i++) {
            int nota;

            do {
                System.out.print("Nota de la asignatura " + i + ": ");
                nota = sc.nextInt();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota no valida. Intentalo de nuevo.");
                }

            } while (nota < 0 || nota > 10);

            suma = suma + nota;

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

        System.out.println("La media de las notas es: " + media);
        System.out.println("Asignaturas aprobadas: " + aprobadas);
        System.out.println("Asignaturas suspensas: " + suspensas);
        System.out.println("Nota mas alta: " + notaMaxima);
        System.out.println("Nota mas baja: " + notaMinima);

        
        if (media >= 5 && notaMinima >= 4) {
            System.out.println("Promociona");
        } else {
            System.out.println("Recupera");
        }

        sc.close();
    }
}

