package string.practice;

public class clsRotar {

    private String palabra; // creamos una variable la cual utilizaremos con set and get en el metodo

    public String alRevez() { // cramos el metodo con el cual llamaremos por medio de un puente en el main
        String retorno = ""; // metodo string debemos retornar un string asi que inicializamos la variable que utilizaremos para reetirnar
        for (int i = getPalabra().length() - 1; i >= 0; i--) {  // creamos un ciclo for para dar vuelta a esa palabra que queremos
            retorno += getPalabra().charAt(i);

        }
        return retorno;  // aqui imprimimos la palabra la cual transformamos en el ciclo for ... =)

    }
// set and get de la clase

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
