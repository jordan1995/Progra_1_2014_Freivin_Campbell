/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientos;

/**
 *
 * @author Freivin Campbell <fncampbellr@est.utn.ac.cr>
 */
public class Borbuja {

    public int[] ordenamientoB(int arreglo[], String ordenamineto) {
        int indice;
        int indice2;
        int auxiliar;
        
        // for que lleva el metodo de ordenar
        for (indice = 0; indice < arreglo.length; indice++) {
            // es el que intercambia los valores / borbujea en ellos
            for (indice2 = 0; indice2 < (((arreglo.length) - indice)) - 1; indice2++) {
                if (arreglo[indice2 + 1] < arreglo[indice2]) {
                    auxiliar = arreglo[indice2 + 1];
                    arreglo[indice2 + 1] = arreglo[indice2];
                    arreglo[indice2] = auxiliar;

                }

            }

        }
        return arreglo;
    }

}
