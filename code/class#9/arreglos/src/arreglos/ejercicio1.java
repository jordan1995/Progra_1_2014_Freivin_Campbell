
package arreglos;
/**
 *
 * @author Campbell
 */
public class ejercicio1 {

    double[] salarios = new double[5];// creamos la variable con un arreglo
    
// que hace intenta poner el valor del salario en cada variable con el length del arreglo que lo recorre

    public void AgregarSalario(double salario) {
        for (int i = 0; i < salarios.length; i++) { // en el arreglo lo recorre para ver cuantos salarios hay
            
            if (salarios[i] == 0) { // si el salario es igual a cero le agregara un valor salario
                
                salarios[i] = salario;// aqui el salario es agregado o asignado a cada arreglo
                
                break; // corte del metodo
            }
        }
    }
    
    public  String ImprimirSueldos() // medoto utilizado para imprimir sueldos
    {
    String imprimir=""; // creamos una variable para imprimir los suledos o la imformacion
    
        for (int i = 0; i < salarios.length; i++) { // un contador para que nos lea todos los arreglos
            
            imprimir+="El salario del trabajador #"+(i+1)+"es de "+ salarios[i]+" \n"; //asignamos el salario y mostramos el numero del trabajadpr
        }
        return  imprimir; // imprimimos el metodo
    }

}
