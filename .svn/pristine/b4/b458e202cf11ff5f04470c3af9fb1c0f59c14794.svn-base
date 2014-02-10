/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Poglavlje09.Vjezbe.V0902.klase;

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
        return (super.getStanje() + dozvoljenMinus);
    }
    @Override
    public String toString(){
        return "Racun broj  " + this.getBrojRacuna() 
                + " sa stanjem "
                + this.getStanje() + " kn";
    }    
}
