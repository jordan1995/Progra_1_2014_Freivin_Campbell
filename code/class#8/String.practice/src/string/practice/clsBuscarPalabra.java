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

    private String sTexto, sTextoBuscado;

    public void buscarPa() {
        /*int index = getOracion().indexOf(getBusqueda());
         System.out.println(index);
         index = getOracion().indexOf(getBusqueda(), index + 1);
         System.out.println(index);*/
         // Texto

	    // Texto que vamos a buscar
        // Contador de ocurrencias 
        int contador = 0;

        while (getsTexto().indexOf(getsTextoBuscado()) > -1) {
            setsTexto(getsTexto().substring(getsTexto().indexOf(getsTextoBuscado()) + getsTextoBuscado().length(), getsTexto().length()));
            contador++;
        }

        System.out.println("la palabra que busco es :"+ getsTextoBuscado()+ "  y la cantidad es de : "+ contador);

    }

    /**
     * @return the sTexto
     */
    public String getsTexto() {
        return sTexto;
    }

    /**
     * @param sTexto the sTexto to set
     */
    public void setsTexto(String sTexto) {
        this.sTexto = sTexto;
    }

    /**
     * @return the sTextoBuscado
     */
    public String getsTextoBuscado() {
        return sTextoBuscado;
    }

    /**
     * @param sTextoBuscado the sTextoBuscado to set
     */
    public void setsTextoBuscado(String sTextoBuscado) {
        this.sTextoBuscado = sTextoBuscado;
    }

}
