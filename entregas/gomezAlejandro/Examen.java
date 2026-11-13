import java.util.Scanner;
public class Examen{ 
    public static void main (String [] args){
        
        System.out.println("Examen Parcial PRG1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println ("Su edad es " + edad);
        if ( edad < 18){
            System.out.println("Usted es menor de edad");
        } else {
            System.out.println("Usted es mayor de edad");
        }
       

        System.out.println("Ingrese su edad: ");
        int edad1 = scanner.nextInt();
        if ( edad1 >= 17 && edad1 <= 70){
            System.out.println("Edad válida");
        } 
        else {
            System.out.println("Edad no válida");
        }

        System.out.println("¿En qué asignaturas estás matriculado?");
        int asignaturas = scanner.nextInt();

        System.out.println("¿En qué asignaturas estás matriculado?");
        int asignaturas1 = scanner.nextInt();

        if ( asignaturas1 >= 1 && asignaturas1 <= 10){
            System.out.println("Aceptado");
        } 
        else {
            System.out.println("Error en la cantidad de asignaturas máximo 10 y mínimo 1");
        }
        
        System.out.println ("Introduzca la nota de la asignatura 1 del 1-10: "); 
        int nota1 = scanner.nextInt();
        
        System.out.println ("Introduzca la nota de la asignatura 2 del 1-10: ");
        int nota2 = scanner.nextInt();

        System.out.println ("Introduzca la nota de la asignatura 3 del 1-10: ");
        int nota3 = scanner.nextInt();

        System.out.println ("Introduzca la nota de la asignatura 4 del 1-10: ");
        int nota4 = scanner.nextInt();

        System.out.println ("Introduzca la nota de la asignatura 5 del 1-10: ");
        int nota5 = scanner.nextInt();

        System.out.println ("Introduzca la nota de la asignatura 6 del 1-10: ");
        int nota6 = scanner.nextInt();

        System.out.println ("Introduzca la nota de la asignatura 7 del 1-10: ");
        int nota7 = scanner.nextInt();

        System.out.println ("Introduzca la nota de la asignatura 8 del 1-10: ");
        int nota8 = scanner.nextInt();

        System.out.println ("Introduzca la nota de la asignatura 9 del 1-10: ");
        int nota9 = scanner.nextInt();

        System.out.println ("Introduzca la nota de la asignatura 10 del 1-10: ");
        int nota10 = scanner.nextInt();
        
        double media = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6 + nota7 + nota8 + nota9 + nota10) / 10.0;
        System.out.println ("La media de las notas es: " + media);
        int aprobadas = 0;

        if (nota1 >= 5) aprobadas++;
        if (nota2 >= 5) aprobadas++;
        if (nota3 >= 5) aprobadas++;
        if (nota4 >= 5) aprobadas++;
        if (nota5 >= 5) aprobadas++;
        if (nota6 >= 5) aprobadas++;
        if (nota7 >= 5) aprobadas++;
        if (nota8 >= 5) aprobadas++;
        if (nota9 >= 5) aprobadas++;
        if (nota10 >= 5) aprobadas++;
        
        System.out.println("Aprobadas: " + aprobadas);
        
        int suspensas = 10 - aprobadas;
        System.out .println("Suspensas: " + suspensas);


        if (nota1 >= 1 && nota1 <= 10) {
            System.out.println("Nota 1 válida");
        } else {
            System.out.println("Nota 1 no válida");
        }
        
        if (nota2 >= 1 && nota2 <= 10) {
            System.out.println("Nota 2 válida");
        } else {
            System.out.println("Nota 2 no válida");
        }
        
        if (nota3 >= 1 && nota3 <= 10) {
            System.out.println("Nota 3 válida");
        } else {
            System.out.println("Nota 3 no válida");
        }
        
        if (nota4 >= 1 && nota4 <= 10) {
            System.out.println("Nota 4 válida");
        } else {
            System.out.println("Nota 4 no válida");
        }
        
        if (nota5 >= 1 && nota5 <= 10) {
            System.out.println("Nota 5 válida");
        } else {
            System.out.println("Nota 5 no válida");
        }
        
        if (nota6 >= 1 && nota6 <= 10) {
            System.out.println("Nota 6 válida");
        } else {
            System.out.println("Nota 6 no válida");
        }
        
        if (nota7 >= 1 && nota7 <= 10) {
            System.out.println("Nota 7 válida");
        } else {
            System.out.println("Nota 7 no válida");
        }
        
        if (nota8 >= 1 && nota8 <= 10) {
            System.out.println("Nota 8 válida");
        } else {
            System.out.println("Nota 8 no válida");
        }
        
        if (nota9 >= 1 && nota9 <= 10) {
            System.out.println("Nota 9 válida");
        } else {
            System.out.println("Nota 9 no válida");
        }
        
        if (nota10 >= 1 && nota10 <= 10) {
            System.out.println("Nota 10 válida");
        } 
        else {
            System.out.println("Nota 10 no válida");
        }

        int mayor = nota1;

            if (nota2 > mayor) mayor = nota2;
            if (nota3 > mayor) mayor = nota3;
            if (nota4 > mayor) mayor = nota4;
            if (nota5 > mayor) mayor = nota5;
            if (nota6 > mayor) mayor = nota6;
            if (nota7 > mayor) mayor = nota7;
            if (nota8 > mayor) mayor = nota8;
            if (nota9 > mayor) mayor = nota9;
            if (nota10 > mayor) mayor = nota10;

        System.out.println("La nota más alta es: " + mayor);

        int menor = nota1;

            if (nota2 < menor) menor = nota2;
            if (nota3 < menor) menor = nota3;
            if (nota4 < menor) menor = nota4;
            if (nota5 < menor) menor = nota5;
            if (nota6 < menor) menor = nota6;
            if (nota7 < menor) menor = nota7;
            if (nota8 < menor) menor = nota8;
            if (nota9 < menor) menor = nota9;
            if (nota10 < menor) menor = nota10;

        System.out.println("La nota más baja es: " + menor);

        if (media >= 5 && menor <= 4) {
            System.out.println("Promociona");
        } else {
            System.out.println("Recupera");
        }
    }
}
