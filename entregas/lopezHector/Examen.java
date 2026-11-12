package entregas.lopezHector;
import java.util.Scanner;


public class Examen {
    Scanner scanner = new Scanner(System.in);
    final int MAYOR_EDAD=18;
    System.out.println("¿Es mayor de edad?: ");
    int edad = scanner.nextInt();
    double media = notas/ asignaturas;

    if (asignaturas > 10){
        System.out.println("¿Numero de asignaturas en las que estas matriculado: ");
        int asignaturas = scanner.nextInt();
    }
    if (edad <= MAYOR_EDAD){
        System.out.println("es mayor de edad");

    }else{
        System.out.println("es menor de edad");
    }

    for (int i = 1; i < asignaturas; i++) {

    System.out.println("¿dime una nota entera: ");
    int notas = scanner.nextInt();
    System.out.println("Nota de la asignatura N:");

}

System.out.println("medias de la nota" + media);

}}

    



