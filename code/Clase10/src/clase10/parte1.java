/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase10;

/**
 * 
 * @author freivin campbell
 */
public class parte1 {
    
 private int[] numeros = new int [8];
 

public void agregarNumero(int numero)
{
for (int i = 0; i < numeros.length; i++) { 
               numeros[i] = numero; 
          
    }
                
               
            }

public double sumaTotal()
{
    double suma=0;
    for (int i = 0; i < numeros.length; i++) {
        suma+=numeros[i];
        
    }return suma;

}
       



}











