/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author Campbell
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, y, suma = 1;
        /**
         * 1.	Dado un valor n y otro valor y, desplegar en pantalla números
         * correlativos desde 1 hasta n, reemplazando por un * cada vez que
         * corresponda desplegar un número múltiplo de y.
         */
        n = 20;
        y = 5;
        suma = 1;

        do {

            if ((suma % y) != 0) {
                System.out.println(suma);

            } else {
                System.out.println("*");

            }
            suma = suma + 1;

        } while (suma <= n);

        /**
         * 2.	Solicitar al usuario que ingrese un valor inicial, un valor final
         * y el incremento deseado. Estos valores deben ser decimales. El
         * sistema llenará imprimir los números generados por un ciclo for con
         * los parámetros antes mencionados.
         */
        Scanner teclado = new Scanner(System.in);

        float incremento, valor1, valor2;
        System.out.println("Digite el valor 1");
        valor1 = Float.parseFloat(teclado.nextLine());

        System.out.println("Digite el valor 2");
        valor2 = Float.parseFloat(teclado.nextLine());

        System.out.println("Digite de cuanto lo quiere incrementar");
        incremento = Float.parseFloat(teclado.nextLine());
        for (float i = valor1; i <= valor2; i = i + incremento) {
            System.out.println(i);

        }

        /**
         * 4.	Construir un algoritmo que eleve un número decimal a un valor
         * entero ingresado por el usuario. No se pueden utilizar las funciones
         * matemáticas la idea es lograrlo mediante el uso del ciclo para.
         */
        float num, operacion;
        int elv;
        int res;

        System.out.println("Digite el numero base");
        num = Float.parseFloat(teclado.nextLine());

        System.out.println("Digite el numero como exponente");
        elv = Integer.parseInt(teclado.nextLine());
        operacion = num;

        for (int i = 1; i < elv; i++) {
            operacion = operacion * num;

        }
        res = (int) num; // esto es para cambier el valor de la variable
        System.out.println("El resultado del calculo es de:" + res);

        /**
         * 1.	Construir un programa que imprima los números que se pueden
         * generar de 5 dígitos con la combinación de los dígitos del 1 al 9
         * ejemplo 11111, 11112, 11113, ... 99999
         */
        int nu = 11111;
        while (nu <= 99999) {
            nu++;

            System.out.println(nu);
        }

        /**
         * 1.	Ingresar N números enteros y reportar la cantidad de pares y la
         * cantidad de impares.
         */
        int numero;
        int contadorpa = 0;
        int contadorIm = 0;
        System.out.println("Digite un numero a cual llegar");
        numero = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                contadorpa = contadorpa + 1;
            } else {
                contadorIm = contadorIm + 1;
            }

        }
        System.out.println("los numeros  PARES son" + contadorpa + "los numeros imprares son" + contadorIm);

        /**
         * 1.	Programa que lea un número n luego desplegar la tabla de
         * multiplicar de ese número. Realizar el programa: a) utilizando for b)
         * Utilizando while c) utilizando do while.
         */
        
    
    
    
    
    
    
    
    }// llaves del final
}
