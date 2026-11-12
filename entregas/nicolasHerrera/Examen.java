package entregas.nicolasHerrera;

import java.util.Scanner;


// HECHO POR NICOLAS HERRERA BARRETO


public class Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // final int MAYOR_DE_EDAD = 18;
        // int minimo_edad = 17;
        // int maximo_edad = 70;

        // System.out.println("Dime tu edad:");
        // int edad = scanner.nextInt();

        // String ComprobadorEdad = (edad >= MAYOR_DE_EDAD) ? "Eres mayor de edad" : "Eres menor de edad";
        // System.out.println(ComprobadorEdad);20

        // while (minimo_edad <= edad && edad <= maximo_edad) {
        //    System.out.println("Dime una ultimatu edad:");
        //    edad = scanner.nextInt();
        //    System.out.println("Tu edad está dentro del rango permitido.");
        //    break;   
        // }

        System.out.println("Dime el número de asignaturas que tienes:");
        int numero_asignaturas = scanner.nextInt();

        int minimo_asignaturas = 1;
        int maximo_asignaturas = 10;

        while (numero_asignaturas < minimo_asignaturas || numero_asignaturas > maximo_asignaturas) {
            System.out.println("Número no válido (debe ser entre 1 y 10). Dime otra vez el número de asignaturas:");
            numero_asignaturas = scanner.nextInt();
        }
        System.out.println("Tu número de asignaturas está dentro del rango permitido.");


        double suma_notas = 0;
        int asignaturas_aprobadas = 0;
        int asignaturas_desaprobadas = 0;

        for (int i = 1; i <= numero_asignaturas; i++) {
            System.out.println("Dime la nota de la asignatura " + i + ":");
            double nota_de_asignatura = scanner.nextDouble();
            System.out.println("La nota de la asignatura " + i + " es: " + nota_de_asignatura);

            suma_notas += nota_de_asignatura;
            if (nota_de_asignatura >= 5) {
                asignaturas_aprobadas++;
            } else {
                asignaturas_desaprobadas++;
            }
        }

        double promedio = suma_notas / numero_asignaturas;

        System.out.println("--- RESULTADOS ---");
        System.out.println("El promedio de las notas es: " + promedio);
        System.out.println("Asignaturas aprobadas: " + asignaturas_aprobadas);
        System.out.println("Asignaturas desaprobadas: " + asignaturas_desaprobadas);
    }
}


