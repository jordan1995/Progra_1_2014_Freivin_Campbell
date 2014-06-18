/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz2;

import java.util.Scanner;

/**
 *
 * @author Freivin CAmpbell<freivin12@hotail.com>
 */
public class practicaMatriz {

    private int[][] matriz;
    private Scanner key;
    private int promedio;
    private int suma = 0;

    public void valorMatriz() {
        key = new Scanner(System.in);
        matriz = new int[3][3];

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el número correspondiente.");
                matriz[f][c] = key.nextInt();

            }

        }
    }

    public void promedioMatriz() {

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                suma += matriz[f][c];
            }

        }
        promedio = suma / matriz.length;
        System.out.println("El promedio es" + " " + promedio);

    }

    public void mayorImPar() {
        int imparMayor = 0;
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                if (matriz[f][c] % 2 == 1) {
                    if (imparMayor < matriz[f][c]) {
                        imparMayor = matriz[f][c];
                    }
                }
            }

        }
        System.out.println("El Impar mayor es  " + imparMayor);

    }

    public void promedioPar() {
        int pPar = 0;
        int suma = 0;
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                if (matriz[f][c] % 2 == 0) {
                    suma += matriz[f][c];
                }
            }
        }
        pPar = suma / (matriz.length * matriz[0].length);

        System.out.println("El promedio de los pares es de  " + pPar);
    }

    public void Fpromedio() {
        int pf = 0, cont=0;
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                if (matriz[f][c] % 2 == 1) {
                    System.out.println(matriz[f][c]);
                }System.out.println(" ");
            }
        }pf=suma*100/matriz[0].length;
        
        System.out.println("El promedio de los numeros impares es de:" + cont++ + pf);
        cont+=1;
    }
    

}
