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
abstract public class GeomentrijskiLik {
    abstract public double racunajOpseg();
    abstract public double racunajPovrsinu();
    @Override
    public String toString(){
        
         return "Oseg je " + this.racunajOpseg() + 
                "dok je povrsina " +  this.racunajPovrsinu();
    }
}
