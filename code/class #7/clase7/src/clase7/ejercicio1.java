/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase7;

/**
 *
 * @author Campbell
 */
public class ejercicio1 {
    private String email;
    
    public ejercicio1(String pEmail)
    { this.email= pEmail;
    
    
    }
    public  String validarCorreo()
    {  String mensaje="El correo no continene el @";
        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i)=='@')
            {
            mensaje="El correo si contiene @";
            }
            
        }
    return mensaje;
    }
    
}
