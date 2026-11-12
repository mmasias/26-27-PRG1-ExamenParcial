import java.util.Scanner;

class Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Examen parcial");
        int edadUsuario = scanner.nextInt();

        final int MAYORIA_DE_EDAD = 18;

        if (edadUsuario >= MAYORIA_DE_EDAD){
        System.out.println("Es mayor de edad");
        }else {
            System.out.println("Es menor de edad");
        }

    }
}