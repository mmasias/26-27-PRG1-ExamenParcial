

public class Examen {
    public static void main(String[] args) {

sistem.out.ptrintln("Examen parcial PRG1");
sistem.out.ptrintln("¿Qué edad tienes?");
int= edad = Integer.parseInt(System.console().readLine());
if (edad >= 18) {
    sistem.out.ptrintln("Eres mayor de edad");
} else {
    sistem.out.ptrintln("Eres menor de edad");
}
if (edad >= 16 && edad <= 99) {
    sistem.out.ptrintln("Eres valido");
} else if (edad < 16 && edad > 99) {
    sistem.out.ptrintln("No eres valido");
    system.out.println("¿En cuántas asignaturas estás matriculado?");
    int asignaturas = Integer.parseInt(System.console().readLine());
    if asignaturas >= 1 && asignaturas <= 10) {
        sistem.out.ptrintln("Eres valido");
    } else if (asignaturas =0 && asignaturas > 10) {
        sistem.out.ptrintln("No eres valido");
        
import java.util.Scanner;

public class CalificacionesApp {
    public static void main(String[] args) {
        String[] asignaturas = {
            "Matemáticas", "Física", "Química", "Historia", 
            "Literatura", "Inglés", "Biología", "Informática", 
            "Geografía", "Educación Física"
        };
        
        Scanner scanner = new Scanner(System.in);
        double sumaNotas = 0;
        int aprobadas = 0;
        int suspensas = 0;
        int[] notas = new int[asignaturas.length];
        
        int notaMasAlta = -1;
        String asignaturaMasAlta = "";
        int notaMasBaja = 11;
        String asignaturaMasBaja = "";
        
        System.out.println("=== INTRODUCE LAS CALIFICACIONES (1 a 10) ===");
        
        for (int i = 0; i < asignaturas.length; i++) {
            int nota;
            do {
                System.out.print("Introduce la nota para " + asignaturas[i] + ": ");
                nota = scanner.nextInt();
                if (nota < 1 || nota > 10) {
                    System.out.println("Error: La nota debe estar entre 1 y 10. Inténtalo de nuevo.");
                }
            } while (nota < 1 || nota > 10);
            
            notas[i] = nota;
            sumaNotas += nota;
            
            if (nota >= 5) {
                aprobadas++;
            } else {
                suspensas++;
            }
            
            if (nota > notaMasAlta) {
                notaMasAlta = nota;
                asignaturaMasAlta = asignaturas[i];
            }
            
            if (nota < notaMasBaja) {
                notaMasBaja = nota;
                asignaturaMasBaja = asignaturas[i];
            }
        }
        
        scanner.close();
        
        System.out.println("\n=== BOLETÍN DE CALIFICACIONES ===");
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println(asignaturas[i] + ": " + notas[i]);
        }
        
        double media = sumaNotas / asignaturas.length;
        System.out.println("---------------------------------");
        System.out.println("Nota media final: " + media);
        System.out.println("Asignaturas aprobadas (5 o más): " + aprobadas);
        System.out.println("Asignaturas suspensas (menos de 5): " + suspensas);
        System.out.println("Nota más alta: " + notaMasAlta + " (" + asignaturaMasAlta + ")");
        System.out.println("Nota más baja: " + notaMasBaja + " (" + asignaturaMasBaja + ")");
        
        System.out.println("---------------------------------");
        if (media >= 5) {
            System.out.println("Estado: ¡Promociona!");
        } else {
            System.out.println("Estado: Recupera.");
        }
    }
}
    }
}
}
}