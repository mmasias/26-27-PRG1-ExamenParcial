import java.util.Scanner;

class Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Examen parcial");
        System.out.println("Ingrese su edad:");
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
            asignaturasAlumno = scanner.nextInt();
        }

        double notaAsignaturaTotal = 0;
        int notaEstaAsignatura = 0;
        double promedio = 0;
        int asignaturasAprobadas = 0;
        final double NOTA_APROBADA = 5.0;
        int notaMasAlta = 0;
        int notaMasBaja = 10;

        for (int i = 0; i < asignaturasAlumno; i++) {
            System.out.println("Nota de la asignatura " + (i+1) +":");
            notaEstaAsignatura = scanner.nextInt();
            while (!(notaEstaAsignatura >= 1 && notaEstaAsignatura <= 10)){
                System.out.println("Ingrese nuevamente su nota de la asignatura dentro del rango (1 a 10):");
                notaEstaAsignatura = scanner.nextInt();
            }
            notaAsignaturaTotal = notaAsignaturaTotal + notaEstaAsignatura;
            if(notaEstaAsignatura >= NOTA_APROBADA){
                asignaturasAprobadas++;
            }

            if (notaEstaAsignatura <= notaMasBaja){
                notaMasBaja = notaEstaAsignatura;
            }

            if (notaEstaAsignatura >= notaMasAlta){
                notaMasAlta = notaEstaAsignatura;
            }
        }

        promedio = (notaAsignaturaTotal/asignaturasAlumno);
        if (promedio >= NOTA_APROBADA && notaMasBaja >= NOTA_APROBADA){
            System.out.println("Promociona");
        }else{
            System.out.println("Recupera");
        }

        System.out.println("su promedio es: " + promedio);
        System.out.println("Usted aprobó: " + asignaturasAprobadas + " asignaturas");
        int asignaturasSuspensas = asignaturasAlumno - asignaturasAprobadas;
        System.out.println("Usted suspendió " + asignaturasSuspensas + " asignaturas");
        System.out.println("La nota más alta es: " + notaMasAlta);
        System.out.println("La nota más baja es: " + notaMasBaja);
    }
}