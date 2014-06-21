

package clase.pkg11;

import java.util.Scanner;

/**
 * 
 * @author Freivin CAmpbell<freivin12@hotail.com>
 */
public class ejercicio2 {
private int[][] matriz;
    private Scanner teclado;
    
    public void CargaMatriz() {
        teclado = new Scanner(System.in);
        matriz = new int[4][4];
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("Ingrese el # correspondiente");
                matriz[f][c]=teclado.nextInt();   
            }   
        }
    }
    public void imprimirDiagonal()
    {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                if (i==j) 
                {
                    System.out.print(matriz[i][i]+" ");                    
                }
                else
                {
                    System.out.print("_"+" ");
                }
                System.out.print(" ");
                }
            }
        }
    }
    

