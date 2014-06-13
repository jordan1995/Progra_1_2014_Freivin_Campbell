package string.practice;

public class clsPalindromo {

    private String palabra;  // creamos una variable string privada para la palabra que vamos  a comprobar si se escribe o no igual 

    public boolean Palindromo() { // creacion del metodo que utilizamos para ver si es palindromo
        String palabraAlravez = ""; // inicializamos el string de l
        for (int i = getPalabra().length() - 1; i >= 0; i--) {
            palabraAlravez += getPalabra().charAt(i);
        }
        if (getPalabra().equals(palabraAlravez)) {
            return true; // regresa verdadero si la palabra se escribe igual
        } else {
            return false; // recresa falso si es loc onrario
        }

    }

    // creacion de los set y de los get de la clase que utilizamos para estos metodos
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
