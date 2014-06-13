package clase7;

import java.util.Scanner; // import of scan

public class Clase7 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner oScanner = new Scanner(System.in); // importamos el scan
        int option = 0;  // variable int para opcion

        do {   // cracion del  ciclo para el menu
            System.out.println("Digite la opcion que desea");
            System.out.println("1.Ejemplo 1");
            System.out.println("2.Ejemplo 2");
            //System.out.println("3.Ejemplo 3");
            option = oScanner.nextInt();

            switch (option) {
                case 1:  // al escoger la opcion 1 realizara todo el codigo a continuacion
                    System.out.println("Digite el correo a evluar");
                    oScanner = new Scanner(System.in);
                    ejercicio1 oejercicio1 = new ejercicio1(oScanner.nextLine());
                    System.out.println(oejercicio1.validarCorreo());
                    break;
                case 2:   // si escoje la opcio 2 realizara todo el codigo hasta llegar al brack 
                    System.out.println("Digite la cadena a evaluar");
                    oScanner = new Scanner(System.in);
                    ejercicio2 oejercicio2 = new ejercicio2();
                    oejercicio2.setCadena(oScanner.nextLine());
                    System.out.println("Imprime la mitad");
                    System.out.println(oejercicio2.MitadCadena());
                    System.out.println("Imprime  el ultimo digito");
                    System.out.println(oejercicio2.ultimovalor());
                    System.out.println("Imprime la cadedna alrevez");
                    System.out.println(oejercicio2.Alrevez());
                    System.out.println("Imprime la cadedna con un guion");
                    System.out.println(oejercicio2.Guion());
                    System.out.println("Imprime solamente las vocales de la cadena");
                    System.out.println(oejercicio2.Vocales());
                    System.out.println("Imprime si es un Palindromo");
                    System.out.println(oejercicio2.Palindromo());

                    break;

            }

        } while (option < 3); // opciones llega hasta la 2 si se pasa el programa finalizara

    }

}
