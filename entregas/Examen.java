import java.util.Scanner;
class Examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Examen parcial PRG1");
        int edad;
        boolean opcionvalida = false;
        while(opcionvalida){
            System.out.println("Introduzca su edad: ");
            edad = sc();
            if (edad < 18){
                System.out.println("Es menor de edad");
            }else{
                System.out.println("Es mayor de edad");
            }
            if (edad < 99 && edad > 17){
                opcionvalida = true;
            }else{
                System.out.println("opcion no valida");
            }
        }
        int nmatriculas;
        boolean matriculasvalidas = false;
        while(matriculasvalidas)
            System.out.println("En cuantas asignaturas te estas matriculando?");
            nmatriculas = sc();
            if (nmatriculas < 1 && nmatriculas > 10){
                matriculasvalidas = true;
        }
        int i = 1;
        int nota;
        int sumanotas = 0;
        int nnotas;
        while (nnotas == nmatriculas){
            System.out.println("Introduzca la nota de la asignatura" + i + ":" );
            nota = sc();
            sumanotas = sumanotas + nota;
            nnotas = nnotas + 1;
        }
        double media;
        media = sumanotas / nnotas;
        System.out.println("la media es: " + media);

    }
}