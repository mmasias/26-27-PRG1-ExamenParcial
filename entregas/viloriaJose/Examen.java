import java.util.Scanner;

class Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Examen parcial");
        int edadUsuario = scanner.nextInt();

        final int MAYORIA_DE_EDAD = 18;
        final int RANGO_EDAD_MENOR = 17;
        final int RANGO_EDAD_MAYOR = 70;

        boolean edadValida = false;

        if (edadUsuario >= MAYORIA_DE_EDAD){
        System.out.println("Es mayor de edad");
        }else {
            System.out.println("Es menor de edad");
        }
        edadValida = edadUsuario >= 17 && edadUsuario <= 70;
        while(!edadValida){
            System.out.println("Ingrese su edad nuevamente, debe edtar entre 17 y 70:");
            edadUsuario = scanner.nextInt();
            edadValida = edadUsuario >= 17 && edadUsuario <= 70;
        }

        int asignaturasAlumno;
        System.out.println("Ingrese la cantidad de asignaturas que está cursando:");
        asignaturasAlumno = scanner.nextInt();

        final int ASIGNATURAS_MIN = 1;
        final int ASIGNATURAS_MAX = 10;
        while (!(asignaturasAlumno >= ASIGNATURAS_MIN && asignaturasAlumno <= ASIGNATURAS_MAX)){
            System.out.println("Ingrese su cantidad de asignaturas nuevamente entre 1 y 10");
        }

        int notaAsignatura = 0;
        for (int i = 0; i < asignaturasAlumno; i++) {
            System.out.println("Nota de la asignatura " + (i+1) +":");
        }
    }
}