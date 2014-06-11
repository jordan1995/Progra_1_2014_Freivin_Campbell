/*
 /**
 * 1Crear una matriz de 2 filas y 5 columnas. Realizar la carga de componentes
 * por columna (es decir primero ingresar toda la primer columna, luego la
 * segunda columna y así sucesivamente)
 */
package practice6;

import java.util.Scanner;

/**
 *
 * @author Freivin CAmpbell<freivin12@hotail.com>
 */
public class ejemplo1 {

    private Scanner key;
    int[][] matriz;

    public void IngresarMatriz() {
        key = new Scanner(System.in);
        matriz = new int[2][5];

        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {
                System.out.println("Digite el valor deseado.");
                matriz[f][c] = key.nextInt();

            }

        }

    }
    public  void ImprimirMatriz()
    {
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[f][c]);
            }
            System.out.println("");
            
        }
    
    }

}
