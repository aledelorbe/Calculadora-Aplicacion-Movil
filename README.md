# Calculadora Móvil

El diseño de la calculadora está basado en el mismo diseño que tiene la aplicación calculadora del sistema operativo Windows 10 (home).

El funcionamiento de esta aplicación móvil es bastante análogo al mismo, se puede realizar operaciones básicas tales como: suma, resta, multiplicación y división aplicadas sobre dos o más números asimismo es posible aplicar las operaciones: raíz cuadrada, potencia cuadrática, inversor de signo y reciproco sobre un solo número.

Cada que se presione un número, el programa extraerá la serie de operadores y operandos que se encuentra sobre el textView principal y aplicara la jerarquía de operaciones sobre los mismos para depositar y actualizar el resultado sobre el textView secundario.

En cambio cuando se presione un operador básico (suma, resta, multiplicación y división), no se extraerán la serie de operadores y operandos que se encuentra sobre el textView principal.

Funcionamiento de los botones:

* CE: Actualizara el textView secundario escribiendo un 0. 
* C: Mandara una cadena vacía sobre el textView principal y actualizara el textView secundario escribiendo un 0.
* DEL: Eliminara el ultimo carácter escrito sobre el textView principal.
    * Si el ultimo carácter que queda sobre el textView principal es un número se extraerá la serie de operadores y operandos que se encuentra sobre el textView principal y aplicara la jerarquía de operaciones sobre los mismos para depositar y actualizar el resultado sobre el textView secundario. 
    * Si el ultimo carácter que queda sobre el textView principal NO es un numero NO se extraerá la serie de operadores y operandos que se encuentra sobre el textView principal y aplicara la jerarquía de operaciones sobre los mismos para depositar y actualizar el resultado sobre el textView secundario. 
    * Si ya no quedan más caracteres sobre el textView principal, se actualizará el textView secundario escribiendo un 0.
* Punto: Se extraen todos los caracteres que están sobre el textView principal.
    * Si lo último que se encuentra es un número.
        * Si este no tiene un punto, se le agregara uno al final.
        * Si este tiene un punto, NO se le agregara uno al final.
    * Si lo último que se encuentra NO es un número, se agregara al final un cero con un punto.
* Reciproco: Se extraen todos los caracteres que están sobre el textView principal.
    * Si lo último que se encuentra es un número, se invierte este número (1/numero) y se reescribe todo el textView principal sustituyendo el último número con esta actualización.
    * Si lo último que se encuentra es un operador, se vuelve a extraer todos los caracteres que están sobre el textView principal y se determina cual es el último número, este número es el que se invierte y se anexa al final del textView principal, respetando el ultimo operador que se encuentra al final del mismo.
* Raíz cuadrada: Se extraen todos los caracteres que están sobre el textView principal.
    * Si lo último que se encuentra es un número, se obtiene la raíz cuadra de este número y se reescribe todo el textView principal sustituyendo el último número con esta actualización.
    * Si lo último que se encuentra es un operador, se vuelve a extraer todos los caracteres que están sobre el textView principal y se determina cual es el último número, este número se obtiene su raíz cuadrada y se anexa al final del textView principal, respetando el ultimo operador que se encuentra al final del mismo.
* Potencia cuadrática: Se extraen todos los caracteres que están sobre el textView principal.
    * Si lo último que se encuentra es un número, se obtiene la potencia cuadrada de este número y se reescribe todo el textView principal sustituyendo el último número con esta actualización.
    * Si lo último que se encuentra es un operador, se vuelve a extraer todos los caracteres que están sobre el textView principal y se determina cual es el último número, este número se obtiene su potencia cuadrada y se anexa al final del textView principal, respetando el ultimo operador que se encuentra al final del mismo.
* Inversor de signo: Se extraen todos los caracteres que están sobre el textView principal, se determina cual es el último signo escrito y en que posición se encuentra.
    * Si el ultimo signo es un más, se reescribirá toda la cadena de caracteres cambiando el signo más por un menos.
    * Si el ultimo signo es un menos, se reescribirá toda la cadena de caracteres cambiando el signo menos por un más.
* Igual: Actualizara el textView principal con lo que se encuentre en el textView secundario.
    
El resto de los botones que se encuentran en la calculadora, no tienen implementado funcionamiento alguno, solo es parte del diseño.

![calculadora](https://www.digitaltrends.com/wp-content/uploads/2021/08/calculator2-windows-11.jpg?fit=720%2C555&p=1)

