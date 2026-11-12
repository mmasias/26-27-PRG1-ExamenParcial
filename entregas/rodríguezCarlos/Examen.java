class main {
    public static void main(String[] args) {
        system.printoutln("Examen parcial PRG1");
        system.printoutln("Cual es tu edad?");
        scanner int = edad;
        if (int edad>=18){
            system.printoutln("Es mayor de edad");
        }
        else {
            system.printoutln("Es menor de edad");
        }

        do{
            system.printoutln("Cual es tu edad?");
            scanner int = edad;
            system.printoutln("Edad no válida, por favor introduce de nuevo")
        } while (int edad<=17, edad>=70);
        system.printoutln("Edad válida.");

        system.printoutln("En cuantas asignaturas estas matriculado?");
        scanner int = asignaturas;
        do{
        system.printoutln("En cuantas asignaturas estas matriculado?");
        scanner int = asignaturas;
        system.printoutln("Número no válido, introdúcelo de nuevo.");
        } while {int asignaturas<<1, asignaturas>10};
        system.printoutln("Número válido de asignaturas");

        int N = 1;
        for (int N<asignaturas) {
            system.printoutln("Nota de la asignatura " N ":");
            N++1;
        }
    }
}