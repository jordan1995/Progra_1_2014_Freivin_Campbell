/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientos;

import java.util.Scanner;

/**
 *
 * @author Campbbell
 */
public class TiposDeOrdenamientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] arreglo = {56, 4, 85, 8, 42,100,34,39,46,1085,248,2348,2348,450,284,2738};
        int[] arregloOrdenado;
        int opt;
        Scanner t = new Scanner(System.in);
        do {
            System.out.println("Menu.");
            System.out.println("1.Metodo por SELECCION");
            System.out.println("2.Metodo por Borbuja");
            System.out.println("3.Borbuja inverso");
            System.out.println("4.Seleccion inverso");
            System.out.println("5.SALIR");

            opt = t.nextInt();
            switch (opt) {
                case 1:
                    Seleccion OS = new Seleccion();
                    arregloOrdenado = OS.ordenS(arreglo, "A");
                    for (int i = 0; i < arregloOrdenado.length; i++) {
                        System.out.println(arregloOrdenado[i]);
                    }
                    break;
                case 2:
                    Borbuja OB = new Borbuja();
                    arregloOrdenado = OB.ordenamientoB(arreglo, null);
                    for (int i = 0; i < arregloOrdenado.length; i++) {
                        System.out.println(arregloOrdenado[i]);

                    }
                    break;
                case 3:
                    BorbujaInverso OBI = new BorbujaInverso();
                    arregloOrdenado= OBI.ordenamientoB(arreglo, null);
                    for (int i = 0; i < arregloOrdenado.length; i++) {
                        System.out.println(arregloOrdenado[i]);
                        
                    }
                    break;
                case 4:
                    SelecionInverso OSI = new SelecionInverso();
                    arregloOrdenado= OSI.ordenS(arreglo, "A");
                    for (int i = 0; i < arregloOrdenado.length; i++) {
                        System.out.println(arregloOrdenado[i]);
                    
            }
                break;
        }
    } while (opt <5);
}
}