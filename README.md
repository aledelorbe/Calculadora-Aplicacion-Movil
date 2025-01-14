# Calculadora (Aplicación Móvil)

Este proyecto consiste en permitir al usuario realizar operaciones básicas, tales como: suma, resta, multiplicación y división, utilizando dos, tres o hasta N números. Asimismo, es posible aplicar operaciones como raíz cuadrada, potencia cuadrada, inversión de signo y recíproco sobre un solo número. La calculadora respeta la jerarquía de operaciones en todas las situaciones.

El diseño de esta calculadora está inspirado en la aplicación de calculadora del sistema operativo Windows 10 (Home).

## Tecnologías utilizadas

- **Java**: Lenguaje de programación principal. En este proyecto se utilizó el `JDK 11`.
- **Android Studio**: Entorno de desarrollo integrado (IDE) para crear aplicaciones Android.

## Funcionamiento

- **CE**: Actualizara el `TextView` secundario escribiendo un 0.  
- **C**: Limpia el `TextView` principal y actualiza el secundario escribiendo un 0.  
- **DEL**: Elimina el último carácter escrito en el `TextView` principal.
  - Si el último carácter restante es un número, se extraen los operadores y operandos, se aplica la jerarquía de operaciones y se actualiza el resultado en el `TextView` secundario.
  - Si el último carácter restante **no** es un número, no se extraen los operadores ni operandos.
  - Si no quedan más caracteres, el `TextView` secundario se actualiza escribiendo un 0.
- **Punto**: Evalúa los caracteres en el `TextView` principal.
  - Si lo último es un número:
    - Si no tiene un punto, se le agrega uno.
    - Si ya tiene un punto, no se agrega nada.
  - Si lo último **no** es un número, se agrega un cero seguido de un punto.
- **Recíproco**: Evalúa los caracteres del `TextView` principal.
  - Si lo último es un número, se invierte (1/número) y se sustituye el número en el `TextView`.
  - Si lo último es un operador, se extrae el último número, se invierte y se agrega al final respetando el operador.
- **Raíz cuadrada**: Evalúa los caracteres del `TextView` principal.
  - Si lo último es un número, se calcula la raíz cuadrada y se sustituye.
  - Si lo último es un operador, se extrae el último número, se calcula su raíz cuadrada y se agrega al final respetando el operador.
- **Potencia cuadrada**: Evalúa los caracteres del `TextView` principal.
  - Si lo último es un número, se calcula su potencia cuadrada y se sustituye.
  - Si lo último es un operador, se extrae el último número, se calcula su potencia cuadrada y se agrega al final respetando el operador.
- **Inversor de signo**: Evalúa el último signo escrito.
  - Si el último signo es un **más**, se cambia a **menos**.
  - Si el último signo es un **menos**, se cambia a **más**.
- **Igual**: Actualiza el `TextView` principal con el contenido del `TextView` secundario.

**Nota**: El resto de los botones presentes en la calculadora que no fueron mencionados no tienen funcionalidad implementada; solo forman parte del diseño.

## Estructura del proyecto

- `java/com/example/calculadora`: Contiene el código fuente de la aplicación en Java.
- `res/`: Contiene los recursos de la aplicación, organizados en subcarpetas:
  - `layout/`: Contiene archivos XML que definen la interfaz de usuario.
- `gradle/`: Contiene los archivos de configuración de Gradle que definen cómo se construye el proyecto.


![calculadora](https://www.digitaltrends.com/wp-content/uploads/2021/08/calculator2-windows-11.jpg?fit=720%2C555&p=1)

----

# Calculator (Mobile Application)

This project allows the user to perform basic operations such as addition, subtraction, multiplication, and division using two, three, or up to N numbers. Additionally, it supports operations like square root, square power, sign inversion, and reciprocal on a single number. The calculator respects the order of operations in all cases.

The design of this calculator is inspired by the calculator application of the Windows 10 (Home) operating system.

## Technologies used

- **Java**: Main programming language. This project uses `JDK 11`.
- **Android Studio**: Integrated development environment (IDE) for building Android applications.

## Functionality

- **CE**: Updates the secondary `TextView` by writing a 0.  
- **C**: Clears the main `TextView` and updates the secondary one by writing a 0.  
- **DEL**: Deletes the last character from the main `TextView`.
  - If the remaining last character is a number, it extracts the operators and operands, applies the order of operations, and updates the result in the secondary `TextView`.
  - If the remaining last character **is not** a number, it does not extract operators or operands.
  - If no characters remain, the secondary `TextView` is updated by writing a 0.
- **Dot**: Evaluates the characters in the main `TextView`.
  - If the last character is a number:
    - If it does not have a dot, a dot is added.
    - If it already has a dot, nothing is added.
  - If the last character **is not** a number, a zero followed by a dot is added.
- **Reciprocal**: Evaluates the characters in the main `TextView`.
  - If the last character is a number, it calculates its reciprocal (1/number) and replaces it.
  - If the last character is an operator, it extracts the last number, calculates its reciprocal, and appends it, respecting the operator.
- **Square root**: Evaluates the characters in the main `TextView`.
  - If the last character is a number, it calculates its square root and replaces it.
  - If the last character is an operator, it extracts the last number, calculates its square root, and appends it, respecting the operator.
- **Square power**: Evaluates the characters in the main `TextView`.
  - If the last character is a 

![calculadora](https://www.digitaltrends.com/wp-content/uploads/2021/08/calculator2-windows-11.jpg?fit=720%2C555&p=1)

