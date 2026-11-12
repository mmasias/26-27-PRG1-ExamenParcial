package entregas.herranzIzan;

import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Examen parcial PRG1");

        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}