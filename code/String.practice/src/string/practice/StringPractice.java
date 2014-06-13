package string.practice;

import java.util.Scanner;  // importamos la libreria del scaner

public class StringPractice {

    public static void main(String[] args) throws Exception {
        Scanner key = new Scanner(System.in); // importacion del scaner al programa
        //Declaracion de las variables que usaremos durante el programa
        int opcion = 0; // declaracion de la variable opcion
        char salida; // declaramos la variable para salida del siclo

        do { // creamos el ciclo do{}while para el menu y los cases
            System.out.println("Digite la opcion que desea");
            System.out.println("1.Alreves");
            System.out.println("2.Palindromo");
            System.out.println("3.Buscar Palabra");
            System.out.println("4.Parte 2");
            opcion = Integer.parseInt(key.nextLine());

            switch (opcion) { // declaramos el switch para las opciones que escojemos
                case 1: // case 1 llamara a rotar que lo que hace es rotar la palabra que incremasos
                    System.out.println("Digite la palabra a evaluar");
                    key = new Scanner(System.in);
                    clsRotar rotar = new clsRotar(); // creamos el puente o la instacia
                    rotar.setPalabra(key.nextLine()); // mandamos la palabra
                    System.out.println("Imprime la palabra digitada Alreves");
                    System.out.println(rotar.alRevez()); // imprime la pralabra escrita al reves
                    break;
                case 2: // llama remos al palindromo para ver si la palabra incresada se escribe igual al reves que al derecho
                    System.out.println("Digite la palabra Palindromo");
                    key = new Scanner(System.in);
                    clsPalindromo palindromo = new clsPalindromo(); // creamos la instancia
                    palindromo.setPalabra(key.nextLine());
                    System.out.println("la palabra es palindromo");
                    System.out.println(palindromo.Palindromo()); // imprimimos si es verdad o mentira
                    break;
                case 3: // cramos el case 3 donde escribimos una oracion y con otro comando buscaremos una palabra en la oracion
                    clsBuscarPalabra buscar = new clsBuscarPalabra();
                    key = new Scanner(System.in);
                    System.out.println("digite una oracion");
                    buscar.setsTexto(key.nextLine());  // mandamos la oracion con el set
                    System.out.println("Digite la palabra que quiere buscar dentro de la oracion");
                    buscar.setsTextoBuscado(key.nextLine()); // mandamos la palabra que queremos buscas de igual forma con el set
                    buscar.buscarPa(); // imprimimos la palabra que buscamos y la cantidad en la oracion
                    System.out.println("Daremos la palabra buscada con un guion para identificarla");
                    System.out.print("-" ); buscar.buscarPaguion();
                    break;
                case 4:
                    Ejercicio2 oEjercicio2 = new Ejercicio2();
                    oEjercicio2.setHilera("HolA mUndO");
                    System.out.println(oEjercicio2.SubString(2,4));
                    System.out.println(oEjercicio2.toUpperchase());
                    
                    break;

            }
            System.out.println("Desea continuar S/N"); // pedimos al usuario si continua o no
            salida = key.nextLine().charAt(0); // asignamos la variable char a salida

        } while (salida == 's' || salida == 'S'); // terminamos el siclo do{}while saliendo  comprobando si salida es igual a lo que el usuario increso

    }

}
