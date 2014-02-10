/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje08.Vjezbe.V0804;

/**
 *
 * @author Celestin
 */
public class Osoba {
    
    
    private String ime;
    private String prezime;
    private int godinaRodjenja;
    
    public void setIme(String novoIme) {
        this.ime = novoIme;           
    }
    public void setPrezime(String novoPrezime){
        this.prezime = novoPrezime; 
    }
    
    public String getIme(){
        return ime;
    }
    public String getPrezime(){
        return prezime;
    }
    public void setGodinaRodjenja(int novaGodina){
        this.godinaRodjenja = novaGodina;
    }
    public int getGodinaRodjenja(){
        return godinaRodjenja;
    }
    public String stanje(){
        return this.getIme() + ", Prezime: " + 
               this.getPrezime() + ", Godina: " + 
               this.getGodinaRodjenja() + ".";
    }
    public boolean isPunoljetan(int trenutnaGodina){
        int trenutnaStarost = trenutnaGodina - this.getGodinaRodjenja();
        return trenutnaStarost < 18;
    }
}
