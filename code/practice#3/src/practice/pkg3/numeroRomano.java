/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.pkg3;

import java.util.Random;

/**
 *
 * @author Campbell
 */
public class numeroRomano {

    public int generarromano() {
        Random minumero = new Random();

        int n = minumero.nextInt(3001);

        return n;
    }

    
        public void calculaRomano(int n) {
       boolean ciclo = true;
       while(ciclo) {
       if(n - 1000 >= 0) {
           System.out.print("M");
           n-=1000;
       }
       else {
           if(n - 500 >= 0) {
               System.out.print("D");
               n-=500;
           }
           else {
               if(n - 100 >= 0) {
                   System.out.print("C");
                   n-=100;
               }
               else {
                   if (n - 50 >= 0) {
                       System.out.print("L");
                       n-=50;
                   }
                   else {
                       if(n - 10 >= 0) {
                           System.out.print("X");
                           n-=10;
                       }
                       else {
                           if(n - 5 >= 0) {
                               System.out.print("V");
                               n-=5;
                           }
                           else {
                               if (n - 1 >= 0) {
                                   System.out.print("I");
                                   n-=1;
                               }
                               else {
                                   ciclo = false;
                                   System.out.println("");
                               }
                           }
                       }
                   }
               }
           }
       }
    }
    }
}
        

    

