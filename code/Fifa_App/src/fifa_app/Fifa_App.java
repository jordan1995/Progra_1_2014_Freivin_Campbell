/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// inicio el 14/07/2014
//link 1 = http://alvinalexander.com/java/joptionpane-showinputdialog-examples  7:47 pm
// bitacora = creacion de los primeros mensajes para los menu y sub  menu
//creacion de los primeros metodos y clases.
package fifa_app;

import Estadios.Lista_Estadios;
import Estadios.infoEstadios;
import javax.swing.JOptionPane;

/**
 *
 * @author Freivin Campbell <fncampbellr@est.utn.ac.cr>
 */
public class Fifa_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opt = 0;

        // Mensaje Que muestra En detalle ell Inicio de la App
        JOptionPane.showMessageDialog(null, "Bienvenido: Esta es la App de la Fifa para el Mundial 2014.");

        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog("Digite una opcion a evaluar"
                    + "\n" + "1. Ver Lista de Estadios"
                    + "\n" + "2. Ver lista de equipos"
                    + "\n" + "3.Ver lista de los grupos"
                    + "\n" + "4.Modificar listas"
                    + "\n" + "5.Salir"));
            switch (opt) {
                case 1:
                    infoEstadios oinfoEstadios = new infoEstadios();
                    opt = Integer.parseInt(JOptionPane.showInputDialog(""
                            + "0. Maracana" + "\n"
                            + "1. Arena Amazonia" + "\n"
                            + "2. Castelao." + "\n"
                            + "3. Arena Pantanal." + "\n"
                            + "4. Arena Fonte Nova." + "\n"
                            + "5. Nacional." + "\n"
                            + "6. Mineirao." + "\n"
                            + "7. Arena de Sao Paulo." + "\n"
                            + "8. Arena Pernambuco." + "\n"
                            + "9. Estadio Das Dunas." + "\n"
                            + "10. Arena Baixada." + "\n"
                            + "11. EstadioBaira-Rio." + "\n"
                            + "12. SALIR"));
                    oinfoEstadios.EstadiosIn(opt);

                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "segunda opcion");
                    break;

                default:
                    throw new AssertionError();
            }

        } while (true);

    }

}
