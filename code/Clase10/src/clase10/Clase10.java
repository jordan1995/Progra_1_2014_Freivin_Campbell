/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase10;

import java.util.Scanner;

/**
 *
 * @author campbell
 */
public class Clase10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opt=0, suma=0;
        Scanner key = new Scanner(System.in);
        
        do {
            System.out.println("Digite una opcion");
            System.out.println("1.vector #8");
            opt=key.nextInt();
            switch (opt) {
                case 1:
                    parte1 oparte1= new parte1();
                    
                    
                     for (int i = 0; i < 8; i++) {
                         key = new Scanner(System.in);
                         System.out.println("Digite el numero #"+ (i+1));
                         oparte1.agregarNumero(key.nextInt());   
                        
                     }
                     
                     System.out.println("La suma total de los numeros del vector es de "+oparte1.sumaTotal());                  
                    
                    break;
                    
                    
                default:
                    throw new AssertionError();
            }
            
        } while (true);
        
    }
    
}
