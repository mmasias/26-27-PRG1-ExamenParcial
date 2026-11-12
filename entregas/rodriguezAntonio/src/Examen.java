
import java.util.Scanner;

class Examen {

    public static void main(String args[]) {

        final int MAYOR_EDAD = 18;
        System.out.println("Examen parcial PRG1");
        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es tu edad?");
        int edad_usuario = sc.nextInt();

        if (edad_usuario > MAYOR_EDAD) {
            System.out.println("Eres mayor de edad!");

        } else {
            System.out.println("Eres menor de edad...");
        }

    }
}
