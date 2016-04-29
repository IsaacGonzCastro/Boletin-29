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
public class EmbarcacionsDep extends Barco {

    public EmbarcacionsDep(int potencia, int eslora, String matricula){
        super.potencia=potencia;
        super.longt=longt;
        super.matricula=matricula;
    }

    @Override
    public void cuota(int dias) {
        int cuota= dias*((longt*10)+potencia);
        System.out.println("Alquiler= "+cuota+"€");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
