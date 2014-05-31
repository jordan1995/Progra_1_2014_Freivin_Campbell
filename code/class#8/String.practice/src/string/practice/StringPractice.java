/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.practice;

import java.util.Scanner;

/**
 *
 * @author Campbell
 */
public class StringPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Digite la opcion que desea");
            System.out.println("1.Alreves");
            System.out.println("2.Palindromo");
            System.out.println("2.Buscar Palabra");
            opcion = Integer.parseInt(key.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Digite la palabra a evaluar");
                    key = new Scanner(System.in);
                    clsRotar rotar = new clsRotar();
                    rotar.setPalabra(key.nextLine());
                    System.out.println("Imprime la palabra digitada Alreves");
                    System.out.println(rotar.alRevez());
                    break;
                case 2:
                    System.out.println("Digite la palabra Palindromo");
                    key = new Scanner(System.in);
                    clsPalindromo palindromo = new clsPalindromo();
                    palindromo.setPalabra(key.nextLine());
                    System.out.println("la palabra es palindromo");
                    System.out.println(palindromo.Palindromo());
                    break;
                case 3:
                    clsBuscarPalabra buscar = new clsBuscarPalabra();
                    key = new Scanner(System.in);
                    System.out.println("digite una oracion");
                    buscar.setsTexto(key.nextLine());
                    System.out.println("Digite la palabra que quiere buscar dentro de la oracion");
                    buscar.setsTextoBuscado(key.nextLine());
                    buscar.buscarPa();
                    break;

            }

        } while (true);

    }

}
