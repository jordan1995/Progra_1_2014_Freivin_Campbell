package clase7;

public class ejercicio1 {

    private String email;

    public ejercicio1(String pEmail) {
        this.email = pEmail;

    }

    public String validarCorreo() // metodo donde sabremos si el correo tiene el caracter @ o no
    {
        String mensaje = "El correo no continene el @"; /// si lo tiene dara este mensaje
        for (int i = 0; i < email.length(); i++) { // ciclo donde escaneamos todos los caracteres para ver si no lo tiene
            if (email.charAt(i) == '@') // una condicional simple donde preguntamos si esta o no el @
            {
                mensaje = "El correo si contiene @";  // sino lo tiene el mensaje que dara sera el siguiente
            }

        }
        return mensaje; // retornamos el mensajes en strin =)
    }

}
