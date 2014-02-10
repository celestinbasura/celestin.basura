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
public class Trokut extends GeomentrijskiLik{
    
    
    private double a;
    private double b;
    private double c;
    
    public Trokut(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        
    }
    
    @Override
    public double racunajPovrsinu(){
        
        double s = (a + b + c)/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
    @Override
    public double racunajOpseg(){
        
        return a + b + c;
    }
   
}


