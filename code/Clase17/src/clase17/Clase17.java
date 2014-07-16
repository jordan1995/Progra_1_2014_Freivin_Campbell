/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase17;

/**
 *
 * @author Freivin
 */
public class Clase17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lista oLista =new Lista();
        oLista.Insertar("Efren","20111-4");
        oLista.Insertar("Joss","3666611-5");
        oLista.Insertar("Navas","744455-8");
        oLista.Imprimir();
        
        oLista.EliminarPrimero();
        oLista.EliminarUltimo();
        
        
    }
    
}
