/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estadios;

import javax.swing.JOptionPane;

/**
 *
 * @author Freivin Campbell <fncampbellr@est.utn.ac.cr>
 */
public class Lista_Estadios {
    
     private Nodo_Estadios
            raiz;
    
    public Lista_Estadios()
    {
        raiz=null;
    }
    
    public void Insertar (String dato, String clima)
    {
        Nodo_Estadios nuevo;
        nuevo=new Nodo_Estadios();
        nuevo.setDato(dato);
        nuevo.setClima(clima);
        
        
        if (raiz==null) {
            nuevo.setSiguiente(null);
            raiz=nuevo;
        }
        else{
            Nodo_Estadios auxiliar=raiz;
            while   (auxiliar.getSiguiente()!=null)
            {
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
            
        }
    }
    
     public String Imprimir(int opt)
    {
        Nodo_Estadios recorrido=raiz;
       String lista =" ";
       int cont=0;
        
        while(recorrido!=null)
        {
            if(opt==cont)
            {
                lista+=recorrido.getDato()+ recorrido.getClima() +"\n";
               
            }
            
            cont++;
            
            
            recorrido=recorrido.getSiguiente();
            
        }
        
        
         return lista;
    }
     
    
    
}
