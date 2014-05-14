/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attributes;

/**
 *
 * @author Campbell
 */
public class Acccount {
    // creacion de atributos

    private double saldoInicial;
    private boolean hayError;

    //Metodoparael saldo
    public Acccount() {
        saldoInicial = 0;
    }

    // este metodo sirve para aumentarla cuenta del cliente
    public void Deposito(double monto) {
        setSaldoInicial(getSaldoInicial() + monto); // puedo acortar las cosas si tienen las mismas variables
    }

    // este metodo sirve para disminuir cuenta del cliente

    public void Retiro(double monto) {

        if (getSaldoInicial() >= monto) 
            setSaldoInicial(getSaldoInicial() - monto);
        else
            setHayError(true);
    }

    /**
     * @return the saldoInicial
     */
    public double getSaldoInicial() {
        return saldoInicial;
    }

    /**
     * @param saldoInicial the saldoInicial to set
     */
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    /**
     * @return the hayError
     */
    public boolean isHayError() {
        return hayError;
    }

    /**
     * @param hayError the hayError to set
     */
    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }

}
