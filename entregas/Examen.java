import java.util.Scanner;
class Examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Examen parcial PRG1");
        int edad;
        boolean opcionvalida = false;
        while(!opcionvalida){
            System.out.println("Introduzca su edad: ");
            edad = sc.nextInt();
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
        System.out.println("En cuantas asignaturas te estas matriculando?");
        do{
            nmatriculas = sc.nextInt();
            if (nmatriculas > 1 && nmatriculas < 10){
                matriculasvalidas = true;
            }else{
                System.out.println("opcion no valida, introduzca un numero entre 1 y 10");
            }
        }while(!matriculasvalidas);
        double nota;
        double sumanotas = 0;
        int nnotas = 0;
        boolean notavalida;
        int aprobadas = 0;
        double notaalta = 0;
        double notabaja = 0;
        while (nnotas < nmatriculas){
            System.out.println("Introduzca la nota de la asignatura nº" + (nnotas + 1) + ":" );
            notavalida = false;
            while (!notavalida){
                nota = sc.nextDouble();
                if (nota <= 10 && nota >= 0){
                    sumanotas = sumanotas + nota;
                    nnotas = nnotas + 1;
                    notavalida = true;
                    if (nota > notaalta){
                        notaalta = nota;
                    }
                    if (nota < notabaja){
                        notabaja = nota;
                    }
                    if (nota >= 5){
                        aprobadas = aprobadas + 1;
                    }
                }else{
                    System.out.println("nota no valida");
                }    
            }
        }
        double media;
        media = sumanotas / nnotas;
        System.out.println("la media es: " + media);
        System.out.println("has aprobado " + aprobadas + " asignaturas");
        int suspensas = nnotas - aprobadas;
        System.out.println("has suspendido " + suspensas + " asignaturas");
        System.out.println("la nota mas alta es: " + notaalta);
        System.out.println("La nota mas baja ha sido: " + notabaja);
        if (media >= 5 && notabaja >= 4){
            System.out.println("promociona");
        }else{
            System.out.println("recupera");
        }
        }
        }
