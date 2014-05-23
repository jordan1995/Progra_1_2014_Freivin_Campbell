/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice.pkg3;

/**
 *
 * @author Campbell
 */
public class regresoUnDia {
    
    public void regresar(int dia, int mes, int año) {
    int mod;
    System.out.println("La fecha ingresada es:" + dia + "/" + mes + "/" + año);
        System.out.println("la fecha anterios es:");
        mod = año % 4;
        dia--;
        if(dia == 0) {
            mes--;
            switch(mes) {
                case 0:
                    dia = 31;
                    mes = 12;
                    año--;
                    break;
                case 1: case 3: case 5: case 7: case 8: case 10:
                    dia = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    dia = 30;
                    break;
                case 2:
                    if(mod == 0) {
                       System.out.println("Año bisiesto.");
                       dia = 29;
                    }
                    else {
                        dia = 28;
                    }
                break;
            }
        }
        System.out.println(dia + "/" + mes + "/" + año);
    }
    
}
