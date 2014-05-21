/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author Campbell
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in); // instancia para que lea el teclado
        // delcaracion de variables
        boolean validar = true; // variables booblean no regresa nada true/false
        double valor1 = 0, valor2 = 0, resultado; // double
        char continuar; // char para opciones
        int option = 0; // igual para opciones
        clsSwitch oclsSwitch = new clsSwitch(); // creamos la instancia

// creamos un ciclo do/while
        do {
            // creamos un menu
            System.out.println("Digite la opcion a evaluar");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Division");
            System.out.println("4.Multiplicacion");
            System.out.println("5.Raiz");
            System.out.println("6.Potencia");

            option = Integer.parseInt(teclado.nextLine());
            
            // switch  para las opciones del menu
            switch (option) {
                case 1: // opcion que suma
                    System.out.println("Digite el valor del primer digito");
                    valor1 = Double.parseDouble(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    valor2 = Double.parseDouble(teclado.nextLine());

                    resultado = oclsSwitch.sumar(valor1, valor2);
                    System.out.println(resultado);
                    break;
                case 2:// opcion que resta
                    System.out.println("Digite el valor del primer digito");
                    valor1 = Double.parseDouble(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    valor2 = Double.parseDouble(teclado.nextLine());

                    resultado = oclsSwitch.resta(valor1, valor2);
                    System.out.println(resultado);
                    break;
                case 3: // opcion que divide
                    System.out.println("Digite el valor del primer digito");
                    valor1 = Double.parseDouble(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    valor2 = Double.parseDouble(teclado.nextLine());

                    resultado = oclsSwitch.divisiom(valor1, valor2);
                    System.out.println(resultado);
                    break;
                case 4: // opcion que multiplica
                    System.out.println("Digite el valor del primer digito");
                    valor1 = Double.parseDouble(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    valor2 = Double.parseDouble(teclado.nextLine());

                    resultado = oclsSwitch.multiplicacion(valor1, valor2);
                    System.out.println(resultado);
                    break;
                case 5: // da la raiz
                    System.out.println("Digite el valor del numero");
                    valor1 = Double.parseDouble(teclado.nextLine());

                    resultado = oclsSwitch.raiz(valor1, valor2);
                    System.out.println(resultado);
                    break;
                case 6: // eleva al numero
                    System.out.println("Digite el valor del primer digito");
                    valor1 = Double.parseDouble(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    valor2 = Double.parseDouble(teclado.nextLine());

                    resultado = oclsSwitch.elevar(valor1, valor2);
                    System.out.println(resultado);

                default: // un valor default da un texto
                    System.out.println("Disculpe no ingreso una opcion existente");
            }

            System.out.println("Desea continuar S/N"); // pregunta si el siclo continua o finaliza
            continuar = teclado.nextLine().charAt(0);
             // cambia el valor de validar
            if ((continuar == 's') || (continuar == 'S')) {
                validar = true; // si escoje s cambia a true
            } else {
                validar = false; // de lo contrario false y termina el ciclo
            }

        } while (validar); // sale dependiendo de la opcion
    }

}
