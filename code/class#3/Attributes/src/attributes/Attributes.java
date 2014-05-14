/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attributes;

import java.util.Scanner;

/**
 *
 * @author Campbell
 */
public class Attributes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean validar = true;
        int opcion;
        double monto;
        char continuar;

        Acccount oAcccount = new Acccount();
        Scanner teclado = new Scanner(System.in);

        while (validar) {
            
            System.out.println("Digite 1 si quiere realizar un deposito y 2 si quiere realizar un retiro");
            opcion = Integer.parseInt(teclado.nextLine());
            if (opcion == 1) {
                System.out.println("Digite el monto a depositar");
                monto = Double.parseDouble(teclado.nextLine());
                oAcccount.Deposito(monto);
            }
            if (opcion == 2) {
                System.out.println("Digite el monto que desea retitar");
                monto = Double.parseDouble(teclado.nextLine());
                oAcccount.Retiro(monto);
                if (oAcccount.isHayError()) {
                    System.out.println("El monto que quiere retirar no puede ser retirado");
                }
            }
            System.out.println("El saldo final es de"  +" "+ oAcccount.getSaldoInicial());
            System.out.println("Desea continuar con otra transsacción" + " " + "S/N");
            continuar = teclado.nextLine().charAt(0);

            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;
            }
            if ((continuar == 'N') || (continuar == 'n')) {
                validar = false;
            }
        }
    }

}
