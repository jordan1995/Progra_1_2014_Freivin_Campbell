package arreglos;

/**
 *
 * @author F campbell
 */
public class ejercicio3 {

    double[] salarios = new double[8];// creamos la variable con un arreglo
    double suma = 0;

// que hace intenta poner el valor del salario en cada variable con el length del arreglo que lo recorre
    public void SalarioNoche(double salario) {
        for (int i = 0; i < salarios.length; i++) { // en el arreglo lo recorre para ver cuantos salarios hay
            if (i < 4) {
                System.out.println("Turno mañana Digite el salario de la persona # " + (i + 1));
                if (salarios[i] == 0) { // si el salario es igual a cero le agregara un valor salario

                    salarios[i] = salario;// aqui el salario es agregado o asignado a cada arreglo
                }
            } else {
                System.out.println("Turno tarde Digite el salario de la persona # " + (i + 1));
                if (salarios[i] == 0) { // si el salario es igual a cero le agregara un valor salario

                    salarios[i] = salario;
                }

            }

        }
    }
}
