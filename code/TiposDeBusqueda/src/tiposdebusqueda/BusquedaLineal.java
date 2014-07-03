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
public class BusquedaLineal {
   public int BuscarNombre(String[] nombres, String busqueda)
   {
       for (int i = 0; i < nombres.length; i++) {
           if (nombres.equals(busqueda))
           {
           return i;
           }
       }
   
   return -1;
   }
    
}
