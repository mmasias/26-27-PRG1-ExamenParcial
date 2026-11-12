import java.util.Scanner;
class Examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Examen parcial PRG1");
        int edad;
        boolean opcionvalida = false
        while(opcionvalida){
        System.out.println("Introduzca su edad: ");
        edad = scanner();
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
    }
}