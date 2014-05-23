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
public class diaLunes {

    int proximo = 0;

    public void imprimeQuedia(int dia, int contador) {
        for (; contador <= dia; contador++) {
            if (proximo == 7) {
                proximo = 0;

            }
            proximo++;
        }
        if (proximo == 7) {
            proximo = 0;
        }
        switch (proximo) {
            case 0:
                System.out.println("El día " + dia + " es un domingo.");
                break;
            case 1:
                System.out.println("El día " + dia + " es un lunes.");
                break;
            case 2:
                System.out.println("El día " + dia + " es un martes.");
                break;
            case 3:
                System.out.println("El día " + dia + " es un miércoles.");
                break;
            case 4:
                System.out.println("El día " + dia + " es un jueves.");
                break;
            case 5:
                System.out.println("El día " + dia + " es un viernes.");
                break;
            case 6:
                System.out.println("El día " + dia + " es un sábado.");
                break;
        }
    }

}
