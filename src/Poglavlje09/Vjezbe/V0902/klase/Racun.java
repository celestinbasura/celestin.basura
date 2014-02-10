/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Poglavlje09.Vjezbe.V0902.klase;

/**
 *
 * @author cbasura
 */
public class Racun {
    
    protected double stanje;
    private String brojRacuna;
    
    public double getStanje(){
        return this.stanje;
    }
    public void setStanje(double novoStanje){
        this.stanje = novoStanje;
    }
    @Override
    public String toString(){
        return "Racun broj " + brojRacuna 
                + " sa stanjem " 
                + this.getStanje() + " kn";
    }
    public String getBrojRacuna(){
        return brojRacuna;
    }
    public void setBrojRacuna(String brojRac){
        this.brojRacuna = brojRac;
    }    
}
