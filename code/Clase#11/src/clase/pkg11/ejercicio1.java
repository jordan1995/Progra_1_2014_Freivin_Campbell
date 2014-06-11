
package clase.pkg11;

import java.util.Scanner;

/**
 *
 * @author Freivin CAmpbell<freivin12@hotail.com>
 */
public class ejercicio1 {

private int[][] matriz;
private Scanner teclado;

    public void CargaMatriz() {
        teclado = new Scanner(System.in);
        matriz = new int[3][5];

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.println("Ingrese el número correspondiente.");
                matriz[f][c] = teclado.nextInt();
            }
        }

    }

    public void Imprimir() {
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[f][c] + "");
            }
            System.out.println("");
        }
    }
}
