fila:par
# Programación I - Examen parcial [26][27]

## Formato

El examen es un **dictado de código**. El profesor dicta los pasos uno a uno y cada paso se proyecta en la pizarra, junto con los anteriores. Cada paso tiene un tiempo de respuesta, que se indica al dictarlo.

Al acabar el tiempo de cada paso, el profesor hace un commit de corte. **Un paso es válido si su commit es anterior al corte de ese paso.**

## Reglas

|Regla|Detalle|
|-|-|
|Un commit por paso|El mensaje sigue el formato `paso-NN: descripción`, con el número en dos cifras: `paso-02`, `paso-17`...|
|Pasos con retraso|Quien no llegue a tiempo puede ponerse al día durante el paso siguiente, con un commit propio para cada paso (`paso-04` y después `paso-05`). El paso atrasado no cuenta como válido.|
|Pasos perdidos|**Tres pasos perdidos suponen el suspenso del examen.**|
|Lugar de trabajo|Su fork de este repositorio, en la carpeta `entregas/apellidoNombre/`.|
|Conceptos permitidos|Los vistos en clase: variables, constantes, entrada y salida por consola, expresiones, `if`/`else`, `for`, `while`, `do`-`while`. No se permiten `switch`, matrices, métodos (salvo `main`), `break` ni `continue`.|
|Entrega|Push y pull request a este repositorio, cuando lo indique el último paso.|

## Se valora

- Que cada paso esté a tiempo, compile y haga lo dictado.
- Código limpio: nombres expresivos, constantes en lugar de números mágicos, el bucle adecuado en cada caso, condiciones con nombre y ninguna línea que sobre.
- La calidad de los mensajes de commit.
