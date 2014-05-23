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
        letraOpalabra oleOpalabra = new letraOpalabra();
        numeroRomano onumeroRomano = new numeroRomano();
        regresoUnDia oregresoUnDia = new regresoUnDia();
        diaLunes odialunes = new diaLunes();

        int opt = 0, numero, n, dia, dial, contador = 0, mes, año;
        char continuar, valor;
        boolean validar = true;
        double num;

        do {
            // creamos un menu
            System.out.println("Digite la opcion a evaluar");
            System.out.println("1.saber el mes");
            System.out.println("2.Eleva o multiplica");
            System.out.println("3.Opciones");
            System.out.println("4.Numero romano");
            System.out.println("5.Cambiar el Año");
            System.out.println("6.Dia Lunes");
            opt = Integer.parseInt(teclado.nextLine());

            switch (opt) {
                case 1:
                    System.out.println("Digite el mes en valor numerico");
                    numero = Integer.parseInt(teclado.nextLine());
                    omeses.calculames(numero);
                    break;

                case 2:
                    System.out.println("Digite el valor del numero");
                    num = Double.parseDouble(teclado.nextLine());
                    oelevarNumeros.eleva(num);
                    break;
                case 3:
                    System.out.println("Digite el valor  A=excelente B= bueno C= regular D= malo E= pésimo");
                    valor = teclado.nextLine().charAt(0);
                    oleOpalabra.cambiarPalabra(valor);
                    break;
                case 4:
                    n = onumeroRomano.generarromano();
                    System.out.println("El numero aleatoreo es:" + n);
                    onumeroRomano.calculaRomano(n);
                    break;
                case 5:
                    System.out.println("Digite el dia  / digite el mes / digite el año");
                    System.out.println("Dia:");
                    dia = Integer.parseInt(teclado.nextLine());
                    System.out.println("Mes:");
                    mes = Integer.parseInt(teclado.nextLine());
                    System.out.println("Año:");
                    año = Integer.parseInt(teclado.nextLine());
                    oregresoUnDia.regresar(dia, mes, año);
                    break;
                case 6:
                    System.out.println("Digite El dia");
                    dial = Integer.parseInt(teclado.nextLine());
                    odialunes.imprimeQuedia(dial, contador);

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
