package clase7;

public class ejemplo3 {

    private String cadena;  // creamos variables string

    public String UltimoCadena() {   // creamos el metodo que llamaremos como puente en el main
        String retorno = "";  // inicializamos la variable del retorno del metodo
        for (int i = 0; i < getCadena().length() - 1; i++) { // ciclo for para saber cual es el ultimo digito de la cadena digitada
            retorno += getCadena().charAt(i);
        }
        return retorno;  /// como es un strin damos el retorno para que se imprima donde el metodo sea llamado 
    }

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

}
