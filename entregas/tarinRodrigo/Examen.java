import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        final int MAYOR_DE_EDAD = 18;

        System.out.println("Examen parcial PRG1");


        System.out.println("Cual es la edad del alumno: ");
        int edad = scanner.nextInt();

        System.out.println(edad >= MAYOR_DE_EDAD? "Es mayor de edad" : "Es menor de edad");
    }
}