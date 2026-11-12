import.import java.util.scanner
class ClaseJava {
    public static void main(String[] args) {
        System.out.println ("Examen parcial PRG1");
        Scanner scanner = new Scanner(System.in);
        int edadAlumno;
        int numeroDeAsignaturas;
        double asignatura1;
        double asignatura2;
        double asignatura3;
        double asignatura4;
        double asignatura5;
        double asignatura6;
        double asignatura7;
        double asignatura8;
        double asignatura9;
        double asignatura10;
        final int ASIGNATURAS_MINIMAS = 1;
        final int ASIGNATURAS_MAXIMAS = 10;
        final int EDAD_MINIMA = 16;
        final int EDAD_MAXIMA = 99;
        edadAlumno = scanner.nextInt();
        while (edadAlumno >= EDAD_MINIMA || edadAlumno <= EDAD_MAXIMA);{
            System.out.println ("Tu edad "edadAlumno );
            edadAlumno = scanner.nextInt();
        }
    }
    System.out.println ("Cunatas asignaturuas estas matriculado");
    numeroDeAsignaturas = scanner.nextInt();
    while (numeroDeAsignaturas >= ASIGNATURAS_MINIMAS || numeroDeAsignaturas <= ASIGNATURAS_MAXIMAS);{
        System.out.println ("Tienes de asiganturas " numeroDeAsignaturas);
        numeroDeAsignaturas = scanner.nextInt();
    }
    for (int i = 1; 1 <= numeroDeAsignaturas ); {
        System.out-println ("Nota de la asignatura " + 1);
        int elecionAsigntura = scanner.nextInt();