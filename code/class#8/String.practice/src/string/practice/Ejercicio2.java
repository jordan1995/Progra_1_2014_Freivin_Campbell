/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.practice;

/**
 *
 * @author Freivin Campbell
 */
public class Ejercicio2 {

    private String hilera;

    public String SubString(int begin, int end) throws Exception {
        String retorno = "";
        if (end < begin) {
            throw new Exception("Error el final no puede ser menor al inicio");
        }
        if (getHilera().length() < 0) {
            throw new Exception("la hilera debe contener caracteres");
        }

        for (int i = begin - 1; i < end; i++) {
            retorno += getHilera().charAt(i);
        }
        return retorno;
    }
    
    public String toUpperchase()
    {
    String retorno="";
    String mayuscula="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ ";
    String minuscula="abcdefghijklmnñopqrstuvwxyz";
    char temporal;
    int index=0;
        for (int i = 0; i < getHilera().length(); i++) {
            if(Character.isLowerCase(getHilera().charAt(i)))
            {
            index= minuscula.indexOf(getHilera().charAt(i));
            retorno+=mayuscula.charAt(index);
            }else{retorno+=getHilera().charAt(i);}
            
        }
    return retorno;
    }

    /**
     * @return the hilera
     */
    public String getHilera() {
        return hilera;
    }

    /**
     * @param hilera the hilera to set
     */
    public void setHilera(String hilera) {
        this.hilera = hilera;
    }
    
    
    
}
