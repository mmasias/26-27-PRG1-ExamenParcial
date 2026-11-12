package entregas.nicolasHerrera;

import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime tu edad:");
        int edad = scanner.nextInt();
        final int MAYORD_DE_EDAD = 18;


        String ComprobadorEdad = (edad >= MAYORD_DE_EDAD) ? "Eres mayor de edad" : "Eres menor de edad";

        System.out.println(ComprobadorEdad);

        scanner.close();
    }
}
