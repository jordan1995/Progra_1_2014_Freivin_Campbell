package clase7;

public class ejercicio2 {

    private String cadena;

    public String MitadCadena() {    // metodo que nos dal la mitad de la cadena que ingresamos
        String retorno = "";
        for (int i = 0; i < getCadena().length() / 2; i++) {
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }

    public String ultimovalor() {  /// metodo donde nos dara el ultimo valor o el ultimo caracter de la cadena
        return getCadena().charAt(getCadena().length() - 1) + "";

    }

    public String Alrevez() {   // nos dara la cadena volteada osea al reves
        String retorno = "";
        for (int i = getCadena().length() - 1; i >= 0; i--) {
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }

    public String Guion() {  // nos dara la cadena dividida por guines en medio de cada caracter 
        String retorno = "";
        for (int i = 0; i < getCadena().length(); i++) {
            if (getCadena().length() - 1 == i) {
                retorno += getCadena().charAt(i);
            } else {
                retorno += getCadena().charAt(i) + "-";
            }
        }
        return retorno;
    }

    public int Vocales() {   // metodo donde nos dira cuantas vocales son las que hay en la cadena entrante
        int cantidadVocales = 0;
        for (int i = 0; i < getCadena().length(); i++) {

            if ((getCadena().charAt(i) == 'a') || (getCadena().charAt(i) == 'A')
                    || (getCadena().charAt(i) == 'e') || (getCadena().charAt(i) == 'E')
                    || (getCadena().charAt(i) == 'i') || (getCadena().charAt(i) == 'I')
                    || (getCadena().charAt(i) == 'o') || (getCadena().charAt(i) == 'O')
                    || (getCadena().charAt(i) == 'u') || (getCadena().charAt(i) == 'U')) {
                cantidadVocales++;
            }
        }
        return cantidadVocales;  // imprime el contador osea las vocales totales en la cadena de caracteres
    }

    public boolean Palindromo() {   // retorna si la palabra se escribe de igual manera al derecho o al reves
        String palabraAlravez = "";
        for (int i = getCadena().length() - 1; i >= 0; i--) {
            palabraAlravez += getCadena().charAt(i);
        }
        if (getCadena().equals(palabraAlravez)) {   /// como es un metodo boolean nos dara si es verdadero o si es falso
            return true;
        } else {
            return false;
        }

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
