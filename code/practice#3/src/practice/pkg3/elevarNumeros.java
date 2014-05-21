/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.pkg3;

/**
 *
 * @author Campbell
 */
public class elevarNumeros {

    /**
     *
     * •	Ingresar un numero entero, y si este termina en 2,5 u 8 reportar el
     * cuadrado del número, si este termina en 4,7 o 9 reportar el numero
     * multiplicado por 5 y reportar el mismo número en otro caso.
     */
    public double eleva(double num) {
        if ((num % 10) == 2 ||(num % 10) ==5 ||(num % 10)==8) {
            num = Math.pow(num, 2);
            System.out.println("La elevacion es de:" + " " + num);
        } 
        
        else{if ((num % 10) == 4||(num % 10) ==7 ||(num % 10)==9) {
            num = num * 5;
            System.out.println("La multiplicacion es de:" + " " + num);
        }
        }
        if ((num % 10) == 1 ||(num % 10)==3||(num % 10)==6||(num % 10)==0) {

            System.out.println("El numero quedo igual:" + " " + num);
        }
        
        
        
        return num;
    }

}
