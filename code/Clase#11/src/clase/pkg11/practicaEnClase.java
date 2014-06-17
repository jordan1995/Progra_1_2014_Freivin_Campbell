package clase.pkg11;

import java.util.Scanner;

/**
 *
 * @author Freivin CAmpbell<freivin12@hotail.com>
 */
public class practicaEnClase {

    private int[][] matriz;
    private Scanner teclado;
    private int filas, columnas;

    public void CargaMatriz1() {
        teclado = new Scanner(System.in);
        matriz = new int[2][5];

        for (int c = 0; c < 3; c++) {
            for (int f = 0; f < 5; f++) {
                System.out.println("Ingrese el número correspondiente.");
                matriz[f][c] = teclado.nextInt();
            }
        }

    }

    public void Imprimir1() {
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[f][c] + "");
            }
            System.out.println("");
        }
    }

    public void CargaMatriz2() {
        teclado = new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas = teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas = teclado.nextInt();
        matriz = new int[filas][columnas];

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.println("Ingrese el número correspondiente.");
                matriz[f][c] = teclado.nextInt();
            }
        }

    }

    public void cambiaMatriz2() {
        for (int c = 0; c < matriz[0].length; c++) {
            int espera = matriz[0][c];
            matriz[0][c] = matriz[1][c];
            matriz[1][c] = espera;
        }
    }

    public void imprimirMatriz2() {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }

    public void Cargamatriz3() {
        teclado = new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        filas = teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        columnas = teclado.nextInt();
        matriz = new int[filas][columnas];

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.println("Ingrese el número correspondiente.");
                matriz[f][c] = teclado.nextInt();

            }
        }
    }

    public void BuscarVertices3() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 && j == 0) {
                    System.out.print(matriz[i][j] + " ");
                } else if (i == 0 && columnas - 1 == j) {
                    System.out.print(matriz[i][j] + " ");

                } else if (i == filas - 1 && j == 0) {
                    System.out.print(matriz[i][j] + " ");

                } else if (i == filas - 1 && j == columnas - 1) {
                    System.out.print(matriz[i][j] + " ");

                } else {
                    System.out.print("*" + " ");
                }

            } System.out.println("");

        }
    }
}
