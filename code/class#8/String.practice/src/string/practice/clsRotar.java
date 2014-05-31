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
public class clsRotar {

    private String palabra;

    public String alRevez() {
        String retorno = "";
        for (int i = getPalabra().length() - 1; i >= 0; i--) {
            retorno += getPalabra().charAt(i);

        }
        return retorno;

    }

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
}
