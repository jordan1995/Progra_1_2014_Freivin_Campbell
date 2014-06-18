
package matriz2;

import java.util.Scanner;

/**
 *
 * @author Freivin CAmpbell<freivin12@hotail.com>
 */
public class Matriz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        practicaMatriz opracticaMatriz= new practicaMatriz();
        int opt=0;
        
        do { 
            System.out.println("Menu:");
            
            System.out.println("1.Promedio de la Matirz");
            System.out.println("2.Imprimir el impar mayor");
            System.out.println("3.Imprimir el promedio de Pares");
            System.out.println("4.Promedio x fila");
            opt=key.nextInt();
            switch (opt) {
                case 1:
                    opracticaMatriz.valorMatriz();
                    opracticaMatriz.promedioMatriz();
                    
                    break;
                    case 2:
                        opracticaMatriz.valorMatriz();
                        opracticaMatriz.mayorImPar();
                        break;
                    case 3:
                        opracticaMatriz.valorMatriz();
                        opracticaMatriz.promedioPar();
                        break;
                    case 4:
                        opracticaMatriz.valorMatriz();
                        opracticaMatriz.Fpromedio();
                        break;
                    
                   
                
            }
        } while (true);
        
    }
    
}
