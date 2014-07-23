/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estadios;

/**
 *
 * @author Freivin Campbell <fncampbellr@est.utn.ac.cr>
 */
public class Nodo_Estadios {
       private String dato;
       private String clima;

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }
    private Nodo_Estadios siguiente;
    
    public Nodo_Estadios()
            {
            dato="";
            siguiente=null;
            
            }

    /**
     * @return the dato
     */
    public String getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(String dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public Nodo_Estadios getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo_Estadios siguiente) {
        this.siguiente = siguiente;
    }
    
}
