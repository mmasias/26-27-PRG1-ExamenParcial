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

        final int EDAD_MINIMA = 17;
        final int EDAD_MAXIMA = 70;
        Boolean edadValida = false;
        int nuevaEdad = 0;

        while(edadValida == false) {
            System.out.println("Cuál es tu nueva edad?");
            nuevaEdad = scanner.nextInt();
            if (nuevaEdad >= EDAD_MINIMA && nuevaEdad <= EDAD_MAXIMA) {
                    edadValida = true;
            }
        } 

        int numeroAsignaturas = 0;
        System.out.println("En cuántas asignaturas estás matriculado?");
        numeroAsignaturas = scanner.nextInt();

        Boolean cantidadAsignaturas = false;
        while (cantidadAsignaturas == false) {
            System.out.println("En cuántas asignaturas estás matriculado?");
            numeroAsignaturas = scanner.nextInt();

            if (numeroAsignaturas >= 1 && numeroAsignaturas <= 10) {
                cantidadAsignaturas = true;
            }
        }

        double sumaNotas = 0;
        int asignaturasAprobadas = 0;
        int asignaturasReprobadas = 0;
        
        for (int i=0; i < numeroAsignaturas; i++) {
            System.out.println("Nota de la asignatura " + i + 1 + ":");
            int notaAsignatura = scanner.nextInt();
            sumaNotas = (double) sumaNotas + notaAsignatura;
            if (notaAsignatura >= 5) {
                asignaturasAprobadas++;
            } else {
                asignaturasReprobadas++;
            }
        }

        double mediaNotas;

        mediaNotas = sumaNotas / numeroAsignaturas;
        System.out.println("Media de notas: " + mediaNotas);
        System.out.println("Asignaturas aprobadas: " + asignaturasAprobadas);
        System.out.println("Asignaturas reprobadas: " + asignaturasReprobadas);
        int notaMasAlta = 0;
        int notaMasBaja = 10;
        
        for (int i=0; i < numeroAsignaturas; i++) {
            
            
            System.out.println("Nota de la asignatura " + i + 1 + ":");
            int notaAsignatura = scanner.nextInt();
            if (notaAsignatura >= 0 && notaAsignatura <= 10 ) {
                System.out.println("Nota de la asignatura " + i + ":");
                notaAsignatura = scanner.nextInt();
                if (notaMasAlta<notaAsignatura) {
                    notaMasAlta = notaAsignatura;
                }
                if (notaMasBaja > notaAsignatura) {
                    notaMasBaja = notaAsignatura;
                }
            } 
            
        }

        System.out.println("Nota más alta: " + notaMasAlta);
        System.out.println("Nota más baja: " + notaMasBaja);



    }
}