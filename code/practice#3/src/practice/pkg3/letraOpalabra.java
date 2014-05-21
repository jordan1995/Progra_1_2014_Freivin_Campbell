/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.pkg3;

/**
 *
 * @author Campbell
 */
public class letraOpalabra {

    /**
     * •	Ingresar una letra entre a y e y reportar el mensaje de acuerdo a: A
     * excelente B bueno C regular D malo E pésimo
     *
     */
    public void cambiarPalabra(String valor) {
        if (valor == "a" || valor == "A") {
            System.out.println("Excelente");
        } else {
            if (valor == "b" || valor == "B") {
                System.out.println("bueno");
            } else {
                if (valor == "c" || valor == "C") {
                    System.out.println("Regular");
                } else {
                    if (valor == "d" || valor == "D") {
                        System.out.println("Malo");
                    } else {
                        if (valor == "e" || valor == "E") {
                            System.out.println("pésimo");
                        } 
                    }
                }
            }

            
        } 
    }
}