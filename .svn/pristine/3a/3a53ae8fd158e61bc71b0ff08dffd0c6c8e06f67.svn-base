/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Poglavlje09.Vjezbe.V0901.klase;

/**
 *
 * @author cbasura
 */
public class TekuciRacun extends Racun{
    
    private double dozvoljenMinus;
    
    public void setDozvoljenMinus(double minus){
        this.dozvoljenMinus = minus;
    }
    @Override
    public double getStanje(){
        return this.getStanje() + dozvoljenMinus;
    }
    public String toString(){
        return "Racun broj  " + this.getBrojRacuna() 
                + " sa stanjem "
                + this.getStanje() + " kn";
    }    
}
