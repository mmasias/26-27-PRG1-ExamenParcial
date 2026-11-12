import java.util.Scanner;

class ExamenParcialCarlosArgosExamen {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Examen parcial PRG1.");
            System.out.println("Cuantos años tienes?");
            int edad = scanner.nextInt();
            System.out.println("Tienes " + edad + " años.");

            if (edad < 18) {
                System.out.println("Eres menor de edad.");
                return;
            }

            System.out.println("Eres mayor de edad.");
            System.out.println("vuelva a introducir su edad para confirmar:");
            int edadConfirmada = scanner.nextInt();
            if (edadConfirmada >=17 && edadConfirmada <= 70) {
                System.out.println("Edad confirmada.");
            } else {
                System.out.println("Edad no confirmada. Debe estar entre 17 y 70 años.");
                return;
            }

            int materias;
            do {
                System.out.println("En cuantas materias estas inscrito? (entre 1 y 10)");
                materias = scanner.nextInt();
                if (materias < 1 || materias > 10) {
                    System.out.println("Introduce un numero entre 1 y 10.");
                }
            } while (materias < 1 || materias > 10);

            int aprobadas = 0;
            double sumaNotas = 0;
            double notaMaxima = Double.NEGATIVE_INFINITY;
            double notaMinima = Double.POSITIVE_INFINITY;

            for (int i = 0; i < materias; i++) {
                double nota;
                do {
                    System.out.println("Nota de la materia " + (i + 1) + " (de 0 a 10):");
                    nota = scanner.nextDouble();
                    if (nota < 0 || nota > 10) {
                        System.out.println("La nota debe estar entre 0 y 10.");
                    }
                } while (nota < 0 || nota > 10);

                sumaNotas += nota;
                if (nota >= 5) {
                    aprobadas++;
                }
                if (nota > notaMaxima) {
                    notaMaxima = nota;
                }
                if (nota < notaMinima) {
                    notaMinima = nota;
                }
            }

            int suspensas = materias - aprobadas;
            double promedio = sumaNotas / materias;

            System.out.println("Tu promedio es: " + promedio);
            System.out.println("Materias aprobadas: " + aprobadas);
            System.out.println("Materias suspensas: " + suspensas);
            System.out.println("La nota mas alta es: " + notaMaxima);
            System.out.println("La nota mas baja es: " + notaMinima);
            if (promedio >= 5 && suspensas <= 1) {
                System.out.println("Promociona");
            } else {
                System.out.println("Recupera");
            }
        }
    }
}