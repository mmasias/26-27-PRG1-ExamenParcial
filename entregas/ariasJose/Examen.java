import java.util.Scanner;

class Examen {
    public static void main(String[] args) {
        System.out.println("Examen parcial");

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuál es tu edad?");
        int edad = 0;
        edad = scanner.nextInt();

        Boolean esMayor;
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }


    }
}