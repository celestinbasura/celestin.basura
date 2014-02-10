/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Poglavlje09.Zadaci.Z0901;

/**
 *
 * @author Celestin
 */
class Osoba {
    
    
    private String ime;
    private String prezime;
    protected String pozicija;
    
    public String getIme(){
        return this.ime;
    }
    public String getPrezime(){
        return this.prezime;
    }
    public void setImePrezime(String novoIme, String novoPrezime){
        this.ime = novoIme;
        this.prezime = novoPrezime;
    }
    void setPozicija(String novaPozicija){
        this.pozicija = novaPozicija;
    }
    
    
}
