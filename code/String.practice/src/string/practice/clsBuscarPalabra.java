package string.practice;

public class clsBuscarPalabra {

    private String sTexto, sTextoBuscado; // creamos las variables privadas y le sacamos el set y el get a cada una de ellas

    public void buscarPa() { // cramos un metodo donde abra un contador de palabras y un ciclo donde donde comprueba si la palabra existe y le suma al contador

        int contador = 0;

        while (getsTexto().indexOf(getsTextoBuscado()) > -1) {
            setsTexto(getsTexto().substring(getsTexto().indexOf(getsTextoBuscado()) + getsTextoBuscado().length(), getsTexto().length()));
            contador++;
        }

        System.out.println("la palabra que busco es :" + getsTextoBuscado() + "  y la cantidad es de : " + contador);

    }
    
    public void buscarPaguion() { // cramos un metodo donde abra un contador de palabras y un ciclo donde donde comprueba si la palabra existe y le suma al contador

        int contador = 0;

        while (getsTexto().indexOf(getsTextoBuscado()) > -1) {
            setsTexto(getsTexto().substring(getsTexto().indexOf(getsTextoBuscado()) + getsTextoBuscado().length(), getsTexto().length()));
            contador++;
        }

        System.out.println(getsTextoBuscado());

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
