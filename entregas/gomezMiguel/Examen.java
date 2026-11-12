import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
        System.out.println("Examen parcial");
        Scanner scanner = new Scanner(System.in);
        int edad = 0;

        do {
            System.out.println("Cual es tu edad");
            edad = scanner.nextInt();

            if (edad <= 16 || edad >= 99) {
                System.out.println("Edad no valida. Intente de nuevo.");
            }
        } while (edad <= 16 || edad >= 99);

        if (edad >= 18) {
            System.out.println("Mayor edad");
        } else {
            System.out.println("Menor edad");
        }

        int materias = 0;

        do {
            System.out.println("Cuantas materias estas matriculado");
            materias = scanner.nextInt();

            if (materias < 1 || materias >= 10) {
                System.out.println("Cantidad de materias no valida. Intente de nuevo.");
            }
        } while (materias < 1 || materias >= 10);

        double total = 0;
        int notasMayoresACinco = 0;
        int suspendidos = 0;
        double notaMasAlta = 0;
        int materiaNotaMasAlta = 0;
        double notaMasBaja = 11;
        int materiaNotaMasBaja = 0;

        for (int i = 0; i < materias; i++) {
            double nota = 0;

            do {
                System.out.println("nota de esta materia " + (i + 1) + " (entre 1 y 10)");
                nota = scanner.nextDouble();

                if (nota < 1 || nota > 10) {
                    System.out.println("Nota no valida. Debe estar entre 1 y 10.");
                }
            } while (nota < 1 || nota > 10);

            total = total + nota;

            if (nota > notaMasAlta) {
                notaMasAlta = nota;
                materiaNotaMasAlta = i + 1;
            }

            if (nota < notaMasBaja) {
                notaMasBaja = nota;
                materiaNotaMasBaja = i + 1;
            }

            if (nota > 5) {
                notasMayoresACinco = notasMayoresACinco + 1;
            } else if (nota < 5) {
                suspendidos = suspendidos + 1;
                System.out.println("Materia suspendida");
            } else {
                System.out.println("Materia aprobada con nota exacta de 5");
            }
        }

        double media = total / materias;

    
        System.out.println("Suma total de notas: " + total);
        System.out.println("La media es: " + media);
        System.out.println("La nota mas alta es: " + notaMasAlta + " (en la materia " + materiaNotaMasAlta + ")");
        System.out.println("La nota mas baja es: " + notaMasBaja + " (en la materia " + materiaNotaMasBaja + ")");
        System.out.println("Cantidad de notas mayores a 5: " + notasMayoresACinco);
        System.out.println("Cantidad de materias suspendidas: " + suspendidos);

        if (media >= 5) {
            System.out.println("Curso aprobado");
        } else {
            System.out.println("Curso suspendido");
        }
       
        if (media>=5 && nota>=4){
              System.out.println("Promociona ");
        }else{
             System.out.println("Recupera  ");
        }

      

        scanner.close();
    }
}