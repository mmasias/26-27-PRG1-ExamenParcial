package entregas.garciaDiego;

import java.util.Scanner;

class Examen {
    public static void main(String[] args) {

        System.out.println("Examen parcial PRG1");
        Scanner scanner = new Scanner(System.in);
        final int MAYOR_EDAD = 18;
        final int edadAlumno;
        do {
            System.out.println("Introduzca una edad válida: ");
            Scanner edadAlumno = new Scanner(System.in);
        } while (edadAlumno >= MAYOR_EDAD);
        if (edadAlumno >= MAYOR_EDAD) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        final int NUMERO_ASIGNATURAS;
        System.out.println("Introduce número de asignaturas entre 0 y 10: ");
        do {
            Scanner NUMERO_ASIGNATURAS = new Scanner(System.in);
        } while (NUMERO_ASIGNATURAS > 10);
        System.out.println("Está matriculado a: " + NUMERO_ASIGNATURAS + "asignaturas");
        final String TEXTO_PEDIR_NOTA = "Intruduzca la nota de la asignatura ";
        if (NUMERO_ASIGNATURAS == 10) {
            System.out.println(TEXTO_PEDIR_NOTA + 10);
            Scanner NOTA_10 = new Scanner(System.in);
            System.out.println(TEXTO_PEDIR_NOTA + 9);
            Scanner NOTA_9 = new Scanner(System.in);
            System.out.println(TEXTO_PEDIR_NOTA + 8);
            Scanner NOTA_8 = new Scanner(System.in);
            System.out.println(TEXTO_PEDIR_NOTA + 7);
            Scanner NOTA_7 = new Scanner(System.in);
            System.out.println(TEXTO_PEDIR_NOTA + 6);
            Scanner NOTA_6 = new Scanner(System.in);
            //continuaría...
        } else {

        }
    }
}
