/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicadenodos;

/**
 *
 * @author Freivin Campbell <fncampbellr@est.utn.ac.cr>
 */
public class NodoDelista {
    private int dato;
    private NodoDelista siguiente;
    
    public NodoDelista()
            {
            dato=0;
            siguiente=null;
            
            }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public NodoDelista getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoDelista siguiente) {
        this.siguiente = siguiente;
    }
    
}
