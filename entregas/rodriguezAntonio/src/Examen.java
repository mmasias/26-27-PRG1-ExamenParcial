
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

        } else if  {
            System.out.println("Eres menor de edad...");
            System.out.println("Vuelve a introducir una edad valida...");
            int edad_corregida = sc.nextInt();

        }
        while (edad_corregida < 16) {

        }

        System.out.println("En cuantas materias estas inscrito?");
        int materias_inscritas = sc.nextInt();
        {
            if (materias_inscritas < 0 || materias_inscritas > 10) {
                System.out.println("Numero de materias invalidas");

            }

        }
        System.out.println("Dame una nota por cada asignatura");
        //paso 8

    }

}
