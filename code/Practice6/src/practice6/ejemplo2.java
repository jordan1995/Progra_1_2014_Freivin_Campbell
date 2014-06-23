/**
 * 2.Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar la
 * primer fila con la segundo. Imprimir luego la matriz.
 */
package practice6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Freivin CAmpbell<freivin12@hotmail.com>
 */
public class ejemplo2 {
    private int[][] matriz;
private Scanner teclado;
int f,c;

    public void CambiarMatriz() {
        teclado = new Scanner(System.in);
        System.out.println("Digite la cantidad de filas y columnas.");
        matriz = new int[f][c];
        matriz[f][c]=teclado.nextInt();
        
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(Arrays.toString(matriz[1]));
                System.out.println(Arrays.toString(matriz[0]));
                
                
            }
            
        }
        
        
        
    
    }
}
