//hecho pensado en q el usuario no es cabron

import java.util.Scanner;

class Examen {

    public static void main(String args[]) {

        final int NOTA_APROBADO = 5;
        final int NOTA_MIN = 0;
        final int NOTA_MAX = 10;
        final int MAYOR_EDAD = 18;
        final int MAX_MATERIAS = 10;
        final int MIN_MATERIAS = 1;
        System.out.println("Examen parcial PRG1");
        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es tu edad? (17-70) ");
        int edad_usuario = sc.nextInt();

        if (edad_usuario > MAYOR_EDAD) {
            System.out.println("Eres mayor de edad!");

        } else if (edad_usuario < MAYOR_EDAD) {
            System.out.println("Eres menor de edad...");

        }
        System.out.println("Vuelve a introducir una edad valida");
        int edad_corregida = sc.nextInt();

        System.out.println("En cuantas materias estas inscrito? (1)");
        int materias_inscritas = sc.nextInt();
        int cant_mats = 1;
        {
            if (materias_inscritas < MIN_MATERIAS || materias_inscritas > MAX_MATERIAS) {
                System.out.println("Numero de materias invalidas");

            }

        }
        System.out.println("Dame una nota por la asignatura");
        int nota_materia = sc.nextInt();

        double media_nota = nota_materia / materias_inscritas;

        System.out.println("La media de la materia es " + media_nota);

        if (media_nota > NOTA_APROBADO) {
            System.out.println("Las materias pasadas con 5 son: " + cant_mats);
        } else if (media_nota < NOTA_APROBADO) {
            System.out.println("La cantidad de materias reprobadas son " + cant_mats);
        } else if (nota_materia < NOTA_MIN || nota_materia > NOTA_MAX) {
            System.out.println("Numero de materias invalidas...");

        }

        System.out.println("La nota mas alta es: " + nota_materia);

        System.out.println("La nota mas baja es: " + nota_materia);
        //se muestra la nota mas baja

        if (media_nota > NOTA_APROBADO) {
            System.out.println("Promociona!");
        } else {
            System.out.println("Recupera!");
        }
    }

}
