/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.pkg3;

import java.util.Scanner;

/**
 *
 * @author Campbell
 */
public class Practice3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        meses omeses = new meses();
        elevarNumeros oelevarNumeros = new elevarNumeros();
        
        int opt = 0, numero;
        char continuar;
        boolean validar = true;

        do {
            // creamos un menu
            System.out.println("Digite la opcion a evaluar");
            System.out.println("1.saber el mes");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("6.");
            opt = Integer.parseInt(teclado.nextLine());

            switch (opt) {
                case 1:
                    System.out.println("Digite el mes en valor numerico");
                    numero = Integer.parseInt(teclado.nextLine());
                    omeses.calculames(numero);

                case 2:

            }

            System.out.println("Desea continuar S/N"); // pregunta si el siclo continua o finaliza
            continuar = teclado.nextLine().charAt(0);
            // cambia el valor de validar
            if ((continuar == 's') || (continuar == 'S')) {
                validar = true; // si escoje s cambia a true
            } else {
                validar = false; // de lo contrario false y termina el ciclo
            }
        } while (validar);
    }

}
