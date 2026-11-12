import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Examen parcial PRG1");

        int edad;

        do {
            System.out.print("Introduce la edad del alumno (17-70): ");
            edad = teclado.nextInt();

            if (edad < 17 || edad > 70) {
                System.out.println("Edad incorrecta. Vuelve a intentarlo.");
            }

        } while (edad < 17 || edad > 70);

        if (edad >= 18) {
            System.out.println("El alumno es mayor de edad");
        } else {
            System.out.println("El alumno es menor de edad");
        }

        int numAsignaturas;

        do {
            System.out.print("Introduce el número de asignaturas (1-10): ");
            numAsignaturas = teclado.nextInt();

            if (numAsignaturas < 1 || numAsignaturas > 10) {
                System.out.println("Número incorrecto. Vuelve a intentarlo.");
            }

        } while (numAsignaturas < 1 || numAsignaturas > 10);

        int nota;
        int aprobadas = 0;
        int suspensas = 0;
        int notaAlta = 0;
        int notaBaja = 10;
        double sumaNotas = 0;
        boolean notaPeorQue4 = false;

        for (int i = 1; i <= numAsignaturas; i++) {

            do {
                System.out.print("Nota de la asignatura N" + i + ": ");
                nota = teclado.nextInt();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota incorrecta. Introduce una nota entre 0 y 10.");
                }

            } while (nota < 0 || nota > 10);

            sumaNotas = sumaNotas + nota;

            if (nota >= 5) {
                aprobadas++;
            } else {
                suspensas++;
            }

            if (nota > notaAlta) {
                notaAlta = nota;
            }

            if (nota < notaBaja) {
                notaBaja = nota;
            }

            if (nota < 4) {
                notaPeorQue4 = true;
            }
        }

        double media = sumaNotas / numAsignaturas;

        System.out.println("La media de las notas es: " + media);
        System.out.println("Asignaturas aprobadas: " + aprobadas);
        System.out.println("Asignaturas suspensas: " + suspensas);
        System.out.println("La nota más alta es: " + notaAlta);
        System.out.println("La nota más baja es: " + notaBaja);

        if (media >= 5 && notaPeorQue4 == false) {
            System.out.println("Promociona");
        } else {
            System.out.println("Recupera");
        }

        teclado.close();
    }
}