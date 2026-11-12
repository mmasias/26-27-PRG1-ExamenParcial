import new.scanner // no recuerdo la sentencia de memoria

System.out.println("Cual es la edad del usuario?");
int edad=teclado.new(int);
if(edad>=18){

    System.out.println("Es mayor de edad");
}
else{

    System.out.println("Es menor de edad");
}


double filaPar= (int) (Math.random() * (99-16 +1)) -16;
double fila impar= (int) (Math.random()* (70-17 +1)) -17;

if(edad==filaPar){
    System.out.println("ES par");
}
else{

     System.out.println("ES impar");
}