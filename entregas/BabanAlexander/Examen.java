import new.scanner // no recuerdo la sentencia de memoria
//no recuerdo la estrcutura public state....

System.out.println("Cual es la edad del usuario?");
int edad=teclado.new(int);
if(edad>=18){

    System.out.println("Es mayor de edad");
}
else{

    System.out.println("Es menor de edad");
}


double filaPar= (int) (Math.random() * (99-16 +1)) -16;
double filaImpar= (int) (Math.random()* (70-17 +1)) -17;

if(edad==filaPar){
    System.out.println("ES par");
}
else{

     System.out.println("ES impar");
}



System.out.println("En cuentas asignaturas estas matriculado?");
int asignaturas=(int) (Math.random() * (10-1 +1) +1)
while(asignaturas>=1 && asignaturas<=10){

    System.out.println("Tus asignaturas no estan entre 1 y 10");
}
