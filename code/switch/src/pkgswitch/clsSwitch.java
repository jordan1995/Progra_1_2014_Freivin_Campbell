package pkgswitch;


import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Campbell
 */
public class clsSwitch {
    
    // creacion de metodos para cada operacion
    public double sumar( double  valor1,double valor2)
    {
    return valor1+valor2;
    }
    
    public double resta( double  valor1,double valor2)
    {
    return valor1-valor2;
    }
    public double divisiom( double  valor1,double valor2)
    {
    return valor1/valor2;
    }
    public double multiplicacion( double  valor1,double valor2)
    {
    return valor1*valor2;
    }
    
    public double raiz( double  valor1,double valor2)
    {
    return Math.sqrt(valor1);
    }
    public double elevar( double  valor1,double valor2)
    {
    return Math.pow(valor1, valor2);
    }

}
