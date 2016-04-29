/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin29;

import java.util.ArrayList;

/**
 *
 * @author igonzalezcastro
 */
public class Boletin29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Barco> listaBarcos= new ArrayList();
        
        Barco velero1=new Veleros(8,"O porquiño con velas",5);
        Barco Embarcacion1=new EmbarcacionsDep(20,15,"Espartano");
        Barco Yate1= new Yate(110,70,"El increible Hulk",50);
        
        listaBarcos.add(velero1);
        listaBarcos.add(Embarcacion1);
        listaBarcos.add(Yate1);
        
        System.out.println(velero1.toString());
        velero1.cuota(5);
        System.out.println(Embarcacion1.toString());
        Embarcacion1.cuota(9);
        System.out.println(Yate1.toString());
        Yate1.cuota(7);
        
        
    }
    }
    

