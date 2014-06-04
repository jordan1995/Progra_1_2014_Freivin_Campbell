

package arreglos;

import java.util.Scanner;

/**
 *
 * @author Campbell
 */
public class Arreglos {

    
    public static void main(String[] args) {
        // creamos variables
        boolean continuar = false;
        int option=0;
        Scanner teclado = new Scanner(System.in);
        
        
        do {
            System.out.println("Digite la opcion del ejercicio a evaluar");
            System.out.println("1.Ejercicio 1");
            System.out.println("2.Ejercicio 2");
            System.out.println("3.Ejercicio 3");
            System.out.println("4.Slir");
            option= teclado.nextInt();
            
            switch(option){
                
                case 1:
                    ejercicio1 oejercicio1= new ejercicio1();
                    for (int i = 0; i < 5; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("Digite el salario del trabajador # " + (i+1));
                        oejercicio1.AgregarSalario(teclado.nextDouble());
                    } System.out.println(oejercicio1.ImprimirSueldos());
                    break;
                     case 2:
                    ejercicio2 oejercicio2= new ejercicio2();
                    for (int i = 0; i < 5; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("Digite el peso de la persona # " + (i+1));
                        oejercicio2.Agregaraltura(teclado.nextFloat());
                    } System.out.println(oejercicio2.ContarPersonas());
                    break;
                    
                     default:
                       break;
            }
            
            
        } while (option==4);
        
       
    }
    
}
