package com.generation;
//para tener una mejor vista puse los system terminando cada ejercicio, sin embargo se ponen al terminar codigo
public class Main {
    //declaracion de variables en java
    public static void main(String[] args) {

        //Variable String
        //const edad = 31; asi se hacía en js
        String nombre = "Daniela";

        System.out.println(nombre);

        //datos primitivos numéricos
        byte num1 = 10;
        short num2 = 10;
        int num3 = 10;
        long num4 = 10;

        //Datos primitivos decimales
        //el numero float siempre debe llavar una f y el double d para que funcione
        float decimal1 = 10.31554315f;
        double decimal2 = 20.1615464d;

        //dato primitivo char, siempre va con comillas simples
        char caracter = 'f';

        //dato primitivo boolean
        boolean verdadero = true;

        //---------------------
        //conversiones
        short numShort1 = num1;
        int numInt = numShort1;
        short numShort2 = (short) numInt;
        //no podemos hacer
        /*short numShort2 = numInt; porque nos manda a error*/
        //---------------------
        System.out.println(numInt);
        System.out.println(numShort2);

        //Ejercicio de practica
        byte numByte1 = 120;
        byte numByte2 = 120;
        //byte suma = numByte1 + numByte2;
        /*da error por el rango*/
        //short suma = numByte1 + numByte2;
        //debemos hacer la conversion
        short suma =(short) (numByte1 + numByte2);
        System.out.println(suma);

        //OPERADORES ARITMÉTICOS EN JAVA: +, -, *, %, /
        // + sumar o concatenar cadenas
        // - restar
        // * multiplicar
        // / dividir
        // % residuo
        // para la potencializacion y raices debemos hacer uso de una libreria

        int numero1 = 15;
        int numero2 = 3;

        int sum = numero1 + numero2;
        System.out.println(numero1 + " + " + numero2 + " = " + sum);
        int resta = numero1 - numero2;
        System.out.println("15 - 3 = " + resta);
        int multiplicacion = numero1 * numero2;
        System.out.println("15 x 3 = " + multiplicacion);
        int division = numero1 / numero2;
        System.out.println("15 / 3 = " + division);
    }
}
