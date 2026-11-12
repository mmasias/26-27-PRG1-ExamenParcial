
import java.util.Scanner;

class Examen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Examen parcial PRG1");

        int RANGO_MAYOR_EDAD = 99;
        int RANGO_MENOR_EDAD = 16;

        int edadAlumno;
        boolean RANGO_ACEPTADO_EDAD;
        do {
            System.out.println("¿Cual es la edad del alumno?");
            edadAlumno = scanner.nextInt();

            RANGO_ACEPTADO_EDAD = (RANGO_MENOR_EDAD <= edadAlumno && edadAlumno <= RANGO_MAYOR_EDAD);

        } while (!RANGO_ACEPTADO_EDAD);

        int MAYOR_EDAD = 18;
        String comprobacionEdad = (edadAlumno >= MAYOR_EDAD) ? "Eres mayor de edad" : "Eres menor de edad";

        System.out.println(comprobacionEdad);

        int RANGO_MAYOR_ASIGNATURAS = 10;
        int RANGO_MENOR_ASIGNATURAS = 1;

        int numeroDeAsignaturas;
        boolean RANGO_ACEPTADO_ASIGNATURAS  ;
        do {
        System.out.println("¿En cuentas asignaturas esta matriculado el alumno?");
            numeroDeAsignaturas = scanner.nextInt();

            RANGO_ACEPTADO_ASIGNATURAS = (RANGO_MENOR_ASIGNATURAS <= numeroDeAsignaturas && numeroDeAsignaturas <= RANGO_MAYOR_ASIGNATURAS);
        } while (!RANGO_ACEPTADO_ASIGNATURAS); 
        
        for (int i = 1; i<=numeroDeAsignaturas; i++) {
            System.out.println("¿Cuantos notas tiene en la asignatura" + i);
            int notasPorAsignatura = scanner.nextInt();
        }
    }
}
