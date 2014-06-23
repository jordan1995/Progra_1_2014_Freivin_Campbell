/*
 * Name: PrimeraClase
 
 * Information:This is the frist class.
  
 * Date: 7/05/2014.
  
 * Copyrigh.
 
 */
package PrimeraClase;

import java.util.Scanner;

/**
 *
 * @author Campbell
 */
public class PrimeraClase {

    /**
     * @param args the command line arguments thus is the main method
     */
    public static void main(String[] args) {
        double horasLaboradas = 0;
        double costoHora = 0;
        double salario = 0;

        Scanner teclado = new Scanner(System.in);

        //JOptionPane.showMessageDialog(null, "Hello World");
        System.out.print("Hello world" + "\n");

        System.out.print("Digite las horas laboradas por el trabajador:");

        horasLaboradas = Double.parseDouble(teclado.nextLine());

        System.out.print("Digite el costo de las horas:");

        costoHora = Double.parseDouble(teclado.nextLine());

        salario = horasLaboradas * costoHora;

        System.out.println("El salario final es de:" + " " + salario);

        System.out.println("Java epic win" + "\n");

    }
}
