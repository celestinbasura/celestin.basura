/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Poglavlje10.Zadaci.Z1001;

import Poglavlje10.Vjezbe.GeometrijskiLik.*;

/**
 *
 * @author cbasura
 */
public class Elipsa extends GeomentrijskiLik{
 
   private double a;
    private double b;
    
    public Elipsa(double a, double b){
        
        this.a = a;
        this.b = b;       
        
    }
    
    @Override
    public double racunajOpseg(){
        
        return 2 * Math.PI * Math.sqrt(((a * a) + (b * b))/2);
    }
    
    @Override
    public double racunajPovrsinu(){
        
        return a * b * Math.PI;
    }
    

}
