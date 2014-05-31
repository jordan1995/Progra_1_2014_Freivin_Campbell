/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package string.practice;

/**
 *
 * @author Campbell
 */
public class clsBuscarPalabra {
    private String oracion, busqueda;
    
    
    
    public String buscarPa()
            
    {
        int index =getOracion().indexOf(getBusqueda());
        System.out.println(index);
        index= getOracion().indexOf(getBusqueda(),index+1);
        System.out.println(index);
        
        
    return "";
    }

    /**
     * @return the oracion
     */
    public String getOracion() {
        return oracion;
    }

    /**
     * @param oracion the oracion to set
     */
    public void setOracion(String oracion) {
        this.oracion = oracion;
    }

    /**
     * @return the busqueda
     */
    public String getBusqueda() {
        return busqueda;
    }

    /**
     * @param busqueda the busqueda to set
     */
    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

    
    
    
    
    
    
    
    
    
       
    }
    

