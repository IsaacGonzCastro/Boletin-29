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
public class Yate extends Barco {
int numCamarotes;
    
    public Yate(int potencia,int eslora, String matricula, int camarotes){
        super.potencia=potencia;
        super.longt=longt;
        super.matricula=matricula;
        this.numCamarotes=numCamarotes;
        
    }

    @Override
    public void cuota(int dias) {
        int cuota= dias*((longt*10)+numCamarotes+potencia);
        System.out.println("Alquiler= "+cuota+"€");
    }

    @Override
    public String toString() {
        return super.toString()+"Yates{" + "camarotes=" + numCamarotes + '}';
    }
    
}
