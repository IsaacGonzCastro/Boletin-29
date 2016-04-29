/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

/**
 *
 * @author igonzalezcastro
 */
public abstract class Barco {

    String matricula;
    int longt;
    int potencia;

    public abstract void cuota(int dias);

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", Longitud=" + longt + ", potencia=" + potencia + '}';
    }

}
