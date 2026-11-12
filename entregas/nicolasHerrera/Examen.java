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

        System.out.println("Dime el número de asignaturas en el que estas:");
        int numero_asignaturas = scanner.nextInt();

        int minimo_asignaturas = 1;
        int maximo_asignaturas = 10;

        while (minimo_asignaturas <= numero_asignaturas && numero_asignaturas <= maximo_asignaturas) {
            System.out.println("Dime otra vez el número de asignaturas en el que estas:");
            numero_asignaturas = scanner.nextInt();
            System.out.println("Tu número de asignaturas está dentro del rango permitido.");
            break;   
        }

        scanner.close();
    }
}
