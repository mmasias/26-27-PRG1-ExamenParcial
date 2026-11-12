import java.util.Scanner;
class ClaseJava {
    public static void main(String[] args) {
        System.out.println("Examen Parcial PRG1");
        Scanner scanner = new Scanner(System.in);
        int edadAlumno;
        int asignaturasMatriculadas;
        final int ASIGNATURASMINIMAS = 1;
        final int ASIGNATURASMAXIMAS = 10;
        final int EDADMINIMA = 17;
        final int EDADMAXIMA = 77;
        System.out.println("Ingrese la edad del alumno");
        edadAlumno = scanner.nextInt();
        while (edadAlumno <= EDADMINIMA || edadAlumno >= EDADMAXIMA) {
            System.out.println("Edad no válida, ingrese nuevamente");
            edadAlumno = scanner.nextInt();
        }
        System.out.println("Ingrese el número de asignaturas matriculadas");
        asignaturasMatriculadas = scanner.nextInt();
        while (asignaturasMatriculadas < ASIGNATURASMINIMAS || asignaturasMatriculadas > ASIGNATURASMAXIMAS) {
            System.out.println("Número de asignaturas no válido, ingrese nuevamente");
            asignaturasMatriculadas = scanner.nextInt();
        }
        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double nota4 = 0;
        double nota5 = 0;
        double nota6 = 0;
        double nota7 = 0;
        double nota8 = 0;
        double nota9 = 0;
        double nota10 = 0;
        double mediaNotas;
        int aprobadas = 0;
        int suspendidas = 0;
        double notaParaAprobar = 5;
        double notaMasAlta = 0;
        double notaMasBaja = 10;
        for (int i = 1; i <= asignaturasMatriculadas; i++) {
            System.out.println("Ingrese nota " + i);
            if (i == 1) {
                nota1 = scanner.nextInt();
                while (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota no válida, ingrese nuevamente");
                    nota1 = scanner.nextInt();
                }
                if (nota1 >= notaParaAprobar) {
                    aprobadas++;
                }else {
                    suspendidas++;
                }
                nota1= notaMasAlta;
                nota1= notaMasBaja;
            } else if (i == 2) {
                nota2 = scanner.nextInt();
                
                while (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota no válida, ingrese nuevamente");
                    nota2 = scanner.nextInt();
                }
                if (nota2 >= notaParaAprobar) {
                    aprobadas++;
                }else {
                    suspendidas++;
                }
                if (nota2 > notaMasAlta) {
                    notaMasAlta = nota2;
                }
                if (nota2 < notaMasBaja) {
                    notaMasBaja = nota2;
                }
                 }else if (i == 3) {
                    nota3 = scanner.nextInt();
                    while (nota3 < 0 || nota3 > 10) {
                    System.out.println("Nota no válida, ingrese nuevamente");
                    nota3 = scanner.nextInt();
                    }
                    if (nota3 >= notaParaAprobar) {
                    aprobadas++;
                    }else {
                    suspendidas++;
                    }
                    if (nota3 > notaMasAlta) {
                    notaMasAlta = nota3;
                    }
                    if (nota3 < notaMasBaja) {
                    notaMasBaja = nota3;
                    }
                else if (i == 4) {
                    nota4 = scanner.nextInt();
                    while (nota4 < 0 || nota4 > 10) {
                        System.out.println("Nota no válida, ingrese nuevamente");
                        nota4 = scanner.nextInt();
                    }
                    if (nota4 >= notaParaAprobar) {
                        aprobadas++;
                    }else {
                        suspendidas++;
                    }
                    if (nota4 > notaMasAlta) {
                        notaMasAlta = nota4;
                    }
                    if (nota4 < notaMasBaja) {
                        notaMasBaja = nota4;
                    }
                }else if (i == 5) {
                nota5 = scanner.nextInt();
                while (nota5 < 0 || nota5 > 10) {
                    System.out.println("Nota no válida, ingrese nuevamente");
                    nota5 = scanner.nextInt();
                }
                if (nota5 >= notaParaAprobar) {
                    aprobadas++;
                }else {
                    suspendidas++;
                }
                if (nota5 > notaMasAlta) {
                    notaMasAlta = nota5;
                }
                if (nota5 < notaMasBaja) {
                    notaMasBaja = nota5;
                }
             else if (i == 6) {
                nota6 = scanner.nextInt();
                while (nota6 < 0 || nota6 > 10) {
                    System.out.println("Nota no válida, ingrese nuevamente");
                    nota6 = scanner.nextInt();
                }
                if (nota6 >= notaParaAprobar) {
                    aprobadas++;
                }else {
                    suspendidas++;
                }
                if (nota6 > notaMasAlta) {
                    notaMasAlta = nota6;
                }
                if (nota6 < notaMasBaja) {
                    notaMasBaja = nota6;
                }
            }  else if (i == 7) {
                nota7 = scanner.nextInt();
                while (nota7 < 0 || nota7 > 10) {
                    System.out.println("Nota no válida, ingrese nuevamente");
                    nota7 = scanner.nextInt();
                }
                if (nota7 >= notaParaAprobar) {
                    aprobadas++;
                }else {
                    suspendidas++;
                }
                if (nota7 > notaMasAlta) {
                    notaMasAlta = nota7;
                }
                if (nota7 < notaMasBaja) {
                    notaMasBaja = nota7;
                }
            } else if (i == 8) {
                nota8 = scanner.nextInt();
                while (nota8 < 0 || nota8 > 10) {
                    System.out.println("Nota no válida, ingrese nuevamente");
                    nota8 = scanner.nextInt();
                }
                if (nota8 >= notaParaAprobar) {
                    aprobadas++;
                }else {
                    suspendidas++;
                }
                if (nota8 > notaMasAlta) {
                    notaMasAlta = nota8;
                }
                if (nota8 < notaMasBaja) {
                    notaMasBaja = nota8;
                }
            }else if (i == 9) {
                nota9 = scanner.nextInt();
                while (nota9 < 0 || nota9 > 10) {
                    System.out.println("Nota no válida, ingrese nuevamente");
                    nota9 = scanner.nextInt();
                }
                if (nota9 >= notaParaAprobar) {
                    aprobadas++;
                }else {
                    suspendidas++;
                }
                if (nota9 > notaMasAlta) {
                    notaMasAlta = nota9;
                }
                if (nota9 < notaMasBaja) {
                    notaMasBaja = nota9;
                }
             else if (i == 10) {
                nota10 = scanner.nextInt();
                while (nota10 < 0 || nota10 > 10) {
                    System.out.println("Nota no válida, ingrese nuevamente");
                    nota10 = scanner.nextInt();
                }
                if (nota10 >= notaParaAprobar) {
                    aprobadas++;
                }else {
                    suspendidas++;
                }
                if (nota10 > notaMasAlta) {
                    notaMasAlta = nota10;
                }
                if (nota10 < notaMasBaja) {
                    notaMasBaja = nota10;
                }
            }
            
        }
        mediaNotas = (double) (nota1 + nota2 + nota3 + nota4 + nota5 + nota6 + nota7 + nota8 + nota9 + nota10) / asignaturasMatriculadas;
        System.out.println("La media de las notas es: " + mediaNotas);
        System.out.println("Número de asignaturas aprobadas: " + aprobadas);
        System.out.println("Número de asignaturas suspendidas: " + suspendidas);
        System.out.println("La nota más alta es: " + notaMasAlta);
        System.out.println("La nota más baja es: " + notaMasBaja);
        if (mediaNotas >= notaParaAprobar) {
            System.out.println("El alumno promociona");
        } else {
            System.out.println("El alumno no promociona");
        }
    }
}