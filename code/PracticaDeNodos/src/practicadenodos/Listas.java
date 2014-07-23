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
public class Listas {
   // cargamos la clase nodo de lista como vriable para utilizara
    private NodoDelista inicio;
    
// Decimos Que la lista inicio esta en nulo
    public Listas() {
        inicio = null;
    }
    
    // metodo boolean que nos dice si la lista esta vacia o no ¡¡¡
    public boolean EstaVacia() {
        if (inicio == null) {
            return true;
        }
        return false;
    }
    
    public void Insertar(int dato) {
        NodoDelista nuevo;
        nuevo = new NodoDelista();
        nuevo.setDato(dato);
        

        if (inicio == null) {
            nuevo.setSiguiente(null);
            inicio = nuevo;
        } else {
            NodoDelista auxiliar = inicio;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
            
        }
    }
    
    public void Imprimir() {
        NodoDelista recorrido = inicio;
        System.out.println("Listado de todos los elementos de la lista");
        while (recorrido != null) {
            
            System.out.println(recorrido.getDato() );
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();
    }
    
    
}
