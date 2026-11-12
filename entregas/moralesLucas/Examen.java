
public class Examen {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Examen parcial prg1");

        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();

        while (edad < 16 || edad > 99) {
            System.out.println("Edad no valida. Debe estar entre 16 y 99 años.");

            System.out.print("Introduce tu edad: ");
            edad = teclado.nextInt();
        }

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        System.out.println("Edad valida para entrar en la fila.");

        teclado.close();
    }
}