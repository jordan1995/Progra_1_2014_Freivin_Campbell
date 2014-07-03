/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tiposdebusqueda;

import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;

/**
 *
 * @author Freivin Campbell <fncampbellr@est.utn.ac.cr>
 */
public class TiposDeBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opt=0;
        Scanner t = new Scanner(System.in);
        String[] arreglo ={"Mario", "Efren", "Sunana", "Campbell", "Agustin", "Elias"};
        
        do {
            System.out.println("Menu:");
            System.out.println("1.Busqueda Lineal");
            System.out.println("2.Busqueda Binaria");
            opt=t.nextInt();
            switch(opt)
            {
                case 1:
                    BusquedaLineal BL = new BusquedaLineal();
                    System.out.println("La Busqueda lineal es: " + BL.BuscarNombre(arreglo, "Efren"));
                    System.out.println(" ");
                    break;
                case 2:
                    BusquedaBinaria BB= new BusquedaBinaria();
                    System.out.println("La Busqueda Binaria es :" + BB.BuscarNombre(arreglo, "Campbell"));
                    break;
            
            
            }
            
            
        } while (true);
        
    }
    
}
