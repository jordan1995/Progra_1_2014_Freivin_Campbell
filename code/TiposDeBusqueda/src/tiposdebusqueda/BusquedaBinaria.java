/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdebusqueda;

/**
 *
 * @author Freivin Campbell <fncampbellr@est.utn.ac.cr>
 */
public class BusquedaBinaria {

    public int BuscarNombre(String[] nombres, String busqueda) {
        int inicial = 0;
        int elementoFinal = nombres.length - 1;

        while (inicial < elementoFinal) {
            int central = (inicial + elementoFinal) / 2;
            if (busqueda.compareTo(nombres[central]) > 0) {
                inicial = central;

            } else {
                if (busqueda.compareTo(nombres[central]) < 0) {
                    elementoFinal = central - 1;

                } else {
                    return central;

                }

            }

        }
        return -1;

    }

}
