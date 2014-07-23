/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estadios;

import javax.swing.JOptionPane;

/**
 *
 * @author Freivin Campbell <fncampbellr@est.utn.ac.cr>
 */
public class infoEstadios {
    int opt=0;
   
    
    public void EstadiosIn(int opt)
    {
     Lista_Estadios oLista_Estadios = new Lista_Estadios();
                    
                    oLista_Estadios.Insertar("1.Maracana","\n"+ "Temperatura 25° C." + "\n" + "Precipitaciones: 0%." + "\n" + "Humedad: 65%." + "\n" + "Viento: 18 km/h.");
                    oLista_Estadios.Insertar("2.Arena Amazonia", "\n"+"Temperatura 31° C." + "\n" + "Precipitaciones: 10%." + "\n" + "Humedad: 58%." + "\n" + "Viento: 11 km/h.");
                    oLista_Estadios.Insertar("3.Castelao", "\n"+"Temperatura 28° C." + "\n" + "Precipitaciones: 30%." + "\n" + "Humedad: 58%." + "\n" + "Viento: 26 km/h.");
                    oLista_Estadios.Insertar("4.Arena Pantanal","\n"+ "Temperatura 36° C." + "\n" + "Precipitaciones: 0%." + "\n" + "Humedad: 32%." + "\n" + "Viento: 21 km/h.");
                    oLista_Estadios.Insertar("5.Arena Fonte Nova","\n"+ "Temperatura 26° C." + "\n" + "Precipitaciones: 50%." + "\n" + "Humedad: 78%." + "\n" + "Viento: 21 km/h.");
                    oLista_Estadios.Insertar("6.Nacional","\n"+ "Temperatura 27° C." + "\n" + "Precipitaciones: 20%." + "\n" + "Humedad: 32%." + "\n" + "Viento: 21 km/h.");
                    oLista_Estadios.Insertar("7.Mineirao","\n"+ "Temperatura 22° C." + "\n" + "Precipitaciones: 10%." + "\n" + "Humedad: 38%." + "\n" + "Viento: 16 km/h.");
                    oLista_Estadios.Insertar("8.Arena de Sao Paulo", "\n"+"Temperatura 24° C." + "\n" + "Precipitaciones: 0%." + "\n" + "Humedad: 50%." + "\n" + "Viento: 14 km/h.");
                    oLista_Estadios.Insertar("9.Arena Pernambuco", "\n"+"Temperatura 25° C." + "\n" + "Precipitaciones: 20%." + "\n" + "Humedad: 83%." + "\n" + "Viento: 27 km/h.");
                    oLista_Estadios.Insertar("10.Estadio Das Dunas","\n"+ "Temperatura 26° C." + "\n" + "Precipitaciones: 50%." + "\n" + "Humedad: 65%." + "\n" + "Viento: 32 km/h.");
                    oLista_Estadios.Insertar("11.Arena Baixada", "\n"+"Temperatura 21° C." + "\n" + "Precipitaciones: 0%." + "\n" + "Humedad: 56%." + "\n" + "Viento: 13 km/h.");
                    oLista_Estadios.Insertar("12.EstadioBaira-Rio","\n"+ "Temperatura 26° C." + "\n" + "Precipitaciones: 0%." + "\n" + "Humedad: 43%." + "\n" + "Viento: 2 km/h.");
                    JOptionPane.showMessageDialog(null, oLista_Estadios.Imprimir(opt));
    }
    
}
