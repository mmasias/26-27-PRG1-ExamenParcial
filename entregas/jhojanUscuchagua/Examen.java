
import java.util.Scanner;

class Examen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Examen parcial PRG1");

        int RANGO_MAYOR = 99;
        int RANGO_MENOR = 16;

        int edadAlumno;
        boolean RANGO_ACEPTADO;
        do {
            System.out.println("¿Cual es la edad del alumno?");
            edadAlumno = scanner.nextInt();

            RANGO_ACEPTADO = (16 <= edadAlumno && edadAlumno <= 99);

        } while (!RANGO_ACEPTADO);

        int MAYOR_EDAD = 18;
        String comprobacionEdad = (edadAlumno >= MAYOR_EDAD) ? "Eres mayor de edad" : "Eres menor de edad";

        System.out.println(comprobacionEdad);

        System.out.println("¿En cuentas asignaturas esta matriculado el alumno?");
            int numeroDeAsignaturas = scanner.nextInt();
    }
}
