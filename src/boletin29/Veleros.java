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
public class Veleros extends Barco {

     int numMastiles;
    
    public Veleros(int eslora, String matricula, int numMastiles){
        super.longt=longt;
        super.matricula=matricula;
        this.numMastiles=numMastiles;
    }

    @Override
    public void cuota(int dias) {
       
        int cuota= dias*((longt*10)+numMastiles);
        System.out.println("Alquiler= "+cuota+"€");
    }

    @Override
    public String toString() {
        return "Veleros{ matricula: "+matricula+ " Longitud: " +longt+ " mastiles:" + numMastiles + '}';
    }

    
}
